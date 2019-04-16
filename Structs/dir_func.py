# El Directorio de Funciones es un diccionario de listas
class Dir_Func:
  def __init__(self, dictionary):
    self.dictionary = dictionary
  
  def __getitem__(self, pos):
    return self.dictionary[pos][1]