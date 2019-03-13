import sys
from antlr4 import *
from testParser import testParser
from testListener import testListener

class MyListener(testListener) :
  # Enter a parse tree produced by testParser#says.
    def enterSays(self, ctx):
      pass

    # Exit a parse tree produced by testParser#says.
    def exitSays(self, ctx):
      pass

    # Enter a parse tree produced by testParser#string.
    def enterString(self, ctx):
      pass

    # Exit a parse tree produced by testParser#string.
    def exitString(self, ctx):
      pass