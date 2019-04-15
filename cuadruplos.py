# Un cuadruplo es un diccionario con sus llaves ordenadas de la siguiente manera
# {operador, operandoIzq, operandoDer, resultado}
class Cuadruplo:
  def __init__(self, op, izq, der, res):
    self.dict = dict()
    self.dict['op'] = op
    self.dict['izq'] = izq
    self.dict['der'] = der
    self.dict['res'] = res

  def __getitem__(self, index):
    return self.dict[index]

  def __setitem__(self, index, value):
    self.dict[index] = value

  def __str__(self):
    return self.dict['op'] + ' ' + self.dict['izq'] + ' ' + self.dict['der'] + ' ' + self.dict['res']

  def rellena():
    print()