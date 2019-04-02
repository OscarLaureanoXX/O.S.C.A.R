# Generated from oscar.g4 by ANTLR 4.7.2
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys


import rules


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"B\u023b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write(u"\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write(u"\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4")
        buf.write(u"\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30")
        buf.write(u"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t")
        buf.write(u"\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$")
        buf.write(u"\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t")
        buf.write(u",\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\5\2c\n\2\3\2\7\2")
        buf.write(u"f\n\2\f\2\16\2i\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3")
        buf.write(u"\3\3\3\3\3\3\5\3v\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4")
        buf.write(u"\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\5")
        buf.write(u"\5\u0089\n\5\3\5\3\5\3\6\3\6\5\6\u008f\n\6\3\6\6\6\u0092")
        buf.write(u"\n\6\r\6\16\6\u0093\3\6\3\6\3\6\3\6\5\6\u009a\n\6\3\6")
        buf.write(u"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a8")
        buf.write(u"\n\7\3\7\5\7\u00ab\n\7\3\7\5\7\u00ae\n\7\3\7\3\7\3\7")
        buf.write(u"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\7\5\7\u00bc")
        buf.write(u"\n\7\3\7\5\7\u00bf\n\7\7\7\u00c1\n\7\f\7\16\7\u00c4\13")
        buf.write(u"\7\3\7\3\7\6\7\u00c8\n\7\r\7\16\7\u00c9\3\b\3\b\3\b\3")
        buf.write(u"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d7\n\t\3\n\3\n")
        buf.write(u"\3\n\3\n\5\n\u00dd\n\n\3\n\3\n\3\n\5\n\u00e2\n\n\7\n")
        buf.write(u"\u00e4\n\n\f\n\16\n\u00e7\13\n\3\n\3\n\3\n\3\13\3\13")
        buf.write(u"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00f5\n\f\3\f\5\f")
        buf.write(u"\u00f8\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ff\n\r\3\r\3\r")
        buf.write(u"\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\16\3\16\3\16")
        buf.write(u"\3\16\3\16\3\16\3\16\5\16\u0110\n\16\3\16\3\16\3\16\7")
        buf.write(u"\16\u0115\n\16\f\16\16\16\u0118\13\16\3\17\3\17\3\17")
        buf.write(u"\3\17\3\17\3\17\3\17\5\17\u0121\n\17\3\17\3\17\5\17\u0125")
        buf.write(u"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012e\n")
        buf.write(u"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0137\n\22")
        buf.write(u"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0141\n")
        buf.write(u"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014b")
        buf.write(u"\n\23\3\24\3\24\6\24\u014f\n\24\r\24\16\24\u0150\3\24")
        buf.write(u"\3\24\3\25\3\25\3\25\5\25\u0158\n\25\3\25\3\25\3\25\3")
        buf.write(u"\26\3\26\3\26\3\26\3\26\3\26\5\26\u0163\n\26\3\26\3\26")
        buf.write(u"\3\26\5\26\u0168\n\26\7\26\u016a\n\26\f\26\16\26\u016d")
        buf.write(u"\13\26\5\26\u016f\n\26\3\26\3\26\5\26\u0173\n\26\3\26")
        buf.write(u"\3\26\3\27\3\27\3\27\3\27\7\27\u017b\n\27\f\27\16\27")
        buf.write(u"\u017e\13\27\5\27\u0180\n\27\3\27\3\27\3\30\3\30\3\30")
        buf.write(u"\3\30\5\30\u0188\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3")
        buf.write(u"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31")
        buf.write(u"\3\31\3\31\5\31\u019d\n\31\3\32\3\32\3\32\3\32\3\32\3")
        buf.write(u"\32\3\32\5\32\u01a6\n\32\3\33\3\33\3\33\3\33\3\33\3\34")
        buf.write(u"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3")
        buf.write(u"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 ")
        buf.write(u"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3")
        buf.write(u"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3")
        buf.write(u"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3")
        buf.write(u"(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*")
        buf.write(u"\3+\3+\3+\3+\5+\u020a\n+\3+\3+\3+\5+\u020f\n+\7+\u0211")
        buf.write(u"\n+\f+\16+\u0214\13+\5+\u0216\n+\3+\3+\3,\3,\3,\3,\3")
        buf.write(u",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.")
        buf.write(u"\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\2\2\60\2\4\6\b\n")
        buf.write(u"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:")
        buf.write(u"<>@BDFHJLNPRTVXZ\\\2\4\3\2\25\26\3\2\32\36\2\u0258\2")
        buf.write(u"^\3\2\2\2\4m\3\2\2\2\6z\3\2\2\2\b\177\3\2\2\2\n\u008c")
        buf.write(u"\3\2\2\2\f\u009d\3\2\2\2\16\u00cb\3\2\2\2\20\u00cf\3")
        buf.write(u"\2\2\2\22\u00d8\3\2\2\2\24\u00eb\3\2\2\2\26\u00ef\3\2")
        buf.write(u"\2\2\30\u00f9\3\2\2\2\32\u0108\3\2\2\2\34\u0124\3\2\2")
        buf.write(u"\2\36\u012d\3\2\2\2 \u012f\3\2\2\2\"\u0136\3\2\2\2$\u014a")
        buf.write(u"\3\2\2\2&\u014c\3\2\2\2(\u0154\3\2\2\2*\u015c\3\2\2\2")
        buf.write(u",\u0176\3\2\2\2.\u0183\3\2\2\2\60\u019c\3\2\2\2\62\u01a5")
        buf.write(u"\3\2\2\2\64\u01a7\3\2\2\2\66\u01ac\3\2\2\28\u01b1\3\2")
        buf.write(u"\2\2:\u01b6\3\2\2\2<\u01bb\3\2\2\2>\u01c0\3\2\2\2@\u01c5")
        buf.write(u"\3\2\2\2B\u01cc\3\2\2\2D\u01d3\3\2\2\2F\u01da\3\2\2\2")
        buf.write(u"H\u01df\3\2\2\2J\u01e4\3\2\2\2L\u01e9\3\2\2\2N\u01ee")
        buf.write(u"\3\2\2\2P\u01f5\3\2\2\2R\u01fc\3\2\2\2T\u0205\3\2\2\2")
        buf.write(u"V\u0219\3\2\2\2X\u0221\3\2\2\2Z\u0229\3\2\2\2\\\u0231")
        buf.write(u"\3\2\2\2^_\7\3\2\2_`\7\4\2\2`b\b\2\1\2ac\5\f\7\2ba\3")
        buf.write(u"\2\2\2bc\3\2\2\2cg\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3\2")
        buf.write(u"\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\6\4")
        buf.write(u"\2kl\b\2\1\2l\3\3\2\2\2mu\7\5\2\2no\5 \21\2op\7=\2\2")
        buf.write(u"pq\b\3\1\2qv\3\2\2\2rs\7\6\2\2st\7=\2\2tv\b\3\1\2un\3")
        buf.write(u"\2\2\2ur\3\2\2\2vw\3\2\2\2wx\5\b\5\2xy\5\n\6\2y\5\3\2")
        buf.write(u"\2\2z{\7\7\2\2{|\b\4\1\2|}\5\b\5\2}~\5\n\6\2~\7\3\2\2")
        buf.write(u"\2\177\u0088\7\b\2\2\u0080\u0085\5\16\b\2\u0081\u0082")
        buf.write(u"\7\t\2\2\u0082\u0084\5\16\b\2\u0083\u0081\3\2\2\2\u0084")
        buf.write(u"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2")
        buf.write(u"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0080")
        buf.write(u"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a")
        buf.write(u"\u008b\7\n\2\2\u008b\t\3\2\2\2\u008c\u008e\7\13\2\2\u008d")
        buf.write(u"\u008f\5\f\7\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2")
        buf.write(u"\2\u008f\u0091\3\2\2\2\u0090\u0092\5\"\22\2\u0091\u0090")
        buf.write(u"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093")
        buf.write(u"\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0096\7\f\2")
        buf.write(u"\2\u0096\u0097\5\30\r\2\u0097\u0098\7\4\2\2\u0098\u009a")
        buf.write(u"\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a")
        buf.write(u"\u009b\3\2\2\2\u009b\u009c\7\r\2\2\u009c\13\3\2\2\2\u009d")
        buf.write(u"\u00c7\7\16\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7=\2")
        buf.write(u"\2\u00a0\u00aa\b\7\1\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3")
        buf.write(u"\7?\2\2\u00a3\u00a7\b\7\1\2\u00a4\u00a5\7\t\2\2\u00a5")
        buf.write(u"\u00a6\7?\2\2\u00a6\u00a8\b\7\1\2\u00a7\u00a4\3\2\2\2")
        buf.write(u"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab")
        buf.write(u"\7\20\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab")
        buf.write(u"\u00ad\3\2\2\2\u00ac\u00ae\5*\26\2\u00ad\u00ac\3\2\2")
        buf.write(u"\2\u00ad\u00ae\3\2\2\2\u00ae\u00c2\3\2\2\2\u00af\u00b0")
        buf.write(u"\7\t\2\2\u00b0\u00b1\7=\2\2\u00b1\u00bb\b\7\1\2\u00b2")
        buf.write(u"\u00b3\7\17\2\2\u00b3\u00b4\7?\2\2\u00b4\u00b8\b\7\1")
        buf.write(u"\2\u00b5\u00b6\7\t\2\2\u00b6\u00b7\7?\2\2\u00b7\u00b9")
        buf.write(u"\b\7\1\2\u00b8\u00b5\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9")
        buf.write(u"\u00ba\3\2\2\2\u00ba\u00bc\7\20\2\2\u00bb\u00b2\3\2\2")
        buf.write(u"\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf")
        buf.write(u"\5*\26\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf")
        buf.write(u"\u00c1\3\2\2\2\u00c0\u00af\3\2\2\2\u00c1\u00c4\3\2\2")
        buf.write(u"\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5")
        buf.write(u"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\4\2\2\u00c6")
        buf.write(u"\u00c8\3\2\2\2\u00c7\u009e\3\2\2\2\u00c8\u00c9\3\2\2")
        buf.write(u"\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\r\3")
        buf.write(u"\2\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7=\2\2\u00cd\u00ce")
        buf.write(u"\b\b\1\2\u00ce\17\3\2\2\2\u00cf\u00d0\7\21\2\2\u00d0")
        buf.write(u"\u00d1\7\b\2\2\u00d1\u00d2\5\26\f\2\u00d2\u00d3\7\n\2")
        buf.write(u"\2\u00d3\u00d6\5&\24\2\u00d4\u00d5\7\22\2\2\u00d5\u00d7")
        buf.write(u"\5&\24\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7")
        buf.write(u"\21\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00dc\7\b\2\2")
        buf.write(u"\u00da\u00dd\5\26\f\2\u00db\u00dd\7A\2\2\u00dc\u00da")
        buf.write(u"\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e5\3\2\2\2\u00de")
        buf.write(u"\u00e1\7\t\2\2\u00df\u00e2\5\26\f\2\u00e0\u00e2\7A\2")
        buf.write(u"\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e4")
        buf.write(u"\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5")
        buf.write(u"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2")
        buf.write(u"\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\n\2\2\u00e9\u00ea")
        buf.write(u"\7\4\2\2\u00ea\23\3\2\2\2\u00eb\u00ec\7\24\2\2\u00ec")
        buf.write(u"\u00ed\7\b\2\2\u00ed\u00ee\7\n\2\2\u00ee\25\3\2\2\2\u00ef")
        buf.write(u"\u00f7\5\30\r\2\u00f0\u00f1\79\2\2\u00f1\u00f5\b\f\1")
        buf.write(u"\2\u00f2\u00f3\7:\2\2\u00f3\u00f5\b\f\1\2\u00f4\u00f0")
        buf.write(u"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6")
        buf.write(u"\u00f8\5\30\r\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2")
        buf.write(u"\2\u00f8\27\3\2\2\2\u00f9\u0105\5\32\16\2\u00fa\u00fb")
        buf.write(u"\7\25\2\2\u00fb\u00ff\b\r\1\2\u00fc\u00fd\7\26\2\2\u00fd")
        buf.write(u"\u00ff\b\r\1\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2")
        buf.write(u"\2\u00ff\u0100\3\2\2\2\u0100\u0101\5\32\16\2\u0101\u0102")
        buf.write(u"\b\r\1\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0104")
        buf.write(u"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2")
        buf.write(u"\2\u0106\31\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0116\5")
        buf.write(u"\34\17\2\u0109\u010a\7\27\2\2\u010a\u0110\b\16\1\2\u010b")
        buf.write(u"\u010c\7\30\2\2\u010c\u0110\b\16\1\2\u010d\u010e\7\31")
        buf.write(u"\2\2\u010e\u0110\b\16\1\2\u010f\u0109\3\2\2\2\u010f\u010b")
        buf.write(u"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111")
        buf.write(u"\u0112\5\34\17\2\u0112\u0113\b\16\1\2\u0113\u0115\3\2")
        buf.write(u"\2\2\u0114\u010f\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114")
        buf.write(u"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\33\3\2\2\2\u0118\u0116")
        buf.write(u"\3\2\2\2\u0119\u011a\7\b\2\2\u011a\u011b\b\17\1\2\u011b")
        buf.write(u"\u011c\5\26\f\2\u011c\u011d\7\n\2\2\u011d\u011e\b\17")
        buf.write(u"\1\2\u011e\u0125\3\2\2\2\u011f\u0121\t\2\2\2\u0120\u011f")
        buf.write(u"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122")
        buf.write(u"\u0125\5\36\20\2\u0123\u0125\5\60\31\2\u0124\u0119\3")
        buf.write(u"\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125")
        buf.write(u"\35\3\2\2\2\u0126\u0127\7=\2\2\u0127\u012e\b\20\1\2\u0128")
        buf.write(u"\u012e\7?\2\2\u0129\u012e\7@\2\2\u012a\u012e\7>\2\2\u012b")
        buf.write(u"\u012e\7A\2\2\u012c\u012e\5.\30\2\u012d\u0126\3\2\2\2")
        buf.write(u"\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a")
        buf.write(u"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e")
        buf.write(u"\37\3\2\2\2\u012f\u0130\t\3\2\2\u0130!\3\2\2\2\u0131")
        buf.write(u"\u0137\5(\25\2\u0132\u0137\5\20\t\2\u0133\u0137\5\22")
        buf.write(u"\n\2\u0134\u0137\5$\23\2\u0135\u0137\5\62\32\2\u0136")
        buf.write(u"\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2")
        buf.write(u"\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137#\3\2")
        buf.write(u"\2\2\u0138\u0139\7\37\2\2\u0139\u013a\7=\2\2\u013a\u013b")
        buf.write(u"\7 \2\2\u013b\u013c\5\30\r\2\u013c\u013d\7!\2\2\u013d")
        buf.write(u"\u0140\5\30\r\2\u013e\u013f\7!\2\2\u013f\u0141\5\30\r")
        buf.write(u"\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142")
        buf.write(u"\3\2\2\2\u0142\u0143\5&\24\2\u0143\u014b\3\2\2\2\u0144")
        buf.write(u"\u0145\7\"\2\2\u0145\u0146\7\b\2\2\u0146\u0147\5\26\f")
        buf.write(u"\2\u0147\u0148\7\n\2\2\u0148\u0149\5&\24\2\u0149\u014b")
        buf.write(u"\3\2\2\2\u014a\u0138\3\2\2\2\u014a\u0144\3\2\2\2\u014b")
        buf.write(u"%\3\2\2\2\u014c\u014e\7\13\2\2\u014d\u014f\5\"\22\2\u014e")
        buf.write(u"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2")
        buf.write(u"\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153")
        buf.write(u"\7\r\2\2\u0153\'\3\2\2\2\u0154\u0155\7=\2\2\u0155\u0157")
        buf.write(u"\b\25\1\2\u0156\u0158\5.\30\2\u0157\u0156\3\2\2\2\u0157")
        buf.write(u"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5*\26")
        buf.write(u"\2\u015a\u015b\7\4\2\2\u015b)\3\2\2\2\u015c\u015d\7 ")
        buf.write(u"\2\2\u015d\u0172\b\26\1\2\u015e\u0173\5\26\f\2\u015f")
        buf.write(u"\u016e\7\17\2\2\u0160\u0163\5\30\r\2\u0161\u0163\5,\27")
        buf.write(u"\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u016b")
        buf.write(u"\3\2\2\2\u0164\u0167\7\t\2\2\u0165\u0168\5\30\r\2\u0166")
        buf.write(u"\u0168\5,\27\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2")
        buf.write(u"\2\u0168\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u016d")
        buf.write(u"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c")
        buf.write(u"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0162\3\2\2")
        buf.write(u"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173")
        buf.write(u"\7\20\2\2\u0171\u0173\5\60\31\2\u0172\u015e\3\2\2\2\u0172")
        buf.write(u"\u015f\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2")
        buf.write(u"\2\u0174\u0175\b\26\1\2\u0175+\3\2\2\2\u0176\u017f\7")
        buf.write(u"\17\2\2\u0177\u017c\5\30\r\2\u0178\u0179\7\t\2\2\u0179")
        buf.write(u"\u017b\5\30\r\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2")
        buf.write(u"\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180")
        buf.write(u"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0177\3\2\2\2\u017f")
        buf.write(u"\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\20\2")
        buf.write(u"\2\u0182-\3\2\2\2\u0183\u0184\7\17\2\2\u0184\u0187\5")
        buf.write(u"\30\r\2\u0185\u0186\7\t\2\2\u0186\u0188\5\30\r\2\u0187")
        buf.write(u"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2")
        buf.write(u"\2\u0189\u018a\7\20\2\2\u018a/\3\2\2\2\u018b\u019d\5")
        buf.write(u"N(\2\u018c\u019d\5P)\2\u018d\u019d\5R*\2\u018e\u019d")
        buf.write(u"\5H%\2\u018f\u019d\5J&\2\u0190\u019d\5L\'\2\u0191\u019d")
        buf.write(u"\5\64\33\2\u0192\u019d\5\66\34\2\u0193\u019d\58\35\2")
        buf.write(u"\u0194\u019d\5:\36\2\u0195\u019d\5<\37\2\u0196\u019d")
        buf.write(u"\5> \2\u0197\u019d\5F$\2\u0198\u019d\5@!\2\u0199\u019d")
        buf.write(u"\5B\"\2\u019a\u019d\5D#\2\u019b\u019d\5T+\2\u019c\u018b")
        buf.write(u"\3\2\2\2\u019c\u018c\3\2\2\2\u019c\u018d\3\2\2\2\u019c")
        buf.write(u"\u018e\3\2\2\2\u019c\u018f\3\2\2\2\u019c\u0190\3\2\2")
        buf.write(u"\2\u019c\u0191\3\2\2\2\u019c\u0192\3\2\2\2\u019c\u0193")
        buf.write(u"\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u0195\3\2\2\2\u019c")
        buf.write(u"\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2\2")
        buf.write(u"\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b")
        buf.write(u"\3\2\2\2\u019d\61\3\2\2\2\u019e\u01a6\5V,\2\u019f\u01a6")
        buf.write(u"\5X-\2\u01a0\u01a6\5Z.\2\u01a1\u01a6\5\\/\2\u01a2\u01a3")
        buf.write(u"\5T+\2\u01a3\u01a4\7\4\2\2\u01a4\u01a6\3\2\2\2\u01a5")
        buf.write(u"\u019e\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2")
        buf.write(u"\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\63\3")
        buf.write(u"\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9\7\b\2\2\u01a9\u01aa")
        buf.write(u"\7=\2\2\u01aa\u01ab\7\n\2\2\u01ab\65\3\2\2\2\u01ac\u01ad")
        buf.write(u"\7$\2\2\u01ad\u01ae\7\b\2\2\u01ae\u01af\7=\2\2\u01af")
        buf.write(u"\u01b0\7\n\2\2\u01b0\67\3\2\2\2\u01b1\u01b2\7%\2\2\u01b2")
        buf.write(u"\u01b3\7\b\2\2\u01b3\u01b4\7=\2\2\u01b4\u01b5\7\n\2\2")
        buf.write(u"\u01b59\3\2\2\2\u01b6\u01b7\7&\2\2\u01b7\u01b8\7\b\2")
        buf.write(u"\2\u01b8\u01b9\7=\2\2\u01b9\u01ba\7\n\2\2\u01ba;\3\2")
        buf.write(u"\2\2\u01bb\u01bc\7\'\2\2\u01bc\u01bd\7\b\2\2\u01bd\u01be")
        buf.write(u"\7=\2\2\u01be\u01bf\7\n\2\2\u01bf=\3\2\2\2\u01c0\u01c1")
        buf.write(u"\7(\2\2\u01c1\u01c2\7\b\2\2\u01c2\u01c3\7=\2\2\u01c3")
        buf.write(u"\u01c4\7\n\2\2\u01c4?\3\2\2\2\u01c5\u01c6\7)\2\2\u01c6")
        buf.write(u"\u01c7\7\b\2\2\u01c7\u01c8\7=\2\2\u01c8\u01c9\7\t\2\2")
        buf.write(u"\u01c9\u01ca\7=\2\2\u01ca\u01cb\7\n\2\2\u01cbA\3\2\2")
        buf.write(u"\2\u01cc\u01cd\7*\2\2\u01cd\u01ce\7\b\2\2\u01ce\u01cf")
        buf.write(u"\7=\2\2\u01cf\u01d0\7\t\2\2\u01d0\u01d1\7=\2\2\u01d1")
        buf.write(u"\u01d2\7\n\2\2\u01d2C\3\2\2\2\u01d3\u01d4\7+\2\2\u01d4")
        buf.write(u"\u01d5\7\b\2\2\u01d5\u01d6\7=\2\2\u01d6\u01d7\7\t\2\2")
        buf.write(u"\u01d7\u01d8\5\30\r\2\u01d8\u01d9\7\n\2\2\u01d9E\3\2")
        buf.write(u"\2\2\u01da\u01db\7,\2\2\u01db\u01dc\7\b\2\2\u01dc\u01dd")
        buf.write(u"\7A\2\2\u01dd\u01de\7\n\2\2\u01deG\3\2\2\2\u01df\u01e0")
        buf.write(u"\7-\2\2\u01e0\u01e1\7\b\2\2\u01e1\u01e2\7=\2\2\u01e2")
        buf.write(u"\u01e3\7\n\2\2\u01e3I\3\2\2\2\u01e4\u01e5\7.\2\2\u01e5")
        buf.write(u"\u01e6\7\b\2\2\u01e6\u01e7\7=\2\2\u01e7\u01e8\7\n\2\2")
        buf.write(u"\u01e8K\3\2\2\2\u01e9\u01ea\7/\2\2\u01ea\u01eb\7\b\2")
        buf.write(u"\2\u01eb\u01ec\7=\2\2\u01ec\u01ed\7\n\2\2\u01edM\3\2")
        buf.write(u"\2\2\u01ee\u01ef\7\60\2\2\u01ef\u01f0\7\b\2\2\u01f0\u01f1")
        buf.write(u"\7=\2\2\u01f1\u01f2\7\t\2\2\u01f2\u01f3\7=\2\2\u01f3")
        buf.write(u"\u01f4\7\n\2\2\u01f4O\3\2\2\2\u01f5\u01f6\7\61\2\2\u01f6")
        buf.write(u"\u01f7\7\b\2\2\u01f7\u01f8\7=\2\2\u01f8\u01f9\7\t\2\2")
        buf.write(u"\u01f9\u01fa\7?\2\2\u01fa\u01fb\7\n\2\2\u01fbQ\3\2\2")
        buf.write(u"\2\u01fc\u01fd\7\62\2\2\u01fd\u01fe\7\b\2\2\u01fe\u01ff")
        buf.write(u"\7=\2\2\u01ff\u0200\7\t\2\2\u0200\u0201\5\30\r\2\u0201")
        buf.write(u"\u0202\7\t\2\2\u0202\u0203\5\30\r\2\u0203\u0204\7\n\2")
        buf.write(u"\2\u0204S\3\2\2\2\u0205\u0206\7=\2\2\u0206\u0215\7\b")
        buf.write(u"\2\2\u0207\u020a\7=\2\2\u0208\u020a\5\36\20\2\u0209\u0207")
        buf.write(u"\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u0212\3\2\2\2\u020b")
        buf.write(u"\u020e\7\t\2\2\u020c\u020f\7=\2\2\u020d\u020f\5\36\20")
        buf.write(u"\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u0211")
        buf.write(u"\3\2\2\2\u0210\u020b\3\2\2\2\u0211\u0214\3\2\2\2\u0212")
        buf.write(u"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2\2")
        buf.write(u"\2\u0214\u0212\3\2\2\2\u0215\u0209\3\2\2\2\u0215\u0216")
        buf.write(u"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\n\2\2\u0218")
        buf.write(u"U\3\2\2\2\u0219\u021a\7\63\2\2\u021a\u021b\7\b\2\2\u021b")
        buf.write(u"\u021c\7=\2\2\u021c\u021d\7\t\2\2\u021d\u021e\7=\2\2")
        buf.write(u"\u021e\u021f\7\n\2\2\u021f\u0220\7\4\2\2\u0220W\3\2\2")
        buf.write(u"\2\u0221\u0222\7\64\2\2\u0222\u0223\7\b\2\2\u0223\u0224")
        buf.write(u"\7=\2\2\u0224\u0225\7\t\2\2\u0225\u0226\7=\2\2\u0226")
        buf.write(u"\u0227\7\n\2\2\u0227\u0228\7\4\2\2\u0228Y\3\2\2\2\u0229")
        buf.write(u"\u022a\7\65\2\2\u022a\u022b\7\b\2\2\u022b\u022c\7=\2")
        buf.write(u"\2\u022c\u022d\7\t\2\2\u022d\u022e\7=\2\2\u022e\u022f")
        buf.write(u"\7\n\2\2\u022f\u0230\7\4\2\2\u0230[\3\2\2\2\u0231\u0232")
        buf.write(u"\7\66\2\2\u0232\u0233\7\b\2\2\u0233\u0234\7=\2\2\u0234")
        buf.write(u"\u0235\7\t\2\2\u0235\u0236\7A\2\2\u0236\u0237\7\67\2")
        buf.write(u"\2\u0237\u0238\7\n\2\2\u0238\u0239\7\4\2\2\u0239]\3\2")
        buf.write(u"\2\2\62bgu\u0085\u0088\u008e\u0093\u0099\u00a7\u00aa")
        buf.write(u"\u00ad\u00b8\u00bb\u00be\u00c2\u00c9\u00d6\u00dc\u00e1")
        buf.write(u"\u00e5\u00f4\u00f7\u00fe\u0105\u010f\u0116\u0120\u0124")
        buf.write(u"\u012d\u0136\u0140\u014a\u0150\u0157\u0162\u0167\u016b")
        buf.write(u"\u016e\u0172\u017c\u017f\u0187\u019c\u01a5\u0209\u020e")
        buf.write(u"\u0212\u0215")
        return buf.getvalue()


class oscarParser ( Parser ):

    grammarFileName = "oscar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'#oscar'", u"';'", u"'def'", u"'void'", 
                     u"'main'", u"'('", u"','", u"')'", u"'{'", u"'return'", 
                     u"'}'", u"'var'", u"'['", u"']'", u"'if'", u"'else'", 
                     u"'print'", u"'read'", u"'+'", u"'-'", u"'*'", u"'/'", 
                     u"'%'", u"'int'", u"'float'", u"'string'", u"'boolean'", 
                     u"'list'", u"'for'", u"'='", u"':'", u"'while'", u"'mean'", 
                     u"'variance'", u"'median'", u"'stdev'", u"'head'", 
                     u"'tail'", u"'union'", u"'intersect'", u"'find'", u"'import'", 
                     u"'length'", u"'min'", u"'max'", u"'concat'", u"'sort'", 
                     u"'splice'", u"'histogram'", u"'pie_chart'", u"'bar_graph'", 
                     u"'export'", u"'.csv'" ]

    symbolicNames = [ u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"RESERVED", u"RELACIONALES", 
                      u"LOGICOS", u"DELIMITADORES", u"WS", u"ID", u"CTE_B", 
                      u"CTE_I", u"CTE_F", u"CTE_STRING", u"LIST" ]

    RULE_programa = 0
    RULE_modulo = 1
    RULE_main = 2
    RULE_param = 3
    RULE_bloque = 4
    RULE_vars_ = 5
    RULE_id_ = 6
    RULE_condicion = 7
    RULE_escritura = 8
    RULE_lectura = 9
    RULE_expresion = 10
    RULE_exp = 11
    RULE_termino = 12
    RULE_factor = 13
    RULE_var_cte = 14
    RULE_tipo = 15
    RULE_estatuto = 16
    RULE_ciclo = 17
    RULE_estats = 18
    RULE_asignacion = 19
    RULE_igualdad = 20
    RULE_sub_lista = 21
    RULE_element = 22
    RULE_llamadaret = 23
    RULE_llamadavoid = 24
    RULE_mean = 25
    RULE_variance = 26
    RULE_median = 27
    RULE_stdev = 28
    RULE_head = 29
    RULE_tail = 30
    RULE_union = 31
    RULE_intersect = 32
    RULE_find = 33
    RULE_import_csv = 34
    RULE_length = 35
    RULE_min_ = 36
    RULE_max_ = 37
    RULE_concat = 38
    RULE_sort = 39
    RULE_splice = 40
    RULE_userdef = 41
    RULE_histograma = 42
    RULE_pie_chart = 43
    RULE_bar_graph = 44
    RULE_export_csv = 45

    ruleNames =  [ u"programa", u"modulo", u"main", u"param", u"bloque", 
                   u"vars_", u"id_", u"condicion", u"escritura", u"lectura", 
                   u"expresion", u"exp", u"termino", u"factor", u"var_cte", 
                   u"tipo", u"estatuto", u"ciclo", u"estats", u"asignacion", 
                   u"igualdad", u"sub_lista", u"element", u"llamadaret", 
                   u"llamadavoid", u"mean", u"variance", u"median", u"stdev", 
                   u"head", u"tail", u"union", u"intersect", u"find", u"import_csv", 
                   u"length", u"min_", u"max_", u"concat", u"sort", u"splice", 
                   u"userdef", u"histograma", u"pie_chart", u"bar_graph", 
                   u"export_csv" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    T__39=40
    T__40=41
    T__41=42
    T__42=43
    T__43=44
    T__44=45
    T__45=46
    T__46=47
    T__47=48
    T__48=49
    T__49=50
    T__50=51
    T__51=52
    T__52=53
    RESERVED=54
    RELACIONALES=55
    LOGICOS=56
    DELIMITADORES=57
    WS=58
    ID=59
    CTE_B=60
    CTE_I=61
    CTE_F=62
    CTE_STRING=63
    LIST=64

    def __init__(self, input, output=sys.stdout):
        super(oscarParser, self).__init__(input, output=output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ProgramaContext, self).__init__(parent, invokingState)
            self.parser = parser

        def main(self):
            return self.getTypedRuleContext(oscarParser.MainContext,0)


        def vars_(self):
            return self.getTypedRuleContext(oscarParser.Vars_Context,0)


        def modulo(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ModuloContext)
            else:
                return self.getTypedRuleContext(oscarParser.ModuloContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_programa

        def enterRule(self, listener):
            if hasattr(listener, "enterPrograma"):
                listener.enterPrograma(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitPrograma"):
                listener.exitPrograma(self)




    def programa(self):

        localctx = oscarParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(oscarParser.T__0)
            self.state = 93
            self.match(oscarParser.T__1)
            rules.create_function_table()
            self.state = 96
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__11:
                self.state = 95
                self.vars_()


            self.state = 101
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==oscarParser.T__2:
                self.state = 98
                self.modulo()
                self.state = 103
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 104
            self.main()
            rules.destroy()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ModuloContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ModuloContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._tipo = None # TipoContext
            self._ID = None # Token

        def param(self):
            return self.getTypedRuleContext(oscarParser.ParamContext,0)


        def bloque(self):
            return self.getTypedRuleContext(oscarParser.BloqueContext,0)


        def tipo(self):
            return self.getTypedRuleContext(oscarParser.TipoContext,0)


        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_modulo

        def enterRule(self, listener):
            if hasattr(listener, "enterModulo"):
                listener.enterModulo(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitModulo"):
                listener.exitModulo(self)




    def modulo(self):

        localctx = oscarParser.ModuloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_modulo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 107
            self.match(oscarParser.T__2)
            self.state = 115
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__23, oscarParser.T__24, oscarParser.T__25, oscarParser.T__26, oscarParser.T__27]:
                self.state = 108
                localctx._tipo = self.tipo()
                self.state = 109
                localctx._ID = self.match(oscarParser.ID)
                rules.add_to_func_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
                pass
            elif token in [oscarParser.T__3]:
                self.state = 112
                self.match(oscarParser.T__3)
                self.state = 113
                localctx._ID = self.match(oscarParser.ID)
                rules.add_to_func_table((None if localctx._ID is None else localctx._ID.text), 'void')
                pass
            else:
                raise NoViableAltException(self)

            self.state = 117
            self.param()
            self.state = 118
            self.bloque()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.MainContext, self).__init__(parent, invokingState)
            self.parser = parser

        def param(self):
            return self.getTypedRuleContext(oscarParser.ParamContext,0)


        def bloque(self):
            return self.getTypedRuleContext(oscarParser.BloqueContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_main

        def enterRule(self, listener):
            if hasattr(listener, "enterMain"):
                listener.enterMain(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMain"):
                listener.exitMain(self)




    def main(self):

        localctx = oscarParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_main)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 120
            self.match(oscarParser.T__4)
            rules.add_to_func_table('main','main')
            self.state = 122
            self.param()
            self.state = 123
            self.bloque()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ParamContext, self).__init__(parent, invokingState)
            self.parser = parser

        def id_(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.Id_Context)
            else:
                return self.getTypedRuleContext(oscarParser.Id_Context,i)


        def getRuleIndex(self):
            return oscarParser.RULE_param

        def enterRule(self, listener):
            if hasattr(listener, "enterParam"):
                listener.enterParam(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitParam"):
                listener.exitParam(self)




    def param(self):

        localctx = oscarParser.ParamContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_param)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 125
            self.match(oscarParser.T__5)
            self.state = 134
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25) | (1 << oscarParser.T__26) | (1 << oscarParser.T__27))) != 0):
                self.state = 126
                self.id_()
                self.state = 131
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 127
                    self.match(oscarParser.T__6)
                    self.state = 128
                    self.id_()
                    self.state = 133
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 136
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BloqueContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.BloqueContext, self).__init__(parent, invokingState)
            self.parser = parser

        def vars_(self):
            return self.getTypedRuleContext(oscarParser.Vars_Context,0)


        def estatuto(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.EstatutoContext)
            else:
                return self.getTypedRuleContext(oscarParser.EstatutoContext,i)


        def exp(self):
            return self.getTypedRuleContext(oscarParser.ExpContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_bloque

        def enterRule(self, listener):
            if hasattr(listener, "enterBloque"):
                listener.enterBloque(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitBloque"):
                listener.exitBloque(self)




    def bloque(self):

        localctx = oscarParser.BloqueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_bloque)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(oscarParser.T__8)
            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__11:
                self.state = 139
                self.vars_()


            self.state = 143 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 142
                self.estatuto()
                self.state = 145 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__14) | (1 << oscarParser.T__16) | (1 << oscarParser.T__28) | (1 << oscarParser.T__31) | (1 << oscarParser.T__48) | (1 << oscarParser.T__49) | (1 << oscarParser.T__50) | (1 << oscarParser.T__51) | (1 << oscarParser.ID))) != 0)):
                    break

            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__9:
                self.state = 147
                self.match(oscarParser.T__9)
                self.state = 148
                self.exp()
                self.state = 149
                self.match(oscarParser.T__1)


            self.state = 153
            self.match(oscarParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Vars_Context(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Vars_Context, self).__init__(parent, invokingState)
            self.parser = parser
            self._tipo = None # TipoContext
            self._ID = None # Token
            self._CTE_I = None # Token

        def tipo(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.TipoContext)
            else:
                return self.getTypedRuleContext(oscarParser.TipoContext,i)


        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def CTE_I(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.CTE_I)
            else:
                return self.getToken(oscarParser.CTE_I, i)

        def igualdad(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.IgualdadContext)
            else:
                return self.getTypedRuleContext(oscarParser.IgualdadContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_vars_

        def enterRule(self, listener):
            if hasattr(listener, "enterVars_"):
                listener.enterVars_(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitVars_"):
                listener.exitVars_(self)




    def vars_(self):

        localctx = oscarParser.Vars_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_vars_)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 155
            self.match(oscarParser.T__11)
            self.state = 197 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 156
                localctx._tipo = self.tipo()
                self.state = 157
                localctx._ID = self.match(oscarParser.ID)
                rules.add_to_var_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
                self.state = 168
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__12:
                    self.state = 159
                    self.match(oscarParser.T__12)
                    self.state = 160
                    localctx._CTE_I = self.match(oscarParser.CTE_I)
                    rules.addRows((None if localctx._ID is None else localctx._ID.text),(None if localctx._CTE_I is None else localctx._CTE_I.text))
                    self.state = 165
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==oscarParser.T__6:
                        self.state = 162
                        self.match(oscarParser.T__6)
                        self.state = 163
                        localctx._CTE_I = self.match(oscarParser.CTE_I)
                        rules.addColumns((None if localctx._ID is None else localctx._ID.text),(None if localctx._CTE_I is None else localctx._CTE_I.text))


                    self.state = 167
                    self.match(oscarParser.T__13)


                self.state = 171
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__29:
                    self.state = 170
                    self.igualdad()


                self.state = 192
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 173
                    self.match(oscarParser.T__6)
                    self.state = 174
                    localctx._ID = self.match(oscarParser.ID)
                    rules.add_to_var_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
                    self.state = 185
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==oscarParser.T__12:
                        self.state = 176
                        self.match(oscarParser.T__12)
                        self.state = 177
                        localctx._CTE_I = self.match(oscarParser.CTE_I)
                        rules.addRows((None if localctx._ID is None else localctx._ID.text),(None if localctx._CTE_I is None else localctx._CTE_I.text))
                        self.state = 182
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if _la==oscarParser.T__6:
                            self.state = 179
                            self.match(oscarParser.T__6)
                            self.state = 180
                            localctx._CTE_I = self.match(oscarParser.CTE_I)
                            rules.addColumns((None if localctx._ID is None else localctx._ID.text),(None if localctx._CTE_I is None else localctx._CTE_I.text))


                        self.state = 184
                        self.match(oscarParser.T__13)


                    self.state = 188
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==oscarParser.T__29:
                        self.state = 187
                        self.igualdad()


                    self.state = 194
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 195
                self.match(oscarParser.T__1)
                self.state = 199 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25) | (1 << oscarParser.T__26) | (1 << oscarParser.T__27))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Id_Context(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Id_Context, self).__init__(parent, invokingState)
            self.parser = parser
            self._tipo = None # TipoContext
            self._ID = None # Token

        def tipo(self):
            return self.getTypedRuleContext(oscarParser.TipoContext,0)


        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_id_

        def enterRule(self, listener):
            if hasattr(listener, "enterId_"):
                listener.enterId_(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitId_"):
                listener.exitId_(self)




    def id_(self):

        localctx = oscarParser.Id_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_id_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 201
            localctx._tipo = self.tipo()
            self.state = 202
            localctx._ID = self.match(oscarParser.ID)
            rules.add_to_var_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.CondicionContext, self).__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(oscarParser.ExpresionContext,0)


        def estats(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.EstatsContext)
            else:
                return self.getTypedRuleContext(oscarParser.EstatsContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_condicion

        def enterRule(self, listener):
            if hasattr(listener, "enterCondicion"):
                listener.enterCondicion(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitCondicion"):
                listener.exitCondicion(self)




    def condicion(self):

        localctx = oscarParser.CondicionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_condicion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            self.match(oscarParser.T__14)
            self.state = 206
            self.match(oscarParser.T__5)
            self.state = 207
            self.expresion()
            self.state = 208
            self.match(oscarParser.T__7)
            self.state = 209
            self.estats()
            self.state = 212
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__15:
                self.state = 210
                self.match(oscarParser.T__15)
                self.state = 211
                self.estats()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EscrituraContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.EscrituraContext, self).__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpresionContext,i)


        def CTE_STRING(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.CTE_STRING)
            else:
                return self.getToken(oscarParser.CTE_STRING, i)

        def getRuleIndex(self):
            return oscarParser.RULE_escritura

        def enterRule(self, listener):
            if hasattr(listener, "enterEscritura"):
                listener.enterEscritura(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitEscritura"):
                listener.exitEscritura(self)




    def escritura(self):

        localctx = oscarParser.EscrituraContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_escritura)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 214
            self.match(oscarParser.T__16)
            self.state = 215
            self.match(oscarParser.T__5)
            self.state = 218
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 216
                self.expresion()
                pass

            elif la_ == 2:
                self.state = 217
                self.match(oscarParser.CTE_STRING)
                pass


            self.state = 227
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==oscarParser.T__6:
                self.state = 220
                self.match(oscarParser.T__6)
                self.state = 223
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                if la_ == 1:
                    self.state = 221
                    self.expresion()
                    pass

                elif la_ == 2:
                    self.state = 222
                    self.match(oscarParser.CTE_STRING)
                    pass


                self.state = 229
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 230
            self.match(oscarParser.T__7)
            self.state = 231
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LecturaContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.LecturaContext, self).__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return oscarParser.RULE_lectura

        def enterRule(self, listener):
            if hasattr(listener, "enterLectura"):
                listener.enterLectura(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLectura"):
                listener.exitLectura(self)




    def lectura(self):

        localctx = oscarParser.LecturaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_lectura)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 233
            self.match(oscarParser.T__17)
            self.state = 234
            self.match(oscarParser.T__5)
            self.state = 235
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ExpresionContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._RELACIONALES = None # Token
            self._LOGICOS = None # Token

        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def RELACIONALES(self):
            return self.getToken(oscarParser.RELACIONALES, 0)

        def LOGICOS(self):
            return self.getToken(oscarParser.LOGICOS, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_expresion

        def enterRule(self, listener):
            if hasattr(listener, "enterExpresion"):
                listener.enterExpresion(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitExpresion"):
                listener.exitExpresion(self)




    def expresion(self):

        localctx = oscarParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_expresion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 237
            self.exp()
            self.state = 245
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.RELACIONALES or _la==oscarParser.LOGICOS:
                self.state = 242
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [oscarParser.RELACIONALES]:
                    self.state = 238
                    localctx._RELACIONALES = self.match(oscarParser.RELACIONALES)
                    rules.add_to_operator_stack((None if localctx._RELACIONALES is None else localctx._RELACIONALES.text))
                    pass
                elif token in [oscarParser.LOGICOS]:
                    self.state = 240
                    localctx._LOGICOS = self.match(oscarParser.LOGICOS)
                    rules.add_to_operator_stack((None if localctx._LOGICOS is None else localctx._LOGICOS.text))
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 244
                self.exp()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ExpContext, self).__init__(parent, invokingState)
            self.parser = parser

        def termino(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.TerminoContext)
            else:
                return self.getTypedRuleContext(oscarParser.TerminoContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_exp

        def enterRule(self, listener):
            if hasattr(listener, "enterExp"):
                listener.enterExp(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitExp"):
                listener.exitExp(self)




    def exp(self):

        localctx = oscarParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_exp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 247
            self.termino()
            self.state = 259
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==oscarParser.T__18 or _la==oscarParser.T__19:
                self.state = 252
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [oscarParser.T__18]:
                    self.state = 248
                    self.match(oscarParser.T__18)
                    rules.add_to_operator_stack('+')
                    pass
                elif token in [oscarParser.T__19]:
                    self.state = 250
                    self.match(oscarParser.T__19)
                    rules.add_to_operator_stack('-')
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 254
                self.termino()
                rules.pop_sum_from_stack()
                self.state = 261
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TerminoContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.TerminoContext, self).__init__(parent, invokingState)
            self.parser = parser

        def factor(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.FactorContext)
            else:
                return self.getTypedRuleContext(oscarParser.FactorContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_termino

        def enterRule(self, listener):
            if hasattr(listener, "enterTermino"):
                listener.enterTermino(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTermino"):
                listener.exitTermino(self)




    def termino(self):

        localctx = oscarParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_termino)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 262
            self.factor()
            self.state = 276
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__20) | (1 << oscarParser.T__21) | (1 << oscarParser.T__22))) != 0):
                self.state = 269
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [oscarParser.T__20]:
                    self.state = 263
                    self.match(oscarParser.T__20)
                    rules.add_to_operator_stack('*')
                    pass
                elif token in [oscarParser.T__21]:
                    self.state = 265
                    self.match(oscarParser.T__21)
                    rules.add_to_operator_stack('/')
                    pass
                elif token in [oscarParser.T__22]:
                    self.state = 267
                    self.match(oscarParser.T__22)
                    rules.add_to_operator_stack('%')
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 271
                self.factor()
                rules.pop_mult_from_stack()
                self.state = 278
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FactorContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.FactorContext, self).__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(oscarParser.ExpresionContext,0)


        def var_cte(self):
            return self.getTypedRuleContext(oscarParser.Var_cteContext,0)


        def llamadaret(self):
            return self.getTypedRuleContext(oscarParser.LlamadaretContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_factor

        def enterRule(self, listener):
            if hasattr(listener, "enterFactor"):
                listener.enterFactor(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitFactor"):
                listener.exitFactor(self)




    def factor(self):

        localctx = oscarParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_factor)
        self._la = 0 # Token type
        try:
            self.state = 290
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 279
                self.match(oscarParser.T__5)
                rules.add_to_operator_stack('(')
                self.state = 281
                self.expresion()
                self.state = 282
                self.match(oscarParser.T__7)
                #sacar parentesis
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 286
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__18 or _la==oscarParser.T__19:
                    self.state = 285
                    _la = self._input.LA(1)
                    if not(_la==oscarParser.T__18 or _la==oscarParser.T__19):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()


                self.state = 288
                self.var_cte()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 289
                self.llamadaret()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_cteContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Var_cteContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def CTE_I(self):
            return self.getToken(oscarParser.CTE_I, 0)

        def CTE_F(self):
            return self.getToken(oscarParser.CTE_F, 0)

        def CTE_B(self):
            return self.getToken(oscarParser.CTE_B, 0)

        def CTE_STRING(self):
            return self.getToken(oscarParser.CTE_STRING, 0)

        def element(self):
            return self.getTypedRuleContext(oscarParser.ElementContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_var_cte

        def enterRule(self, listener):
            if hasattr(listener, "enterVar_cte"):
                listener.enterVar_cte(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitVar_cte"):
                listener.exitVar_cte(self)




    def var_cte(self):

        localctx = oscarParser.Var_cteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_var_cte)
        try:
            self.state = 299
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 292
                localctx._ID = self.match(oscarParser.ID)
                rules.add_to_operand_stack((None if localctx._ID is None else localctx._ID.text))
                pass
            elif token in [oscarParser.CTE_I]:
                self.enterOuterAlt(localctx, 2)
                self.state = 294
                self.match(oscarParser.CTE_I)
                pass
            elif token in [oscarParser.CTE_F]:
                self.enterOuterAlt(localctx, 3)
                self.state = 295
                self.match(oscarParser.CTE_F)
                pass
            elif token in [oscarParser.CTE_B]:
                self.enterOuterAlt(localctx, 4)
                self.state = 296
                self.match(oscarParser.CTE_B)
                pass
            elif token in [oscarParser.CTE_STRING]:
                self.enterOuterAlt(localctx, 5)
                self.state = 297
                self.match(oscarParser.CTE_STRING)
                pass
            elif token in [oscarParser.T__12]:
                self.enterOuterAlt(localctx, 6)
                self.state = 298
                self.element()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.TipoContext, self).__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return oscarParser.RULE_tipo

        def enterRule(self, listener):
            if hasattr(listener, "enterTipo"):
                listener.enterTipo(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTipo"):
                listener.exitTipo(self)




    def tipo(self):

        localctx = oscarParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_tipo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 301
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25) | (1 << oscarParser.T__26) | (1 << oscarParser.T__27))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EstatutoContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.EstatutoContext, self).__init__(parent, invokingState)
            self.parser = parser

        def asignacion(self):
            return self.getTypedRuleContext(oscarParser.AsignacionContext,0)


        def condicion(self):
            return self.getTypedRuleContext(oscarParser.CondicionContext,0)


        def escritura(self):
            return self.getTypedRuleContext(oscarParser.EscrituraContext,0)


        def ciclo(self):
            return self.getTypedRuleContext(oscarParser.CicloContext,0)


        def llamadavoid(self):
            return self.getTypedRuleContext(oscarParser.LlamadavoidContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_estatuto

        def enterRule(self, listener):
            if hasattr(listener, "enterEstatuto"):
                listener.enterEstatuto(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitEstatuto"):
                listener.exitEstatuto(self)




    def estatuto(self):

        localctx = oscarParser.EstatutoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_estatuto)
        try:
            self.state = 308
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,29,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 303
                self.asignacion()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 304
                self.condicion()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 305
                self.escritura()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 306
                self.ciclo()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 307
                self.llamadavoid()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CicloContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.CicloContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def estats(self):
            return self.getTypedRuleContext(oscarParser.EstatsContext,0)


        def expresion(self):
            return self.getTypedRuleContext(oscarParser.ExpresionContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_ciclo

        def enterRule(self, listener):
            if hasattr(listener, "enterCiclo"):
                listener.enterCiclo(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitCiclo"):
                listener.exitCiclo(self)




    def ciclo(self):

        localctx = oscarParser.CicloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_ciclo)
        self._la = 0 # Token type
        try:
            self.state = 328
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 310
                self.match(oscarParser.T__28)
                self.state = 311
                self.match(oscarParser.ID)
                self.state = 312
                self.match(oscarParser.T__29)
                self.state = 313
                self.exp()
                self.state = 314
                self.match(oscarParser.T__30)
                self.state = 315
                self.exp()
                self.state = 318
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__30:
                    self.state = 316
                    self.match(oscarParser.T__30)
                    self.state = 317
                    self.exp()


                self.state = 320
                self.estats()
                pass
            elif token in [oscarParser.T__31]:
                self.enterOuterAlt(localctx, 2)
                self.state = 322
                self.match(oscarParser.T__31)
                self.state = 323
                self.match(oscarParser.T__5)
                self.state = 324
                self.expresion()
                self.state = 325
                self.match(oscarParser.T__7)
                self.state = 326
                self.estats()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EstatsContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.EstatsContext, self).__init__(parent, invokingState)
            self.parser = parser

        def estatuto(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.EstatutoContext)
            else:
                return self.getTypedRuleContext(oscarParser.EstatutoContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_estats

        def enterRule(self, listener):
            if hasattr(listener, "enterEstats"):
                listener.enterEstats(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitEstats"):
                listener.exitEstats(self)




    def estats(self):

        localctx = oscarParser.EstatsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_estats)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 330
            self.match(oscarParser.T__8)
            self.state = 332 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 331
                self.estatuto()
                self.state = 334 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__14) | (1 << oscarParser.T__16) | (1 << oscarParser.T__28) | (1 << oscarParser.T__31) | (1 << oscarParser.T__48) | (1 << oscarParser.T__49) | (1 << oscarParser.T__50) | (1 << oscarParser.T__51) | (1 << oscarParser.ID))) != 0)):
                    break

            self.state = 336
            self.match(oscarParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.AsignacionContext, self).__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def igualdad(self):
            return self.getTypedRuleContext(oscarParser.IgualdadContext,0)


        def element(self):
            return self.getTypedRuleContext(oscarParser.ElementContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_asignacion

        def enterRule(self, listener):
            if hasattr(listener, "enterAsignacion"):
                listener.enterAsignacion(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitAsignacion"):
                listener.exitAsignacion(self)




    def asignacion(self):

        localctx = oscarParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_asignacion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 338
            localctx._ID = self.match(oscarParser.ID)
            rules.add_to_operand_stack((None if localctx._ID is None else localctx._ID.text))
            self.state = 341
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__12:
                self.state = 340
                self.element()


            self.state = 343
            self.igualdad()
            self.state = 344
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IgualdadContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.IgualdadContext, self).__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(oscarParser.ExpresionContext,0)


        def llamadaret(self):
            return self.getTypedRuleContext(oscarParser.LlamadaretContext,0)


        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def sub_lista(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.Sub_listaContext)
            else:
                return self.getTypedRuleContext(oscarParser.Sub_listaContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_igualdad

        def enterRule(self, listener):
            if hasattr(listener, "enterIgualdad"):
                listener.enterIgualdad(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitIgualdad"):
                listener.exitIgualdad(self)




    def igualdad(self):

        localctx = oscarParser.IgualdadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_igualdad)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 346
            self.match(oscarParser.T__29)
            rules.add_to_operator_stack('=')
            self.state = 368
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,38,self._ctx)
            if la_ == 1:
                self.state = 348
                self.expresion()
                pass

            elif la_ == 2:
                self.state = 349
                self.match(oscarParser.T__12)
                self.state = 364
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__5) | (1 << oscarParser.T__12) | (1 << oscarParser.T__18) | (1 << oscarParser.T__19) | (1 << oscarParser.T__32) | (1 << oscarParser.T__33) | (1 << oscarParser.T__34) | (1 << oscarParser.T__35) | (1 << oscarParser.T__36) | (1 << oscarParser.T__37) | (1 << oscarParser.T__38) | (1 << oscarParser.T__39) | (1 << oscarParser.T__40) | (1 << oscarParser.T__41) | (1 << oscarParser.T__42) | (1 << oscarParser.T__43) | (1 << oscarParser.T__44) | (1 << oscarParser.T__45) | (1 << oscarParser.T__46) | (1 << oscarParser.T__47) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                    self.state = 352
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,34,self._ctx)
                    if la_ == 1:
                        self.state = 350
                        self.exp()
                        pass

                    elif la_ == 2:
                        self.state = 351
                        self.sub_lista()
                        pass


                    self.state = 361
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==oscarParser.T__6:
                        self.state = 354
                        self.match(oscarParser.T__6)
                        self.state = 357
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,35,self._ctx)
                        if la_ == 1:
                            self.state = 355
                            self.exp()
                            pass

                        elif la_ == 2:
                            self.state = 356
                            self.sub_lista()
                            pass


                        self.state = 363
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)



                self.state = 366
                self.match(oscarParser.T__13)
                pass

            elif la_ == 3:
                self.state = 367
                self.llamadaret()
                pass


            rules.pop_equals_from_stack()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Sub_listaContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Sub_listaContext, self).__init__(parent, invokingState)
            self.parser = parser

        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_sub_lista

        def enterRule(self, listener):
            if hasattr(listener, "enterSub_lista"):
                listener.enterSub_lista(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSub_lista"):
                listener.exitSub_lista(self)




    def sub_lista(self):

        localctx = oscarParser.Sub_listaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_sub_lista)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 372
            self.match(oscarParser.T__12)
            self.state = 381
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__5) | (1 << oscarParser.T__12) | (1 << oscarParser.T__18) | (1 << oscarParser.T__19) | (1 << oscarParser.T__32) | (1 << oscarParser.T__33) | (1 << oscarParser.T__34) | (1 << oscarParser.T__35) | (1 << oscarParser.T__36) | (1 << oscarParser.T__37) | (1 << oscarParser.T__38) | (1 << oscarParser.T__39) | (1 << oscarParser.T__40) | (1 << oscarParser.T__41) | (1 << oscarParser.T__42) | (1 << oscarParser.T__43) | (1 << oscarParser.T__44) | (1 << oscarParser.T__45) | (1 << oscarParser.T__46) | (1 << oscarParser.T__47) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                self.state = 373
                self.exp()
                self.state = 378
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 374
                    self.match(oscarParser.T__6)
                    self.state = 375
                    self.exp()
                    self.state = 380
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 383
            self.match(oscarParser.T__13)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ElementContext, self).__init__(parent, invokingState)
            self.parser = parser

        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_element

        def enterRule(self, listener):
            if hasattr(listener, "enterElement"):
                listener.enterElement(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitElement"):
                listener.exitElement(self)




    def element(self):

        localctx = oscarParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_element)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 385
            self.match(oscarParser.T__12)
            self.state = 386
            self.exp()
            self.state = 389
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__6:
                self.state = 387
                self.match(oscarParser.T__6)
                self.state = 388
                self.exp()


            self.state = 391
            self.match(oscarParser.T__13)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LlamadaretContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.LlamadaretContext, self).__init__(parent, invokingState)
            self.parser = parser

        def concat(self):
            return self.getTypedRuleContext(oscarParser.ConcatContext,0)


        def sort(self):
            return self.getTypedRuleContext(oscarParser.SortContext,0)


        def splice(self):
            return self.getTypedRuleContext(oscarParser.SpliceContext,0)


        def length(self):
            return self.getTypedRuleContext(oscarParser.LengthContext,0)


        def min_(self):
            return self.getTypedRuleContext(oscarParser.Min_Context,0)


        def max_(self):
            return self.getTypedRuleContext(oscarParser.Max_Context,0)


        def mean(self):
            return self.getTypedRuleContext(oscarParser.MeanContext,0)


        def variance(self):
            return self.getTypedRuleContext(oscarParser.VarianceContext,0)


        def median(self):
            return self.getTypedRuleContext(oscarParser.MedianContext,0)


        def stdev(self):
            return self.getTypedRuleContext(oscarParser.StdevContext,0)


        def head(self):
            return self.getTypedRuleContext(oscarParser.HeadContext,0)


        def tail(self):
            return self.getTypedRuleContext(oscarParser.TailContext,0)


        def import_csv(self):
            return self.getTypedRuleContext(oscarParser.Import_csvContext,0)


        def union(self):
            return self.getTypedRuleContext(oscarParser.UnionContext,0)


        def intersect(self):
            return self.getTypedRuleContext(oscarParser.IntersectContext,0)


        def find(self):
            return self.getTypedRuleContext(oscarParser.FindContext,0)


        def userdef(self):
            return self.getTypedRuleContext(oscarParser.UserdefContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_llamadaret

        def enterRule(self, listener):
            if hasattr(listener, "enterLlamadaret"):
                listener.enterLlamadaret(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLlamadaret"):
                listener.exitLlamadaret(self)




    def llamadaret(self):

        localctx = oscarParser.LlamadaretContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_llamadaret)
        try:
            self.state = 410
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__45]:
                self.enterOuterAlt(localctx, 1)
                self.state = 393
                self.concat()
                pass
            elif token in [oscarParser.T__46]:
                self.enterOuterAlt(localctx, 2)
                self.state = 394
                self.sort()
                pass
            elif token in [oscarParser.T__47]:
                self.enterOuterAlt(localctx, 3)
                self.state = 395
                self.splice()
                pass
            elif token in [oscarParser.T__42]:
                self.enterOuterAlt(localctx, 4)
                self.state = 396
                self.length()
                pass
            elif token in [oscarParser.T__43]:
                self.enterOuterAlt(localctx, 5)
                self.state = 397
                self.min_()
                pass
            elif token in [oscarParser.T__44]:
                self.enterOuterAlt(localctx, 6)
                self.state = 398
                self.max_()
                pass
            elif token in [oscarParser.T__32]:
                self.enterOuterAlt(localctx, 7)
                self.state = 399
                self.mean()
                pass
            elif token in [oscarParser.T__33]:
                self.enterOuterAlt(localctx, 8)
                self.state = 400
                self.variance()
                pass
            elif token in [oscarParser.T__34]:
                self.enterOuterAlt(localctx, 9)
                self.state = 401
                self.median()
                pass
            elif token in [oscarParser.T__35]:
                self.enterOuterAlt(localctx, 10)
                self.state = 402
                self.stdev()
                pass
            elif token in [oscarParser.T__36]:
                self.enterOuterAlt(localctx, 11)
                self.state = 403
                self.head()
                pass
            elif token in [oscarParser.T__37]:
                self.enterOuterAlt(localctx, 12)
                self.state = 404
                self.tail()
                pass
            elif token in [oscarParser.T__41]:
                self.enterOuterAlt(localctx, 13)
                self.state = 405
                self.import_csv()
                pass
            elif token in [oscarParser.T__38]:
                self.enterOuterAlt(localctx, 14)
                self.state = 406
                self.union()
                pass
            elif token in [oscarParser.T__39]:
                self.enterOuterAlt(localctx, 15)
                self.state = 407
                self.intersect()
                pass
            elif token in [oscarParser.T__40]:
                self.enterOuterAlt(localctx, 16)
                self.state = 408
                self.find()
                pass
            elif token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 17)
                self.state = 409
                self.userdef()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LlamadavoidContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.LlamadavoidContext, self).__init__(parent, invokingState)
            self.parser = parser

        def histograma(self):
            return self.getTypedRuleContext(oscarParser.HistogramaContext,0)


        def pie_chart(self):
            return self.getTypedRuleContext(oscarParser.Pie_chartContext,0)


        def bar_graph(self):
            return self.getTypedRuleContext(oscarParser.Bar_graphContext,0)


        def export_csv(self):
            return self.getTypedRuleContext(oscarParser.Export_csvContext,0)


        def userdef(self):
            return self.getTypedRuleContext(oscarParser.UserdefContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_llamadavoid

        def enterRule(self, listener):
            if hasattr(listener, "enterLlamadavoid"):
                listener.enterLlamadavoid(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLlamadavoid"):
                listener.exitLlamadavoid(self)




    def llamadavoid(self):

        localctx = oscarParser.LlamadavoidContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_llamadavoid)
        try:
            self.state = 419
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__48]:
                self.enterOuterAlt(localctx, 1)
                self.state = 412
                self.histograma()
                pass
            elif token in [oscarParser.T__49]:
                self.enterOuterAlt(localctx, 2)
                self.state = 413
                self.pie_chart()
                pass
            elif token in [oscarParser.T__50]:
                self.enterOuterAlt(localctx, 3)
                self.state = 414
                self.bar_graph()
                pass
            elif token in [oscarParser.T__51]:
                self.enterOuterAlt(localctx, 4)
                self.state = 415
                self.export_csv()
                pass
            elif token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 5)
                self.state = 416
                self.userdef()
                self.state = 417
                self.match(oscarParser.T__1)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MeanContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.MeanContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_mean

        def enterRule(self, listener):
            if hasattr(listener, "enterMean"):
                listener.enterMean(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMean"):
                listener.exitMean(self)




    def mean(self):

        localctx = oscarParser.MeanContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_mean)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 421
            self.match(oscarParser.T__32)
            self.state = 422
            self.match(oscarParser.T__5)
            self.state = 423
            self.match(oscarParser.ID)
            self.state = 424
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarianceContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.VarianceContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_variance

        def enterRule(self, listener):
            if hasattr(listener, "enterVariance"):
                listener.enterVariance(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitVariance"):
                listener.exitVariance(self)




    def variance(self):

        localctx = oscarParser.VarianceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_variance)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 426
            self.match(oscarParser.T__33)
            self.state = 427
            self.match(oscarParser.T__5)
            self.state = 428
            self.match(oscarParser.ID)
            self.state = 429
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MedianContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.MedianContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_median

        def enterRule(self, listener):
            if hasattr(listener, "enterMedian"):
                listener.enterMedian(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMedian"):
                listener.exitMedian(self)




    def median(self):

        localctx = oscarParser.MedianContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_median)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 431
            self.match(oscarParser.T__34)
            self.state = 432
            self.match(oscarParser.T__5)
            self.state = 433
            self.match(oscarParser.ID)
            self.state = 434
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StdevContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.StdevContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_stdev

        def enterRule(self, listener):
            if hasattr(listener, "enterStdev"):
                listener.enterStdev(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitStdev"):
                listener.exitStdev(self)




    def stdev(self):

        localctx = oscarParser.StdevContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_stdev)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 436
            self.match(oscarParser.T__35)
            self.state = 437
            self.match(oscarParser.T__5)
            self.state = 438
            self.match(oscarParser.ID)
            self.state = 439
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HeadContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.HeadContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_head

        def enterRule(self, listener):
            if hasattr(listener, "enterHead"):
                listener.enterHead(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitHead"):
                listener.exitHead(self)




    def head(self):

        localctx = oscarParser.HeadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_head)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 441
            self.match(oscarParser.T__36)
            self.state = 442
            self.match(oscarParser.T__5)
            self.state = 443
            self.match(oscarParser.ID)
            self.state = 444
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TailContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.TailContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_tail

        def enterRule(self, listener):
            if hasattr(listener, "enterTail"):
                listener.enterTail(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitTail"):
                listener.exitTail(self)




    def tail(self):

        localctx = oscarParser.TailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_tail)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 446
            self.match(oscarParser.T__37)
            self.state = 447
            self.match(oscarParser.T__5)
            self.state = 448
            self.match(oscarParser.ID)
            self.state = 449
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UnionContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.UnionContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_union

        def enterRule(self, listener):
            if hasattr(listener, "enterUnion"):
                listener.enterUnion(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitUnion"):
                listener.exitUnion(self)




    def union(self):

        localctx = oscarParser.UnionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_union)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 451
            self.match(oscarParser.T__38)
            self.state = 452
            self.match(oscarParser.T__5)
            self.state = 453
            self.match(oscarParser.ID)
            self.state = 454
            self.match(oscarParser.T__6)
            self.state = 455
            self.match(oscarParser.ID)
            self.state = 456
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IntersectContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.IntersectContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_intersect

        def enterRule(self, listener):
            if hasattr(listener, "enterIntersect"):
                listener.enterIntersect(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitIntersect"):
                listener.exitIntersect(self)




    def intersect(self):

        localctx = oscarParser.IntersectContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_intersect)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 458
            self.match(oscarParser.T__39)
            self.state = 459
            self.match(oscarParser.T__5)
            self.state = 460
            self.match(oscarParser.ID)
            self.state = 461
            self.match(oscarParser.T__6)
            self.state = 462
            self.match(oscarParser.ID)
            self.state = 463
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FindContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.FindContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def exp(self):
            return self.getTypedRuleContext(oscarParser.ExpContext,0)


        def getRuleIndex(self):
            return oscarParser.RULE_find

        def enterRule(self, listener):
            if hasattr(listener, "enterFind"):
                listener.enterFind(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitFind"):
                listener.exitFind(self)




    def find(self):

        localctx = oscarParser.FindContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_find)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 465
            self.match(oscarParser.T__40)
            self.state = 466
            self.match(oscarParser.T__5)
            self.state = 467
            self.match(oscarParser.ID)
            self.state = 468
            self.match(oscarParser.T__6)
            self.state = 469
            self.exp()
            self.state = 470
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Import_csvContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Import_csvContext, self).__init__(parent, invokingState)
            self.parser = parser

        def CTE_STRING(self):
            return self.getToken(oscarParser.CTE_STRING, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_import_csv

        def enterRule(self, listener):
            if hasattr(listener, "enterImport_csv"):
                listener.enterImport_csv(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitImport_csv"):
                listener.exitImport_csv(self)




    def import_csv(self):

        localctx = oscarParser.Import_csvContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_import_csv)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 472
            self.match(oscarParser.T__41)
            self.state = 473
            self.match(oscarParser.T__5)
            self.state = 474
            self.match(oscarParser.CTE_STRING)
            self.state = 475
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LengthContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.LengthContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_length

        def enterRule(self, listener):
            if hasattr(listener, "enterLength"):
                listener.enterLength(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLength"):
                listener.exitLength(self)




    def length(self):

        localctx = oscarParser.LengthContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_length)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 477
            self.match(oscarParser.T__42)
            self.state = 478
            self.match(oscarParser.T__5)
            self.state = 479
            self.match(oscarParser.ID)
            self.state = 480
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Min_Context(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Min_Context, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_min_

        def enterRule(self, listener):
            if hasattr(listener, "enterMin_"):
                listener.enterMin_(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMin_"):
                listener.exitMin_(self)




    def min_(self):

        localctx = oscarParser.Min_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_min_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 482
            self.match(oscarParser.T__43)
            self.state = 483
            self.match(oscarParser.T__5)
            self.state = 484
            self.match(oscarParser.ID)
            self.state = 485
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Max_Context(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Max_Context, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_max_

        def enterRule(self, listener):
            if hasattr(listener, "enterMax_"):
                listener.enterMax_(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitMax_"):
                listener.exitMax_(self)




    def max_(self):

        localctx = oscarParser.Max_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_max_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 487
            self.match(oscarParser.T__44)
            self.state = 488
            self.match(oscarParser.T__5)
            self.state = 489
            self.match(oscarParser.ID)
            self.state = 490
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConcatContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.ConcatContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_concat

        def enterRule(self, listener):
            if hasattr(listener, "enterConcat"):
                listener.enterConcat(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitConcat"):
                listener.exitConcat(self)




    def concat(self):

        localctx = oscarParser.ConcatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_concat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 492
            self.match(oscarParser.T__45)
            self.state = 493
            self.match(oscarParser.T__5)
            self.state = 494
            self.match(oscarParser.ID)
            self.state = 495
            self.match(oscarParser.T__6)
            self.state = 496
            self.match(oscarParser.ID)
            self.state = 497
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SortContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.SortContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def CTE_I(self):
            return self.getToken(oscarParser.CTE_I, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_sort

        def enterRule(self, listener):
            if hasattr(listener, "enterSort"):
                listener.enterSort(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSort"):
                listener.exitSort(self)




    def sort(self):

        localctx = oscarParser.SortContext(self, self._ctx, self.state)
        self.enterRule(localctx, 78, self.RULE_sort)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 499
            self.match(oscarParser.T__46)
            self.state = 500
            self.match(oscarParser.T__5)
            self.state = 501
            self.match(oscarParser.ID)
            self.state = 502
            self.match(oscarParser.T__6)
            self.state = 503
            self.match(oscarParser.CTE_I)
            self.state = 504
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SpliceContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.SpliceContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def exp(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.ExpContext)
            else:
                return self.getTypedRuleContext(oscarParser.ExpContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_splice

        def enterRule(self, listener):
            if hasattr(listener, "enterSplice"):
                listener.enterSplice(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSplice"):
                listener.exitSplice(self)




    def splice(self):

        localctx = oscarParser.SpliceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 80, self.RULE_splice)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 506
            self.match(oscarParser.T__47)
            self.state = 507
            self.match(oscarParser.T__5)
            self.state = 508
            self.match(oscarParser.ID)
            self.state = 509
            self.match(oscarParser.T__6)
            self.state = 510
            self.exp()
            self.state = 511
            self.match(oscarParser.T__6)
            self.state = 512
            self.exp()
            self.state = 513
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UserdefContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.UserdefContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def var_cte(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(oscarParser.Var_cteContext)
            else:
                return self.getTypedRuleContext(oscarParser.Var_cteContext,i)


        def getRuleIndex(self):
            return oscarParser.RULE_userdef

        def enterRule(self, listener):
            if hasattr(listener, "enterUserdef"):
                listener.enterUserdef(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitUserdef"):
                listener.exitUserdef(self)




    def userdef(self):

        localctx = oscarParser.UserdefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 82, self.RULE_userdef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 515
            self.match(oscarParser.ID)
            self.state = 516
            self.match(oscarParser.T__5)
            self.state = 531
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__12) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                self.state = 519
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,44,self._ctx)
                if la_ == 1:
                    self.state = 517
                    self.match(oscarParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 518
                    self.var_cte()
                    pass


                self.state = 528
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 521
                    self.match(oscarParser.T__6)
                    self.state = 524
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,45,self._ctx)
                    if la_ == 1:
                        self.state = 522
                        self.match(oscarParser.ID)
                        pass

                    elif la_ == 2:
                        self.state = 523
                        self.var_cte()
                        pass


                    self.state = 530
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 533
            self.match(oscarParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HistogramaContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.HistogramaContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_histograma

        def enterRule(self, listener):
            if hasattr(listener, "enterHistograma"):
                listener.enterHistograma(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitHistograma"):
                listener.exitHistograma(self)




    def histograma(self):

        localctx = oscarParser.HistogramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 84, self.RULE_histograma)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 535
            self.match(oscarParser.T__48)
            self.state = 536
            self.match(oscarParser.T__5)
            self.state = 537
            self.match(oscarParser.ID)
            self.state = 538
            self.match(oscarParser.T__6)
            self.state = 539
            self.match(oscarParser.ID)
            self.state = 540
            self.match(oscarParser.T__7)
            self.state = 541
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Pie_chartContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Pie_chartContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_pie_chart

        def enterRule(self, listener):
            if hasattr(listener, "enterPie_chart"):
                listener.enterPie_chart(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitPie_chart"):
                listener.exitPie_chart(self)




    def pie_chart(self):

        localctx = oscarParser.Pie_chartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 86, self.RULE_pie_chart)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 543
            self.match(oscarParser.T__49)
            self.state = 544
            self.match(oscarParser.T__5)
            self.state = 545
            self.match(oscarParser.ID)
            self.state = 546
            self.match(oscarParser.T__6)
            self.state = 547
            self.match(oscarParser.ID)
            self.state = 548
            self.match(oscarParser.T__7)
            self.state = 549
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Bar_graphContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Bar_graphContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i=None):
            if i is None:
                return self.getTokens(oscarParser.ID)
            else:
                return self.getToken(oscarParser.ID, i)

        def getRuleIndex(self):
            return oscarParser.RULE_bar_graph

        def enterRule(self, listener):
            if hasattr(listener, "enterBar_graph"):
                listener.enterBar_graph(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitBar_graph"):
                listener.exitBar_graph(self)




    def bar_graph(self):

        localctx = oscarParser.Bar_graphContext(self, self._ctx, self.state)
        self.enterRule(localctx, 88, self.RULE_bar_graph)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 551
            self.match(oscarParser.T__50)
            self.state = 552
            self.match(oscarParser.T__5)
            self.state = 553
            self.match(oscarParser.ID)
            self.state = 554
            self.match(oscarParser.T__6)
            self.state = 555
            self.match(oscarParser.ID)
            self.state = 556
            self.match(oscarParser.T__7)
            self.state = 557
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Export_csvContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(oscarParser.Export_csvContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(oscarParser.ID, 0)

        def CTE_STRING(self):
            return self.getToken(oscarParser.CTE_STRING, 0)

        def getRuleIndex(self):
            return oscarParser.RULE_export_csv

        def enterRule(self, listener):
            if hasattr(listener, "enterExport_csv"):
                listener.enterExport_csv(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitExport_csv"):
                listener.exitExport_csv(self)




    def export_csv(self):

        localctx = oscarParser.Export_csvContext(self, self._ctx, self.state)
        self.enterRule(localctx, 90, self.RULE_export_csv)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 559
            self.match(oscarParser.T__51)
            self.state = 560
            self.match(oscarParser.T__5)
            self.state = 561
            self.match(oscarParser.ID)
            self.state = 562
            self.match(oscarParser.T__6)
            self.state = 563
            self.match(oscarParser.CTE_STRING)
            self.state = 564
            self.match(oscarParser.T__52)
            self.state = 565
            self.match(oscarParser.T__7)
            self.state = 566
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





