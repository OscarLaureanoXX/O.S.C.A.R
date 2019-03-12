from antlr4 import *
from oscarLexer import oscarLexer
from oscarListener import oscarListener
from oscarParser import oscarParser
import sys

class oscarPrintListener(oscarListener):
    def enterHi(self, ctx):
        print("oscar: %s" % ctx.ID())

def main():
    lexer = oscarLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = oscarParser(stream)
    tree = parser.programa()
    printer = oscarPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
