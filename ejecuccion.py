import sys
import antlr

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  tabla_ints = antlr.rules.tabla_const_int
  
  i = 1
  print("___CUADRUPLOS___")
  while(lista_cuadruplos):
    contador = lista_cuadruplos[0]['cont']
    operacion = lista_cuadruplos[0]['op']
    izquierdo = lista_cuadruplos[0]['izq']
    derecho = lista_cuadruplos[0]['der']
    resultado = lista_cuadruplos[0]['res']

    # Valores de CODIGOS DE EJECUCCION
    # PRINT = '1'
    # SUMA = '2'
    # RESTA = '3'
    # MULTIPLICACION = '4'
    # DIVISION = '5'
    # MODULO = '6'
    # MAYOR = '7'
    # MENOR = '8'
    # MAYORQUE = '9'
    # MENORQUE = '10'
    # ASIGNACION = '11'
    # EQUAL = '12'
    # NOTEQUAL = '13'
    # GOTO = '14'
    # GOTOF = '15'

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

if __name__ == '__main__':
  main(sys.argv)