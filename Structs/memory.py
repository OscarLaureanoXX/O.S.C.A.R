class Execution_Memory:
  def __init__(self):
    # Apuntadores a inicio de memoria
    self.apuntador_globales_int = 1000
    self.apuntador_globales_float = 3000
    self.apuntador_globales_bool = 5000
    self.apuntador_globales_string = 7000
    self.apuntador_globales_list = 9000
    self.apuntador_locales_int = 11000
    self.apuntador_locales_float = 13000
    self.apuntador_locales_bool = 15000
    self.apuntador_locales_string = 17000
    self.apuntador_locales_list = 19000
    self.apuntador_temporales_int = 21000
    self.apuntador_temporales_float = 23000
    self.apuntador_temporales_bool = 25000
    self.apuntador_temporales_string = 27000
    self.apuntador_temporales_list = 29000
    self.apuntador_constantes_int = 31000
    self.apuntador_constantes_float = 33000
    self.apuntador_constantes_bool = 35000
    self.apuntador_constantes_string = 37000
    self.apuntador_constantes_list = 39000
    self.globales = dict()
    self.globales['int'] = dict()
    self.globales['float'] = dict()
    self.globales['bool'] = dict()
    self.globales['string'] = dict()
    self.globales['list'] = dict()
    self.locales = dict()
    self.locales['int'] = dict()
    self.locales['float'] = dict()
    self.locales['bool'] = dict()
    self.locales['string'] = dict()
    self.locales['list'] = dict()
    self.temporales = dict()
    self.temporales['int'] = dict()
    self.temporales['float'] = dict()
    self.temporales['bool'] = dict()
    self.temporales['string'] = dict()
    self.temporales['list'] = dict()
    self.constantes = dict()
    self.constantes['int'] = dict()
    self.constantes['float'] = dict()
    self.constantes['bool'] = dict()
    self.constantes['string'] = dict()
    self.constantes['list'] = dict()

  def __getitem__(self, type, index):
    return self.type[index]
  
  def __setitem__(self, index, value):
    return

  def __str__(self):
    return 'globales: {globales}\nlocales: {locales}\ntemporales: {temporales}\nconstantes: {constantes}'.format(globales=self.globales, locales=self.locales, temporales=self.temporales, constantes=self.constantes)
    