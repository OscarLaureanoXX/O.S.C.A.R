def testing(texto):
  print(texto)

def create_function_table():
  print("CREATE FUNCTION TABLE")
  dir_func = dict()
  print(dir_func)

def create_variable_table(texto):
  print("CHECAR SI LA TABLA DE VARIABLES NO HA SIDO CREADA")
  print("LLAMADA DESDE "+texto+" CREATE VARIABLE TABLE")

def add_to_var_table(varName, tipo):
  print("ADD TO VAR TABLE: " + varName + " " + tipo)

def asignacion(texto):
  print("ASIGNAR: " + texto)

def add_to_func_table(texto):
  print("ADD TO FUNC TABLE: " + texto)

def destroy():
  print("DESTROY EVERYTHING")

def delete_var_table():
  print("DELET VAR TABLE")