import sys
import antlr

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos
  tabla_ints = antlr.rules.tabla_const_int

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
      print("La operacion es: " + "PRINT" + " " + resultado)
    elif (operacion == '2'):
      print("La operacion es: " + izquierdo + " " + "SUMA" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '3'):
      print("La operacion es: " + izquierdo + " " + "RESTA" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '4'):
      print("La operacion es: " + izquierdo + " " + "MULTIPLICACION" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '5'):
      print("La operacion es: " + izquierdo + " " + "DIVISION" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '6'):
      print("La operacion es: " + izquierdo + " " + "MODULO" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '7'):
      print("La operacion es: " + izquierdo + " " + "MAYOR" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '8'):
      print("La operacion es: " + izquierdo + " " + "MENOR" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '9'):
      print("La operacion es: " + izquierdo + " " + "MAYORQUE" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '10'):
      print("La operacion es: " + izquierdo + " " + "MENORQUE" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '11'):
      print("La operacion es: " + resultado + " " + "ASIGNACION" + " " + izquierdo)
    elif (operacion == '12'):
      print("La operacion es: " + izquierdo + " " + "EQUAL" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '13'):
      print("La operacion es: " + izquierdo + " " + "NOTEQUAL" + " " + derecho + " y el resultado queda en: " + resultado)
    elif (operacion == '14'):
      print("La operacion es: " + "GOTO " + "al cuadruplo numero: " + resultado)
    elif (operacion == '15'):
      print("La operacion es: " + "Si: " + izquierdo + " es falso entonces: " + "GOTOF " + "al cuadruplo numero " + resultado)
    else:
      print(operacion)

    lista_cuadruplos.pop(0)

if __name__ == '__main__':
  main(sys.argv)