# La clase stack es una lista
class Stack:
  def __init__(self):
    self.items = []

  def is_empty(self):
    return self.items == []

  def push(self, data):
    self.items.append(data)

  def pop(self):
    tope = self.items[len(self.items) -1]
    self.items.pop()
    return tope
  
  def peek(self):
    return self.items[len(self.items) -1]