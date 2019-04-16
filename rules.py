import sys
from Structs import *

# Variables globales
dir_func = 'None'
func_actual = 'global'
oraculo = Semantic_Cube().cubo_semantico
cont_Temporales = 1
cont_Cuadruplos = 1

# Tablas de constantes
# { valor : direccion }
tabla_const_int = {}
tabla_const_float = {}
tabla_const_bool = {}
tabla_const_string = {}

# Valores iniciales de direcciones para tablas de constantes
cont_const_bool = 10000
cont_const_int = 11000
cont_const_float = 12000
cont_const_string = 13000

# Pilas para expresiones
pilaOperandos = Stack()
pilaOperadores = Stack()
pilaTipos = Stack()
pilaSaltos = Stack()

# Lista de cuadruplos
cuadruplos = list()

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
def add_to_operand_stack(id, type):
  global pilaOperandos
  global pilaTipos
  global func_actual
  global dir_func

  # Si es un int se agrega a la tabla de constantes int
  if (type == 'int'):
    global tabla_const_int
    global cont_const_int

    id = id.encode('UTF-8')

    if id not in tabla_const_int:
      tabla_const_int[id] = cont_const_int
      cont_const_int += 1
    
    pilaOperandos.push(id)
    pilaTipos.push('int')

  # Si es un float se agrega a la tabla de floats
  elif (type == 'float'):
    global tabla_const_float
    global cont_const_float

    id = id.encode('UTF-8')

    if id not in tabla_const_float:
      tabla_const_float[id] = cont_const_float
      cont_const_float += 1
    
    pilaOperandos.push(id)
    pilaTipos.push('float')
  
  # Si es un bool se agrega a la tabla de bools
  elif (type == 'bool'):
    global tabla_const_bool
    global cont_const_bool

    id = id.encode('UTF-8')

    if id not in tabla_const_bool:
      tabla_const_bool[id] = cont_const_bool
      cont_const_bool += 1
    
    pilaOperandos.push(id)
    pilaTipos.push('bool')

  # Si es un string se agrega a la tabla de strings
  elif (type == 'string'):
    global tabla_const_string
    global cont_const_string

    id = id.encode('UTF-8')

    if id not in tabla_const_string:
      tabla_const_string[id] = cont_const_string
      cont_const_string += 1
    
    pilaOperandos.push(id)
    pilaTipos.push('string')

  else:
    # buscar en la funcion actual, si no se encuentra entonces buscar en la funcion global
    try:
      tipo = dir_func.__getitem__(func_actual)[id][0]
    except KeyError:
      # Si no se encuentra en la funcion global entonces marcar error
      try:
        tipo = dir_func.__getitem__('oscar')[id][0]
      except KeyError:
        print("Variable " + "'" + id + "'" + " no declarada")
        return
    id = id.encode('UTF-8')
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

  if (oraculo[t1][t2][suma] == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + suma)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  cuadruplo = Cuadruplo(cont_Cuadruplos, suma, izq, der, temp)
  print(cuadruplo)
  cuadruplos.append(cuadruplo)

  pilaOperandos.push('t'+ str(cont_Temporales))
  pilaTipos.push(oraculo[t1][t2][suma])
  cont_Temporales = cont_Temporales + 1
  cont_Cuadruplos = cont_Cuadruplos + 1

def pop_mult_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores
  global cont_Temporales

  mult = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()
  temp = 't'+ str(cont_Temporales)

  if (oraculo[t1][t2][mult] == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + mult)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  cuadruplo = Cuadruplo(cont_Cuadruplos, mult, izq, der, temp)
  print(Cuadruplo)
  cuadruplos.append(cuadruplo)

  pilaOperandos.push('t'+ str(cont_Temporales))
  pilaTipos.push(oraculo[t1][t2][mult])
  cont_Temporales = cont_Temporales + 1
  cont_Cuadruplos = cont_Cuadruplos + 1

def pop_equals_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores

  igual = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()


  if(t1 == t2):
    global cont_Cuadruplos
    global cuadruplos
    cuadruplo = Cuadruplo(cont_Cuadruplos , igual, der, '_', izq)
    cont_Cuadruplos = cont_Cuadruplos + 1
    print(cuadruplo)
    cuadruplos.append(cuadruplo)
  else:
    sys.exit("Incompatible type for operation " + igual)
  

def pop_rel_from_stack():
  global pilaOperandos
  global pilaTipos
  global pilaOperadores
  global cont_Temporales

  rel = pilaOperadores.pop()
  der = pilaOperandos.pop()
  t1 = pilaTipos.pop()
  izq = pilaOperandos.pop()
  t2 = pilaTipos.pop()
  temp = 't'+ str(cont_Temporales)

  if (oraculo[t1][t2][rel] == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + rel)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  cuadruplo = Cuadruplo(cont_Cuadruplos, rel, izq, der, temp)
  print(cuadruplo)
  cuadruplos.append(cuadruplo)

  pilaOperandos.push('t'+ str(cont_Temporales))
  pilaTipos.push(oraculo[t1][t2][rel])
  cont_Temporales = cont_Temporales + 1
  cont_Cuadruplos = cont_Cuadruplos + 1

def add_print():
  global pilaOperandos
  global cont_Cuadruplos
  global cuadruplos
  cuadruplo = Cuadruplo(cont_Cuadruplos ,'PRINT', '_', '_', pilaOperandos.pop())

  print(cuadruplo)
  cuadruplos.append(cuadruplo)
  cont_Cuadruplos = cont_Cuadruplos + 1

def destroy():
  # Imprimiendo toda la tabla
  print(dir_func.dictionary)
  print(tabla_const_int)
  print(tabla_const_float)
  print(tabla_const_bool)
  print(cuadruplos)