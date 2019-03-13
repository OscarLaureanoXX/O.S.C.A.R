# Generated from test.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2")
        buf.write(u"\5 \b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3")
        buf.write(u"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\32\n\5")
        buf.write(u"\f\5\16\5\35\13\5\3\5\3\5\2\2\6\3\3\5\4\7\2\t\5\3\2\4")
        buf.write(u"\5\2\13\f\17\17\"\"\5\2\62;C\\c|\2 \2\3\3\2\2\2\2\5\3")
        buf.write(u"\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\20\3\2\2\2\7\24\3\2")
        buf.write(u"\2\2\t\26\3\2\2\2\13\f\7u\2\2\f\r\7c\2\2\r\16\7{\2\2")
        buf.write(u"\16\17\7u\2\2\17\4\3\2\2\2\20\21\t\2\2\2\21\22\3\2\2")
        buf.write(u"\2\22\23\b\3\2\2\23\6\3\2\2\2\24\25\7$\2\2\25\b\3\2\2")
        buf.write(u"\2\26\33\5\7\4\2\27\32\t\3\2\2\30\32\5\5\3\2\31\27\3")
        buf.write(u"\2\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34")
        buf.write(u"\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\5\7\4\2\37")
        buf.write(u"\n\3\2\2\2\5\2\31\33\3\b\2\2")
        return buf.getvalue()


class testLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    WS = 2
    STRING = 3

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ u"DEFAULT_MODE" ]

    literalNames = [ u"<INVALID>",
            u"'says'" ]

    symbolicNames = [ u"<INVALID>",
            u"WS", u"STRING" ]

    ruleNames = [ u"T__0", u"WS", u"COMILLAS", u"STRING" ]

    grammarFileName = u"test.g4"

    def __init__(self, input=None, output=sys.stdout):
        super(testLexer, self).__init__(input, output=output)
        self.checkVersion("4.7.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


