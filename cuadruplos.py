# Un cuadruplo es un diccionario con sus llaves ordenadas de la siguiente manera
# {contador, operador, operandoIzq, operandoDer, resultado}
class Cuadruplo:
  def __init__(self, cont, op, izq, der, res):
    self.dict = dict()
    self.dict['cont'] = str(cont)
    self.dict['op'] = op
    self.dict['izq'] = izq
    self.dict['der'] = der
    self.dict['res'] = res

  def __getitem__(self, index):
    return self.dict[index]

  def __setitem__(self, index, value):
    self.dict[index] = value

  def __str__(self):
    return self.dict['cont'] + ' ' + self.dict['op'] + ' ' + self.dict['izq'] + ' ' + self.dict['der'] + ' ' + self.dict['res']

  def rellena():
    print()