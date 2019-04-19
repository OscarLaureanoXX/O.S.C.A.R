class Execution_Memory:
  def __init__(self):
    self.ints = dict()
    self.ints['globales'] = dict()
    self.ints['locales'] = dict()
    self.ints['temporales'] = dict()
    self.ints['constantes'] = dict()
    self.floats = dict()
    self.floats['globales'] = dict()
    self.floats['locales'] = dict()
    self.floats['temporales'] = dict()
    self.floats['constantes'] = dict()
    self.bools = dict()
    self.bools['globales'] = dict()
    self.bools['locales'] = dict()
    self.bools['temporales'] = dict()
    self.bools['constantes'] = dict()
    self.strings = dict()
    self.strings['globales'] = dict()
    self.strings['locales'] = dict()
    self.strings['temporales'] = dict()
    self.strings['constantes'] = dict()

  def __getitem__(self, type, index):
    return self.type[index]
  
  def __setitem__(self, index, value):
    return

  def __str__(self):
    return 'ints: {ints}\nfloats: {floats}\nbools: {bools}\nstrings: {strings}'.format(ints=self.ints, floats=self.floats, bools=self.bools, strings=self.strings)
    