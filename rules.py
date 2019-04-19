import sys
from Structs import *

# Variables globales
dir_func = 'None'
func_actual = 'global'
oraculo = Semantic_Cube().cubo_semantico
cont_Temporales = 1
cont_Cuadruplos = 1

# Memoria de ejecuccion
memoria = Execution_Memory()

# Apuntadores a inicio de memoria
apuntador_int = 1000
# apuntador_int_temp = 
# apuntador_int_const =
# apuntador_int_global =
# apuntador_int_local =
apuntador_float = 9000

apuntador_string = 17000

apuntador_bool = 23000

# Valores de CODIGOS DE EJECUCCION
PRINT = '1'
SUMA = '2'
RESTA = '3'
MULTIPLICACION = '4'
DIVISION = '5'
MODULO = '6'
MAYOR = '7'
MENOR = '8'
MAYORIGUAL = '9'
MENORIGUAL = '10'
ASIGNACION = '11'
EQUAL = '12'
NOTEQUAL = '13'
GOTO = '14'
GOTOF = '15'

# Pilas para expresiones
pilaOperandos = Stack()
pilaOperadores = Stack()
pilaTipos = Stack()
pilaSaltos = Stack()

# Lista de cuadruplos
cuadruplos = list()

# Pilas para el for
pilaInicio = Stack()
pilaStep = Stack()

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
    id = id.encode('UTF-8')

    if id not in memoria.ints:
      if (id.isdigit()):
        memoria.ints['constantes'][id] = apuntador_int
      elif (func_actual == 'oscar'):
        memoria.ints['globales'][id] = apuntador_int
      else:
        memoria.ints['locales'][id] = apuntador_int
    
    pilaOperandos.push(id)
    pilaTipos.push('int')

  # Si es un float se agrega a la tabla de floats
  elif (type == 'float'):
    id = id.encode('UTF-8')

    if id not in memoria.floats:
      memoria.floats['constantes'][id] = apuntador_float
    
    pilaOperandos.push(id)
    pilaTipos.push('float')
  
  # Si es un bool se agrega a la tabla de bools
  elif (type == 'bool'):
    id = id.encode('UTF-8')

    if id not in memoria.bools:
      memoria.bools['constantes'][id] = apuntador_bool
    
    pilaOperandos.push(id)
    pilaTipos.push('bool')

  # Si es un string se agrega a la tabla de strings
  elif (type == 'string'):
    id = id.encode('UTF-8')

    if id not in memoria.strings:
      memoria.strings['constantes'][id] = apuntador_string
    
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
        sys.exit("Variable " + "'" + id + "'" + " no declarada")
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

  tipoRes = oraculo[t1][t2][suma]

  if (tipoRes == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + suma)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  if (suma == '+'):
    cuadruplo = Cuadruplo(cont_Cuadruplos, SUMA, izq, der, temp)
  else:
    cuadruplo = Cuadruplo(cont_Cuadruplos, RESTA, izq, der, temp)
  cuadruplos.append(cuadruplo)

  if (tipoRes == 'int'):
    memoria.ints['temporales'][temp] = apuntador_int
  elif (tipoRes == 'float'):
    memoria.floats['temporales'][temp] = apuntador_int
  elif (tipoRes == 'string'):
    memoria.strings['temporales'][temp] = apuntador_int
  elif (tipoRes == 'bool'):
    memoria.bools['temporales'][temp] = apuntador_int
  
  pilaOperandos.push(temp)
  pilaTipos.push(tipoRes)
  cont_Temporales += 1
  cont_Cuadruplos += 1

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

  tipoRes = oraculo[t1][t2][mult]

  if (tipoRes == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + mult)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  if (mult == '*'):
    cuadruplo = Cuadruplo(cont_Cuadruplos, MULTIPLICACION, izq, der, temp)
  elif (mult == '/'):
    cuadruplo = Cuadruplo(cont_Cuadruplos, DIVISION, izq, der, temp)
  else:
    cuadruplo = Cuadruplo(cont_Cuadruplos, MODULO, izq, der, temp)
  cuadruplos.append(cuadruplo)

  if (tipoRes == 'int'):
    memoria.ints['temporales'][temp] = apuntador_int
  elif (tipoRes == 'float'):
    memoria.floats['temporales'][temp] = apuntador_int
  elif (tipoRes == 'string'):
    memoria.strings['temporales'][temp] = apuntador_int
  elif (tipoRes == 'bool'):
    memoria.bools['temporales'][temp] = apuntador_int

  pilaOperandos.push(temp)
  pilaTipos.push(tipoRes)
  cont_Temporales += 1
  cont_Cuadruplos += 1

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
    cuadruplo = Cuadruplo(cont_Cuadruplos , ASIGNACION, der, '_', izq)
    cont_Cuadruplos += 1
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

  tipoRes = oraculo[t1][t2][rel]

  if (tipoRes == 'ERR'):
    sys.exit('Tipos compatibles para la operacion ' + rel)

  # Impresion de Cuadruplos
  global cont_Cuadruplos
  global cuadruplos
  if (rel == '>'):
    cuadruplo = Cuadruplo(cont_Cuadruplos, MAYOR, izq, der, temp)
  elif (rel == '<'):
    cuadruplo = Cuadruplo(cont_Cuadruplos, MENOR, izq, der, temp)
  elif (rel == '<='):
    cuadruplo = Cuadruplo(cont_Cuadruplos, MENORIGUAL, izq, der, temp)
  elif (rel == '>='):
    cuadruplo = Cuadruplo(cont_Cuadruplos, MAYORIGUAL, izq, der, temp)
  elif (rel == '=='):
    cuadruplo = Cuadruplo(cont_Cuadruplos, EQUAL, izq, der, temp)
  else:
    cuadruplo = Cuadruplo(cont_Cuadruplos, NOTEQUAL, izq, der, temp)
  cuadruplos.append(cuadruplo)

  if (tipoRes == 'int'):
    memoria.ints['temporales'][temp] = apuntador_int
  elif (tipoRes == 'float'):
    memoria.floats['temporales'][temp] = apuntador_int
  elif (tipoRes == 'string'):
    memoria.strings['temporales'][temp] = apuntador_int
  elif (tipoRes == 'bool'):
    memoria.bools['temporales'][temp] = apuntador_int

  pilaOperandos.push(temp)
  pilaTipos.push(tipoRes)
  cont_Temporales += 1
  cont_Cuadruplos += 1

########################## CONDICIONALES ############################

def add_conditional():
  global cont_Cuadruplos
  global cuadruplos
  global pilaOperandos
  global pilaSaltos
  global pilaTipos

  # Validando que la expresion del if sea bool
  if pilaTipos.peek() != 'bool':
    sys.exit("Error: Expected bool expresion inside if(expresion)")
  
  # Obteniendo el resultado de la expresion para el cuadruplo
  res_Expresion = pilaOperandos.peek()

  # Generando cuadruplo con GOTOF (go to en false)
  cuadruplo = Cuadruplo(cont_Cuadruplos, GOTOF,res_Expresion,'_','_')

  # Metiendo el cuadruplo
  cuadruplos.append(cuadruplo)
  # Agregando la linea a la pila de saltos
  pilaSaltos.push(cont_Cuadruplos)

  cont_Cuadruplos += 1

def add_else():
  global cont_Cuadruplos
  global cuadruplos
  global pilaSaltos

  # Generar cuadruplo para saltar el else
  cuadruplo = Cuadruplo(cont_Cuadruplos, GOTO,'_','_','_')
  cuadruplos.append(cuadruplo)

  # Llenando el GOTOF del if correspondiente
  fill = pilaSaltos.pop()
  pilaSaltos.push(cont_Cuadruplos)

  cuadruplos.__getitem__(fill-1)['res'] = str(cont_Cuadruplos + 1)

  cont_Cuadruplos += 1

def add_end_conditional():
  global cont_Cuadruplos
  global cuadruplos
  global pilaSaltos

  # Llenando el cuadruplo final correspondiente
  final = pilaSaltos.pop()
  cuadruplos.__getitem__(final-1)['res'] = str(cont_Cuadruplos)

########################## /CONDICIONALES ############################

############################### WHILE ################################
def add_while():
  global pilaSaltos
  global cont_Cuadruplos

  pilaSaltos.push(cont_Cuadruplos)

def add_expr_while():
  add_conditional()

def add_end_while():
  global pilaSaltos
  global cont_Cuadruplos

  fin = pilaSaltos.pop()
  ret = str(pilaSaltos.pop())

  # Generar cuadruplo para volver a evaluar el while
  cuadruplo = Cuadruplo(cont_Cuadruplos, GOTO,'_','_', ret)
  cuadruplos.append(cuadruplo)

  cont_Cuadruplos += 1

  # Llenando el cuadruplo final correspondiente
  cuadruplos.__getitem__(fin-1)['res'] = str(cont_Cuadruplos)

############################### /WHILE ###############################

################################# FOR ################################
def add_for_inicio(id):
  global pilaTipos
  global pilaOperandos
  global pilaInicio

  # Validando que la expresion del inicio del for sea int
  if pilaTipos.peek() != 'int':
    sys.exit("Error: Expected int expresion on first parameter (START) of for")

  # Metiendo el inicio del for
  pilaInicio.push(id)



def add_for_limite():
  global pilaOperandos
  global pilaTipos
  global pilaStep
  global cont_Cuadruplos
  global cuadruplos
  global cont_Temporales

  # Validando que la expresion del limite superior sea int
  if pilaTipos.peek() != 'int':
    sys.exit("Error: Expected int expresion on second parameter (MAX) of for")

  # Obteniendo inicio y limite superior del ciclo
  inicio = pilaInicio.peek()
  lim_superior = pilaOperandos.peek()

  # Metiendo migaja de pan
  pilaSaltos.push(cont_Cuadruplos)

  # Generar cuadruplo de comparacion
  temp = 't'+ str(cont_Temporales)
  cuadruplo = Cuadruplo(cont_Cuadruplos, MAYORIGUAL , inicio , lim_superior , temp)
  cuadruplos.append(cuadruplo)

  cont_Temporales = cont_Temporales + 1
  cont_Cuadruplos = cont_Cuadruplos + 1

  # Generar cuadruplo de gotof
  cuadruplo = Cuadruplo(cont_Cuadruplos, GOTOF , temp , '_', '_')
  cuadruplos.append(cuadruplo)
  cont_Cuadruplos = cont_Cuadruplos + 1

  # Metiendo a la pila de Steps el valor por default del for (1)
  pilaStep.push('1')

  # Metiendo migaja de pan
  pilaSaltos.push(cont_Cuadruplos)

def add_for_step():
  global pilaTipos
  global pilaOperandos
  global pilaStep

  # Validando que la expresion del los saltos sea int
  if pilaTipos.peek() != 'int':
    sys.exit("Error: Expected int expresion on third parameter (STEP) of for")
  
  step = pilaOperandos.peek()
  pilaStep.push(step)

def add_for_final():
  global cont_Cuadruplos
  global cuadruplos
  global cont_Temporales
  global pilaStep
  global pilaInicio

  # Variables para los cuadruplos
  inicio = pilaInicio.pop()
  step = pilaStep.pop()
  fin = pilaSaltos.pop()
  ret = pilaSaltos.pop()

  # Generar cuadruplos de aumento de la variable controladora
  temp = 't'+ str(cont_Temporales)
  cuadruplo = Cuadruplo(cont_Cuadruplos, SUMA , inicio , step , temp)
  cuadruplos.append(cuadruplo)

  cont_Temporales = cont_Temporales + 1
  cont_Cuadruplos = cont_Cuadruplos + 1

  cuadruplo = Cuadruplo(cont_Cuadruplos, ASIGNACION , temp , '_' , inicio)
  cuadruplos.append(cuadruplo)

  cont_Cuadruplos = cont_Cuadruplos + 1

  # Generar cuadruplo para volver a evaluar
  cuadruplo = Cuadruplo(cont_Cuadruplos, GOTO , '_' , '_' , str(ret))
  cuadruplos.append(cuadruplo)

  cont_Cuadruplos = cont_Cuadruplos + 1

  # Llenando el cuadruplo del gotoF pendiente
  cuadruplos.__getitem__(fin-2)['res'] = str(cont_Cuadruplos)

################################ /FOR ################################

def add_print():
  global pilaOperandos
  global cont_Cuadruplos
  global cuadruplos
  cuadruplo = Cuadruplo(cont_Cuadruplos , PRINT, '_', '_', pilaOperandos.pop())

  cuadruplos.append(cuadruplo)
  cont_Cuadruplos += 1

def destroy():
  # Imprimiendo toda la tabla
  print(dir_func.dictionary)
  print(memoria)
  for i in cuadruplos:
    print(i)