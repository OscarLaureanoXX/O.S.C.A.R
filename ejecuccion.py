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

    # apuntador_int_global = 1000
    # apuntador_int_local = 3000
    # apuntador_int_temp = 5000
    # apuntador_int_const = 7000
    # apuntador_float_global = 9000
    # apuntador_float_local = 11000
    # apuntador_float_temp = 13000
    # apuntador_float_const = 15000
    # apuntador_string_global = 17000
    # apuntador_string_local = 19000
    # apuntador_string_temp = 21000
    # apuntador_string_const = 23000
    # apuntador_bool_global = 25000
    # apuntador_bool_local = 27000
    # apuntador_bool_temp = 29000
    # apuntador_bool_const = 31000

    # VALORES INT = 1000 <= x < 9000
    # VALORES FLOAT = 9000 <= x < 17000
    # VALORES STRING = 17000 <= x < 25000
    # VALORES BOOL = 25000 <= x < 31000

    # Sacar tipo de izquierdo FALTA SI ES GLOBAL LOCAL ETC...
    # Sacar tipo de derecho FALTA SI ES GLOBAL LOCAL ETC...
    # Sacando tipo de resultado FALTA SI ES GLOBAL LOCAL ETC...
    if (1000 <= int(resultado) < 9000):
      tipoRes = 'int'
    elif (9000 <= int(resultado) < 17000):
      tipoRes = 'float'
    elif (17000 <= int(resultado) < 25000):
      tipoRes = 'string'
    elif (25000 <= int(resultado) < 31000):
      tipoRes = 'bool'

    print("El resultado va a ser de tipo: " + tipoRes)

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