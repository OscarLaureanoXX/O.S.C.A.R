class Execution_Memory:
  def __init__(self):
    # Index de los bloques de memoria por tipo
    self.indexInt = 0
    self.indexFloat = 1
    self.indexBool = 2
    self.indexString = 3
    self.indexList = 4

    # Direcciones Base
    # Globales [ 1000 - 5999 ]
    self.globales_int = 1000
    self.globales_float = self.globales_int + 1000
    self.globales_bool = self.globales_float + 1000
    self.globales_string = self.globales_bool + 1000
    self.globales_list = self.globales_string + 1000

    # Constantes [ 6000 - 10999]
    self.constantes_int = 6000
    self.constantes_float = self.constantes_int + 1000
    self.constantes_bool = self.constantes_float + 1000
    self.constantes_string = self.constantes_bool + 1000
    self.constantes_list = self.constantes_string + 1000

    # Locales y Temporales [ 11000 - 20999]
    self.locales_int = 11000
    self.locales_float = self.locales_int + 2000
    self.locales_bool = self.locales_float + 2000
    self.locales_string = self.locales_bool + 2000
    self.locales_list = self.locales_string + 2000


    # Apuntadores a inicio de memoria
    self.apuntador_globales_int = 0
    self.apuntador_globales_float = 0
    self.apuntador_globales_bool = 0
    self.apuntador_globales_string = 0
    self.apuntador_globales_list = 0
    self.apuntador_locales_int = 0
    self.apuntador_locales_float = 0
    self.apuntador_locales_bool = 0
    self.apuntador_locales_string = 0
    self.apuntador_locales_list = 0
    self.apuntador_constantes_int = 0
    self.apuntador_constantes_float = 0
    self.apuntador_constantes_bool = 0
    self.apuntador_constantes_string = 0
    self.apuntador_constantes_list = 0
    self.globales = []
    self.globales.append([])
    self.globales.append([])
    self.globales.append([])
    self.globales.append([])
    self.globales.append([])
    self.constantes = []
    self.constantes.append([])
    self.constantes.append([])
    self.constantes.append([])
    self.constantes.append([])
    self.constantes.append([])
    self.locales = []
    self.locales.append([])
    self.locales.append([])
    self.locales.append([])
    self.locales.append([])
    self.locales.append([])

  def __getitem__(self, type, index):
    return self.type[index]
  
  def __setitem__(self, index, value):
    return

  def __str__(self):
    return 'globales: {globales}\nlocales: {locales}\nconstantes: {constantes}'.format(globales=self.globales, locales=self.locales, constantes=self.constantes)
    