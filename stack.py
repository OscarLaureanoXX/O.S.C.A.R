# La clase stack es una lista
class Stack:
  def __init__(self):
    self.items = []

  def is_empty(self):
    return self.items == []

  def push(self, data):
    self.items.append(data)

  def pop(self):
    return self.items.pop()

  def top(self):
    return self.items[self.len() -1]