# Generated from test.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"\5\21\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3")
        buf.write(u"\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\r\2\b\3\2\2\2\4\13\3\2")
        buf.write(u"\2\2\6\16\3\2\2\2\b\t\7\3\2\2\t\n\5\4\3\2\n\3\3\2\2\2")
        buf.write(u"\13\f\7\5\2\2\f\r\5\6\4\2\r\5\3\2\2\2\16\17\b\4\1\2\17")
        buf.write(u"\7\3\2\2\2\2")
        return buf.getvalue()


class testParser ( Parser ):

    grammarFileName = "test.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'says'" ]

    symbolicNames = [ u"<INVALID>", u"<INVALID>", u"WS", u"STRING" ]

    RULE_says = 0
    RULE_string = 1
    RULE_printz = 2

    ruleNames =  [ u"says", u"string", u"printz" ]

    EOF = Token.EOF
    T__0=1
    WS=2
    STRING=3

    def __init__(self, input, output=sys.stdout):
        super(testParser, self).__init__(input, output=output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class SaysContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(testParser.SaysContext, self).__init__(parent, invokingState)
            self.parser = parser

        def string(self):
            return self.getTypedRuleContext(testParser.StringContext,0)


        def getRuleIndex(self):
            return testParser.RULE_says

        def enterRule(self, listener):
            if hasattr(listener, "enterSays"):
                listener.enterSays(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSays"):
                listener.exitSays(self)




    def says(self):

        localctx = testParser.SaysContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_says)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.match(testParser.T__0)
            self.state = 7
            self.string()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class StringContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(testParser.StringContext, self).__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(testParser.STRING, 0)

        def printz(self):
            return self.getTypedRuleContext(testParser.PrintzContext,0)


        def getRuleIndex(self):
            return testParser.RULE_string

        def enterRule(self, listener):
            if hasattr(listener, "enterString"):
                listener.enterString(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitString"):
                listener.exitString(self)




    def string(self):

        localctx = testParser.StringContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_string)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 9
            self.match(testParser.STRING)
            self.state = 10
            self.printz()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class PrintzContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(testParser.PrintzContext, self).__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return testParser.RULE_printz

        def enterRule(self, listener):
            if hasattr(listener, "enterPrintz"):
                listener.enterPrintz(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitPrintz"):
                listener.exitPrintz(self)




    def printz(self):

        localctx = testParser.PrintzContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_printz)
        try:
            self.enterOuterAlt(localctx, 1)
            print('hi')
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





