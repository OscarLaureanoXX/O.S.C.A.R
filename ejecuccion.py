import sys
import antlr

memoria = antlr.rules.memoria

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  dirfunc = antlr.rules.dir_func.dictionary

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
      pedazoMemoriaResultado = getattr(memoria, res[0])[res[1]]
      valorRes = [pedazoMemoriaResultado[value] for value in pedazoMemoriaResultado if int(resultado) == value]

      print(valorRes[0])
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
        pedazoMemoriaResultado = getattr(memoria, res[0])[res[1]]
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

        pedazoMemoriaResultado = getattr(memoria, res[0])[res[1]]
        pedazoMemoriaIzquierdo = getattr(memoria, izq[0])[izq[1]]

        # print(pedazoMemoriaResultado, pedazoMemoriaIzquierdo)

        # Sacar valor de memoria
        valorRes = [pedazoMemoriaResultado[value] for value in pedazoMemoriaResultado if int(resultado) == value]
        valorIzq = [pedazoMemoriaIzquierdo[value] for value in pedazoMemoriaIzquierdo if int(izquierdo) == value]
        # print(resultado)

        # print(valorRes, valorIzq)

        for item in pedazoMemoriaResultado.items():
          # print(item, resultado)
          if (item[1] == valorRes[0] and item[0] == int(resultado)):
            pedazoMemoriaResultado[item[0]] = valorIzq[0]

        # print(pedazoMemoriaResultado)

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

      pedazoMemoriaIzquierdo = getattr(memoria, izq[0])[izq[1]]

      valorIzq = [pedazoMemoriaIzquierdo[value] for value in pedazoMemoriaIzquierdo if int(izquierdo) == value]

      if (valorIzq[0] == False):
        # BRINCAR AL CUADRUPLO: resultado
        i = int(resultado) - 1
    elif (operacion == '16'):
      # print("ENDPROC", izquierdo, derecho, resultado)
      # REGRESAR AL VALOR DE RETORNO
      i = int(ret)
    elif (operacion == '17'):
      print("ERA", izquierdo, derecho, resultado)
      # Checar si la funcion existe en el directiorio de funciones
      if izquierdo in dirfunc:
        # Si existe, sacar variables locales de la funcion y su firma
        variables_locales_funcion = dirfunc[izquierdo][3]
        firma_funcion = dirfunc[izquierdo][2]

        # Creando espacio de memoria para la funcion
        for variable_local in dirfunc[izquierdo][1]:
          nombre = variable_local
          tipo = dirfunc[izquierdo][1][variable_local][0]

          if tipo == 'int':
            memoria.int['local'][memoria.apuntador_int_local] = nombre
            memoria.apuntador_int_local += 1
          elif tipo == 'float':
            memoria.float['local'][memoria.apuntador_float_local] = nombre
            memoria.apuntador_float_local += 1
          elif tipo == 'bool':
            memoria.bool['local'][memoria.apuntador_bool_local] = nombre
            memoria.apuntador_bool_local += 1
          elif tipo == 'string':
            memoria.string['local'][memoria.apuntador_string_local] = nombre
            memoria.apuntador_string_local += 1

        print memoria
    elif (operacion == '18'):
      print("PARAM", izquierdo, derecho, resultado)
      # Checar si el primer parametro es igual al primer elemento de la firma
      if izquierdo == firma_funcion[0]:
        # Si si fue, eliminar el primer elemento de la firma
        firma_funcion = firma_funcion[1:]
        # PASARSELO A LA FUNCION

    elif (operacion == '19'):
      print("GOSUB", izquierdo, derecho, resultado) 
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
    else:
      print(operacion)

    i = i + 1

def sacaTipoYLocalidad(variable):
  if (1000 <= int(variable) < 9000):
    tipo = 'int'
    if (1000 <= int(variable) < 3000):
      localidad = 'global'
    elif (3000 <= int(variable) < 5000):
      localidad = 'local'
    elif (5000 <= int(variable) < 7000):
      localidad = 'temporal'
    elif (7000 <= int(variable) < 9000):
      localidad = 'constante'
  elif (9000 <= int(variable) < 17000):
    tipo = 'float'
    if (9000 <= int(variable) < 11000):
      localidad = 'global'
    elif (11000 <= int(variable) < 13000):
      localidad = 'local'
    elif (13000 <= int(variable) < 15000):
      localidad = 'temporal'
    elif (15000 <= int(variable) < 17000):
      localidad = 'constante'
  elif (17000 <= int(variable) < 25000):
    tipo = 'string'
    if (17000 <= int(variable) < 19000):
      localidad = 'global'
    elif (19000 <= int(variable) < 21000):
      localidad = 'local'
    elif (21000 <= int(variable) < 23000):
      localidad = 'temporal'
    elif (23000 <= int(variable) < 25000):
      localidad = 'constante'
  elif (25000 <= int(variable) < 31000):
    tipo = 'bool'
    if (25000 <= int(variable) < 27000):
      localidad = 'global'
    elif (27000 <= int(variable) < 29000):
      localidad = 'local'
    elif (29000 <= int(variable) < 31000):
      localidad = 'temporal'
    elif (31000 <= int(variable) < 33000):
      localidad = 'constante'
  
  return [tipo, localidad]

def hazOperacion(operacion, izquierdo, derecho, resultado):
  global memoria
  # print(izquierdo, derecho, resultado)

  res = sacaTipoYLocalidad(resultado)
  izq = sacaTipoYLocalidad(izquierdo)
  der = sacaTipoYLocalidad(derecho)

  # print(izq, der, res)

  pedazoMemoriaResultado = getattr(memoria, res[0])[res[1]]
  pedazoMemoriaIzquierdo = getattr(memoria, izq[0])[izq[1]]
  pedazoMemoriaDerecho = getattr(memoria, der[0])[der[1]]

  valorRes = [pedazoMemoriaResultado[value] for value in pedazoMemoriaResultado if int(resultado) == value]
  valorIzq = [pedazoMemoriaIzquierdo[value] for value in pedazoMemoriaIzquierdo if int(izquierdo) == value]
  valorDer = [pedazoMemoriaDerecho[value] for value in pedazoMemoriaDerecho if int(derecho) == value]

  # print(valorIzq, valorDer, valorRes)
  
  for item in pedazoMemoriaResultado.items():
    if (item[1] == valorRes[0]):
      pedazoMemoriaResultado[item[0]] = eval(str(valorIzq[0]) + operacion + str(valorDer[0]))

  # print(pedazoMemoriaResultado)

if __name__ == '__main__':
  main(sys.argv)