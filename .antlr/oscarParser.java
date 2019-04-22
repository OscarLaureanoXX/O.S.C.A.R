// Generated from c:\Users\oscar\Documents\Compilador\ProyectoCompiladores\oscar.g4 by ANTLR 4.7.1

import rules

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class oscarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, RESERVED=54, RELACIONALES=55, LOGICOS=56, DELIMITADORES=57, 
		WS=58, ID=59, CTE_B=60, CTE_I=61, CTE_F=62, CTE_STRING=63, LIST=64;
	public static final int
		RULE_programa = 0, RULE_modulo = 1, RULE_main = 2, RULE_param = 3, RULE_bloque = 4, 
		RULE_vars_ = 5, RULE_id_ = 6, RULE_condicion = 7, RULE_escritura = 8, 
		RULE_lectura = 9, RULE_expresion = 10, RULE_exp = 11, RULE_termino = 12, 
		RULE_factor = 13, RULE_var_cte = 14, RULE_tipo = 15, RULE_estatuto = 16, 
		RULE_ciclo = 17, RULE_estats = 18, RULE_asignacion = 19, RULE_igualdad = 20, 
		RULE_sub_lista = 21, RULE_element = 22, RULE_llamadaret = 23, RULE_llamadavoid = 24, 
		RULE_mean = 25, RULE_variance = 26, RULE_median = 27, RULE_stdev = 28, 
		RULE_head = 29, RULE_tail = 30, RULE_union = 31, RULE_intersect = 32, 
		RULE_find = 33, RULE_import_csv = 34, RULE_length = 35, RULE_min_ = 36, 
		RULE_max_ = 37, RULE_concat = 38, RULE_sort = 39, RULE_splice = 40, RULE_userdef = 41, 
		RULE_histograma = 42, RULE_pie_chart = 43, RULE_bar_graph = 44, RULE_export_csv = 45;
	public static final String[] ruleNames = {
		"programa", "modulo", "main", "param", "bloque", "vars_", "id_", "condicion", 
		"escritura", "lectura", "expresion", "exp", "termino", "factor", "var_cte", 
		"tipo", "estatuto", "ciclo", "estats", "asignacion", "igualdad", "sub_lista", 
		"element", "llamadaret", "llamadavoid", "mean", "variance", "median", 
		"stdev", "head", "tail", "union", "intersect", "find", "import_csv", "length", 
		"min_", "max_", "concat", "sort", "splice", "userdef", "histograma", "pie_chart", 
		"bar_graph", "export_csv"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#oscar'", "';'", "'def'", "'void'", "'main'", "'('", "','", "')'", 
		"'{'", "'return'", "'}'", "'var'", "'['", "']'", "'if'", "'else'", "'print'", 
		"'read'", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'string'", 
		"'bool'", "'list'", "'for'", "'='", "':'", "'while'", "'mean'", "'variance'", 
		"'median'", "'stdev'", "'head'", "'tail'", "'union'", "'intersect'", "'find'", 
		"'import'", "'length'", "'min'", "'max'", "'concat'", "'sort'", "'splice'", 
		"'histogram'", "'pie_chart'", "'bar_graph'", "'export'", "'.csv'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "RESERVED", "RELACIONALES", "LOGICOS", 
		"DELIMITADORES", "WS", "ID", "CTE_B", "CTE_I", "CTE_F", "CTE_STRING", 
		"LIST"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "oscar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public oscarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Vars_Context vars_() {
			return getRuleContext(Vars_Context.class,0);
		}
		public List<ModuloContext> modulo() {
			return getRuleContexts(ModuloContext.class);
		}
		public ModuloContext modulo(int i) {
			return getRuleContext(ModuloContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(93);
			match(T__1);
			rules.create_function_table()
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(95);
				vars_();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(98);
				modulo();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			main();
			rules.destroy()
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuloContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__2);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				{
				setState(108);
				((ModuloContext)_localctx).tipo = tipo();
				setState(109);
				((ModuloContext)_localctx).ID = match(ID);
				rules.add_to_func_table((((ModuloContext)_localctx).ID!=null?((ModuloContext)_localctx).ID.getText():null), (((ModuloContext)_localctx).tipo!=null?_input.getText(((ModuloContext)_localctx).tipo.start,((ModuloContext)_localctx).tipo.stop):null))
				}
				break;
			case T__3:
				{
				setState(112);
				match(T__3);
				setState(113);
				((ModuloContext)_localctx).ID = match(ID);
				rules.add_to_func_table((((ModuloContext)_localctx).ID!=null?((ModuloContext)_localctx).ID.getText():null), 'void')
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			param();
			setState(118);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__4);
			rules.add_to_func_table('main','main')
			setState(122);
			param();
			setState(123);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public List<Id_Context> id_() {
			return getRuleContexts(Id_Context.class);
		}
		public Id_Context id_(int i) {
			return getRuleContext(Id_Context.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__5);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(126);
				id_();
				rules.update_func_firm()
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(128);
					match(T__6);
					setState(129);
					id_();
					rules.update_func_firm()
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public Vars_Context vars_() {
			return getRuleContext(Vars_Context.class,0);
		}
		public List<EstatutoContext> estatuto() {
			return getRuleContexts(EstatutoContext.class);
		}
		public EstatutoContext estatuto(int i) {
			return getRuleContext(EstatutoContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(142);
				vars_();
				}
			}

			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				estatuto();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__28) | (1L << T__31) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0) );
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(150);
				match(T__9);
				setState(151);
				exp();
				setState(152);
				match(T__1);
				}
			}

			setState(156);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vars_Context extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public Token CTE_I;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public List<TerminalNode> CTE_I() { return getTokens(oscarParser.CTE_I); }
		public TerminalNode CTE_I(int i) {
			return getToken(oscarParser.CTE_I, i);
		}
		public List<IgualdadContext> igualdad() {
			return getRuleContexts(IgualdadContext.class);
		}
		public IgualdadContext igualdad(int i) {
			return getRuleContext(IgualdadContext.class,i);
		}
		public Vars_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_; }
	}

	public final Vars_Context vars_() throws RecognitionException {
		Vars_Context _localctx = new Vars_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_vars_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__11);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				((Vars_Context)_localctx).tipo = tipo();
				setState(160);
				((Vars_Context)_localctx).ID = match(ID);
				rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
				rules.add_to_operand_stack((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(163);
					match(T__12);
					setState(164);
					((Vars_Context)_localctx).CTE_I = match(CTE_I);
					rules.addRows((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(166);
						match(T__6);
						setState(167);
						((Vars_Context)_localctx).CTE_I = match(CTE_I);
						rules.addColumns((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
						}
					}

					setState(171);
					match(T__13);
					}
				}

				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(174);
					igualdad();
					}
				}

				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(177);
					match(T__6);
					setState(178);
					((Vars_Context)_localctx).ID = match(ID);
					rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(180);
						match(T__12);
						setState(181);
						((Vars_Context)_localctx).CTE_I = match(CTE_I);
						rules.addRows((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__6) {
							{
							setState(183);
							match(T__6);
							setState(184);
							((Vars_Context)_localctx).CTE_I = match(CTE_I);
							rules.addColumns((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
							}
						}

						setState(188);
						match(T__13);
						}
					}

					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29) {
						{
						setState(191);
						igualdad();
						}
					}

					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__1);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_Context extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public Id_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_; }
	}

	public final Id_Context id_() throws RecognitionException {
		Id_Context _localctx = new Id_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((Id_Context)_localctx).tipo = tipo();
			setState(206);
			((Id_Context)_localctx).ID = match(ID);
			rules.add_to_var_table((((Id_Context)_localctx).ID!=null?((Id_Context)_localctx).ID.getText():null), (((Id_Context)_localctx).tipo!=null?_input.getText(((Id_Context)_localctx).tipo.start,((Id_Context)_localctx).tipo.stop):null))
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<EstatsContext> estats() {
			return getRuleContexts(EstatsContext.class);
		}
		public EstatsContext estats(int i) {
			return getRuleContext(EstatsContext.class,i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__14);
			setState(210);
			match(T__5);
			setState(211);
			expresion();
			setState(212);
			match(T__7);
			rules.add_conditional()
			setState(214);
			estats();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(215);
				match(T__15);
				rules.add_else()
				setState(217);
				estats();
				}
			}

			rules.add_end_conditional()
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscrituraContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> CTE_STRING() { return getTokens(oscarParser.CTE_STRING); }
		public TerminalNode CTE_STRING(int i) {
			return getToken(oscarParser.CTE_STRING, i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__16);
			setState(223);
			match(T__5);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(224);
				expresion();
				rules.add_print()
				}
				break;
			case 2:
				{
				setState(227);
				match(CTE_STRING);
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(230);
				match(T__6);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(231);
					expresion();
					rules.add_print()
					}
					break;
				case 2:
					{
					setState(234);
					match(CTE_STRING);
					}
					break;
				}
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__7);
			setState(243);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturaContext extends ParserRuleContext {
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__17);
			setState(246);
			match(T__5);
			setState(247);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public Token RELACIONALES;
		public Token LOGICOS;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RELACIONALES() { return getToken(oscarParser.RELACIONALES, 0); }
		public TerminalNode LOGICOS() { return getToken(oscarParser.LOGICOS, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			exp();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELACIONALES || _la==LOGICOS) {
				{
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELACIONALES:
					{
					setState(250);
					((ExpresionContext)_localctx).RELACIONALES = match(RELACIONALES);
					rules.add_to_operator_stack((((ExpresionContext)_localctx).RELACIONALES!=null?((ExpresionContext)_localctx).RELACIONALES.getText():null))
					}
					break;
				case LOGICOS:
					{
					setState(252);
					((ExpresionContext)_localctx).LOGICOS = match(LOGICOS);
					rules.add_to_operator_stack((((ExpresionContext)_localctx).LOGICOS!=null?((ExpresionContext)_localctx).LOGICOS.getText():null))
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256);
				exp();
				rules.pop_rel_from_stack()
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			termino();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(262);
					match(T__18);
					rules.add_to_operator_stack('+')
					}
					break;
				case T__19:
					{
					setState(264);
					match(T__19);
					rules.add_to_operator_stack('-')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(268);
				termino();
				rules.pop_sum_from_stack()
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			factor();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(277);
					match(T__20);
					rules.add_to_operator_stack('*')
					}
					break;
				case T__21:
					{
					setState(279);
					match(T__21);
					rules.add_to_operator_stack('/')
					}
					break;
				case T__22:
					{
					setState(281);
					match(T__22);
					rules.add_to_operator_stack('%')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285);
				factor();
				rules.pop_mult_from_stack()
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public LlamadaretContext llamadaret() {
			return getRuleContext(LlamadaretContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(293);
				match(T__5);
				rules.add_to_operator_stack('(')
				setState(295);
				expresion();
				setState(296);
				match(T__7);
				#sacar parentesis
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__19) {
					{
					setState(299);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(302);
				var_cte();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				llamadaret();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_cteContext extends ParserRuleContext {
		public Token ID;
		public Token CTE_I;
		public Token CTE_F;
		public Token CTE_B;
		public Token CTE_STRING;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(oscarParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(oscarParser.CTE_F, 0); }
		public TerminalNode CTE_B() { return getToken(oscarParser.CTE_B, 0); }
		public TerminalNode CTE_STRING() { return getToken(oscarParser.CTE_STRING, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_cte);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((Var_cteContext)_localctx).ID = match(ID);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).ID!=null?((Var_cteContext)_localctx).ID.getText():null), 'var')
				}
				break;
			case CTE_I:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((Var_cteContext)_localctx).CTE_I = match(CTE_I);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_I!=null?((Var_cteContext)_localctx).CTE_I.getText():null), 'int')
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((Var_cteContext)_localctx).CTE_F = match(CTE_F);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_F!=null?((Var_cteContext)_localctx).CTE_F.getText():null), 'float')
				}
				break;
			case CTE_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				((Var_cteContext)_localctx).CTE_B = match(CTE_B);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_B!=null?((Var_cteContext)_localctx).CTE_B.getText():null), 'bool')
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				((Var_cteContext)_localctx).CTE_STRING = match(CTE_STRING);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_STRING!=null?((Var_cteContext)_localctx).CTE_STRING.getText():null), 'string')
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public LlamadavoidContext llamadavoid() {
			return getRuleContext(LlamadavoidContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estatuto);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				escritura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				ciclo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				llamadavoid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public EstatsContext estats() {
			return getRuleContext(EstatsContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ciclo);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(328);
				match(T__28);
				setState(329);
				((CicloContext)_localctx).ID = match(ID);
				rules.add_to_operand_stack((((CicloContext)_localctx).ID!=null?((CicloContext)_localctx).ID.getText():null), 'var')
				setState(331);
				match(T__29);
				rules.add_to_operator_stack('=')
				setState(333);
				exp();
				rules.pop_equals_from_stack()
				setState(335);
				match(T__30);
				rules.add_for_inicio((((CicloContext)_localctx).ID!=null?((CicloContext)_localctx).ID.getText():null))
				setState(337);
				exp();
				rules.add_for_limite()
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(339);
					match(T__30);
					setState(340);
					exp();
					rules.add_for_step()
					}
				}

				setState(345);
				estats();
				rules.add_for_final()
				}
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(348);
				match(T__31);
				rules.add_while()
				setState(350);
				match(T__5);
				setState(351);
				expresion();
				setState(352);
				match(T__7);
				rules.add_expr_while()
				setState(354);
				estats();
				rules.add_end_while()
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstatsContext extends ParserRuleContext {
		public List<EstatutoContext> estatuto() {
			return getRuleContexts(EstatutoContext.class);
		}
		public EstatutoContext estatuto(int i) {
			return getRuleContext(EstatutoContext.class,i);
		}
		public EstatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estats; }
	}

	public final EstatsContext estats() throws RecognitionException {
		EstatsContext _localctx = new EstatsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__8);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				estatuto();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__28) | (1L << T__31) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0) );
			setState(365);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((AsignacionContext)_localctx).ID = match(ID);
			rules.add_to_operand_stack((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), 'var')
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(369);
				element();
				}
			}

			setState(372);
			igualdad();
			setState(373);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualdadContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LlamadaretContext llamadaret() {
			return getRuleContext(LlamadaretContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<Sub_listaContext> sub_lista() {
			return getRuleContexts(Sub_listaContext.class);
		}
		public Sub_listaContext sub_lista(int i) {
			return getRuleContext(Sub_listaContext.class,i);
		}
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		IgualdadContext _localctx = new IgualdadContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_igualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__29);
			rules.add_to_operator_stack('=')
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(377);
				expresion();
				}
				break;
			case 2:
				{
				{
				setState(378);
				match(T__12);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(379);
						exp();
						}
						break;
					case 2:
						{
						setState(380);
						sub_lista();
						}
						break;
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(383);
						match(T__6);
						setState(386);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(384);
							exp();
							}
							break;
						case 2:
							{
							setState(385);
							sub_lista();
							}
							break;
						}
						}
						}
						setState(392);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(395);
				match(T__13);
				}
				}
				break;
			case 3:
				{
				setState(396);
				llamadaret();
				}
				break;
			}
			rules.pop_equals_from_stack()
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_listaContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Sub_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_lista; }
	}

	public final Sub_listaContext sub_lista() throws RecognitionException {
		Sub_listaContext _localctx = new Sub_listaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sub_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__12);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(402);
				exp();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(403);
					match(T__6);
					setState(404);
					exp();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__12);
			setState(415);
			exp();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(416);
				match(T__6);
				setState(417);
				exp();
				}
			}

			setState(420);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaretContext extends ParserRuleContext {
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public SpliceContext splice() {
			return getRuleContext(SpliceContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Min_Context min_() {
			return getRuleContext(Min_Context.class,0);
		}
		public Max_Context max_() {
			return getRuleContext(Max_Context.class,0);
		}
		public MeanContext mean() {
			return getRuleContext(MeanContext.class,0);
		}
		public VarianceContext variance() {
			return getRuleContext(VarianceContext.class,0);
		}
		public MedianContext median() {
			return getRuleContext(MedianContext.class,0);
		}
		public StdevContext stdev() {
			return getRuleContext(StdevContext.class,0);
		}
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public Import_csvContext import_csv() {
			return getRuleContext(Import_csvContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public IntersectContext intersect() {
			return getRuleContext(IntersectContext.class,0);
		}
		public FindContext find() {
			return getRuleContext(FindContext.class,0);
		}
		public UserdefContext userdef() {
			return getRuleContext(UserdefContext.class,0);
		}
		public LlamadaretContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaret; }
	}

	public final LlamadaretContext llamadaret() throws RecognitionException {
		LlamadaretContext _localctx = new LlamadaretContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamadaret);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				concat();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				sort();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				splice();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				length();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				min_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				max_();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				mean();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				variance();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(430);
				median();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 10);
				{
				setState(431);
				stdev();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 11);
				{
				setState(432);
				head();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 12);
				{
				setState(433);
				tail();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(434);
				import_csv();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 14);
				{
				setState(435);
				union();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 15);
				{
				setState(436);
				intersect();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 16);
				{
				setState(437);
				find();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 17);
				{
				setState(438);
				userdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadavoidContext extends ParserRuleContext {
		public HistogramaContext histograma() {
			return getRuleContext(HistogramaContext.class,0);
		}
		public Pie_chartContext pie_chart() {
			return getRuleContext(Pie_chartContext.class,0);
		}
		public Bar_graphContext bar_graph() {
			return getRuleContext(Bar_graphContext.class,0);
		}
		public Export_csvContext export_csv() {
			return getRuleContext(Export_csvContext.class,0);
		}
		public UserdefContext userdef() {
			return getRuleContext(UserdefContext.class,0);
		}
		public LlamadavoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadavoid; }
	}

	public final LlamadavoidContext llamadavoid() throws RecognitionException {
		LlamadavoidContext _localctx = new LlamadavoidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_llamadavoid);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				histograma();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				pie_chart();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				bar_graph();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				export_csv();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(445);
				userdef();
				setState(446);
				match(T__1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeanContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public MeanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mean; }
	}

	public final MeanContext mean() throws RecognitionException {
		MeanContext _localctx = new MeanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__32);
			setState(451);
			match(T__5);
			setState(452);
			match(ID);
			setState(453);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public VarianceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance; }
	}

	public final VarianceContext variance() throws RecognitionException {
		VarianceContext _localctx = new VarianceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__33);
			setState(456);
			match(T__5);
			setState(457);
			match(ID);
			setState(458);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MedianContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public MedianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_median; }
	}

	public final MedianContext median() throws RecognitionException {
		MedianContext _localctx = new MedianContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_median);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__34);
			setState(461);
			match(T__5);
			setState(462);
			match(ID);
			setState(463);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdevContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public StdevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdev; }
	}

	public final StdevContext stdev() throws RecognitionException {
		StdevContext _localctx = new StdevContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stdev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__35);
			setState(466);
			match(T__5);
			setState(467);
			match(ID);
			setState(468);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__36);
			setState(471);
			match(T__5);
			setState(472);
			match(ID);
			setState(473);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(T__37);
			setState(476);
			match(T__5);
			setState(477);
			match(ID);
			setState(478);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__38);
			setState(481);
			match(T__5);
			setState(482);
			match(ID);
			setState(483);
			match(T__6);
			setState(484);
			match(ID);
			setState(485);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public IntersectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersect; }
	}

	public final IntersectContext intersect() throws RecognitionException {
		IntersectContext _localctx = new IntersectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_intersect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__39);
			setState(488);
			match(T__5);
			setState(489);
			match(ID);
			setState(490);
			match(T__6);
			setState(491);
			match(ID);
			setState(492);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FindContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find; }
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__40);
			setState(495);
			match(T__5);
			setState(496);
			match(ID);
			setState(497);
			match(T__6);
			setState(498);
			exp();
			setState(499);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_csvContext extends ParserRuleContext {
		public TerminalNode CTE_STRING() { return getToken(oscarParser.CTE_STRING, 0); }
		public Import_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_csv; }
	}

	public final Import_csvContext import_csv() throws RecognitionException {
		Import_csvContext _localctx = new Import_csvContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_import_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__41);
			setState(502);
			match(T__5);
			setState(503);
			match(CTE_STRING);
			setState(504);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__42);
			setState(507);
			match(T__5);
			setState(508);
			match(ID);
			setState(509);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Min_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public Min_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_; }
	}

	public final Min_Context min_() throws RecognitionException {
		Min_Context _localctx = new Min_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_min_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__43);
			setState(512);
			match(T__5);
			setState(513);
			match(ID);
			setState(514);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public Max_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_; }
	}

	public final Max_Context max_() throws RecognitionException {
		Max_Context _localctx = new Max_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_max_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__44);
			setState(517);
			match(T__5);
			setState(518);
			match(ID);
			setState(519);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__45);
			setState(522);
			match(T__5);
			setState(523);
			match(ID);
			setState(524);
			match(T__6);
			setState(525);
			match(ID);
			setState(526);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(oscarParser.CTE_I, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__46);
			setState(529);
			match(T__5);
			setState(530);
			match(ID);
			setState(531);
			match(T__6);
			setState(532);
			match(CTE_I);
			setState(533);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpliceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SpliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice; }
	}

	public final SpliceContext splice() throws RecognitionException {
		SpliceContext _localctx = new SpliceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_splice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T__47);
			setState(536);
			match(T__5);
			setState(537);
			match(ID);
			setState(538);
			match(T__6);
			setState(539);
			exp();
			setState(540);
			match(T__6);
			setState(541);
			exp();
			setState(542);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public List<Var_cteContext> var_cte() {
			return getRuleContexts(Var_cteContext.class);
		}
		public Var_cteContext var_cte(int i) {
			return getRuleContext(Var_cteContext.class,i);
		}
		public UserdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdef; }
	}

	public final UserdefContext userdef() throws RecognitionException {
		UserdefContext _localctx = new UserdefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_userdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(ID);
			setState(545);
			match(T__5);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(546);
					match(ID);
					}
					break;
				case 2:
					{
					setState(547);
					var_cte();
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(550);
					match(T__6);
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(551);
						match(ID);
						}
						break;
					case 2:
						{
						setState(552);
						var_cte();
						}
						break;
					}
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(562);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistogramaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public HistogramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_histograma; }
	}

	public final HistogramaContext histograma() throws RecognitionException {
		HistogramaContext _localctx = new HistogramaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_histograma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__48);
			setState(565);
			match(T__5);
			setState(566);
			match(ID);
			setState(567);
			match(T__6);
			setState(568);
			match(ID);
			setState(569);
			match(T__7);
			setState(570);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pie_chartContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public Pie_chartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pie_chart; }
	}

	public final Pie_chartContext pie_chart() throws RecognitionException {
		Pie_chartContext _localctx = new Pie_chartContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pie_chart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__49);
			setState(573);
			match(T__5);
			setState(574);
			match(ID);
			setState(575);
			match(T__6);
			setState(576);
			match(ID);
			setState(577);
			match(T__7);
			setState(578);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bar_graphContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public Bar_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_graph; }
	}

	public final Bar_graphContext bar_graph() throws RecognitionException {
		Bar_graphContext _localctx = new Bar_graphContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_bar_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__50);
			setState(581);
			match(T__5);
			setState(582);
			match(ID);
			setState(583);
			match(T__6);
			setState(584);
			match(ID);
			setState(585);
			match(T__7);
			setState(586);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Export_csvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TerminalNode CTE_STRING() { return getToken(oscarParser.CTE_STRING, 0); }
		public Export_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_csv; }
	}

	public final Export_csvContext export_csv() throws RecognitionException {
		Export_csvContext _localctx = new Export_csvContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_export_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__51);
			setState(589);
			match(T__5);
			setState(590);
			match(ID);
			setState(591);
			match(T__6);
			setState(592);
			match(CTE_STRING);
			setState(593);
			match(T__52);
			setState(594);
			match(T__7);
			setState(595);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0258\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\5\2c\n\2\3\2\7\2f\n\2\f\2\16\2"+
		"i\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3v\n\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0087\n\5\f\5\16"+
		"\5\u008a\13\5\5\5\u008c\n\5\3\5\3\5\3\6\3\6\5\6\u0092\n\6\3\6\6\6\u0095"+
		"\n\6\r\6\16\6\u0096\3\6\3\6\3\6\3\6\5\6\u009d\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\5\7\u00af\n\7\3\7\5"+
		"\7\u00b2\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\5\7"+
		"\u00c0\n\7\3\7\5\7\u00c3\n\7\7\7\u00c5\n\7\f\7\16\7\u00c8\13\7\3\7\3\7"+
		"\6\7\u00cc\n\7\r\7\16\7\u00cd\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00dd\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e7\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\7\n\u00f0\n\n\f\n\16\n\u00f3\13\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0101\n\f\3\f"+
		"\3\f\3\f\5\f\u0106\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u010d\n\r\3\r\3\r\3\r\7"+
		"\r\u0112\n\r\f\r\16\r\u0115\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u011e\n\16\3\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012f\n\17\3\17\3\17\5\17\u0133"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0140"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0149\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015a"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0168\n\23\3\24\3\24\6\24\u016c\n\24\r\24\16\24\u016d\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u0175\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0180\n\26\3\26\3\26\3\26\5\26\u0185\n\26\7\26\u0187\n\26\f\26\16"+
		"\26\u018a\13\26\5\26\u018c\n\26\3\26\3\26\5\26\u0190\n\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\7\27\u0198\n\27\f\27\16\27\u019b\13\27\5\27\u019d\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u01a5\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u01ba\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c3\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3+\3+\3+\3+\5+\u0227\n+\3+\3+\3+\5+\u022c\n+\7+\u022e\n+\f+\16+\u0231"+
		"\13+\5+\u0233\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\2\2\60\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\\2\4\3\2\25\26\3\2\32\36\2\u0275\2^\3\2\2\2\4m\3\2\2\2\6z\3\2\2\2\b"+
		"\177\3\2\2\2\n\u008f\3\2\2\2\f\u00a0\3\2\2\2\16\u00cf\3\2\2\2\20\u00d3"+
		"\3\2\2\2\22\u00e0\3\2\2\2\24\u00f7\3\2\2\2\26\u00fb\3\2\2\2\30\u0107\3"+
		"\2\2\2\32\u0116\3\2\2\2\34\u0132\3\2\2\2\36\u013f\3\2\2\2 \u0141\3\2\2"+
		"\2\"\u0148\3\2\2\2$\u0167\3\2\2\2&\u0169\3\2\2\2(\u0171\3\2\2\2*\u0179"+
		"\3\2\2\2,\u0193\3\2\2\2.\u01a0\3\2\2\2\60\u01b9\3\2\2\2\62\u01c2\3\2\2"+
		"\2\64\u01c4\3\2\2\2\66\u01c9\3\2\2\28\u01ce\3\2\2\2:\u01d3\3\2\2\2<\u01d8"+
		"\3\2\2\2>\u01dd\3\2\2\2@\u01e2\3\2\2\2B\u01e9\3\2\2\2D\u01f0\3\2\2\2F"+
		"\u01f7\3\2\2\2H\u01fc\3\2\2\2J\u0201\3\2\2\2L\u0206\3\2\2\2N\u020b\3\2"+
		"\2\2P\u0212\3\2\2\2R\u0219\3\2\2\2T\u0222\3\2\2\2V\u0236\3\2\2\2X\u023e"+
		"\3\2\2\2Z\u0246\3\2\2\2\\\u024e\3\2\2\2^_\7\3\2\2_`\7\4\2\2`b\b\2\1\2"+
		"ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2cg\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\6\4\2kl\b\2\1\2l\3\3\2\2"+
		"\2mu\7\5\2\2no\5 \21\2op\7=\2\2pq\b\3\1\2qv\3\2\2\2rs\7\6\2\2st\7=\2\2"+
		"tv\b\3\1\2un\3\2\2\2ur\3\2\2\2vw\3\2\2\2wx\5\b\5\2xy\5\n\6\2y\5\3\2\2"+
		"\2z{\7\7\2\2{|\b\4\1\2|}\5\b\5\2}~\5\n\6\2~\7\3\2\2\2\177\u008b\7\b\2"+
		"\2\u0080\u0081\5\16\b\2\u0081\u0088\b\5\1\2\u0082\u0083\7\t\2\2\u0083"+
		"\u0084\5\16\b\2\u0084\u0085\b\5\1\2\u0085\u0087\3\2\2\2\u0086\u0082\3"+
		"\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\n\2\2\u008e\t\3\2\2\2\u008f\u0091"+
		"\7\13\2\2\u0090\u0092\5\f\7\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0094\3\2\2\2\u0093\u0095\5\"\22\2\u0094\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7\4\2\2\u009b\u009d\3"+
		"\2\2\2\u009c\u0098\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\r\2\2\u009f\13\3\2\2\2\u00a0\u00cb\7\16\2\2\u00a1\u00a2\5 \21"+
		"\2\u00a2\u00a3\7=\2\2\u00a3\u00a4\b\7\1\2\u00a4\u00ae\b\7\1\2\u00a5\u00a6"+
		"\7\17\2\2\u00a6\u00a7\7?\2\2\u00a7\u00ab\b\7\1\2\u00a8\u00a9\7\t\2\2\u00a9"+
		"\u00aa\7?\2\2\u00aa\u00ac\b\7\1\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7\20\2\2\u00ae\u00a5\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5*\26\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c6\3\2\2\2\u00b3\u00b4\7\t\2\2\u00b4"+
		"\u00b5\7=\2\2\u00b5\u00bf\b\7\1\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\7?"+
		"\2\2\u00b8\u00bc\b\7\1\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		"\u00bd\b\7\1\2\u00bc\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\7\20\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00a1\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\r\3\2\2\2"+
		"\u00cf\u00d0\5 \21\2\u00d0\u00d1\7=\2\2\u00d1\u00d2\b\b\1\2\u00d2\17\3"+
		"\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5\26\f\2\u00d6"+
		"\u00d7\7\n\2\2\u00d7\u00d8\b\t\1\2\u00d8\u00dc\5&\24\2\u00d9\u00da\7\22"+
		"\2\2\u00da\u00db\b\t\1\2\u00db\u00dd\5&\24\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\t\1\2\u00df\21\3\2\2"+
		"\2\u00e0\u00e1\7\23\2\2\u00e1\u00e6\7\b\2\2\u00e2\u00e3\5\26\f\2\u00e3"+
		"\u00e4\b\n\1\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\7A\2\2\u00e6\u00e2\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f1\3\2\2\2\u00e8\u00ed\7\t\2\2\u00e9"+
		"\u00ea\5\26\f\2\u00ea\u00eb\b\n\1\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\7"+
		"A\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e8\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\n\2\2\u00f5"+
		"\u00f6\7\4\2\2\u00f6\23\3\2\2\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\7\b\2"+
		"\2\u00f9\u00fa\7\n\2\2\u00fa\25\3\2\2\2\u00fb\u0105\5\30\r\2\u00fc\u00fd"+
		"\79\2\2\u00fd\u0101\b\f\1\2\u00fe\u00ff\7:\2\2\u00ff\u0101\b\f\1\2\u0100"+
		"\u00fc\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\30"+
		"\r\2\u0103\u0104\b\f\1\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\27\3\2\2\2\u0107\u0113\5\32\16\2\u0108\u0109\7\25"+
		"\2\2\u0109\u010d\b\r\1\2\u010a\u010b\7\26\2\2\u010b\u010d\b\r\1\2\u010c"+
		"\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5\32"+
		"\16\2\u010f\u0110\b\r\1\2\u0110\u0112\3\2\2\2\u0111\u010c\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\31\3\2\2"+
		"\2\u0115\u0113\3\2\2\2\u0116\u0124\5\34\17\2\u0117\u0118\7\27\2\2\u0118"+
		"\u011e\b\16\1\2\u0119\u011a\7\30\2\2\u011a\u011e\b\16\1\2\u011b\u011c"+
		"\7\31\2\2\u011c\u011e\b\16\1\2\u011d\u0117\3\2\2\2\u011d\u0119\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\5\34\17\2\u0120\u0121"+
		"\b\16\1\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0123\u0126\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\33\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\7\b\2\2\u0128\u0129\b\17\1\2\u0129\u012a\5\26\f\2"+
		"\u012a\u012b\7\n\2\2\u012b\u012c\b\17\1\2\u012c\u0133\3\2\2\2\u012d\u012f"+
		"\t\2\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0133\5\36\20\2\u0131\u0133\5\60\31\2\u0132\u0127\3\2\2\2\u0132\u012e"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\35\3\2\2\2\u0134\u0135\7=\2\2\u0135"+
		"\u0140\b\20\1\2\u0136\u0137\7?\2\2\u0137\u0140\b\20\1\2\u0138\u0139\7"+
		"@\2\2\u0139\u0140\b\20\1\2\u013a\u013b\7>\2\2\u013b\u0140\b\20\1\2\u013c"+
		"\u013d\7A\2\2\u013d\u0140\b\20\1\2\u013e\u0140\5.\30\2\u013f\u0134\3\2"+
		"\2\2\u013f\u0136\3\2\2\2\u013f\u0138\3\2\2\2\u013f\u013a\3\2\2\2\u013f"+
		"\u013c\3\2\2\2\u013f\u013e\3\2\2\2\u0140\37\3\2\2\2\u0141\u0142\t\3\2"+
		"\2\u0142!\3\2\2\2\u0143\u0149\5(\25\2\u0144\u0149\5\20\t\2\u0145\u0149"+
		"\5\22\n\2\u0146\u0149\5$\23\2\u0147\u0149\5\62\32\2\u0148\u0143\3\2\2"+
		"\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147"+
		"\3\2\2\2\u0149#\3\2\2\2\u014a\u014b\7\37\2\2\u014b\u014c\7=\2\2\u014c"+
		"\u014d\b\23\1\2\u014d\u014e\7 \2\2\u014e\u014f\b\23\1\2\u014f\u0150\5"+
		"\30\r\2\u0150\u0151\b\23\1\2\u0151\u0152\7!\2\2\u0152\u0153\b\23\1\2\u0153"+
		"\u0154\5\30\r\2\u0154\u0159\b\23\1\2\u0155\u0156\7!\2\2\u0156\u0157\5"+
		"\30\r\2\u0157\u0158\b\23\1\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5&\24\2\u015c\u015d\b\23"+
		"\1\2\u015d\u0168\3\2\2\2\u015e\u015f\7\"\2\2\u015f\u0160\b\23\1\2\u0160"+
		"\u0161\7\b\2\2\u0161\u0162\5\26\f\2\u0162\u0163\7\n\2\2\u0163\u0164\b"+
		"\23\1\2\u0164\u0165\5&\24\2\u0165\u0166\b\23\1\2\u0166\u0168\3\2\2\2\u0167"+
		"\u014a\3\2\2\2\u0167\u015e\3\2\2\2\u0168%\3\2\2\2\u0169\u016b\7\13\2\2"+
		"\u016a\u016c\5\"\22\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\r\2\2\u0170"+
		"\'\3\2\2\2\u0171\u0172\7=\2\2\u0172\u0174\b\25\1\2\u0173\u0175\5.\30\2"+
		"\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\5*\26\2\u0177\u0178\7\4\2\2\u0178)\3\2\2\2\u0179\u017a\7 \2\2\u017a\u018f"+
		"\b\26\1\2\u017b\u0190\5\26\f\2\u017c\u018b\7\17\2\2\u017d\u0180\5\30\r"+
		"\2\u017e\u0180\5,\27\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0188"+
		"\3\2\2\2\u0181\u0184\7\t\2\2\u0182\u0185\5\30\r\2\u0183\u0185\5,\27\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0181"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u017f\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u0190\7\20\2\2\u018e\u0190\5\60\31\2\u018f"+
		"\u017b\3\2\2\2\u018f\u017c\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\b\26\1\2\u0192+\3\2\2\2\u0193\u019c\7\17\2\2\u0194\u0199"+
		"\5\30\r\2\u0195\u0196\7\t\2\2\u0196\u0198\5\30\r\2\u0197\u0195\3\2\2\2"+
		"\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0194\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7\20\2\2\u019f-\3\2\2\2\u01a0\u01a1\7\17\2"+
		"\2\u01a1\u01a4\5\30\r\2\u01a2\u01a3\7\t\2\2\u01a3\u01a5\5\30\r\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\20"+
		"\2\2\u01a7/\3\2\2\2\u01a8\u01ba\5N(\2\u01a9\u01ba\5P)\2\u01aa\u01ba\5"+
		"R*\2\u01ab\u01ba\5H%\2\u01ac\u01ba\5J&\2\u01ad\u01ba\5L\'\2\u01ae\u01ba"+
		"\5\64\33\2\u01af\u01ba\5\66\34\2\u01b0\u01ba\58\35\2\u01b1\u01ba\5:\36"+
		"\2\u01b2\u01ba\5<\37\2\u01b3\u01ba\5> \2\u01b4\u01ba\5F$\2\u01b5\u01ba"+
		"\5@!\2\u01b6\u01ba\5B\"\2\u01b7\u01ba\5D#\2\u01b8\u01ba\5T+\2\u01b9\u01a8"+
		"\3\2\2\2\u01b9\u01a9\3\2\2\2\u01b9\u01aa\3\2\2\2\u01b9\u01ab\3\2\2\2\u01b9"+
		"\u01ac\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9\u01ae\3\2\2\2\u01b9\u01af\3\2"+
		"\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2\3\2\2\2\u01b9"+
		"\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\61\3\2\2\2\u01bb\u01c3"+
		"\5V,\2\u01bc\u01c3\5X-\2\u01bd\u01c3\5Z.\2\u01be\u01c3\5\\/\2\u01bf\u01c0"+
		"\5T+\2\u01c0\u01c1\7\4\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bb\3\2\2\2\u01c2"+
		"\u01bc\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01be\3\2\2\2\u01c2\u01bf\3\2"+
		"\2\2\u01c3\63\3\2\2\2\u01c4\u01c5\7#\2\2\u01c5\u01c6\7\b\2\2\u01c6\u01c7"+
		"\7=\2\2\u01c7\u01c8\7\n\2\2\u01c8\65\3\2\2\2\u01c9\u01ca\7$\2\2\u01ca"+
		"\u01cb\7\b\2\2\u01cb\u01cc\7=\2\2\u01cc\u01cd\7\n\2\2\u01cd\67\3\2\2\2"+
		"\u01ce\u01cf\7%\2\2\u01cf\u01d0\7\b\2\2\u01d0\u01d1\7=\2\2\u01d1\u01d2"+
		"\7\n\2\2\u01d29\3\2\2\2\u01d3\u01d4\7&\2\2\u01d4\u01d5\7\b\2\2\u01d5\u01d6"+
		"\7=\2\2\u01d6\u01d7\7\n\2\2\u01d7;\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9\u01da"+
		"\7\b\2\2\u01da\u01db\7=\2\2\u01db\u01dc\7\n\2\2\u01dc=\3\2\2\2\u01dd\u01de"+
		"\7(\2\2\u01de\u01df\7\b\2\2\u01df\u01e0\7=\2\2\u01e0\u01e1\7\n\2\2\u01e1"+
		"?\3\2\2\2\u01e2\u01e3\7)\2\2\u01e3\u01e4\7\b\2\2\u01e4\u01e5\7=\2\2\u01e5"+
		"\u01e6\7\t\2\2\u01e6\u01e7\7=\2\2\u01e7\u01e8\7\n\2\2\u01e8A\3\2\2\2\u01e9"+
		"\u01ea\7*\2\2\u01ea\u01eb\7\b\2\2\u01eb\u01ec\7=\2\2\u01ec\u01ed\7\t\2"+
		"\2\u01ed\u01ee\7=\2\2\u01ee\u01ef\7\n\2\2\u01efC\3\2\2\2\u01f0\u01f1\7"+
		"+\2\2\u01f1\u01f2\7\b\2\2\u01f2\u01f3\7=\2\2\u01f3\u01f4\7\t\2\2\u01f4"+
		"\u01f5\5\30\r\2\u01f5\u01f6\7\n\2\2\u01f6E\3\2\2\2\u01f7\u01f8\7,\2\2"+
		"\u01f8\u01f9\7\b\2\2\u01f9\u01fa\7A\2\2\u01fa\u01fb\7\n\2\2\u01fbG\3\2"+
		"\2\2\u01fc\u01fd\7-\2\2\u01fd\u01fe\7\b\2\2\u01fe\u01ff\7=\2\2\u01ff\u0200"+
		"\7\n\2\2\u0200I\3\2\2\2\u0201\u0202\7.\2\2\u0202\u0203\7\b\2\2\u0203\u0204"+
		"\7=\2\2\u0204\u0205\7\n\2\2\u0205K\3\2\2\2\u0206\u0207\7/\2\2\u0207\u0208"+
		"\7\b\2\2\u0208\u0209\7=\2\2\u0209\u020a\7\n\2\2\u020aM\3\2\2\2\u020b\u020c"+
		"\7\60\2\2\u020c\u020d\7\b\2\2\u020d\u020e\7=\2\2\u020e\u020f\7\t\2\2\u020f"+
		"\u0210\7=\2\2\u0210\u0211\7\n\2\2\u0211O\3\2\2\2\u0212\u0213\7\61\2\2"+
		"\u0213\u0214\7\b\2\2\u0214\u0215\7=\2\2\u0215\u0216\7\t\2\2\u0216\u0217"+
		"\7?\2\2\u0217\u0218\7\n\2\2\u0218Q\3\2\2\2\u0219\u021a\7\62\2\2\u021a"+
		"\u021b\7\b\2\2\u021b\u021c\7=\2\2\u021c\u021d\7\t\2\2\u021d\u021e\5\30"+
		"\r\2\u021e\u021f\7\t\2\2\u021f\u0220\5\30\r\2\u0220\u0221\7\n\2\2\u0221"+
		"S\3\2\2\2\u0222\u0223\7=\2\2\u0223\u0232\7\b\2\2\u0224\u0227\7=\2\2\u0225"+
		"\u0227\5\36\20\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u022f\3"+
		"\2\2\2\u0228\u022b\7\t\2\2\u0229\u022c\7=\2\2\u022a\u022c\5\36\20\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u0228\3\2"+
		"\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0226\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\n\2\2\u0235U\3\2\2\2\u0236\u0237"+
		"\7\63\2\2\u0237\u0238\7\b\2\2\u0238\u0239\7=\2\2\u0239\u023a\7\t\2\2\u023a"+
		"\u023b\7=\2\2\u023b\u023c\7\n\2\2\u023c\u023d\7\4\2\2\u023dW\3\2\2\2\u023e"+
		"\u023f\7\64\2\2\u023f\u0240\7\b\2\2\u0240\u0241\7=\2\2\u0241\u0242\7\t"+
		"\2\2\u0242\u0243\7=\2\2\u0243\u0244\7\n\2\2\u0244\u0245\7\4\2\2\u0245"+
		"Y\3\2\2\2\u0246\u0247\7\65\2\2\u0247\u0248\7\b\2\2\u0248\u0249\7=\2\2"+
		"\u0249\u024a\7\t\2\2\u024a\u024b\7=\2\2\u024b\u024c\7\n\2\2\u024c\u024d"+
		"\7\4\2\2\u024d[\3\2\2\2\u024e\u024f\7\66\2\2\u024f\u0250\7\b\2\2\u0250"+
		"\u0251\7=\2\2\u0251\u0252\7\t\2\2\u0252\u0253\7A\2\2\u0253\u0254\7\67"+
		"\2\2\u0254\u0255\7\n\2\2\u0255\u0256\7\4\2\2\u0256]\3\2\2\2\62bgu\u0088"+
		"\u008b\u0091\u0096\u009c\u00ab\u00ae\u00b1\u00bc\u00bf\u00c2\u00c6\u00cd"+
		"\u00dc\u00e6\u00ed\u00f1\u0100\u0105\u010c\u0113\u011d\u0124\u012e\u0132"+
		"\u013f\u0148\u0159\u0167\u016d\u0174\u017f\u0184\u0188\u018b\u018f\u0199"+
		"\u019c\u01a4\u01b9\u01c2\u0226\u022b\u022f\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}