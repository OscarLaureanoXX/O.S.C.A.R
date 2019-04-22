import sys
import antlr

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  memoria = antlr.rules.memoria
  
  i = 0
  print("___CUADRUPLOS___")
  while(lista_cuadruplos):
    contador = lista_cuadruplos[0]['cont']
    operacion = lista_cuadruplos[0]['op']
    izquierdo = lista_cuadruplos[0]['izq']
    derecho = lista_cuadruplos[0]['der']
    resultado = lista_cuadruplos[0]['res']

    # Sacar los datos e ir metiendo los valores a memoria

    if (operacion == '1'):
      print(str(i)+": " + "PRINT" + "\t_\t_\t" + resultado)
    elif (operacion == '2'):
      print(str(i)+": " + izquierdo + "\t" + "SUMA" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '3'):
      print(str(i)+": " + izquierdo + "\t" + "RESTA" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '4'):
      print(str(i)+": " + izquierdo + "\t" + "MULTIPLICACION" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '5'):
      print(str(i)+": " + izquierdo + "\t" + "DIVISION" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '6'):
      print(str(i)+": " + izquierdo + "\t" + "MODULO" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '7'):
      print(str(i)+": " + izquierdo + "\t" + "MAYOR" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '8'):
      print(str(i)+": " + izquierdo + "\t" + "MENOR" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '9'):
      print(str(i)+": " + izquierdo + "\t" + "MAYORIGUAL" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '10'):
      print(str(i)+": " + izquierdo + "\t" + "MENORIGUAL" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '11'):
      print(str(i)+": " + resultado + "\t" + "ASIGNACION" + "\t_\t" + izquierdo)
      # Sacar tipo y localidad de resultado y valor a asignar
      # res = sacaTipoYLocalidad(resultado)
      # izq = sacaTipoYLocalidad(izquierdo)

      # print(res, izq)

      # pedazoMemoriaResultado = getattr(memoria, res[0])[res[1]]
      # pedazoMemoriaIzquierdo = getattr(memoria, izq[0])[izq[1]]

      # print(pedazoMemoriaResultado, pedazoMemoriaIzquierdo)

      # # Sacar valor de memoria
      # valorRes = [value for value in pedazoMemoriaResultado if int(resultado) == pedazoMemoriaResultado[value]]
      # valorIzq = [value for value in pedazoMemoriaIzquierdo if int(izquierdo) == pedazoMemoriaIzquierdo[value]]

      # print(valorRes, valorIzq)

      # for item in getattr(memoria, res[0])[res[1]].items():
      #   if (item[0] == valorRes[0]):
      #     getattr(memoria, res[0])[res[1]][valorIzq[0]] = pedazoMemoriaResultado.pop(item[0])

      # print(getattr(memoria, res[0])[res[1]])

    elif (operacion == '12'):
      print(str(i)+": " + izquierdo + "\t" + "EQUAL" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '13'):
      print(str(i)+": " + izquierdo + "\t" + "NOTEQUAL" + "\t" + derecho + "\t" + resultado)
    elif (operacion == '14'):
      print(str(i)+": " + "GOTO " + "\t" + izquierdo + "\t_\t" + resultado)
    elif (operacion == '15'):
      print(str(i)+": " + "GOTOF "+ "\t" + izquierdo + "\t_\t" + resultado)
    else:
      print(operacion)

    lista_cuadruplos.pop(0)
    i = i + 1

def sacaTipoYLocalidad(variable):
  if (1000 <= int(variable) < 9000):
    tipo = 'ints'
    if (1000 <= int(variable) < 3000):
      localidad = 'globales'
    elif (3000 <= int(variable) < 5000):
      localidad = 'locales'
    elif (5000 <= int(variable) < 7000):
      localidad = 'temporales'
    elif (7000 <= int(variable) < 9000):
      localidad = 'constantes'
  elif (9000 <= int(variable) < 17000):
    tipo = 'floats'
    if (9000 <= int(variable) < 11000):
      localidad = 'globales'
    elif (11000 <= int(variable) < 13000):
      localidad = 'locales'
    elif (13000 <= int(variable) < 15000):
      localidad = 'temporales'
    elif (15000 <= int(variable) < 17000):
      localidad = 'constantes'
  elif (17000 <= int(variable) < 25000):
    tipo = 'strings'
    if (17000 <= int(variable) < 19000):
      localidad = 'globales'
    elif (19000 <= int(variable) < 21000):
      localidad = 'locales'
    elif (21000 <= int(variable) < 23000):
      localidad = 'temporales'
    elif (23000 <= int(variable) < 25000):
      localidad = 'constantes'
  elif (25000 <= int(variable) < 31000):
    tipo = 'bools'
    if (25000 <= int(variable) < 27000):
      localidad = 'globales'
    elif (27000 <= int(variable) < 29000):
      localidad = 'locales'
    elif (29000 <= int(variable) < 31000):
      localidad = 'temporales'
    elif (31000 <= int(variable) < 33000):
      localidad = 'constantes'
  
  return [tipo, localidad]

if __name__ == '__main__':
  main(sys.argv)