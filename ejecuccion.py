import sys
import antlr
from Structs import Cuadruplo

def main(argv):
  antlr.main(argv)
  lista_cuadruplos = antlr.rules.cuadruplos

  while(lista_cuadruplos):
    contador = lista_cuadruplos[0]['cont']
    operacion = lista_cuadruplos[0]['op']
    izquierdo = lista_cuadruplos[0]['izq']
    derecho = lista_cuadruplos[0]['der']
    resultado = lista_cuadruplos[0]['res']
    lista_cuadruplos.pop(0)

if __name__ == '__main__':
  main(sys.argv)