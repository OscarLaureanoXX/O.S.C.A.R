# El Directorio de Funciones es un diccionario de listas
class Dir_Func:
  def __init__(self, dictionary):
    self.dictionary = dictionary
  
  def __getitem__(self, pos):
    return dictionary[pos][1]

# Variables globales
dictionary = {}
dir_func = Dir_Func(dictionary) 
func_actual = 'None'


def create_function_table():
  print("CREATE FUNCTION TABLE")

def create_variable_table(texto):
  print("CHECAR SI LA TABLA DE VARIABLES NO HA SIDO CREADA")
  print("LLAMADA DESDE "+texto+" CREATE VARIABLE TABLE")

# Agregar una variable llamada [varName] de tipo [type] 
# a la tabla correspondiente
def add_to_var_table(varName, type):
  global dir_func

  # Checando si ya existe esa variable
  if varName in dir_func.__getitem__(func_actual):
    print("Nombre de variable repetido")
  else:
    # Agregar a la tabla
    dir_func.__getitem__(func_actual)[varName] = type
  
  print("ADD TO VAR TABLE: " + varName + " " + type + " Func name:" + func_actual)


def asignacion(texto):
  print("ASIGNAR: " + texto)

# Agregar una funcion llamada [func_name] de tipo [func_type] 
# a la tabla de funciones [func_table]
def add_to_func_table(func_name, func_type):
  global func_actual
  global dir_func
  # Checando si ya existe esa funcion
  if func_name in dir_func.dictionary:
    print("Nombre de función repetido")
  else:
    # Agregar a la tabla
    dir_func.dictionary[func_name] = [func_type,{}]
    func_actual = func_name


def destroy():
  print("DESTROY EVERYTHING")
  # Imprimiendo toda la tabla
  print(dir_func.dictionary)

def delete_var_table():
  print("DELET VAR TABLE")