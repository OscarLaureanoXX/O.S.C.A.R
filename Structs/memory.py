class Execution_Memory:
  def __init__(self):
    self.ints = dict()
    self.ints['globales'] = list()
    self.ints['locales'] = list()
    self.ints['temporales'] = list()
    self.ints['constantes'] = list()
    self.floats = dict()
    self.floats['globales'] = list()
    self.floats['locales'] = list()
    self.floats['temporales'] = list()
    self.floats['constantes'] = list()
    self.bools = dict()
    self.bools['globales'] = list()
    self.bools['locales'] = list()
    self.bools['temporales'] = list()
    self.bools['constantes'] = list()
    self.strings = dict()
    self.strings['globales'] = list()
    self.strings['locales'] = list()
    self.strings['temporales'] = list()
    self.strings['constantes'] = list()

  def __getitem__(self, type, index):
    return self.type[index]
  
  def __setitem__(self, index, value):
    return

  def __str__(self):
    return 'ints: {ints}\nfloats: {floats}\nbools: {bools}\nstrings: {strings}'.format(ints=self.ints, floats=self.floats, bools=self.bools, strings=self.strings)
    