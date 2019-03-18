def testing():
  print("Importing functions")

def create_function_table():
  function_table = dict(
    ['program'] = ['global']
  )

def create_variable_table(varTableName, scope):
  if scope = "global":
    function_table['program'].append(varTableName)
  else:
    function_table[varTableName] = list()

def add_to_variable_table(varTableName, varName, varType):
  #variable_table[varTableName] 