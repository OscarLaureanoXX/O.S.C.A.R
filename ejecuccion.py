import sys
import antlr
import numpy as np
import re
from matplotlib import pyplot as plt
from Structs import *

memoria = antlr.rules.memoria
paquetes = antlr.rules.paquetes

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  dirfunc = antlr.rules.dir_func.dictionary
  main = antlr.rules.apuntador_main

  Stack_local = Stack()
  # Cargar main a memoria local
  paquete_actual = paquetes['main']
  memoria.locales = paquete_actual
  func_actual = 'main'

  i = 1
  ret = 0
  contadorLlamadas = 0
  bandera = False
  funcionPadre = ''
  print("_____ EJECUCCION _____")
  while(i <= len(lista_cuadruplos)):
    contador = lista_cuadruplos[i-1]['cont']
    operacion = lista_cuadruplos[i-1]['op']
    izquierdo = lista_cuadruplos[i-1]['izq']
    derecho = lista_cuadruplos[i-1]['der']
    resultado = lista_cuadruplos[i-1]['res']

    # print contador

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
      # print izquierdo, derecho, resultado
      # Si la variable fue extraida de consola, no va a tener lugar en memoria, asi que solo se necesita trabajar con el resultado
      if (derecho == "read"):
        res = sacaTipoYLocalidad(resultado)
        pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
        # Construir string dependiendo de localidad y tipo
        stringRes = getApuntadorMemoria(res)
        # Conseguir indice de la variable dentro de su lista
        indexRes = int(resultado) - getattr(memoria, stringRes)

        pedazoMemoriaResultado[indexRes] = izquierdo
      # Si no, buscamos en memoria para ambos casos
      elif (derecho == 'return'):
        res = sacaTipoYLocalidad(resultado)
        pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
        # Construir string dependiendo de localidad y tipo
        stringRes = getApuntadorMemoria(res)
        # Conseguir indice de la variable dentro de su lista
        indexRes = int(resultado) - getattr(memoria, stringRes)

        pedazoMemoriaResultado[indexRes] = izquierdo
      elif (derecho == 'special'):
        res = sacaTipoYLocalidad(resultado)
        pedazoMemoriaResultado = getattr(memoria, res[1])[res[0]]
        # Construir string dependiendo de localidad y tipo
        stringRes = getApuntadorMemoria(res)
        # Conseguir indice de la variable dentro de su lista
        indexRes = int(resultado) - getattr(memoria, stringRes)

        pedazoMemoriaResultado[indexRes] = izquierdo
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
      # Sacar la memoria de la funcion anterior del stack y asignarla a la memoria local
      # print (bandera, contadorLlamadas)
      if not bandera:
        if contadorLlamadas != 0:
          memoria.locales = Stack_local.pop()
          funcionPadre = Stack_local.pop()
          contadorLlamadas -= 1
        else:
          bandera = True

      # REGRESAR AL VALOR DE RETORNO
      # print funcionPadre, ret, apuntador_main
      # if funcionPadre == 'main':
      i = int(main) + 1
      # else:
      #   i = int(ret)

    elif (operacion == '17'):
      # print("ERA", izquierdo, derecho, resultado)
      # Checar si la funcion existe en el directiorio de funciones
      Stack_local.push(func_actual)
      if izquierdo in dirfunc:
        contadorLlamadas += 1
        # Si existe, sacar variables locales de la funcion y su firma
        firma_funcion = dirfunc[izquierdo][2]
        num_params = len(firma_funcion)
        params = dirfunc[izquierdo][5:]
        func_actual = izquierdo
        paquete_funcion = paquetes[func_actual]

        Stack_local.push(paquete_actual)
        paquete_actual = paquete_funcion
        memoria.locales = paquete_actual

    elif (operacion == '18'):
      # print("PARAM", izquierdo, derecho, resultado)
      # Checar si el tipo del primer parametro es igual al tipo primer elemento de la firma
      if derecho[0] == firma_funcion[0]:
        # Si si fue, eliminar el primer elemento de la firma
        firma_funcion = firma_funcion[1:]
        var = params[0]
        # print var
        # PASARSELO A LA FUNCION
        izq = sacaTipoYLocalidad(izquierdo)

        pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]

        # Construir string dependiendo de localidad y tipo
        stringIzq = getApuntadorMemoria(izq)
        # Conseguir indice de la variable dentro de su lista
        indexIzq = int(izquierdo) - getattr(memoria, stringIzq)
    
        for item in memoria.locales[izq[0]]:
          if item == var:
            index = memoria.locales[izq[0]].index(var)
            memoria.locales[izq[0]][index] = pedazoMemoriaIzquierdo[indexIzq]
        
        params = params[1:]

      # print(memoria.locales)  

    elif (operacion == '19'):
      # print("GOSUB", izquierdo, derecho, resultado)
      
      
      # GUARDAR CUADRUPLO A RETORNAR
      ret = contador
      # BRINCAR AL CUADRUPLO DE INICIO DE FUNCION
      
      i = int(resultado) - 1
    elif (operacion == '20'):
      # print("READ", izquierdo, derecho, resultado)

      # Leer de consola y eliminar caracteres invisibles
      print("Ingresa un valor:")
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
      print "ESPECIAL", izquierdo, derecho, resultado

      # Limpiar el string de parametros para contener solo direcciones de memoria
      if derecho[0] == '[':
        arguments = list()
        args = derecho.split(',')
        for arg in args:
          arguments.append(re.sub("[^0-9]", "", arg))

        arg1 = sacaTipoYLocalidad(arguments[0])
        arg2 = sacaTipoYLocalidad(arguments[1])

        pedazoMemoria1 = getattr(memoria, arg1[1])[arg1[0]]
        pedazoMemoria2 = getattr(memoria, arg2[1])[arg2[0]]

        string1 = getApuntadorMemoria(arg1)
        index1 = int(arguments[0]) - getattr(memoria, string1)

        string2 = getApuntadorMemoria(arg2)
        index2 = int(arguments[1]) - getattr(memoria, string2)
      else:
        der = sacaTipoYLocalidad(derecho)
        pedazoMemoriaDerecho = getattr(memoria, der[1])[der[0]]
        # Construir string dependiendo de localidad y tipo
        stringDer = getApuntadorMemoria(der)
        # Conseguir indice de la variable dentro de su lista
        indexDer = int(derecho) - getattr(memoria, stringDer)

      if izquierdo == 'mean':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = np.mean(valorATrabajar)
      elif izquierdo == 'variance':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        resul = np.var(valorATrabajar, ddof=1)
      elif izquierdo == 'median':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = np.median(valorATrabajar)
      elif izquierdo == 'stdev':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = np.std(valorATrabajar)
      elif izquierdo == 'head':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = valorATrabajar[0]
      elif izquierdo == 'tail':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = valorATrabajar[len(valorATrabajar) -1]
      elif izquierdo == 'max':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = max(valorATrabajar)
      elif izquierdo == 'min':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = min(valorATrabajar)
      elif izquierdo == 'length':
        valorATrabajar = pedazoMemoriaDerecho[indexDer]
        valorATrabajar = map(int, valorATrabajar)
        result = len(valorATrabajar)
      elif izquierdo == 'union':
        valor1 = pedazoMemoria1[index1]
        valor1 = map(int, valor1)
        valor2 = pedazoMemoria2[index2]
        valor2 = map(int, valor2)
        result = list(set(valor1) | set(valor2))
      elif izquierdo == 'intersect':
        valor1 = pedazoMemoria1[index1]
        valor1 = map(int, valor1)
        valor2 = pedazoMemoria2[index2]
        valor2 = map(int, valor2)
        result = list(set(valor1) & set(valor2))
      elif izquierdo == 'concat':
        valor1 = pedazoMemoria1[index1]
        valor1 = valor1.split('"')[1]
        valor2 = pedazoMemoria2[index2]
        valor2 = valor2.split('"')[1]
        result = '"' + valor2 + " " + valor1 + '"'
      elif izquierdo == 'bar_graph':
        valor1 = pedazoMemoria1[index1]
        valor1 = map(int, valor1)
        valor2 = pedazoMemoria2[index2]
        valor2 = map(int, valor2)
        plt.bar(valor2, valor1)
        plt.show()
      elif izquierdo == 'pie_chart':
        valor1 = pedazoMemoria1[index1]
        valor1 = map(int, valor1)
        valor2 = pedazoMemoria2[index2]
        valor2 = map(int, valor2)
        plt.pie(valor2, labels=valor1)
        plt.show()

      if resultado != '_':
        lista_cuadruplos[int(resultado)-1]['izq'] = str(result)
        lista_cuadruplos[int(resultado)-1]['der'] = "special"
      

    elif (operacion == '22'):
      # print "RETURN" + " " + izquierdo + " " + derecho + " " + resultado
      izq = sacaTipoYLocalidad(izquierdo)

      pedazoMemoriaIzquierdo = getattr(memoria, izq[1])[izq[0]]

      # Construir string dependiendo de localidad y tipo
      stringIzq = getApuntadorMemoria(izq)
      # Conseguir indice de la variable dentro de su lista
      indexIzq = int(izquierdo) - getattr(memoria, stringIzq)

      valorARetornar = pedazoMemoriaIzquierdo[indexIzq]

      # Ir al cuadruplo correspondiente y agregar el valor y la nota que es un valor regresado de una funcion
      lista_cuadruplos[int(resultado)-1]['izq'] = valorARetornar
      lista_cuadruplos[int(resultado)-1]['der'] = "return"
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