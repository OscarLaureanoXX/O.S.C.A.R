import sys
from antlr4 import *
from oscarParser import oscarParser
from oscarListener import oscarListener

class MyListener(oscarListener) :
  def __init__(self, output):
    self.output = output
    self.output.write('Program Started\n')

  def enterPrograma(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    # for child in ctx.getChildren():
      # print(child)

  def enterMain(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    firstChild = ctx.getChild(0)
    # for child in ctx.getChildren():
      # print(child)

  def enterParam(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    # print(text)

  def enterBloque(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    # print(childCount)

  def enterEstatuto(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    # print(text)

  def enterEscritura(self, ctx) :
    text = ctx.getText()
    childCount = ctx.getChildCount()
    print(text)