import sys
import antlr
from Structs import *

memoria = antlr.rules.memoria
paquetes = antlr.rules.paquetes

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  dirfunc = antlr.rules.dir_func.dictionary

  Stack_local = Stack()
  # Cargar main a memoria local
  memoria.locales = paquetes['main']

  i = 1
  ret = 0
  print("_____ EJECUCCION _____")
  while(i <= len(lista_cuadruplos)):
    contador = lista_cuadruplos[i-1]['cont']
    operacion = lista_cuadruplos[i-1]['op']
    izquierdo = lista_cuadruplos[i-1]['izq']
    derecho = lista_cuadruplos[i-1]['der']
    resultado = lista_cuadruplos[i-1]['res']

    # Sacar los datos e ir metiendo los valores a memoria

    if (operacion == '1'):
      # print(str(i)+": " + "PRINT" + "\t_\t_\t" + resultado)
      res = sacaTipoYLocalidad(resultado)
      pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]

      # Construir string dependiendo de localidad y tipo
      stringRes = getApuntadorMemoria(res)
      # Conseguir indice de la variable dentro de su lista
      indexRes = int(resultado) - getattr(memoria, stringRes)

      print(pedazoMemoriaResultado[indexRes])
    elif (operacion == '2'):
      # print(str(i)+": " + izquierdo + "\t" + "SUMA" + "\t" + derecho + "\t" + resultado)
      hazOperacion('+', izquierdo, derecho, resultado)
    elif (operacion == '3'):
      # print(str(i)+": " + izquierdo + "\t" + "RESTA" + "\t" + derecho + "\t" + resultado)
      hazOperacion('-', izquierdo, derecho, resultado)
    elif (operacion == '4'):
      # print(str(i)+": " + izquierdo + "\t" + "MULTIPLICACION" + "\t" + derecho + "\t" + resultado)
      hazOperacion('*', izquierdo, derecho, resultado)
    elif (operacion == '5'):
      # print(str(i)+": " + izquierdo + "\t" + "DIVISION" + "\t" + derecho + "\t" + resultado)
      hazOperacion('/', izquierdo, derecho, resultado)
    elif (operacion == '6'):
      # print(str(i)+": " + izquierdo + "\t" + "MODULO" + "\t" + derecho + "\t" + resultado)
      hazOperacion('%', izquierdo, derecho, resultado)
    elif (operacion == '7'):
      # print(str(i)+": " + izquierdo + "\t" + "MAYOR" + "\t" + derecho + "\t" + resultado)
      hazOperacion('>', izquierdo, derecho, resultado)
    elif (operacion == '8'):
      # print(str(i)+": " + izquierdo + "\t" + "MENOR" + "\t" + derecho + "\t" + resultado)
      hazOperacion('<', izquierdo, derecho, resultado)
    elif (operacion == '9'):
      # print(str(i)+": " + izquierdo + "\t" + "MAYORIGUAL" + "\t" + derecho + "\t" + resultado)
      hazOperacion('>=', izquierdo, derecho, resultado)
    elif (operacion == '10'):
      # print(str(i)+": " + izquierdo + "\t" + "MENORIGUAL" + "\t" + derecho + "\t" + resultado)
      hazOperacion('<=', izquierdo, derecho, resultado)
    elif (operacion == '11'):
      # print(str(i)+": " + resultado + "\t" + "ASIGNACION" + "\t_\t" + izquierdo)
      
      # Si la variable fue extraida de consola, no va a tener lugar en memoria, asi que solo se necesita trabajar con el resultado
      if (derecho == "read"):
        res = sacaTipoYLocalidad(resultado)
        pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
        valorRes = [pedazoMemoriaResultado[value] for value in pedazoMemoriaResultado if int(resultado) == value]
        for item in pedazoMemoriaResultado.items():
          # print(item, resultado)
          if (item[1] == valorRes[0] and item[0] == int(resultado)):
            pedazoMemoriaResultado[item[0]] = izquierdo
      # Si no, buscamos en memoria para ambos casos
      else:
        # Sacar tipo y localidad de resultado y valor a asignar
        res = sacaTipoYLocalidad(resultado)
        izq = sacaTipoYLocalidad(izquierdo)

        # print(res, izq)

        # Conseguir el pedazo de memoria de ese tipo y localidad
        # EJEMPLO: Si izq tiene [0, constantes]
        # Se agarra memoria.constantes[0]
        pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
        pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]

        # Construir string dependiendo de localidad y tipo
        stringRes = getApuntadorMemoria(res)
        # Conseguir indice de la variable dentro de su lista
        indexRes = int(resultado) - getattr(memoria, stringRes)

        # Construir string dependiendo de localidad y tipo
        stringIzq = getApuntadorMemoria(izq)
        # Conseguir indice de la variable dentro de su lista
        indexIzq = int(izquierdo) - getattr(memoria, stringIzq)

        pedazoMemoriaResultado[indexRes] = pedazoMemoriaIzquierdo[indexIzq]

    elif (operacion == '12'):
      # print(str(i)+": " + izquierdo + "\t" + "EQUAL" + "\t" + derecho + "\t" + resultado)
      hazOperacion('==', izquierdo, derecho, resultado)
    elif (operacion == '13'):
      # print(str(i)+": " + izquierdo + "\t" + "NOTEQUAL" + "\t" + derecho + "\t" + resultado)
      hazOperacion('!=', izquierdo, derecho, resultado)
    elif (operacion == '14'):
      # print(str(i)+": " + "GOTO " + "\t_\t_\t" + resultado)
      # BRINCAR AL CUADRUPLO: resultado
      i = int(resultado) - 1
    elif (operacion == '15'):
      # print(str(i)+": " + "GOTOF "+ "\t" + izquierdo + "\t_\t" + resultado)
      izq = sacaTipoYLocalidad(izquierdo)

      # print(izq)

      pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]

      # print(pedazoMemoriaIzquierdo)

      # Construir string dependiendo de localidad y tipo
      stringIzq = getApuntadorMemoria(izq)
      # Conseguir indice de la variable dentro de su lista
      indexIzq = int(izquierdo) - getattr(memoria, stringIzq)

      if (pedazoMemoriaIzquierdo[indexIzq] == False):
        # BRINCAR AL CUADRUPLO: resultado
        i = int(resultado) - 1
    elif (operacion == '16'):
      # print("ENDPROC", izquierdo, derecho, resultado)
      # REGRESAR AL VALOR DE RETORNO
      i = int(ret)
    elif (operacion == '17'):
      # print("ERA", izquierdo, derecho, resultado)
      # Checar si la funcion existe en el directiorio de funciones
      if izquierdo in dirfunc:
        # Si existe, sacar variables locales de la funcion y su firma
        firma_funcion = dirfunc[izquierdo][2]
        num_params = len(firma_funcion)
        params = dirfunc[izquierdo][5:]
        func_actual = izquierdo

        # Creando espacio de memoria para la funcion
        for variable_local in dirfunc[izquierdo][1]:
          nombre = variable_local
          tipo = dirfunc[izquierdo][1][variable_local][0]
          direccion = dirfunc[izquierdo][1][variable_local][1]

          if tipo == 'int':
            print memoria.locales[tipo]
          elif tipo == 'float':
            memoria.locales[tipo][memoria.apuntador_locales_float] = nombre
            memoria.apuntador_locales_float += 1
          elif tipo == 'bool':
            memoria.locales[tipo][memoria.apuntador_locales_bool] = nombre
            memoria.apuntador_locales_bool+= 1
          elif tipo == 'string':
            memoria.locales[tipo][memoria.apuntador_locales_string] = nombre
            memoria.apuntador_locales_string += 1
          elif tipo == 'list':
            memoria.locales[tipo][memoria.apuntador_locales_list] = nombre
            memoria.apuntador_locales_list += 1

    elif (operacion == '18'):
      # print("PARAM", izquierdo, derecho, resultado)
      # Checar si el tipo del primer parametro es igual al tipo primer elemento de la firma
      if derecho[0] == firma_funcion[0]:
        # Si si fue, eliminar el primer elemento de la firma
        firma_funcion = firma_funcion[1:]
        var = params[0]
        # PASARSELO A LA FUNCION
        izq = sacaTipoYLocalidad(izquierdo)

        pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]

        # Sacar valor de memoria
        valorIzq = [pedazoMemoriaIzquierdo[value] for value in pedazoMemoriaIzquierdo if int(izquierdo) == value]

        # print(valorIzq)
    
        for item in memoria.locales[derecho].items():
          if item[1] == var:
            memoria.locales[derecho][item[0]] = valorIzq[0]

        params = params[2:]

      # print(memoria.locales)  

    elif (operacion == '19'):
      # print("GOSUB", izquierdo, derecho, resultado) 
      print(memoria) 
      # GUARDAR VALOR A RETORNAR
      ret = contador
      # BRINCAR AL CUADRUPLO DE INICIO DE FUNCION
      i = int(resultado)
    elif (operacion == '20'):
      # print("READ", izquierdo, derecho, resultado)

      # Leer de consola y eliminar caracteres invisibles
      var = sys.stdin.readline()
      var = var.rstrip("\n\r")

      if izquierdo != "string":
        # Intentar hacer el cast y si no se puede marcar error
        try:
          exec(izquierdo+'('+var+')')
        except NameError:
          sys.exit("Valor leido no es del tipo de la variable")

      # Ir al cuadruplo correspondiente y agregar el valor y la nota que es un valor leido de consola
      lista_cuadruplos[int(resultado)-1]['izq'] = var
      lista_cuadruplos[int(resultado)-1]['der'] = "read"
    elif (operacion == '21'):
      print "ESPECIAL"
    elif (operacion == '22'):
      print "RETURN"
    elif (operacion == '23'):
      print "VERIFICA"
    else:
      print(operacion)

    i = i + 1

def getApuntadorMemoria(var):
  if var[0] == 0:
    str2 = 'int'
  elif var[0] == 1:
    str2 = 'float'
  elif var[0] == 2:
    str2 = 'bool'
  elif var[0] == 3:
    str2 = 'string'
  elif var[0] == 4:
    str2 = 'list'
  string = var[1] + "_" + str2
  return string

def sacaTipoYLocalidad(variable):
  if (1000 <= int(variable) < 6000):
    localidad = 'globales'
    if (1000 <= int(variable) < 2000):
      tipo = 0
    elif (2000 <= int(variable) < 3000):
      tipo = 1
    elif (3000 <= int(variable) < 4000):
      tipo = 2
    elif (4000 <= int(variable) < 5000):
      tipo = 3
    elif (5000 <= int(variable) < 6000):
      tipo = 4
  elif (6000 <= int(variable) < 11000):
    localidad = 'constantes'
    if (6000 <= int(variable) < 7000):
      tipo = 0
    elif (7000 <= int(variable) < 8000):
      tipo = 1
    elif (8000 <= int(variable) < 9000):
      tipo = 2
    elif (9000 <= int(variable) < 10000):
      tipo = 3
    elif (10000 <= int(variable) < 11000):
      tipo = 4
  elif (11000 <= int(variable) < 21000):
    localidad = 'locales'
    if (11000 <= int(variable) < 13000):
      tipo = 0
    elif (13000 <= int(variable) < 15000):
      tipo = 1
    elif (15000 <= int(variable) < 17000):
      tipo = 2
    elif (17000 <= int(variable) < 19000):
      tipo = 3
    elif (19000 <= int(variable) < 21000):
      tipo = 4
  
  return [tipo, localidad]

def hazOperacion(operacion, izquierdo, derecho, resultado):
  global memoria
  # print(izquierdo, derecho, resultado)

  res = sacaTipoYLocalidad(resultado)
  izq = sacaTipoYLocalidad(izquierdo)
  der = sacaTipoYLocalidad(derecho)

  # print(izq, der, res)

  pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
  pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]
  pedazoMemoriaDerecho = getattr(memoria, der[1])[der[0]]

  # print(pedazoMemoriaIzquierdo, pedazoMemoriaDerecho, pedazoMemoriaResultado)

  # Construir string dependiendo de localidad y tipo
  stringRes = getApuntadorMemoria(res)
  # Conseguir indice de la variable dentro de su lista
  indexRes = int(resultado) - getattr(memoria, stringRes)

  # Construir string dependiendo de localidad y tipo
  stringIzq = getApuntadorMemoria(izq)
  # Conseguir indice de la variable dentro de su lista
  indexIzq = int(izquierdo) - getattr(memoria, stringIzq)

  # Construir string dependiendo de localidad y tipo
  stringDer = getApuntadorMemoria(der)
  # Conseguir indice de la variable dentro de su lista
  indexDer = int(derecho) - getattr(memoria, stringDer)

  res = eval(str(pedazoMemoriaIzquierdo[indexIzq]) + operacion + str(pedazoMemoriaDerecho[indexDer]))

  # print(memoria.locales)

  pedazoMemoriaResultado[indexRes] = res
  
  # print(pedazoMemoriaResultado)

if __name__ == '__main__':
  main(sys.argv)