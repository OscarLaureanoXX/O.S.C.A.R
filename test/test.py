import sys
from antlr4 import *
from testLexer import testLexer
from testParser import testParser
from myListener import MyListener 

def main(argv):
  inp = FileStream(argv[1])
  lexer = testLexer(inp)
  stream = CommonTokenStream(lexer)
  parser = testParser(stream)
  tree = parser.says()

  listener = MyListener()

  walker = ParseTreeWalker()
  walker.walk(listener, tree)

if __name__ == '__main__':
  main(sys.argv)