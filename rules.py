from dir_func import Dir_Func
from stack import Stack
from semantic_cube import Semantic_Cube

# Variables globales
dir_func = 'None'
func_actual = 'global'
oraculo = Semantic_Cube().cubo_semantico
cont_Temporales = 1

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

  var = varName.encode('UTF-8')
  tipo = type.encode('UTF-8')
  # Checando si ya existe esa variable
  if var in dir_func.__getitem__(func_actual):
    print("Nombre de variable repetido")
  else:
    # Agregar a la tabla
    dir_func.__getitem__(func_actual)[var] = [tipo]

# Agregar numero de renglon de una lista [sizeR]
# a una tabla de variables con nombre [tableName]
def addRows(tableName, sizeR):

  name = tableName.encode('UTF-8')
  rows = sizeR.encode('UTF-8')

  dir_func.__getitem__(func_actual)[name].append(rows)

# Agregar numero de columna de una lista [sizeC]
# a una tabla de variables con nombre [tableName]
def addColumns(tableName, sizeC):
  
  name = tableName.encode('UTF-8')
  cols = sizeC.encode('UTF-8')

  dir_func.__getitem__(func_actual)[name].append(cols)

# Agregar una funcion llamada [func_name] de tipo [func_type] 
# a la tabla de funciones [func_table]
def add_to_func_table(func_name, func_type):
  global func_actual
  global dir_func

  name = func_name.encode('UTF-8')
  tipo = func_type.encode('UTF-8')

  # Checando si ya existe esa funcion
  if func_name in dir_func.dictionary:
    print("Nombre de funcion repetido")
  else:
    # Agregar a la tabla
    dir_func.dictionary[name] = [tipo,{}]
    func_actual = name

# Agregar el operador [op] dentro de la pila de operadores
def add_to_operator_stack(op):
  global pilaOperadores
  
  #print("agregando operador" + op + " a la pila de operadores")
  pilaOperadores.push(op)

# Agregar la variable [id] dentro de la pila de operandos
def add_to_operand_stack(id):
  global pilaOperandos
  global pilaTipos
  global func_actual
  global dir_func

  # buscar en la funcion actual, si no se encuentra entonces buscar en la funcion global
  try:
    tipo = dir_func.__getitem__(func_actual)[id][0]
  except KeyError:
    # Si no se encuentra en la funcion global entonces marcar error
    try:
      tipo = dir_func.__getitem__('oscar')[id]
    except KeyError:
      print("Variable " + "'" + id + "'" + " no declarada")
      return

  #print("agregando variable " + id + " del tipo " + tipo + " a la pila de operandos")
  pilaOperandos.push(id)
  pilaTipos.push(tipo)

def pop_sum_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores
  global cont_Temporales

  suma = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()
  temp = 't'+ str(cont_Temporales)

  # Impresion de Cuadruplos
  print(suma+" "+izq+" "+der+" "+temp)

  pilaOperandos.push('t'+ str(cont_Temporales))
  pilaTipos.push(oraculo[t1][t2][suma])
  cont_Temporales = cont_Temporales + 1

def pop_mult_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores
  global cont_Temporales

  suma = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()
  temp = 't'+ str(cont_Temporales)

  # Impresion de Cuadruplos
  print(suma+" "+izq+" "+der+" "+temp)

  pilaOperandos.push('t'+ str(cont_Temporales))
  pilaTipos.push(oraculo[t1][t2][suma])
  cont_Temporales = cont_Temporales + 1

def pop_equals_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores

  igual = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()

  # print(izq+" "+igual+" "+der)
  print(igual+" "+der+" _ "+izq)

def destroy():
  # Imprimiendo toda la tabla
  print(dir_func.dictionary)