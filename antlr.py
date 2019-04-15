import sys
from antlr4 import *
from oscarLexer import oscarLexer
from oscarParser import oscarParser
from oscarListener import oscarListener 
import rules

def main(argv):
  inp = FileStream(argv[1])
  lexer = oscarLexer(inp)
  stream = CommonTokenStream(lexer)
  parser = oscarParser(stream)
  tree = parser.programa()

  listener = oscarListener()

  walker = ParseTreeWalker()
  walker.walk(listener, tree)

if __name__ == '__main__':
  main(sys.argv)