# Cubo semantico
cubo_semantico = {
  'int': {
    'int': {
      '+' : 'int',
      '-' : 'int',
      '/' : 'float',
      '*' : 'int',
      '%' : 'int',
      '>' : 'bool',
      '>=' : 'bool',
      '<=' : 'bool',
      '<' : 'bool',
      '==' : 'bool',
      '!=' : 'bool',
      '&&' : 'ERR',
      '||' : 'ERR'
    },
    'float': {
      '+': 'float'
    }
  },
  'float': {
    'int': {
      '+': 'float'
    },
    'float': {
      '+': 'float'
    }
  }
}

print(cubo_semantico['int']['int']['+'])
print(cubo_semantico['int']['int']['/'])
print(cubo_semantico['int']['int']['>'])
print(cubo_semantico['int']['int']['=='])
print(cubo_semantico['int']['int']['&&'])

print(cubo_semantico['int']['float']['+'])