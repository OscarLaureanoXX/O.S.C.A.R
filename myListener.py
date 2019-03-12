import sys
from antlr4 import *
from oscarParser import oscarParser
from oscarListener import oscarListener

class MyListener(oscarListener) :
  def __init__(self, output):
    self.output = output
    self.output.write(':D')