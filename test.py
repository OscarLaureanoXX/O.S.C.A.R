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
    },
    'bool': {
      '+': ''
    },
    'string': {
      '+': ''
    },
    'list': {
      '+': ''
    }
  },
  'float': {
    'int': {
      '+': 'float'
    },
    'float': {
      '+': 'float'
    },
    'bool': {
      '+': ''
    },
    'string': {
      '+': ''
    },
    'list': {
      '+': ''
    }
  },
  'bool': {
    'int': {
      '+': ''
    },
    'float': {
      '+': ''
    },
    'bool': {
      '+': ''
    },
    'string': {
      '+': ''
    },
    'list': {
      '+': ''
    }
  },
  'string': {
    'int': {
      '+': ''
    },
    'float': {
      '+': ''
    },
    'bool': {
      '+': ''
    },
    'string': {
      '+': ''
    },
    'list': {
      '+': ''
    }
  },
  'list': {
    'int': {
      '+': ''
    },
    'float': {
      '+': ''
    },
    'bool': {
      '+': ''
    },
    'string': {
      '+': ''
    },
    'list': {
      '+': ''
    }
  }
}

print(cubo_semantico['int']['int']['+'])
print(cubo_semantico['int']['int']['/'])
print(cubo_semantico['int']['int']['>'])
print(cubo_semantico['int']['int']['=='])
print(cubo_semantico['int']['int']['&&'])

print(cubo_semantico['int']['float']['+'])