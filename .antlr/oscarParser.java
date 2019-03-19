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
		"'{'", "'return'", "'}'", "'var'", "'if'", "'else'", "'print'", "'read'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'string'", "'boolean'", 
		"'list'", "'for'", "'='", "':'", "'while'", "'['", "']'", "'mean'", "'variance'", 
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
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
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
			rules.delete_var_table()
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
			setState(121);
			match(T__4);
			rules.add_to_func_table('main','main')
			setState(123);
			param();
			setState(124);
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
			setState(126);
			match(T__5);
			rules.create_variable_table('param')
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) {
				{
				setState(128);
				id_();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					match(T__6);
					setState(130);
					id_();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
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
			setState(140);
			match(T__8);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(141);
				vars_();
				}
			}

			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				estatuto();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__26) | (1L << T__29) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0) );
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(149);
				match(T__9);
				setState(150);
				exp();
				setState(151);
				match(T__1);
				}
			}

			setState(155);
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
			setState(157);
			match(T__11);
			rules.create_variable_table('vars')
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				((Vars_Context)_localctx).tipo = tipo();
				setState(160);
				((Vars_Context)_localctx).ID = match(ID);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(161);
					igualdad();
					}
				}

				rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(165);
					match(T__6);
					setState(166);
					((Vars_Context)_localctx).ID = match(ID);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__27) {
						{
						setState(167);
						igualdad();
						}
					}

					rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__1);
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) );
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
			setState(182);
			((Id_Context)_localctx).tipo = tipo();
			setState(183);
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
			setState(186);
			match(T__12);
			setState(187);
			match(T__5);
			setState(188);
			expresion();
			setState(189);
			match(T__7);
			setState(190);
			estats();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(191);
				match(T__13);
				setState(192);
				estats();
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
			setState(195);
			match(T__14);
			setState(196);
			match(T__5);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(197);
				expresion();
				}
				break;
			case 2:
				{
				setState(198);
				match(CTE_STRING);
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(201);
				match(T__6);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(202);
					expresion();
					}
					break;
				case 2:
					{
					setState(203);
					match(CTE_STRING);
					}
					break;
				}
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__7);
			setState(212);
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
			setState(214);
			match(T__15);
			setState(215);
			match(T__5);
			setState(216);
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
			setState(218);
			exp();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELACIONALES || _la==LOGICOS) {
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==RELACIONALES || _la==LOGICOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				exp();
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
			setState(223);
			termino();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				termino();
				}
				}
				setState(230);
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
			setState(231);
			factor();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				factor();
				}
				}
				setState(238);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(239);
				match(T__5);
				setState(240);
				expresion();
				setState(241);
				match(T__7);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__17) {
					{
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==T__17) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(246);
				var_cte();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(ID);
				}
				break;
			case CTE_I:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(CTE_I);
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(CTE_F);
				}
				break;
			case CTE_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(CTE_B);
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(CTE_STRING);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
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
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		public AsignacionContext asignacion;
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((EstatutoContext)_localctx).asignacion = asignacion();
				rules.asignacion((((EstatutoContext)_localctx).asignacion!=null?_input.getText(((EstatutoContext)_localctx).asignacion.start,((EstatutoContext)_localctx).asignacion.stop):null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				escritura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				ciclo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
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
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(269);
				match(T__26);
				setState(270);
				match(ID);
				setState(271);
				match(T__27);
				setState(272);
				exp();
				setState(273);
				match(T__28);
				setState(274);
				exp();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(275);
					match(T__28);
					setState(276);
					exp();
					}
				}

				setState(279);
				estats();
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(281);
				match(T__29);
				setState(282);
				match(T__5);
				setState(283);
				expresion();
				setState(284);
				match(T__7);
				setState(285);
				estats();
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
			setState(289);
			match(T__8);
			setState(291); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				estatuto();
				}
				}
				setState(293); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__26) | (1L << T__29) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0) );
			setState(295);
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
			setState(297);
			match(ID);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(298);
				element();
				}
			}

			setState(301);
			igualdad();
			setState(302);
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
			setState(304);
			match(T__27);
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(305);
				expresion();
				}
				break;
			case 2:
				{
				{
				setState(306);
				match(T__30);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(307);
						exp();
						}
						break;
					case 2:
						{
						setState(308);
						sub_lista();
						}
						break;
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(311);
						match(T__6);
						setState(314);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(312);
							exp();
							}
							break;
						case 2:
							{
							setState(313);
							sub_lista();
							}
							break;
						}
						}
						}
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(323);
				match(T__31);
				}
				}
				break;
			case 3:
				{
				setState(324);
				llamadaret();
				}
				break;
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
			setState(327);
			match(T__30);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(328);
				exp();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(329);
					match(T__6);
					setState(330);
					exp();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			match(T__31);
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
			setState(340);
			match(T__30);
			setState(341);
			exp();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(342);
				match(T__6);
				setState(343);
				exp();
				}
			}

			setState(346);
			match(T__31);
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				concat();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				sort();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				splice();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				length();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				min_();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				max_();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(354);
				mean();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(355);
				variance();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(356);
				median();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 10);
				{
				setState(357);
				stdev();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 11);
				{
				setState(358);
				head();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 12);
				{
				setState(359);
				tail();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(360);
				import_csv();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 14);
				{
				setState(361);
				union();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 15);
				{
				setState(362);
				intersect();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 16);
				{
				setState(363);
				find();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 17);
				{
				setState(364);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				histograma();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				pie_chart();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				bar_graph();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				export_csv();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(371);
				userdef();
				setState(372);
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
			setState(376);
			match(T__32);
			setState(377);
			match(T__5);
			setState(378);
			match(ID);
			setState(379);
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
			setState(381);
			match(T__33);
			setState(382);
			match(T__5);
			setState(383);
			match(ID);
			setState(384);
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
			setState(386);
			match(T__34);
			setState(387);
			match(T__5);
			setState(388);
			match(ID);
			setState(389);
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
			setState(391);
			match(T__35);
			setState(392);
			match(T__5);
			setState(393);
			match(ID);
			setState(394);
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
			setState(396);
			match(T__36);
			setState(397);
			match(T__5);
			setState(398);
			match(ID);
			setState(399);
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
			setState(401);
			match(T__37);
			setState(402);
			match(T__5);
			setState(403);
			match(ID);
			setState(404);
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
			setState(406);
			match(T__38);
			setState(407);
			match(T__5);
			setState(408);
			match(ID);
			setState(409);
			match(T__6);
			setState(410);
			match(ID);
			setState(411);
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
			setState(413);
			match(T__39);
			setState(414);
			match(T__5);
			setState(415);
			match(ID);
			setState(416);
			match(T__6);
			setState(417);
			match(ID);
			setState(418);
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
			setState(420);
			match(T__40);
			setState(421);
			match(T__5);
			setState(422);
			match(ID);
			setState(423);
			match(T__6);
			setState(424);
			exp();
			setState(425);
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
			setState(427);
			match(T__41);
			setState(428);
			match(T__5);
			setState(429);
			match(CTE_STRING);
			setState(430);
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
			setState(432);
			match(T__42);
			setState(433);
			match(T__5);
			setState(434);
			match(ID);
			setState(435);
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
			setState(437);
			match(T__43);
			setState(438);
			match(T__5);
			setState(439);
			match(ID);
			setState(440);
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
			setState(442);
			match(T__44);
			setState(443);
			match(T__5);
			setState(444);
			match(ID);
			setState(445);
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
			setState(447);
			match(T__45);
			setState(448);
			match(T__5);
			setState(449);
			match(ID);
			setState(450);
			match(T__6);
			setState(451);
			match(ID);
			setState(452);
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
			setState(454);
			match(T__46);
			setState(455);
			match(T__5);
			setState(456);
			match(ID);
			setState(457);
			match(T__6);
			setState(458);
			match(CTE_I);
			setState(459);
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
			setState(461);
			match(T__47);
			setState(462);
			match(T__5);
			setState(463);
			match(ID);
			setState(464);
			match(T__6);
			setState(465);
			exp();
			setState(466);
			match(T__6);
			setState(467);
			exp();
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
			setState(470);
			match(ID);
			setState(471);
			match(T__5);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(472);
					match(ID);
					}
					break;
				case 2:
					{
					setState(473);
					var_cte();
					}
					break;
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(476);
					match(T__6);
					setState(479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(477);
						match(ID);
						}
						break;
					case 2:
						{
						setState(478);
						var_cte();
						}
						break;
					}
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(488);
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
			setState(490);
			match(T__48);
			setState(491);
			match(T__5);
			setState(492);
			match(ID);
			setState(493);
			match(T__6);
			setState(494);
			match(ID);
			setState(495);
			match(T__7);
			setState(496);
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
			setState(498);
			match(T__49);
			setState(499);
			match(T__5);
			setState(500);
			match(ID);
			setState(501);
			match(T__6);
			setState(502);
			match(ID);
			setState(503);
			match(T__7);
			setState(504);
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
			setState(506);
			match(T__50);
			setState(507);
			match(T__5);
			setState(508);
			match(ID);
			setState(509);
			match(T__6);
			setState(510);
			match(ID);
			setState(511);
			match(T__7);
			setState(512);
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
			setState(514);
			match(T__51);
			setState(515);
			match(T__5);
			setState(516);
			match(ID);
			setState(517);
			match(T__6);
			setState(518);
			match(CTE_STRING);
			setState(519);
			match(T__52);
			setState(520);
			match(T__7);
			setState(521);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u020e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\5\2c\n\2\3\2\7\2f\n\2\f\2\16\2"+
		"i\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3v\n\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5"+
		"\u0089\13\5\5\5\u008b\n\5\3\5\3\5\3\6\3\6\5\6\u0091\n\6\3\6\6\6\u0094"+
		"\n\6\r\6\16\6\u0095\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\5\7\u00ab\n\7\3\7\7\7\u00ae\n\7"+
		"\f\7\16\7\u00b1\13\7\3\7\3\7\6\7\u00b5\n\7\r\7\16\7\u00b6\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\3\n\3\n\5\n\u00ca"+
		"\n\n\3\n\3\n\3\n\5\n\u00cf\n\n\7\n\u00d1\n\n\f\n\16\n\u00d4\13\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\7\r\u00e5"+
		"\n\r\f\r\16\r\u00e8\13\r\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17\3\17\3\17\5\17\u00fb\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0118\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0122\n\23\3\24\3\24\6\24\u0126\n\24\r\24\16\24\u0127\3\24\3\24\3\25"+
		"\3\25\5\25\u012e\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0138"+
		"\n\26\3\26\3\26\3\26\5\26\u013d\n\26\7\26\u013f\n\26\f\26\16\26\u0142"+
		"\13\26\5\26\u0144\n\26\3\26\3\26\5\26\u0148\n\26\3\27\3\27\3\27\3\27\7"+
		"\27\u014e\n\27\f\27\16\27\u0151\13\27\5\27\u0153\n\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\5\30\u015b\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0170\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0179\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u01dd\n+"+
		"\3+\3+\3+\5+\u01e2\n+\7+\u01e4\n+\f+\16+\u01e7\13+\5+\u01e9\n+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\3\29:\3\2\23\24\3"+
		"\2\25\27\3\2\30\34\2\u0223\2^\3\2\2\2\4m\3\2\2\2\6{\3\2\2\2\b\u0080\3"+
		"\2\2\2\n\u008e\3\2\2\2\f\u009f\3\2\2\2\16\u00b8\3\2\2\2\20\u00bc\3\2\2"+
		"\2\22\u00c5\3\2\2\2\24\u00d8\3\2\2\2\26\u00dc\3\2\2\2\30\u00e1\3\2\2\2"+
		"\32\u00e9\3\2\2\2\34\u00fa\3\2\2\2\36\u0102\3\2\2\2 \u0104\3\2\2\2\"\u010d"+
		"\3\2\2\2$\u0121\3\2\2\2&\u0123\3\2\2\2(\u012b\3\2\2\2*\u0132\3\2\2\2,"+
		"\u0149\3\2\2\2.\u0156\3\2\2\2\60\u016f\3\2\2\2\62\u0178\3\2\2\2\64\u017a"+
		"\3\2\2\2\66\u017f\3\2\2\28\u0184\3\2\2\2:\u0189\3\2\2\2<\u018e\3\2\2\2"+
		">\u0193\3\2\2\2@\u0198\3\2\2\2B\u019f\3\2\2\2D\u01a6\3\2\2\2F\u01ad\3"+
		"\2\2\2H\u01b2\3\2\2\2J\u01b7\3\2\2\2L\u01bc\3\2\2\2N\u01c1\3\2\2\2P\u01c8"+
		"\3\2\2\2R\u01cf\3\2\2\2T\u01d8\3\2\2\2V\u01ec\3\2\2\2X\u01f4\3\2\2\2Z"+
		"\u01fc\3\2\2\2\\\u0204\3\2\2\2^_\7\3\2\2_`\7\4\2\2`b\b\2\1\2ac\5\f\7\2"+
		"ba\3\2\2\2bc\3\2\2\2cg\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\6\4\2kl\b\2\1\2l\3\3\2\2\2mu\7\5\2"+
		"\2no\5 \21\2op\7=\2\2pq\b\3\1\2qv\3\2\2\2rs\7\6\2\2st\7=\2\2tv\b\3\1\2"+
		"un\3\2\2\2ur\3\2\2\2vw\3\2\2\2wx\5\b\5\2xy\5\n\6\2yz\b\3\1\2z\5\3\2\2"+
		"\2{|\7\7\2\2|}\b\4\1\2}~\5\b\5\2~\177\5\n\6\2\177\7\3\2\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u008a\b\5\1\2\u0082\u0087\5\16\b\2\u0083\u0084\7\t\2\2"+
		"\u0084\u0086\5\16\b\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\n"+
		"\2\2\u008d\t\3\2\2\2\u008e\u0090\7\13\2\2\u008f\u0091\5\f\7\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\"\22\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u0099\5\30\r\2"+
		"\u0099\u009a\7\4\2\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\r\2\2\u009e\13\3\2\2\2\u009f"+
		"\u00a0\7\16\2\2\u00a0\u00b4\b\7\1\2\u00a1\u00a2\5 \21\2\u00a2\u00a4\7"+
		"=\2\2\u00a3\u00a5\5*\26\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00af\b\7\1\2\u00a7\u00a8\7\t\2\2\u00a8\u00aa\7="+
		"\2\2\u00a9\u00ab\5*\26\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\b\7\1\2\u00ad\u00a7\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00a1\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\r\3\2\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7=\2\2\u00ba\u00bb\b\b\1\2"+
		"\u00bb\17\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf"+
		"\5\26\f\2\u00bf\u00c0\7\n\2\2\u00c0\u00c3\5&\24\2\u00c1\u00c2\7\20\2\2"+
		"\u00c2\u00c4\5&\24\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\21"+
		"\3\2\2\2\u00c5\u00c6\7\21\2\2\u00c6\u00c9\7\b\2\2\u00c7\u00ca\5\26\f\2"+
		"\u00c8\u00ca\7A\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d2"+
		"\3\2\2\2\u00cb\u00ce\7\t\2\2\u00cc\u00cf\5\26\f\2\u00cd\u00cf\7A\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\7\4"+
		"\2\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00da\7\b\2\2\u00da\u00db"+
		"\7\n\2\2\u00db\25\3\2\2\2\u00dc\u00df\5\30\r\2\u00dd\u00de\t\2\2\2\u00de"+
		"\u00e0\5\30\r\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\27\3\2\2"+
		"\2\u00e1\u00e6\5\32\16\2\u00e2\u00e3\t\3\2\2\u00e3\u00e5\5\32\16\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\31\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\5\34\17\2\u00ea"+
		"\u00eb\t\4\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\33\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\7"+
		"\n\2\2\u00f4\u00fb\3\2\2\2\u00f5\u00f7\t\3\2\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\5\36\20\2\u00f9\u00fb\5"+
		"\60\31\2\u00fa\u00f1\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\35\3\2\2\2\u00fc\u0103\7=\2\2\u00fd\u0103\7?\2\2\u00fe\u0103\7@\2\2\u00ff"+
		"\u0103\7>\2\2\u0100\u0103\7A\2\2\u0101\u0103\5.\30\2\u0102\u00fc\3\2\2"+
		"\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103\37\3\2\2\2\u0104\u0105\t\5\2\2\u0105"+
		"!\3\2\2\2\u0106\u0107\5(\25\2\u0107\u0108\b\22\1\2\u0108\u010e\3\2\2\2"+
		"\u0109\u010e\5\20\t\2\u010a\u010e\5\22\n\2\u010b\u010e\5$\23\2\u010c\u010e"+
		"\5\62\32\2\u010d\u0106\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e#\3\2\2\2\u010f\u0110\7"+
		"\35\2\2\u0110\u0111\7=\2\2\u0111\u0112\7\36\2\2\u0112\u0113\5\30\r\2\u0113"+
		"\u0114\7\37\2\2\u0114\u0117\5\30\r\2\u0115\u0116\7\37\2\2\u0116\u0118"+
		"\5\30\r\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\5&\24\2\u011a\u0122\3\2\2\2\u011b\u011c\7 \2\2\u011c\u011d"+
		"\7\b\2\2\u011d\u011e\5\26\f\2\u011e\u011f\7\n\2\2\u011f\u0120\5&\24\2"+
		"\u0120\u0122\3\2\2\2\u0121\u010f\3\2\2\2\u0121\u011b\3\2\2\2\u0122%\3"+
		"\2\2\2\u0123\u0125\7\13\2\2\u0124\u0126\5\"\22\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\7\r\2\2\u012a\'\3\2\2\2\u012b\u012d\7=\2\2\u012c\u012e"+
		"\5.\30\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\5*\26\2\u0130\u0131\7\4\2\2\u0131)\3\2\2\2\u0132\u0147\7\36\2\2"+
		"\u0133\u0148\5\26\f\2\u0134\u0143\7!\2\2\u0135\u0138\5\30\r\2\u0136\u0138"+
		"\5,\27\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0140\3\2\2\2\u0139"+
		"\u013c\7\t\2\2\u013a\u013d\5\30\r\2\u013b\u013d\5,\27\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013b\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0148\7\"\2\2\u0146\u0148\5\60\31\2\u0147\u0133\3"+
		"\2\2\2\u0147\u0134\3\2\2\2\u0147\u0146\3\2\2\2\u0148+\3\2\2\2\u0149\u0152"+
		"\7!\2\2\u014a\u014f\5\30\r\2\u014b\u014c\7\t\2\2\u014c\u014e\5\30\r\2"+
		"\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u014a\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\"\2\2\u0155-\3\2\2\2"+
		"\u0156\u0157\7!\2\2\u0157\u015a\5\30\r\2\u0158\u0159\7\t\2\2\u0159\u015b"+
		"\5\30\r\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u015d\7\"\2\2\u015d/\3\2\2\2\u015e\u0170\5N(\2\u015f\u0170\5P)"+
		"\2\u0160\u0170\5R*\2\u0161\u0170\5H%\2\u0162\u0170\5J&\2\u0163\u0170\5"+
		"L\'\2\u0164\u0170\5\64\33\2\u0165\u0170\5\66\34\2\u0166\u0170\58\35\2"+
		"\u0167\u0170\5:\36\2\u0168\u0170\5<\37\2\u0169\u0170\5> \2\u016a\u0170"+
		"\5F$\2\u016b\u0170\5@!\2\u016c\u0170\5B\"\2\u016d\u0170\5D#\2\u016e\u0170"+
		"\5T+\2\u016f\u015e\3\2\2\2\u016f\u015f\3\2\2\2\u016f\u0160\3\2\2\2\u016f"+
		"\u0161\3\2\2\2\u016f\u0162\3\2\2\2\u016f\u0163\3\2\2\2\u016f\u0164\3\2"+
		"\2\2\u016f\u0165\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u0167\3\2\2\2\u016f"+
		"\u0168\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\61\3\2\2\2\u0171\u0179\5V,\2\u0172\u0179\5X-\2\u0173\u0179\5Z.\2\u0174"+
		"\u0179\5\\/\2\u0175\u0176\5T+\2\u0176\u0177\7\4\2\2\u0177\u0179\3\2\2"+
		"\2\u0178\u0171\3\2\2\2\u0178\u0172\3\2\2\2\u0178\u0173\3\2\2\2\u0178\u0174"+
		"\3\2\2\2\u0178\u0175\3\2\2\2\u0179\63\3\2\2\2\u017a\u017b\7#\2\2\u017b"+
		"\u017c\7\b\2\2\u017c\u017d\7=\2\2\u017d\u017e\7\n\2\2\u017e\65\3\2\2\2"+
		"\u017f\u0180\7$\2\2\u0180\u0181\7\b\2\2\u0181\u0182\7=\2\2\u0182\u0183"+
		"\7\n\2\2\u0183\67\3\2\2\2\u0184\u0185\7%\2\2\u0185\u0186\7\b\2\2\u0186"+
		"\u0187\7=\2\2\u0187\u0188\7\n\2\2\u01889\3\2\2\2\u0189\u018a\7&\2\2\u018a"+
		"\u018b\7\b\2\2\u018b\u018c\7=\2\2\u018c\u018d\7\n\2\2\u018d;\3\2\2\2\u018e"+
		"\u018f\7\'\2\2\u018f\u0190\7\b\2\2\u0190\u0191\7=\2\2\u0191\u0192\7\n"+
		"\2\2\u0192=\3\2\2\2\u0193\u0194\7(\2\2\u0194\u0195\7\b\2\2\u0195\u0196"+
		"\7=\2\2\u0196\u0197\7\n\2\2\u0197?\3\2\2\2\u0198\u0199\7)\2\2\u0199\u019a"+
		"\7\b\2\2\u019a\u019b\7=\2\2\u019b\u019c\7\t\2\2\u019c\u019d\7=\2\2\u019d"+
		"\u019e\7\n\2\2\u019eA\3\2\2\2\u019f\u01a0\7*\2\2\u01a0\u01a1\7\b\2\2\u01a1"+
		"\u01a2\7=\2\2\u01a2\u01a3\7\t\2\2\u01a3\u01a4\7=\2\2\u01a4\u01a5\7\n\2"+
		"\2\u01a5C\3\2\2\2\u01a6\u01a7\7+\2\2\u01a7\u01a8\7\b\2\2\u01a8\u01a9\7"+
		"=\2\2\u01a9\u01aa\7\t\2\2\u01aa\u01ab\5\30\r\2\u01ab\u01ac\7\n\2\2\u01ac"+
		"E\3\2\2\2\u01ad\u01ae\7,\2\2\u01ae\u01af\7\b\2\2\u01af\u01b0\7A\2\2\u01b0"+
		"\u01b1\7\n\2\2\u01b1G\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3\u01b4\7\b\2\2\u01b4"+
		"\u01b5\7=\2\2\u01b5\u01b6\7\n\2\2\u01b6I\3\2\2\2\u01b7\u01b8\7.\2\2\u01b8"+
		"\u01b9\7\b\2\2\u01b9\u01ba\7=\2\2\u01ba\u01bb\7\n\2\2\u01bbK\3\2\2\2\u01bc"+
		"\u01bd\7/\2\2\u01bd\u01be\7\b\2\2\u01be\u01bf\7=\2\2\u01bf\u01c0\7\n\2"+
		"\2\u01c0M\3\2\2\2\u01c1\u01c2\7\60\2\2\u01c2\u01c3\7\b\2\2\u01c3\u01c4"+
		"\7=\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6\7=\2\2\u01c6\u01c7\7\n\2\2\u01c7"+
		"O\3\2\2\2\u01c8\u01c9\7\61\2\2\u01c9\u01ca\7\b\2\2\u01ca\u01cb\7=\2\2"+
		"\u01cb\u01cc\7\t\2\2\u01cc\u01cd\7?\2\2\u01cd\u01ce\7\n\2\2\u01ceQ\3\2"+
		"\2\2\u01cf\u01d0\7\62\2\2\u01d0\u01d1\7\b\2\2\u01d1\u01d2\7=\2\2\u01d2"+
		"\u01d3\7\t\2\2\u01d3\u01d4\5\30\r\2\u01d4\u01d5\7\t\2\2\u01d5\u01d6\5"+
		"\30\r\2\u01d6\u01d7\7\n\2\2\u01d7S\3\2\2\2\u01d8\u01d9\7=\2\2\u01d9\u01e8"+
		"\7\b\2\2\u01da\u01dd\7=\2\2\u01db\u01dd\5\36\20\2\u01dc\u01da\3\2\2\2"+
		"\u01dc\u01db\3\2\2\2\u01dd\u01e5\3\2\2\2\u01de\u01e1\7\t\2\2\u01df\u01e2"+
		"\7=\2\2\u01e0\u01e2\5\36\20\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01de\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01dc\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\n"+
		"\2\2\u01ebU\3\2\2\2\u01ec\u01ed\7\63\2\2\u01ed\u01ee\7\b\2\2\u01ee\u01ef"+
		"\7=\2\2\u01ef\u01f0\7\t\2\2\u01f0\u01f1\7=\2\2\u01f1\u01f2\7\n\2\2\u01f2"+
		"\u01f3\7\4\2\2\u01f3W\3\2\2\2\u01f4\u01f5\7\64\2\2\u01f5\u01f6\7\b\2\2"+
		"\u01f6\u01f7\7=\2\2\u01f7\u01f8\7\t\2\2\u01f8\u01f9\7=\2\2\u01f9\u01fa"+
		"\7\n\2\2\u01fa\u01fb\7\4\2\2\u01fbY\3\2\2\2\u01fc\u01fd\7\65\2\2\u01fd"+
		"\u01fe\7\b\2\2\u01fe\u01ff\7=\2\2\u01ff\u0200\7\t\2\2\u0200\u0201\7=\2"+
		"\2\u0201\u0202\7\n\2\2\u0202\u0203\7\4\2\2\u0203[\3\2\2\2\u0204\u0205"+
		"\7\66\2\2\u0205\u0206\7\b\2\2\u0206\u0207\7=\2\2\u0207\u0208\7\t\2\2\u0208"+
		"\u0209\7A\2\2\u0209\u020a\7\67\2\2\u020a\u020b\7\n\2\2\u020b\u020c\7\4"+
		"\2\2\u020c]\3\2\2\2+bgu\u0087\u008a\u0090\u0095\u009b\u00a4\u00aa\u00af"+
		"\u00b6\u00c3\u00c9\u00ce\u00d2\u00df\u00e6\u00ee\u00f6\u00fa\u0102\u010d"+
		"\u0117\u0121\u0127\u012d\u0137\u013c\u0140\u0143\u0147\u014f\u0152\u015a"+
		"\u016f\u0178\u01dc\u01e1\u01e5\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}