import sys
from antlr4 import *
from oscarLexer import oscarLexer
from oscarParser import oscarParser
from myListener import MyListener 

def main():
  inp = StdinStream()
  lexer = oscarLexer(inp)
  stream = CommonTokenStream(lexer)
  parser = oscarParser(stream)
  tree = parser.programa()

  output = open("output.oscar","w")

  listener = MyListener(output)

  walker = ParseTreeWalker()
  walker.walk(listener, tree)

  output.close()

if __name__ == '__main__':
  main()