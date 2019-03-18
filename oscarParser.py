# Generated from oscar.g4 by ANTLR 4.7.1
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys


import rules

dir_func = None

def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"B\u020d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write(u"\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write(u"\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4")
        buf.write(u"\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30")
        buf.write(u"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t")
        buf.write(u"\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$")
        buf.write(u"\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t")
        buf.write(u",\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\5\2c\n\2\3\2\7\2")
        buf.write(u"f\n\2\f\2\16\2i\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3")
        buf.write(u"\3\3\3\3\5\3u\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4")
        buf.write(u"\3\5\3\5\3\5\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13")
        buf.write(u"\5\5\5\u008a\n\5\3\5\3\5\3\6\3\6\5\6\u0090\n\6\3\6\6")
        buf.write(u"\6\u0093\n\6\r\6\16\6\u0094\3\6\3\6\3\6\3\6\5\6\u009b")
        buf.write(u"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a4\n\7\3\7\3")
        buf.write(u"\7\3\7\3\7\5\7\u00aa\n\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0")
        buf.write(u"\13\7\3\7\3\7\6\7\u00b4\n\7\r\7\16\7\u00b5\3\b\3\b\3")
        buf.write(u"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\n")
        buf.write(u"\3\n\3\n\3\n\5\n\u00c9\n\n\3\n\3\n\3\n\5\n\u00ce\n\n")
        buf.write(u"\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\13\3")
        buf.write(u"\13\3\13\3\13\3\f\3\f\3\f\5\f\u00df\n\f\3\r\3\r\3\r\7")
        buf.write(u"\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\16\3\16\3\16\7\16")
        buf.write(u"\u00ec\n\16\f\16\16\16\u00ef\13\16\3\17\3\17\3\17\3\17")
        buf.write(u"\3\17\5\17\u00f6\n\17\3\17\3\17\5\17\u00fa\n\17\3\20")
        buf.write(u"\3\20\3\20\3\20\3\20\3\20\5\20\u0102\n\20\3\21\3\21\3")
        buf.write(u"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\23")
        buf.write(u"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0117\n\23\3")
        buf.write(u"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0121\n\23")
        buf.write(u"\3\24\3\24\6\24\u0125\n\24\r\24\16\24\u0126\3\24\3\24")
        buf.write(u"\3\25\3\25\5\25\u012d\n\25\3\25\3\25\3\25\3\26\3\26\3")
        buf.write(u"\26\3\26\3\26\5\26\u0137\n\26\3\26\3\26\3\26\5\26\u013c")
        buf.write(u"\n\26\7\26\u013e\n\26\f\26\16\26\u0141\13\26\5\26\u0143")
        buf.write(u"\n\26\3\26\3\26\5\26\u0147\n\26\3\27\3\27\3\27\3\27\7")
        buf.write(u"\27\u014d\n\27\f\27\16\27\u0150\13\27\5\27\u0152\n\27")
        buf.write(u"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u015a\n\30\3\30\3")
        buf.write(u"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31")
        buf.write(u"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u016f\n\31\3")
        buf.write(u"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0178\n\32\3\33")
        buf.write(u"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3")
        buf.write(u"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37")
        buf.write(u"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3")
        buf.write(u"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3")
        buf.write(u"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'")
        buf.write(u"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3")
        buf.write(u"*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u01dc\n+\3+")
        buf.write(u"\3+\3+\5+\u01e1\n+\7+\u01e3\n+\f+\16+\u01e6\13+\5+\u01e8")
        buf.write(u"\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3")
        buf.write(u"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/")
        buf.write(u"\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36")
        buf.write(u" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\3\29:\3")
        buf.write(u"\2\23\24\3\2\25\27\3\2\30\34\2\u0222\2^\3\2\2\2\4m\3")
        buf.write(u"\2\2\2\6z\3\2\2\2\b\177\3\2\2\2\n\u008d\3\2\2\2\f\u009e")
        buf.write(u"\3\2\2\2\16\u00b7\3\2\2\2\20\u00bb\3\2\2\2\22\u00c4\3")
        buf.write(u"\2\2\2\24\u00d7\3\2\2\2\26\u00db\3\2\2\2\30\u00e0\3\2")
        buf.write(u"\2\2\32\u00e8\3\2\2\2\34\u00f9\3\2\2\2\36\u0101\3\2\2")
        buf.write(u"\2 \u0103\3\2\2\2\"\u010c\3\2\2\2$\u0120\3\2\2\2&\u0122")
        buf.write(u"\3\2\2\2(\u012a\3\2\2\2*\u0131\3\2\2\2,\u0148\3\2\2\2")
        buf.write(u".\u0155\3\2\2\2\60\u016e\3\2\2\2\62\u0177\3\2\2\2\64")
        buf.write(u"\u0179\3\2\2\2\66\u017e\3\2\2\28\u0183\3\2\2\2:\u0188")
        buf.write(u"\3\2\2\2<\u018d\3\2\2\2>\u0192\3\2\2\2@\u0197\3\2\2\2")
        buf.write(u"B\u019e\3\2\2\2D\u01a5\3\2\2\2F\u01ac\3\2\2\2H\u01b1")
        buf.write(u"\3\2\2\2J\u01b6\3\2\2\2L\u01bb\3\2\2\2N\u01c0\3\2\2\2")
        buf.write(u"P\u01c7\3\2\2\2R\u01ce\3\2\2\2T\u01d7\3\2\2\2V\u01eb")
        buf.write(u"\3\2\2\2X\u01f3\3\2\2\2Z\u01fb\3\2\2\2\\\u0203\3\2\2")
        buf.write(u"\2^_\7\3\2\2_`\7\4\2\2`b\b\2\1\2ac\5\f\7\2ba\3\2\2\2")
        buf.write(u"bc\3\2\2\2cg\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge")
        buf.write(u"\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\6\4\2kl\b")
        buf.write(u"\2\1\2l\3\3\2\2\2mt\7\5\2\2no\5\16\b\2op\b\3\1\2pu\3")
        buf.write(u"\2\2\2qr\7\6\2\2rs\7=\2\2su\b\3\1\2tn\3\2\2\2tq\3\2\2")
        buf.write(u"\2uv\3\2\2\2vw\5\b\5\2wx\5\n\6\2xy\b\3\1\2y\5\3\2\2\2")
        buf.write(u"z{\7\7\2\2{|\b\4\1\2|}\5\b\5\2}~\5\n\6\2~\7\3\2\2\2\177")
        buf.write(u"\u0080\7\b\2\2\u0080\u0089\b\5\1\2\u0081\u0086\5\16\b")
        buf.write(u"\2\u0082\u0083\7\t\2\2\u0083\u0085\5\16\b\2\u0084\u0082")
        buf.write(u"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086")
        buf.write(u"\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2")
        buf.write(u"\2\u0089\u0081\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b")
        buf.write(u"\3\2\2\2\u008b\u008c\7\n\2\2\u008c\t\3\2\2\2\u008d\u008f")
        buf.write(u"\7\13\2\2\u008e\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u008f")
        buf.write(u"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5\"\22")
        buf.write(u"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092")
        buf.write(u"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096")
        buf.write(u"\u0097\7\f\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7\4\2")
        buf.write(u"\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b")
        buf.write(u"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\r\2\2\u009d")
        buf.write(u"\13\3\2\2\2\u009e\u009f\7\16\2\2\u009f\u00b3\b\7\1\2")
        buf.write(u"\u00a0\u00a1\5 \21\2\u00a1\u00a3\7=\2\2\u00a2\u00a4\5")
        buf.write(u"*\26\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4")
        buf.write(u"\u00a5\3\2\2\2\u00a5\u00ae\b\7\1\2\u00a6\u00a7\7\t\2")
        buf.write(u"\2\u00a7\u00a9\7=\2\2\u00a8\u00aa\5*\26\2\u00a9\u00a8")
        buf.write(u"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab")
        buf.write(u"\u00ad\b\7\1\2\u00ac\u00a6\3\2\2\2\u00ad\u00b0\3\2\2")
        buf.write(u"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1")
        buf.write(u"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2")
        buf.write(u"\u00b4\3\2\2\2\u00b3\u00a0\3\2\2\2\u00b4\u00b5\3\2\2")
        buf.write(u"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\r\3")
        buf.write(u"\2\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7=\2\2\u00b9\u00ba")
        buf.write(u"\b\b\1\2\u00ba\17\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc")
        buf.write(u"\u00bd\7\b\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\n\2")
        buf.write(u"\2\u00bf\u00c2\5&\24\2\u00c0\u00c1\7\20\2\2\u00c1\u00c3")
        buf.write(u"\5&\24\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3")
        buf.write(u"\21\3\2\2\2\u00c4\u00c5\7\21\2\2\u00c5\u00c8\7\b\2\2")
        buf.write(u"\u00c6\u00c9\5\26\f\2\u00c7\u00c9\7A\2\2\u00c8\u00c6")
        buf.write(u"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d1\3\2\2\2\u00ca")
        buf.write(u"\u00cd\7\t\2\2\u00cb\u00ce\5\26\f\2\u00cc\u00ce\7A\2")
        buf.write(u"\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d0")
        buf.write(u"\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1")
        buf.write(u"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2")
        buf.write(u"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6")
        buf.write(u"\7\4\2\2\u00d6\23\3\2\2\2\u00d7\u00d8\7\22\2\2\u00d8")
        buf.write(u"\u00d9\7\b\2\2\u00d9\u00da\7\n\2\2\u00da\25\3\2\2\2\u00db")
        buf.write(u"\u00de\5\30\r\2\u00dc\u00dd\t\2\2\2\u00dd\u00df\5\30")
        buf.write(u"\r\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\27")
        buf.write(u"\3\2\2\2\u00e0\u00e5\5\32\16\2\u00e1\u00e2\t\3\2\2\u00e2")
        buf.write(u"\u00e4\5\32\16\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2")
        buf.write(u"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\31")
        buf.write(u"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ed\5\34\17\2\u00e9")
        buf.write(u"\u00ea\t\4\2\2\u00ea\u00ec\5\34\17\2\u00eb\u00e9\3\2")
        buf.write(u"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee")
        buf.write(u"\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1")
        buf.write(u"\7\b\2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7\n\2\2\u00f3")
        buf.write(u"\u00fa\3\2\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2")
        buf.write(u"\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa")
        buf.write(u"\5\36\20\2\u00f8\u00fa\5\60\31\2\u00f9\u00f0\3\2\2\2")
        buf.write(u"\u00f9\u00f5\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\35\3\2")
        buf.write(u"\2\2\u00fb\u0102\7=\2\2\u00fc\u0102\7?\2\2\u00fd\u0102")
        buf.write(u"\7@\2\2\u00fe\u0102\7>\2\2\u00ff\u0102\7A\2\2\u0100\u0102")
        buf.write(u"\5.\30\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101")
        buf.write(u"\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2")
        buf.write(u"\2\u0101\u0100\3\2\2\2\u0102\37\3\2\2\2\u0103\u0104\t")
        buf.write(u"\5\2\2\u0104!\3\2\2\2\u0105\u0106\5(\25\2\u0106\u0107")
        buf.write(u"\b\22\1\2\u0107\u010d\3\2\2\2\u0108\u010d\5\20\t\2\u0109")
        buf.write(u"\u010d\5\22\n\2\u010a\u010d\5$\23\2\u010b\u010d\5\62")
        buf.write(u"\32\2\u010c\u0105\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109")
        buf.write(u"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d")
        buf.write(u"#\3\2\2\2\u010e\u010f\7\35\2\2\u010f\u0110\7=\2\2\u0110")
        buf.write(u"\u0111\7\36\2\2\u0111\u0112\5\30\r\2\u0112\u0113\7\37")
        buf.write(u"\2\2\u0113\u0116\5\30\r\2\u0114\u0115\7\37\2\2\u0115")
        buf.write(u"\u0117\5\30\r\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2")
        buf.write(u"\2\u0117\u0118\3\2\2\2\u0118\u0119\5&\24\2\u0119\u0121")
        buf.write(u"\3\2\2\2\u011a\u011b\7 \2\2\u011b\u011c\7\b\2\2\u011c")
        buf.write(u"\u011d\5\26\f\2\u011d\u011e\7\n\2\2\u011e\u011f\5&\24")
        buf.write(u"\2\u011f\u0121\3\2\2\2\u0120\u010e\3\2\2\2\u0120\u011a")
        buf.write(u"\3\2\2\2\u0121%\3\2\2\2\u0122\u0124\7\13\2\2\u0123\u0125")
        buf.write(u"\5\"\22\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126")
        buf.write(u"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2")
        buf.write(u"\2\u0128\u0129\7\r\2\2\u0129\'\3\2\2\2\u012a\u012c\7")
        buf.write(u"=\2\2\u012b\u012d\5.\30\2\u012c\u012b\3\2\2\2\u012c\u012d")
        buf.write(u"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5*\26\2\u012f")
        buf.write(u"\u0130\7\4\2\2\u0130)\3\2\2\2\u0131\u0146\7\36\2\2\u0132")
        buf.write(u"\u0147\5\26\f\2\u0133\u0142\7!\2\2\u0134\u0137\5\30\r")
        buf.write(u"\2\u0135\u0137\5,\27\2\u0136\u0134\3\2\2\2\u0136\u0135")
        buf.write(u"\3\2\2\2\u0137\u013f\3\2\2\2\u0138\u013b\7\t\2\2\u0139")
        buf.write(u"\u013c\5\30\r\2\u013a\u013c\5,\27\2\u013b\u0139\3\2\2")
        buf.write(u"\2\u013b\u013a\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0138")
        buf.write(u"\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f")
        buf.write(u"\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2")
        buf.write(u"\2\u0142\u0136\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144")
        buf.write(u"\3\2\2\2\u0144\u0147\7\"\2\2\u0145\u0147\5\60\31\2\u0146")
        buf.write(u"\u0132\3\2\2\2\u0146\u0133\3\2\2\2\u0146\u0145\3\2\2")
        buf.write(u"\2\u0147+\3\2\2\2\u0148\u0151\7!\2\2\u0149\u014e\5\30")
        buf.write(u"\r\2\u014a\u014b\7\t\2\2\u014b\u014d\5\30\r\2\u014c\u014a")
        buf.write(u"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e")
        buf.write(u"\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2")
        buf.write(u"\2\u0151\u0149\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153")
        buf.write(u"\3\2\2\2\u0153\u0154\7\"\2\2\u0154-\3\2\2\2\u0155\u0156")
        buf.write(u"\7!\2\2\u0156\u0159\5\30\r\2\u0157\u0158\7\t\2\2\u0158")
        buf.write(u"\u015a\5\30\r\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2")
        buf.write(u"\2\u015a\u015b\3\2\2\2\u015b\u015c\7\"\2\2\u015c/\3\2")
        buf.write(u"\2\2\u015d\u016f\5N(\2\u015e\u016f\5P)\2\u015f\u016f")
        buf.write(u"\5R*\2\u0160\u016f\5H%\2\u0161\u016f\5J&\2\u0162\u016f")
        buf.write(u"\5L\'\2\u0163\u016f\5\64\33\2\u0164\u016f\5\66\34\2\u0165")
        buf.write(u"\u016f\58\35\2\u0166\u016f\5:\36\2\u0167\u016f\5<\37")
        buf.write(u"\2\u0168\u016f\5> \2\u0169\u016f\5F$\2\u016a\u016f\5")
        buf.write(u"@!\2\u016b\u016f\5B\"\2\u016c\u016f\5D#\2\u016d\u016f")
        buf.write(u"\5T+\2\u016e\u015d\3\2\2\2\u016e\u015e\3\2\2\2\u016e")
        buf.write(u"\u015f\3\2\2\2\u016e\u0160\3\2\2\2\u016e\u0161\3\2\2")
        buf.write(u"\2\u016e\u0162\3\2\2\2\u016e\u0163\3\2\2\2\u016e\u0164")
        buf.write(u"\3\2\2\2\u016e\u0165\3\2\2\2\u016e\u0166\3\2\2\2\u016e")
        buf.write(u"\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u0169\3\2\2")
        buf.write(u"\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c")
        buf.write(u"\3\2\2\2\u016e\u016d\3\2\2\2\u016f\61\3\2\2\2\u0170\u0178")
        buf.write(u"\5V,\2\u0171\u0178\5X-\2\u0172\u0178\5Z.\2\u0173\u0178")
        buf.write(u"\5\\/\2\u0174\u0175\5T+\2\u0175\u0176\7\4\2\2\u0176\u0178")
        buf.write(u"\3\2\2\2\u0177\u0170\3\2\2\2\u0177\u0171\3\2\2\2\u0177")
        buf.write(u"\u0172\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2")
        buf.write(u"\2\u0178\63\3\2\2\2\u0179\u017a\7#\2\2\u017a\u017b\7")
        buf.write(u"\b\2\2\u017b\u017c\7=\2\2\u017c\u017d\7\n\2\2\u017d\65")
        buf.write(u"\3\2\2\2\u017e\u017f\7$\2\2\u017f\u0180\7\b\2\2\u0180")
        buf.write(u"\u0181\7=\2\2\u0181\u0182\7\n\2\2\u0182\67\3\2\2\2\u0183")
        buf.write(u"\u0184\7%\2\2\u0184\u0185\7\b\2\2\u0185\u0186\7=\2\2")
        buf.write(u"\u0186\u0187\7\n\2\2\u01879\3\2\2\2\u0188\u0189\7&\2")
        buf.write(u"\2\u0189\u018a\7\b\2\2\u018a\u018b\7=\2\2\u018b\u018c")
        buf.write(u"\7\n\2\2\u018c;\3\2\2\2\u018d\u018e\7\'\2\2\u018e\u018f")
        buf.write(u"\7\b\2\2\u018f\u0190\7=\2\2\u0190\u0191\7\n\2\2\u0191")
        buf.write(u"=\3\2\2\2\u0192\u0193\7(\2\2\u0193\u0194\7\b\2\2\u0194")
        buf.write(u"\u0195\7=\2\2\u0195\u0196\7\n\2\2\u0196?\3\2\2\2\u0197")
        buf.write(u"\u0198\7)\2\2\u0198\u0199\7\b\2\2\u0199\u019a\7=\2\2")
        buf.write(u"\u019a\u019b\7\t\2\2\u019b\u019c\7=\2\2\u019c\u019d\7")
        buf.write(u"\n\2\2\u019dA\3\2\2\2\u019e\u019f\7*\2\2\u019f\u01a0")
        buf.write(u"\7\b\2\2\u01a0\u01a1\7=\2\2\u01a1\u01a2\7\t\2\2\u01a2")
        buf.write(u"\u01a3\7=\2\2\u01a3\u01a4\7\n\2\2\u01a4C\3\2\2\2\u01a5")
        buf.write(u"\u01a6\7+\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8\7=\2\2")
        buf.write(u"\u01a8\u01a9\7\t\2\2\u01a9\u01aa\5\30\r\2\u01aa\u01ab")
        buf.write(u"\7\n\2\2\u01abE\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae")
        buf.write(u"\7\b\2\2\u01ae\u01af\7A\2\2\u01af\u01b0\7\n\2\2\u01b0")
        buf.write(u"G\3\2\2\2\u01b1\u01b2\7-\2\2\u01b2\u01b3\7\b\2\2\u01b3")
        buf.write(u"\u01b4\7=\2\2\u01b4\u01b5\7\n\2\2\u01b5I\3\2\2\2\u01b6")
        buf.write(u"\u01b7\7.\2\2\u01b7\u01b8\7\b\2\2\u01b8\u01b9\7=\2\2")
        buf.write(u"\u01b9\u01ba\7\n\2\2\u01baK\3\2\2\2\u01bb\u01bc\7/\2")
        buf.write(u"\2\u01bc\u01bd\7\b\2\2\u01bd\u01be\7=\2\2\u01be\u01bf")
        buf.write(u"\7\n\2\2\u01bfM\3\2\2\2\u01c0\u01c1\7\60\2\2\u01c1\u01c2")
        buf.write(u"\7\b\2\2\u01c2\u01c3\7=\2\2\u01c3\u01c4\7\t\2\2\u01c4")
        buf.write(u"\u01c5\7=\2\2\u01c5\u01c6\7\n\2\2\u01c6O\3\2\2\2\u01c7")
        buf.write(u"\u01c8\7\61\2\2\u01c8\u01c9\7\b\2\2\u01c9\u01ca\7=\2")
        buf.write(u"\2\u01ca\u01cb\7\t\2\2\u01cb\u01cc\7?\2\2\u01cc\u01cd")
        buf.write(u"\7\n\2\2\u01cdQ\3\2\2\2\u01ce\u01cf\7\62\2\2\u01cf\u01d0")
        buf.write(u"\7\b\2\2\u01d0\u01d1\7=\2\2\u01d1\u01d2\7\t\2\2\u01d2")
        buf.write(u"\u01d3\5\30\r\2\u01d3\u01d4\7\t\2\2\u01d4\u01d5\5\30")
        buf.write(u"\r\2\u01d5\u01d6\7\n\2\2\u01d6S\3\2\2\2\u01d7\u01d8\7")
        buf.write(u"=\2\2\u01d8\u01e7\7\b\2\2\u01d9\u01dc\7=\2\2\u01da\u01dc")
        buf.write(u"\5\36\20\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc")
        buf.write(u"\u01e4\3\2\2\2\u01dd\u01e0\7\t\2\2\u01de\u01e1\7=\2\2")
        buf.write(u"\u01df\u01e1\5\36\20\2\u01e0\u01de\3\2\2\2\u01e0\u01df")
        buf.write(u"\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e3")
        buf.write(u"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2")
        buf.write(u"\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01db")
        buf.write(u"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9")
        buf.write(u"\u01ea\7\n\2\2\u01eaU\3\2\2\2\u01eb\u01ec\7\63\2\2\u01ec")
        buf.write(u"\u01ed\7\b\2\2\u01ed\u01ee\7=\2\2\u01ee\u01ef\7\t\2\2")
        buf.write(u"\u01ef\u01f0\7=\2\2\u01f0\u01f1\7\n\2\2\u01f1\u01f2\7")
        buf.write(u"\4\2\2\u01f2W\3\2\2\2\u01f3\u01f4\7\64\2\2\u01f4\u01f5")
        buf.write(u"\7\b\2\2\u01f5\u01f6\7=\2\2\u01f6\u01f7\7\t\2\2\u01f7")
        buf.write(u"\u01f8\7=\2\2\u01f8\u01f9\7\n\2\2\u01f9\u01fa\7\4\2\2")
        buf.write(u"\u01faY\3\2\2\2\u01fb\u01fc\7\65\2\2\u01fc\u01fd\7\b")
        buf.write(u"\2\2\u01fd\u01fe\7=\2\2\u01fe\u01ff\7\t\2\2\u01ff\u0200")
        buf.write(u"\7=\2\2\u0200\u0201\7\n\2\2\u0201\u0202\7\4\2\2\u0202")
        buf.write(u"[\3\2\2\2\u0203\u0204\7\66\2\2\u0204\u0205\7\b\2\2\u0205")
        buf.write(u"\u0206\7=\2\2\u0206\u0207\7\t\2\2\u0207\u0208\7A\2\2")
        buf.write(u"\u0208\u0209\7\67\2\2\u0209\u020a\7\n\2\2\u020a\u020b")
        buf.write(u"\7\4\2\2\u020b]\3\2\2\2+bgt\u0086\u0089\u008f\u0094\u009a")
        buf.write(u"\u00a3\u00a9\u00ae\u00b5\u00c2\u00c8\u00cd\u00d1\u00de")
        buf.write(u"\u00e5\u00ed\u00f5\u00f9\u0101\u010c\u0116\u0120\u0126")
        buf.write(u"\u012c\u0136\u013b\u013f\u0142\u0146\u014e\u0151\u0159")
        buf.write(u"\u016e\u0177\u01db\u01e0\u01e4\u01e7")
        return buf.getvalue()


class oscarParser ( Parser ):

    grammarFileName = "oscar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'#oscar'", u"';'", u"'def'", u"'void'", 
                     u"'main'", u"'('", u"','", u"')'", u"'{'", u"'return'", 
                     u"'}'", u"'var'", u"'if'", u"'else'", u"'print'", u"'read'", 
                     u"'+'", u"'-'", u"'*'", u"'/'", u"'%'", u"'int'", u"'float'", 
                     u"'string'", u"'boolean'", u"'list'", u"'for'", u"'='", 
                     u"':'", u"'while'", u"'['", u"']'", u"'mean'", u"'variance'", 
                     u"'median'", u"'stdev'", u"'head'", u"'tail'", u"'union'", 
                     u"'intersect'", u"'find'", u"'import'", u"'length'", 
                     u"'min'", u"'max'", u"'concat'", u"'sort'", u"'splice'", 
                     u"'histogram'", u"'pie_chart'", u"'bar_graph'", u"'export'", 
                     u"'.csv'" ]

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
        self.checkVersion("4.7.1")
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
            self._id_ = None # Id_Context
            self._ID = None # Token

        def param(self):
            return self.getTypedRuleContext(oscarParser.ParamContext,0)


        def bloque(self):
            return self.getTypedRuleContext(oscarParser.BloqueContext,0)


        def id_(self):
            return self.getTypedRuleContext(oscarParser.Id_Context,0)


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
            self.state = 114
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__21, oscarParser.T__22, oscarParser.T__23, oscarParser.T__24, oscarParser.T__25]:
                self.state = 108
                localctx._id_ = self.id_()
                rules.add_to_func_table((None if localctx._id_ is None else self._input.getText((localctx._id_.start,localctx._id_.stop))))
                pass
            elif token in [oscarParser.T__3]:
                self.state = 111
                self.match(oscarParser.T__3)
                self.state = 112
                localctx._ID = self.match(oscarParser.ID)
                rules.add_to_func_table('void'+(None if localctx._ID is None else localctx._ID.text))
                pass
            else:
                raise NoViableAltException(self)

            self.state = 116
            self.param()
            self.state = 117
            self.bloque()
            rules.delete_var_table()
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
            rules.add_to_func_table('main')
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
            rules.create_variable_table('param')
            self.state = 135
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__21) | (1 << oscarParser.T__22) | (1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25))) != 0):
                self.state = 127
                self.id_()
                self.state = 132
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 128
                    self.match(oscarParser.T__6)
                    self.state = 129
                    self.id_()
                    self.state = 134
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 137
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
            self.state = 139
            self.match(oscarParser.T__8)
            self.state = 141
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__11:
                self.state = 140
                self.vars_()


            self.state = 144 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 143
                self.estatuto()
                self.state = 146 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__12) | (1 << oscarParser.T__14) | (1 << oscarParser.T__26) | (1 << oscarParser.T__29) | (1 << oscarParser.T__48) | (1 << oscarParser.T__49) | (1 << oscarParser.T__50) | (1 << oscarParser.T__51) | (1 << oscarParser.ID))) != 0)):
                    break

            self.state = 152
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__9:
                self.state = 148
                self.match(oscarParser.T__9)
                self.state = 149
                self.exp()
                self.state = 150
                self.match(oscarParser.T__1)


            self.state = 154
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
            self.state = 156
            self.match(oscarParser.T__11)
            rules.create_variable_table('vars')
            self.state = 177 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 158
                localctx._tipo = self.tipo()
                self.state = 159
                localctx._ID = self.match(oscarParser.ID)
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__27:
                    self.state = 160
                    self.igualdad()


                rules.add_to_var_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
                self.state = 172
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 164
                    self.match(oscarParser.T__6)
                    self.state = 165
                    localctx._ID = self.match(oscarParser.ID)
                    self.state = 167
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==oscarParser.T__27:
                        self.state = 166
                        self.igualdad()


                    rules.add_to_var_table((None if localctx._ID is None else localctx._ID.text), (None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))))
                    self.state = 174
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 175
                self.match(oscarParser.T__1)
                self.state = 179 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__21) | (1 << oscarParser.T__22) | (1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25))) != 0)):
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
            self.state = 181
            localctx._tipo = self.tipo()
            self.state = 182
            localctx._ID = self.match(oscarParser.ID)
            rules.add_to_var_table((None if localctx._tipo is None else self._input.getText((localctx._tipo.start,localctx._tipo.stop))), (None if localctx._ID is None else localctx._ID.text))
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
            self.state = 185
            self.match(oscarParser.T__12)
            self.state = 186
            self.match(oscarParser.T__5)
            self.state = 187
            self.expresion()
            self.state = 188
            self.match(oscarParser.T__7)
            self.state = 189
            self.estats()
            self.state = 192
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__13:
                self.state = 190
                self.match(oscarParser.T__13)
                self.state = 191
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
            self.state = 194
            self.match(oscarParser.T__14)
            self.state = 195
            self.match(oscarParser.T__5)
            self.state = 198
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 196
                self.expresion()
                pass

            elif la_ == 2:
                self.state = 197
                self.match(oscarParser.CTE_STRING)
                pass


            self.state = 207
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==oscarParser.T__6:
                self.state = 200
                self.match(oscarParser.T__6)
                self.state = 203
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
                if la_ == 1:
                    self.state = 201
                    self.expresion()
                    pass

                elif la_ == 2:
                    self.state = 202
                    self.match(oscarParser.CTE_STRING)
                    pass


                self.state = 209
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 210
            self.match(oscarParser.T__7)
            self.state = 211
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
            self.state = 213
            self.match(oscarParser.T__15)
            self.state = 214
            self.match(oscarParser.T__5)
            self.state = 215
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
            self.state = 217
            self.exp()
            self.state = 220
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.RELACIONALES or _la==oscarParser.LOGICOS:
                self.state = 218
                _la = self._input.LA(1)
                if not(_la==oscarParser.RELACIONALES or _la==oscarParser.LOGICOS):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 219
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
            self.state = 222
            self.termino()
            self.state = 227
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==oscarParser.T__16 or _la==oscarParser.T__17:
                self.state = 223
                _la = self._input.LA(1)
                if not(_la==oscarParser.T__16 or _la==oscarParser.T__17):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 224
                self.termino()
                self.state = 229
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
            self.state = 230
            self.factor()
            self.state = 235
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__18) | (1 << oscarParser.T__19) | (1 << oscarParser.T__20))) != 0):
                self.state = 231
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__18) | (1 << oscarParser.T__19) | (1 << oscarParser.T__20))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 232
                self.factor()
                self.state = 237
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
            self.state = 247
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 238
                self.match(oscarParser.T__5)
                self.state = 239
                self.expresion()
                self.state = 240
                self.match(oscarParser.T__7)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 243
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__16 or _la==oscarParser.T__17:
                    self.state = 242
                    _la = self._input.LA(1)
                    if not(_la==oscarParser.T__16 or _la==oscarParser.T__17):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()


                self.state = 245
                self.var_cte()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 246
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
            self.state = 255
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 249
                self.match(oscarParser.ID)
                pass
            elif token in [oscarParser.CTE_I]:
                self.enterOuterAlt(localctx, 2)
                self.state = 250
                self.match(oscarParser.CTE_I)
                pass
            elif token in [oscarParser.CTE_F]:
                self.enterOuterAlt(localctx, 3)
                self.state = 251
                self.match(oscarParser.CTE_F)
                pass
            elif token in [oscarParser.CTE_B]:
                self.enterOuterAlt(localctx, 4)
                self.state = 252
                self.match(oscarParser.CTE_B)
                pass
            elif token in [oscarParser.CTE_STRING]:
                self.enterOuterAlt(localctx, 5)
                self.state = 253
                self.match(oscarParser.CTE_STRING)
                pass
            elif token in [oscarParser.T__30]:
                self.enterOuterAlt(localctx, 6)
                self.state = 254
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
            self.state = 257
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__21) | (1 << oscarParser.T__22) | (1 << oscarParser.T__23) | (1 << oscarParser.T__24) | (1 << oscarParser.T__25))) != 0)):
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
            self._asignacion = None # AsignacionContext

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
            self.state = 266
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 259
                localctx._asignacion = self.asignacion()
                rules.asignacion((None if localctx._asignacion is None else self._input.getText((localctx._asignacion.start,localctx._asignacion.stop))))
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 262
                self.condicion()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 263
                self.escritura()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 264
                self.ciclo()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 265
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
            self.state = 286
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__26]:
                self.enterOuterAlt(localctx, 1)
                self.state = 268
                self.match(oscarParser.T__26)
                self.state = 269
                self.match(oscarParser.ID)
                self.state = 270
                self.match(oscarParser.T__27)
                self.state = 271
                self.exp()
                self.state = 272
                self.match(oscarParser.T__28)
                self.state = 273
                self.exp()
                self.state = 276
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==oscarParser.T__28:
                    self.state = 274
                    self.match(oscarParser.T__28)
                    self.state = 275
                    self.exp()


                self.state = 278
                self.estats()
                pass
            elif token in [oscarParser.T__29]:
                self.enterOuterAlt(localctx, 2)
                self.state = 280
                self.match(oscarParser.T__29)
                self.state = 281
                self.match(oscarParser.T__5)
                self.state = 282
                self.expresion()
                self.state = 283
                self.match(oscarParser.T__7)
                self.state = 284
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
            self.state = 288
            self.match(oscarParser.T__8)
            self.state = 290 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 289
                self.estatuto()
                self.state = 292 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__12) | (1 << oscarParser.T__14) | (1 << oscarParser.T__26) | (1 << oscarParser.T__29) | (1 << oscarParser.T__48) | (1 << oscarParser.T__49) | (1 << oscarParser.T__50) | (1 << oscarParser.T__51) | (1 << oscarParser.ID))) != 0)):
                    break

            self.state = 294
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
            self.state = 296
            self.match(oscarParser.ID)
            self.state = 298
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__30:
                self.state = 297
                self.element()


            self.state = 300
            self.igualdad()
            self.state = 301
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
            self.state = 303
            self.match(oscarParser.T__27)
            self.state = 324
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,31,self._ctx)
            if la_ == 1:
                self.state = 304
                self.expresion()
                pass

            elif la_ == 2:
                self.state = 305
                self.match(oscarParser.T__30)
                self.state = 320
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__5) | (1 << oscarParser.T__16) | (1 << oscarParser.T__17) | (1 << oscarParser.T__30) | (1 << oscarParser.T__32) | (1 << oscarParser.T__33) | (1 << oscarParser.T__34) | (1 << oscarParser.T__35) | (1 << oscarParser.T__36) | (1 << oscarParser.T__37) | (1 << oscarParser.T__38) | (1 << oscarParser.T__39) | (1 << oscarParser.T__40) | (1 << oscarParser.T__41) | (1 << oscarParser.T__42) | (1 << oscarParser.T__43) | (1 << oscarParser.T__44) | (1 << oscarParser.T__45) | (1 << oscarParser.T__46) | (1 << oscarParser.T__47) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                    self.state = 308
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
                    if la_ == 1:
                        self.state = 306
                        self.exp()
                        pass

                    elif la_ == 2:
                        self.state = 307
                        self.sub_lista()
                        pass


                    self.state = 317
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==oscarParser.T__6:
                        self.state = 310
                        self.match(oscarParser.T__6)
                        self.state = 313
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
                        if la_ == 1:
                            self.state = 311
                            self.exp()
                            pass

                        elif la_ == 2:
                            self.state = 312
                            self.sub_lista()
                            pass


                        self.state = 319
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)



                self.state = 322
                self.match(oscarParser.T__31)
                pass

            elif la_ == 3:
                self.state = 323
                self.llamadaret()
                pass


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
            self.state = 326
            self.match(oscarParser.T__30)
            self.state = 335
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__5) | (1 << oscarParser.T__16) | (1 << oscarParser.T__17) | (1 << oscarParser.T__30) | (1 << oscarParser.T__32) | (1 << oscarParser.T__33) | (1 << oscarParser.T__34) | (1 << oscarParser.T__35) | (1 << oscarParser.T__36) | (1 << oscarParser.T__37) | (1 << oscarParser.T__38) | (1 << oscarParser.T__39) | (1 << oscarParser.T__40) | (1 << oscarParser.T__41) | (1 << oscarParser.T__42) | (1 << oscarParser.T__43) | (1 << oscarParser.T__44) | (1 << oscarParser.T__45) | (1 << oscarParser.T__46) | (1 << oscarParser.T__47) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                self.state = 327
                self.exp()
                self.state = 332
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 328
                    self.match(oscarParser.T__6)
                    self.state = 329
                    self.exp()
                    self.state = 334
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 337
            self.match(oscarParser.T__31)
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
            self.state = 339
            self.match(oscarParser.T__30)
            self.state = 340
            self.exp()
            self.state = 343
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==oscarParser.T__6:
                self.state = 341
                self.match(oscarParser.T__6)
                self.state = 342
                self.exp()


            self.state = 345
            self.match(oscarParser.T__31)
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
            self.state = 364
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__45]:
                self.enterOuterAlt(localctx, 1)
                self.state = 347
                self.concat()
                pass
            elif token in [oscarParser.T__46]:
                self.enterOuterAlt(localctx, 2)
                self.state = 348
                self.sort()
                pass
            elif token in [oscarParser.T__47]:
                self.enterOuterAlt(localctx, 3)
                self.state = 349
                self.splice()
                pass
            elif token in [oscarParser.T__42]:
                self.enterOuterAlt(localctx, 4)
                self.state = 350
                self.length()
                pass
            elif token in [oscarParser.T__43]:
                self.enterOuterAlt(localctx, 5)
                self.state = 351
                self.min_()
                pass
            elif token in [oscarParser.T__44]:
                self.enterOuterAlt(localctx, 6)
                self.state = 352
                self.max_()
                pass
            elif token in [oscarParser.T__32]:
                self.enterOuterAlt(localctx, 7)
                self.state = 353
                self.mean()
                pass
            elif token in [oscarParser.T__33]:
                self.enterOuterAlt(localctx, 8)
                self.state = 354
                self.variance()
                pass
            elif token in [oscarParser.T__34]:
                self.enterOuterAlt(localctx, 9)
                self.state = 355
                self.median()
                pass
            elif token in [oscarParser.T__35]:
                self.enterOuterAlt(localctx, 10)
                self.state = 356
                self.stdev()
                pass
            elif token in [oscarParser.T__36]:
                self.enterOuterAlt(localctx, 11)
                self.state = 357
                self.head()
                pass
            elif token in [oscarParser.T__37]:
                self.enterOuterAlt(localctx, 12)
                self.state = 358
                self.tail()
                pass
            elif token in [oscarParser.T__41]:
                self.enterOuterAlt(localctx, 13)
                self.state = 359
                self.import_csv()
                pass
            elif token in [oscarParser.T__38]:
                self.enterOuterAlt(localctx, 14)
                self.state = 360
                self.union()
                pass
            elif token in [oscarParser.T__39]:
                self.enterOuterAlt(localctx, 15)
                self.state = 361
                self.intersect()
                pass
            elif token in [oscarParser.T__40]:
                self.enterOuterAlt(localctx, 16)
                self.state = 362
                self.find()
                pass
            elif token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 17)
                self.state = 363
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
            self.state = 373
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [oscarParser.T__48]:
                self.enterOuterAlt(localctx, 1)
                self.state = 366
                self.histograma()
                pass
            elif token in [oscarParser.T__49]:
                self.enterOuterAlt(localctx, 2)
                self.state = 367
                self.pie_chart()
                pass
            elif token in [oscarParser.T__50]:
                self.enterOuterAlt(localctx, 3)
                self.state = 368
                self.bar_graph()
                pass
            elif token in [oscarParser.T__51]:
                self.enterOuterAlt(localctx, 4)
                self.state = 369
                self.export_csv()
                pass
            elif token in [oscarParser.ID]:
                self.enterOuterAlt(localctx, 5)
                self.state = 370
                self.userdef()
                self.state = 371
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
            self.state = 375
            self.match(oscarParser.T__32)
            self.state = 376
            self.match(oscarParser.T__5)
            self.state = 377
            self.match(oscarParser.ID)
            self.state = 378
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
            self.state = 380
            self.match(oscarParser.T__33)
            self.state = 381
            self.match(oscarParser.T__5)
            self.state = 382
            self.match(oscarParser.ID)
            self.state = 383
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
            self.state = 385
            self.match(oscarParser.T__34)
            self.state = 386
            self.match(oscarParser.T__5)
            self.state = 387
            self.match(oscarParser.ID)
            self.state = 388
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
            self.state = 390
            self.match(oscarParser.T__35)
            self.state = 391
            self.match(oscarParser.T__5)
            self.state = 392
            self.match(oscarParser.ID)
            self.state = 393
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
            self.state = 395
            self.match(oscarParser.T__36)
            self.state = 396
            self.match(oscarParser.T__5)
            self.state = 397
            self.match(oscarParser.ID)
            self.state = 398
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
            self.state = 400
            self.match(oscarParser.T__37)
            self.state = 401
            self.match(oscarParser.T__5)
            self.state = 402
            self.match(oscarParser.ID)
            self.state = 403
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
            self.state = 405
            self.match(oscarParser.T__38)
            self.state = 406
            self.match(oscarParser.T__5)
            self.state = 407
            self.match(oscarParser.ID)
            self.state = 408
            self.match(oscarParser.T__6)
            self.state = 409
            self.match(oscarParser.ID)
            self.state = 410
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
            self.state = 412
            self.match(oscarParser.T__39)
            self.state = 413
            self.match(oscarParser.T__5)
            self.state = 414
            self.match(oscarParser.ID)
            self.state = 415
            self.match(oscarParser.T__6)
            self.state = 416
            self.match(oscarParser.ID)
            self.state = 417
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
            self.state = 419
            self.match(oscarParser.T__40)
            self.state = 420
            self.match(oscarParser.T__5)
            self.state = 421
            self.match(oscarParser.ID)
            self.state = 422
            self.match(oscarParser.T__6)
            self.state = 423
            self.exp()
            self.state = 424
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
            self.state = 426
            self.match(oscarParser.T__41)
            self.state = 427
            self.match(oscarParser.T__5)
            self.state = 428
            self.match(oscarParser.CTE_STRING)
            self.state = 429
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
            self.state = 431
            self.match(oscarParser.T__42)
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
            self.state = 436
            self.match(oscarParser.T__43)
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
            self.state = 441
            self.match(oscarParser.T__44)
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
            self.state = 446
            self.match(oscarParser.T__45)
            self.state = 447
            self.match(oscarParser.T__5)
            self.state = 448
            self.match(oscarParser.ID)
            self.state = 449
            self.match(oscarParser.T__6)
            self.state = 450
            self.match(oscarParser.ID)
            self.state = 451
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
            self.state = 453
            self.match(oscarParser.T__46)
            self.state = 454
            self.match(oscarParser.T__5)
            self.state = 455
            self.match(oscarParser.ID)
            self.state = 456
            self.match(oscarParser.T__6)
            self.state = 457
            self.match(oscarParser.CTE_I)
            self.state = 458
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
            self.state = 460
            self.match(oscarParser.T__47)
            self.state = 461
            self.match(oscarParser.T__5)
            self.state = 462
            self.match(oscarParser.ID)
            self.state = 463
            self.match(oscarParser.T__6)
            self.state = 464
            self.exp()
            self.state = 465
            self.match(oscarParser.T__6)
            self.state = 466
            self.exp()
            self.state = 467
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
            self.state = 469
            self.match(oscarParser.ID)
            self.state = 470
            self.match(oscarParser.T__5)
            self.state = 485
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << oscarParser.T__30) | (1 << oscarParser.ID) | (1 << oscarParser.CTE_B) | (1 << oscarParser.CTE_I) | (1 << oscarParser.CTE_F) | (1 << oscarParser.CTE_STRING))) != 0):
                self.state = 473
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
                if la_ == 1:
                    self.state = 471
                    self.match(oscarParser.ID)
                    pass

                elif la_ == 2:
                    self.state = 472
                    self.var_cte()
                    pass


                self.state = 482
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==oscarParser.T__6:
                    self.state = 475
                    self.match(oscarParser.T__6)
                    self.state = 478
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,38,self._ctx)
                    if la_ == 1:
                        self.state = 476
                        self.match(oscarParser.ID)
                        pass

                    elif la_ == 2:
                        self.state = 477
                        self.var_cte()
                        pass


                    self.state = 484
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 487
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
            self.state = 489
            self.match(oscarParser.T__48)
            self.state = 490
            self.match(oscarParser.T__5)
            self.state = 491
            self.match(oscarParser.ID)
            self.state = 492
            self.match(oscarParser.T__6)
            self.state = 493
            self.match(oscarParser.ID)
            self.state = 494
            self.match(oscarParser.T__7)
            self.state = 495
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
            self.state = 497
            self.match(oscarParser.T__49)
            self.state = 498
            self.match(oscarParser.T__5)
            self.state = 499
            self.match(oscarParser.ID)
            self.state = 500
            self.match(oscarParser.T__6)
            self.state = 501
            self.match(oscarParser.ID)
            self.state = 502
            self.match(oscarParser.T__7)
            self.state = 503
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
            self.state = 505
            self.match(oscarParser.T__50)
            self.state = 506
            self.match(oscarParser.T__5)
            self.state = 507
            self.match(oscarParser.ID)
            self.state = 508
            self.match(oscarParser.T__6)
            self.state = 509
            self.match(oscarParser.ID)
            self.state = 510
            self.match(oscarParser.T__7)
            self.state = 511
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
            self.state = 513
            self.match(oscarParser.T__51)
            self.state = 514
            self.match(oscarParser.T__5)
            self.state = 515
            self.match(oscarParser.ID)
            self.state = 516
            self.match(oscarParser.T__6)
            self.state = 517
            self.match(oscarParser.CTE_STRING)
            self.state = 518
            self.match(oscarParser.T__52)
            self.state = 519
            self.match(oscarParser.T__7)
            self.state = 520
            self.match(oscarParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





