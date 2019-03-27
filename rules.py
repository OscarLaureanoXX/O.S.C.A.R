# El Directorio de Funciones es un diccionario de listas
class Dir_Func:
  def __init__(self, dictionary):
    self.dictionary = dictionary
  
  def __getitem__(self, pos):
    return self.dictionary[pos][1]

# La clase stack es una lista
class Stack:
  def __init__(self):
    self.items = []

  def is_empty(self):
    return self.items == []

  def push(self, data):
    self.items.append(data)

  def pop(self):
    return self.items.pop()

  def top(self):
    return self.items[self.len() -1]

# Variables globales
dir_func = 'None'
func_actual = 'global'

# Pilas para expresiones
pilaOperandos = Stack()
pilaOperadores = Stack()
pilaTipos = Stack()
pilaSaltos = Stack()

# Inicializa el directorio de funciones y agrega la funcion global
def create_function_table():
  global dir_func
  dir_func = Dir_Func(dict())
  add_to_func_table('oscar', 'global')

# Agregar una variable llamada [varName] de tipo [type] 
# a la tabla correspondiente
def add_to_var_table(varName, type):
  global dir_func

  var = varName#varName.encode('UTF-8')
  tipo = type#type.encode('UTF-8')
  # Checando si ya existe esa variable
  if var in dir_func.__getitem__(func_actual):
    print("Nombre de variable repetido")
  else:
    # Agregar a la tabla
    dir_func.__getitem__(func_actual)[var] = [tipo]

def addRows(tableName, sizeR):
  dir_func.__getitem__(func_actual)[tableName].append(sizeR)

def addColumns(tableName, sizeC):
  dir_func.__getitem__(func_actual)[tableName].append(sizeC)

# Agregar una funcion llamada [func_name] de tipo [func_type] 
# a la tabla de funciones [func_table]
def add_to_func_table(func_name, func_type):
  global func_actual
  global dir_func
  # Checando si ya existe esa funcion
  if func_name in dir_func.dictionary:
    print("Nombre de funcion repetido")
  else:
    # Agregar a la tabla
    dir_func.dictionary[func_name] = [func_type,{}]
    func_actual = func_name

# Agregar el operador [op] dentro de la pila de operadores
def add_to_operator_stack(op):
  global pilaOperadores

  pilaOperadores.push(op)

# Agregar la variable [id] dentro de la pila de operandos
def add_to_operand_stack(id):
  global pilaOperandos
  global pilaTipos
  global func_actual
  global dir_func

  var = id#.encode('ascii')

  # buscar en la funcion actual, si no se encuentra entonces buscar en la funcion global
  try:
    tipo = dir_func.__getitem__(func_actual)[var][0]
  except KeyError:
    # Si no se encuentra en la funcion global entonces marcar error
    try:
      tipo = dir_func.__getitem__('oscar')[var]
    except KeyError:
      print("Variable " + "'" + var + "'" + " no declarada")
      return

  pilaOperandos.push(var)
  pilaTipos.push(tipo)

def destroy():
  # Imprimiendo toda la tabla
  print(dir_func.dictionary)