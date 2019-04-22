class Execution_Memory:
  def __init__(self):
    # Apuntadores a inicio de memoria
    self.apuntador_int_global = 1000
    self.apuntador_int_local = 3000
    self.apuntador_int_temp = 5000
    self.apuntador_int_const = 7000
    self.apuntador_float_global = 9000
    self.apuntador_float_local = 11000
    self.apuntador_float_temp = 13000
    self.apuntador_float_const = 15000
    self.apuntador_string_global = 17000
    self.apuntador_string_local = 19000
    self.apuntador_string_temp = 21000
    self.apuntador_string_const = 23000
    self.apuntador_bool_global = 25000
    self.apuntador_bool_local = 27000
    self.apuntador_bool_temp = 29000
    self.apuntador_bool_const = 31000
    self.int = dict()
    self.int['global'] = dict()
    self.int['local'] = dict()
    self.int['temporal'] = dict()
    self.int['constante'] = dict()
    self.float = dict()
    self.float['global'] = dict()
    self.float['local'] = dict()
    self.float['temporal'] = dict()
    self.float['constante'] = dict()
    self.bool = dict()
    self.bool['global'] = dict()
    self.bool['local'] = dict()
    self.bool['temporal'] = dict()
    self.bool['constante'] = dict()
    self.string = dict()
    self.string['global'] = dict()
    self.string['local'] = dict()
    self.string['temporal'] = dict()
    self.string['constante'] = dict()

  def __getitem__(self, type, index):
    return self.type[index]
  
  def __setitem__(self, index, value):
    return

  def __str__(self):
    return 'int: {int}\nfloat: {float}\nbool: {bool}\nstring: {string}'.format(int=self.int, float=self.float, bool=self.bool, string=self.string)
    