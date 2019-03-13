// Generated from c:\Users\oscar\Documents\Compilador\ProyectoCompiladores\oscar.g4 by ANTLR 4.7.1
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
		T__52=53, T__53=54, RESERVED=55, RELACIONALES=56, LOGICOS=57, DELIMITADORES=58, 
		WS=59, ID=60, CTE_B=61, CTE_I=62, CTE_F=63, CTE_STRING=64, LIST=65;
	public static final int
		RULE_programa = 0, RULE_modulo = 1, RULE_main = 2, RULE_param = 3, RULE_bloque = 4, 
		RULE_vars_ = 5, RULE_id_ = 6, RULE_condicion = 7, RULE_escritura = 8, 
		RULE_lectura = 9, RULE_expresion = 10, RULE_exp = 11, RULE_termino = 12, 
		RULE_factor = 13, RULE_var_cte = 14, RULE_tipo = 15, RULE_estatuto = 16, 
		RULE_ciclo = 17, RULE_estats = 18, RULE_asignacion = 19, RULE_element = 20, 
		RULE_llamada = 21, RULE_mean = 22, RULE_variance = 23, RULE_median = 24, 
		RULE_stdev = 25, RULE_head = 26, RULE_tail = 27, RULE_histograma = 28, 
		RULE_pie_chart = 29, RULE_bar_graph = 30, RULE_union = 31, RULE_intersect = 32, 
		RULE_find = 33, RULE_import_csv = 34, RULE_export_csv = 35, RULE_length = 36, 
		RULE_min_ = 37, RULE_max_ = 38, RULE_concat = 39, RULE_sort = 40, RULE_splice = 41, 
		RULE_userdef = 42;
	public static final String[] ruleNames = {
		"programa", "modulo", "main", "param", "bloque", "vars_", "id_", "condicion", 
		"escritura", "lectura", "expresion", "exp", "termino", "factor", "var_cte", 
		"tipo", "estatuto", "ciclo", "estats", "asignacion", "element", "llamada", 
		"mean", "variance", "median", "stdev", "head", "tail", "histograma", "pie_chart", 
		"bar_graph", "union", "intersect", "find", "import_csv", "export_csv", 
		"length", "min_", "max_", "concat", "sort", "splice", "userdef"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#oscar'", "';'", "'def'", "'void'", "'main'", "'('", "','", "')'", 
		"'{'", "'return'", "'}'", "'var'", "'if'", "'else'", "'print'", "'='", 
		"'read'", "'+'", "'-'", "'*'", "'/'", "'%'", "'int'", "'float'", "'string'", 
		"'boolean'", "'list'", "'for'", "':'", "'while'", "'['", "']'", "'ID'", 
		"'mean'", "'variance'", "'median'", "'stdev'", "'head'", "'tail'", "'histogram'", 
		"'pie_chart'", "'bar_graph'", "'union'", "'intersect'", "'find'", "'import'", 
		"'export'", "'.csv'", "'lenght'", "'min'", "'max'", "'concat'", "'sort'", 
		"'splice'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "RESERVED", "RELACIONALES", 
		"LOGICOS", "DELIMITADORES", "WS", "ID", "CTE_B", "CTE_I", "CTE_F", "CTE_STRING", 
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
			setState(86);
			match(T__0);
			setState(87);
			match(T__1);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(88);
				vars_();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(91);
				modulo();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			main();
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Id_Context id_() {
			return getRuleContext(Id_Context.class,0);
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
			setState(99);
			match(T__2);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				{
				setState(100);
				id_();
				}
				break;
			case T__3:
				{
				setState(101);
				match(T__3);
				setState(102);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(105);
			param();
			setState(106);
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
			setState(108);
			match(T__4);
			setState(109);
			param();
			setState(110);
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
			setState(112);
			match(T__5);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(113);
				id_();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(114);
					match(T__6);
					setState(115);
					id_();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123);
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
			setState(125);
			match(T__8);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(126);
				vars_();
				}
			}

			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				estatuto();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__46) | (1L << ID))) != 0) );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(134);
				match(T__9);
				setState(135);
				exp();
				}
			}

			setState(138);
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
			setState(140);
			match(T__11);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				tipo();
				setState(142);
				match(ID);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(143);
					match(T__6);
					setState(144);
					match(ID);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__1);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) );
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
			setState(156);
			tipo();
			setState(157);
			match(ID);
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
			setState(159);
			match(T__12);
			setState(160);
			match(T__5);
			setState(161);
			expresion();
			setState(162);
			match(T__7);
			setState(163);
			estats();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(164);
				match(T__13);
				setState(165);
				estats();
				}
			}

			setState(168);
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
			setState(170);
			match(T__14);
			print("Se va a hacer un print\n")
			setState(172);
			match(T__5);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(173);
				expresion();
				}
				break;
			case 2:
				{
				setState(174);
				match(CTE_STRING);
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(177);
				match(T__6);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(178);
					expresion();
					}
					break;
				case 2:
					{
					setState(179);
					match(CTE_STRING);
					}
					break;
				}
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__7);
			setState(188);
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
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(190);
				match(ID);
				}
				break;
			case T__32:
				{
				setState(191);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			match(T__15);
			setState(195);
			match(T__16);
			setState(196);
			match(T__5);
			setState(197);
			match(T__7);
			setState(198);
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
			setState(200);
			exp();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELACIONALES || _la==LOGICOS) {
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==RELACIONALES || _la==LOGICOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
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
			setState(205);
			termino();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				termino();
				}
				}
				setState(212);
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
			setState(213);
			factor();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				factor();
				}
				}
				setState(220);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(221);
				match(T__5);
				setState(222);
				expresion();
				setState(223);
				match(T__7);
				}
				}
				break;
			case T__17:
			case T__18:
			case T__32:
			case ID:
			case CTE_B:
			case CTE_I:
			case CTE_F:
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(225);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(228);
				var_cte();
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

	public static class Var_cteContext extends ParserRuleContext {
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ID);
				}
				break;
			case CTE_I:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(CTE_I);
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(CTE_F);
				}
				break;
			case CTE_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(CTE_B);
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				((Var_cteContext)_localctx).CTE_STRING = match(CTE_STRING);
				print ("String: " + (((Var_cteContext)_localctx).CTE_STRING!=null?((Var_cteContext)_localctx).CTE_STRING.getText():null))
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
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
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				escritura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				lectura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				ciclo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				llamada();
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(250);
				match(T__27);
				setState(251);
				match(ID);
				setState(252);
				match(T__15);
				setState(253);
				exp();
				setState(254);
				match(T__28);
				setState(255);
				exp();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(256);
					match(T__28);
					setState(257);
					exp();
					}
				}

				setState(260);
				estats();
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(262);
				match(T__29);
				setState(263);
				match(T__5);
				setState(264);
				expresion();
				setState(265);
				match(T__7);
				setState(266);
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
			setState(270);
			match(T__8);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				estatuto();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__46) | (1L << ID))) != 0) );
			setState(276);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(278);
				match(ID);
				}
				break;
			case T__32:
				{
				setState(279);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(T__15);
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__17:
			case T__18:
			case T__32:
			case ID:
			case CTE_B:
			case CTE_I:
			case CTE_F:
			case CTE_STRING:
				{
				setState(283);
				expresion();
				}
				break;
			case T__30:
				{
				{
				setState(284);
				match(T__30);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__17 - 6)) | (1L << (T__18 - 6)) | (1L << (T__32 - 6)) | (1L << (ID - 6)) | (1L << (CTE_B - 6)) | (1L << (CTE_I - 6)) | (1L << (CTE_F - 6)) | (1L << (CTE_STRING - 6)))) != 0)) {
					{
					setState(285);
					exp();
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(286);
						match(T__6);
						setState(287);
						exp();
						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(295);
				match(T__31);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
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
		enterRule(_localctx, 40, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__32);
			setState(301);
			match(T__30);
			setState(302);
			exp();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(303);
				match(T__6);
				setState(304);
				exp();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
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

	public static class LlamadaContext extends ParserRuleContext {
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
		public HistogramaContext histograma() {
			return getRuleContext(HistogramaContext.class,0);
		}
		public Pie_chartContext pie_chart() {
			return getRuleContext(Pie_chartContext.class,0);
		}
		public Bar_graphContext bar_graph() {
			return getRuleContext(Bar_graphContext.class,0);
		}
		public Import_csvContext import_csv() {
			return getRuleContext(Import_csvContext.class,0);
		}
		public Export_csvContext export_csv() {
			return getRuleContext(Export_csvContext.class,0);
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
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_llamada);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				concat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				sort();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				splice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				length();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				min_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				max_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				mean();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				variance();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				median();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				stdev();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(322);
				head();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(323);
				tail();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(324);
				histograma();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(325);
				pie_chart();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(326);
				bar_graph();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(327);
				import_csv();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(328);
				export_csv();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(329);
				union();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(330);
				intersect();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(331);
				find();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(332);
				userdef();
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

	public static class MeanContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public MeanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mean; }
	}

	public final MeanContext mean() throws RecognitionException {
		MeanContext _localctx = new MeanContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ID);
			setState(336);
			match(T__15);
			setState(337);
			match(T__33);
			setState(338);
			match(T__5);
			setState(339);
			match(ID);
			setState(340);
			match(T__7);
			setState(341);
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

	public static class VarianceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public VarianceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance; }
	}

	public final VarianceContext variance() throws RecognitionException {
		VarianceContext _localctx = new VarianceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(T__15);
			setState(345);
			match(T__34);
			setState(346);
			match(T__5);
			setState(347);
			match(ID);
			setState(348);
			match(T__7);
			setState(349);
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

	public static class MedianContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public MedianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_median; }
	}

	public final MedianContext median() throws RecognitionException {
		MedianContext _localctx = new MedianContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_median);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ID);
			setState(352);
			match(T__15);
			setState(353);
			match(T__35);
			setState(354);
			match(T__5);
			setState(355);
			match(ID);
			setState(356);
			match(T__7);
			setState(357);
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

	public static class StdevContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public StdevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdev; }
	}

	public final StdevContext stdev() throws RecognitionException {
		StdevContext _localctx = new StdevContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stdev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(ID);
			setState(360);
			match(T__15);
			setState(361);
			match(T__36);
			setState(362);
			match(T__5);
			setState(363);
			match(ID);
			setState(364);
			match(T__7);
			setState(365);
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

	public static class HeadContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ID);
			setState(368);
			match(T__15);
			setState(369);
			match(T__37);
			setState(370);
			match(T__5);
			setState(371);
			match(ID);
			setState(372);
			match(T__7);
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

	public static class TailContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
			setState(376);
			match(T__15);
			setState(377);
			match(T__38);
			setState(378);
			match(T__5);
			setState(379);
			match(ID);
			setState(380);
			match(T__7);
			setState(381);
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
		enterRule(_localctx, 56, RULE_histograma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__39);
			setState(384);
			match(T__5);
			setState(385);
			match(ID);
			setState(386);
			match(T__6);
			setState(387);
			match(ID);
			setState(388);
			match(T__7);
			setState(389);
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
		enterRule(_localctx, 58, RULE_pie_chart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__40);
			setState(392);
			match(T__5);
			setState(393);
			match(ID);
			setState(394);
			match(T__6);
			setState(395);
			match(ID);
			setState(396);
			match(T__7);
			setState(397);
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
		enterRule(_localctx, 60, RULE_bar_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__41);
			setState(400);
			match(T__5);
			setState(401);
			match(ID);
			setState(402);
			match(T__6);
			setState(403);
			match(ID);
			setState(404);
			match(T__7);
			setState(405);
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
			setState(407);
			match(ID);
			setState(408);
			match(T__15);
			setState(409);
			match(T__42);
			setState(410);
			match(T__5);
			setState(411);
			match(ID);
			setState(412);
			match(T__6);
			setState(413);
			match(ID);
			setState(414);
			match(T__7);
			setState(415);
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
			setState(417);
			match(ID);
			setState(418);
			match(T__15);
			setState(419);
			match(T__43);
			setState(420);
			match(T__5);
			setState(421);
			match(ID);
			setState(422);
			match(T__6);
			setState(423);
			match(ID);
			setState(424);
			match(T__7);
			setState(425);
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

	public static class FindContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
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
			setState(427);
			match(ID);
			setState(428);
			match(T__15);
			setState(429);
			match(T__44);
			setState(430);
			match(T__5);
			setState(431);
			match(ID);
			setState(432);
			match(T__6);
			setState(433);
			exp();
			setState(434);
			match(T__7);
			setState(435);
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

	public static class Import_csvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(437);
			match(ID);
			setState(438);
			match(T__15);
			setState(439);
			match(T__45);
			setState(440);
			match(T__5);
			setState(441);
			match(CTE_STRING);
			setState(442);
			match(T__7);
			setState(443);
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
		enterRule(_localctx, 70, RULE_export_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__46);
			setState(446);
			match(T__5);
			setState(447);
			match(ID);
			setState(448);
			match(T__6);
			setState(449);
			match(CTE_STRING);
			setState(450);
			match(T__47);
			setState(451);
			match(T__7);
			setState(452);
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

	public static class LengthContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ID);
			setState(455);
			match(T__15);
			setState(456);
			match(T__48);
			setState(457);
			match(T__5);
			setState(458);
			match(ID);
			setState(459);
			match(T__7);
			setState(460);
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

	public static class Min_Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public Min_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_; }
	}

	public final Min_Context min_() throws RecognitionException {
		Min_Context _localctx = new Min_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_min_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(ID);
			setState(463);
			match(T__15);
			setState(464);
			match(T__49);
			setState(465);
			match(T__5);
			setState(466);
			match(ID);
			setState(467);
			match(T__7);
			setState(468);
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

	public static class Max_Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public Max_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_; }
	}

	public final Max_Context max_() throws RecognitionException {
		Max_Context _localctx = new Max_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_max_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ID);
			setState(471);
			match(T__15);
			setState(472);
			match(T__50);
			setState(473);
			match(T__5);
			setState(474);
			match(ID);
			setState(475);
			match(T__7);
			setState(476);
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
		enterRule(_localctx, 78, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ID);
			setState(479);
			match(T__15);
			setState(480);
			match(T__51);
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
			setState(486);
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

	public static class SortContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public TerminalNode CTE_I() { return getToken(oscarParser.CTE_I, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(ID);
			setState(489);
			match(T__15);
			setState(490);
			match(T__52);
			setState(491);
			match(T__5);
			setState(492);
			match(ID);
			setState(493);
			match(T__6);
			setState(494);
			match(CTE_I);
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

	public static class SpliceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(oscarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(oscarParser.ID, i);
		}
		public List<TerminalNode> CTE_I() { return getTokens(oscarParser.CTE_I); }
		public TerminalNode CTE_I(int i) {
			return getToken(oscarParser.CTE_I, i);
		}
		public SpliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice; }
	}

	public final SpliceContext splice() throws RecognitionException {
		SpliceContext _localctx = new SpliceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_splice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ID);
			setState(499);
			match(T__15);
			setState(500);
			match(T__53);
			setState(501);
			match(T__5);
			setState(502);
			match(ID);
			setState(503);
			match(T__6);
			setState(504);
			match(CTE_I);
			setState(505);
			match(T__6);
			setState(506);
			match(CTE_I);
			setState(507);
			match(T__7);
			setState(508);
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
		enterRule(_localctx, 84, RULE_userdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(510);
				match(ID);
				setState(511);
				match(T__15);
				}
				break;
			}
			setState(514);
			match(ID);
			setState(515);
			match(T__5);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (T__32 - 33)) | (1L << (ID - 33)) | (1L << (CTE_B - 33)) | (1L << (CTE_I - 33)) | (1L << (CTE_F - 33)) | (1L << (CTE_STRING - 33)))) != 0)) {
				{
				setState(518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(516);
					match(ID);
					}
					break;
				case 2:
					{
					setState(517);
					var_cte();
					}
					break;
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(520);
					match(T__6);
					setState(523);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(521);
						match(ID);
						}
						break;
					case 2:
						{
						setState(522);
						var_cte();
						}
						break;
					}
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(532);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0219\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\5\2\\\n\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3j\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5w\n\5"+
		"\f\5\16\5z\13\5\5\5|\n\5\3\5\3\5\3\6\3\6\5\6\u0082\n\6\3\6\6\6\u0085\n"+
		"\6\r\6\16\6\u0086\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u0094\n\7\f\7\16\7\u0097\13\7\3\7\3\7\6\7\u009b\n\7\r\7\16\7\u009c"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\n\5\n\u00b7\n\n\7\n\u00b9\n\n\f\n"+
		"\16\n\u00bc\13\n\3\n\3\n\3\n\3\13\3\13\5\13\u00c3\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\r\7\r\u00d3\n\r\f"+
		"\r\16\r\u00d6\13\r\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\17\5\17\u00e8\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0105\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n"+
		"\23\3\24\3\24\6\24\u0113\n\24\r\24\16\24\u0114\3\24\3\24\3\25\3\25\5\25"+
		"\u011b\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0123\n\25\f\25\16\25\u0126"+
		"\13\25\5\25\u0128\n\25\3\25\5\25\u012b\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u0134\n\26\f\26\16\26\u0137\13\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0150\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\5,\u0203\n,\3,\3,\3,\3,\5,\u0209\n,\3,\3,\3,\5,"+
		"\u020e\n,\7,\u0210\n,\f,\16,\u0213\13,\5,\u0215\n,\3,\3,\3,\2\2-\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"V\2\6\3\2:;\3\2\24\25\3\2\26\30\3\2\31\35\2\u022c\2X\3\2\2\2\4e\3\2\2"+
		"\2\6n\3\2\2\2\br\3\2\2\2\n\177\3\2\2\2\f\u008e\3\2\2\2\16\u009e\3\2\2"+
		"\2\20\u00a1\3\2\2\2\22\u00ac\3\2\2\2\24\u00c2\3\2\2\2\26\u00ca\3\2\2\2"+
		"\30\u00cf\3\2\2\2\32\u00d7\3\2\2\2\34\u00e7\3\2\2\2\36\u00f0\3\2\2\2 "+
		"\u00f2\3\2\2\2\"\u00fa\3\2\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u011a\3"+
		"\2\2\2*\u012e\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60\u0159\3\2\2\2\62"+
		"\u0161\3\2\2\2\64\u0169\3\2\2\2\66\u0171\3\2\2\28\u0179\3\2\2\2:\u0181"+
		"\3\2\2\2<\u0189\3\2\2\2>\u0191\3\2\2\2@\u0199\3\2\2\2B\u01a3\3\2\2\2D"+
		"\u01ad\3\2\2\2F\u01b7\3\2\2\2H\u01bf\3\2\2\2J\u01c8\3\2\2\2L\u01d0\3\2"+
		"\2\2N\u01d8\3\2\2\2P\u01e0\3\2\2\2R\u01ea\3\2\2\2T\u01f4\3\2\2\2V\u0202"+
		"\3\2\2\2XY\7\3\2\2Y[\7\4\2\2Z\\\5\f\7\2[Z\3\2\2\2[\\\3\2\2\2\\`\3\2\2"+
		"\2]_\5\4\3\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2"+
		"\2cd\5\6\4\2d\3\3\2\2\2ei\7\5\2\2fj\5\16\b\2gh\7\6\2\2hj\7>\2\2if\3\2"+
		"\2\2ig\3\2\2\2jk\3\2\2\2kl\5\b\5\2lm\5\n\6\2m\5\3\2\2\2no\7\7\2\2op\5"+
		"\b\5\2pq\5\n\6\2q\7\3\2\2\2r{\7\b\2\2sx\5\16\b\2tu\7\t\2\2uw\5\16\b\2"+
		"vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}~\7\n\2\2~\t\3\2\2\2\177\u0081\7\13\2\2\u0080\u0082"+
		"\5\f\7\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\7\f\2\2\u0089"+
		"\u008b\5\30\r\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\7\r\2\2\u008d\13\3\2\2\2\u008e\u009a\7\16\2\2\u008f"+
		"\u0090\5 \21\2\u0090\u0095\7>\2\2\u0091\u0092\7\t\2\2\u0092\u0094\7>\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\4\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u008f\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u009f\5 \21\2\u009f\u00a0"+
		"\7>\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00a4\5\26\f\2\u00a4\u00a5\7\n\2\2\u00a5\u00a8\5&\24\2\u00a6\u00a7\7"+
		"\20\2\2\u00a7\u00a9\5&\24\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\7\21\2"+
		"\2\u00ad\u00ae\b\n\1\2\u00ae\u00b1\7\b\2\2\u00af\u00b2\5\26\f\2\u00b0"+
		"\u00b2\7B\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00ba\3\2"+
		"\2\2\u00b3\u00b6\7\t\2\2\u00b4\u00b7\5\26\f\2\u00b5\u00b7\7B\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b3\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\n\2\2\u00be\u00bf\7\4"+
		"\2\2\u00bf\23\3\2\2\2\u00c0\u00c3\7>\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\22\2\2"+
		"\u00c5\u00c6\7\23\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9"+
		"\7\4\2\2\u00c9\25\3\2\2\2\u00ca\u00cd\5\30\r\2\u00cb\u00cc\t\2\2\2\u00cc"+
		"\u00ce\5\30\r\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\27\3\2\2"+
		"\2\u00cf\u00d4\5\32\16\2\u00d0\u00d1\t\3\2\2\u00d1\u00d3\5\32\16\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\31\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5\34\17\2\u00d8"+
		"\u00d9\t\4\2\2\u00d9\u00db\5\34\17\2\u00da\u00d8\3\2\2\2\u00db\u00de\3"+
		"\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\33\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\7"+
		"\n\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e5\t\3\2\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\36\20\2\u00e7\u00df\3"+
		"\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00f1\7>\2\2\u00ea\u00f1"+
		"\7@\2\2\u00eb\u00f1\7A\2\2\u00ec\u00f1\7?\2\2\u00ed\u00ee\7B\2\2\u00ee"+
		"\u00f1\b\20\1\2\u00ef\u00f1\5*\26\2\u00f0\u00e9\3\2\2\2\u00f0\u00ea\3"+
		"\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3!\3\2\2\2\u00f4"+
		"\u00fb\5(\25\2\u00f5\u00fb\5\20\t\2\u00f6\u00fb\5\22\n\2\u00f7\u00fb\5"+
		"\24\13\2\u00f8\u00fb\5$\23\2\u00f9\u00fb\5,\27\2\u00fa\u00f4\3\2\2\2\u00fa"+
		"\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7\36\2\2\u00fd\u00fe"+
		"\7>\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\7\37\2\2"+
		"\u0101\u0104\5\30\r\2\u0102\u0103\7\37\2\2\u0103\u0105\5\30\r\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5&"+
		"\24\2\u0107\u010f\3\2\2\2\u0108\u0109\7 \2\2\u0109\u010a\7\b\2\2\u010a"+
		"\u010b\5\26\f\2\u010b\u010c\7\n\2\2\u010c\u010d\5&\24\2\u010d\u010f\3"+
		"\2\2\2\u010e\u00fc\3\2\2\2\u010e\u0108\3\2\2\2\u010f%\3\2\2\2\u0110\u0112"+
		"\7\13\2\2\u0111\u0113\5\"\22\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\7\r\2\2\u0117\'\3\2\2\2\u0118\u011b\7>\2\2\u0119\u011b\5*\26\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u012a\7\22"+
		"\2\2\u011d\u012b\5\26\f\2\u011e\u0127\7!\2\2\u011f\u0124\5\30\r\2\u0120"+
		"\u0121\7\t\2\2\u0121\u0123\5\30\r\2\u0122\u0120\3\2\2\2\u0123\u0126\3"+
		"\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\7\"\2\2\u012a\u011d\3\2\2\2\u012a\u011e\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\4\2\2\u012d)\3\2\2\2\u012e\u012f\7#\2\2\u012f"+
		"\u0130\7!\2\2\u0130\u0135\5\30\r\2\u0131\u0132\7\t\2\2\u0132\u0134\5\30"+
		"\r\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\""+
		"\2\2\u0139+\3\2\2\2\u013a\u0150\5P)\2\u013b\u0150\5R*\2\u013c\u0150\5"+
		"T+\2\u013d\u0150\5J&\2\u013e\u0150\5L\'\2\u013f\u0150\5N(\2\u0140\u0150"+
		"\5.\30\2\u0141\u0150\5\60\31\2\u0142\u0150\5\62\32\2\u0143\u0150\5\64"+
		"\33\2\u0144\u0150\5\66\34\2\u0145\u0150\58\35\2\u0146\u0150\5:\36\2\u0147"+
		"\u0150\5<\37\2\u0148\u0150\5> \2\u0149\u0150\5F$\2\u014a\u0150\5H%\2\u014b"+
		"\u0150\5@!\2\u014c\u0150\5B\"\2\u014d\u0150\5D#\2\u014e\u0150\5V,\2\u014f"+
		"\u013a\3\2\2\2\u014f\u013b\3\2\2\2\u014f\u013c\3\2\2\2\u014f\u013d\3\2"+
		"\2\2\u014f\u013e\3\2\2\2\u014f\u013f\3\2\2\2\u014f\u0140\3\2\2\2\u014f"+
		"\u0141\3\2\2\2\u014f\u0142\3\2\2\2\u014f\u0143\3\2\2\2\u014f\u0144\3\2"+
		"\2\2\u014f\u0145\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f"+
		"\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"-\3\2\2\2\u0151\u0152\7>\2\2\u0152\u0153\7\22\2\2\u0153\u0154\7$\2\2\u0154"+
		"\u0155\7\b\2\2\u0155\u0156\7>\2\2\u0156\u0157\7\n\2\2\u0157\u0158\7\4"+
		"\2\2\u0158/\3\2\2\2\u0159\u015a\7>\2\2\u015a\u015b\7\22\2\2\u015b\u015c"+
		"\7%\2\2\u015c\u015d\7\b\2\2\u015d\u015e\7>\2\2\u015e\u015f\7\n\2\2\u015f"+
		"\u0160\7\4\2\2\u0160\61\3\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7\22\2"+
		"\2\u0163\u0164\7&\2\2\u0164\u0165\7\b\2\2\u0165\u0166\7>\2\2\u0166\u0167"+
		"\7\n\2\2\u0167\u0168\7\4\2\2\u0168\63\3\2\2\2\u0169\u016a\7>\2\2\u016a"+
		"\u016b\7\22\2\2\u016b\u016c\7\'\2\2\u016c\u016d\7\b\2\2\u016d\u016e\7"+
		">\2\2\u016e\u016f\7\n\2\2\u016f\u0170\7\4\2\2\u0170\65\3\2\2\2\u0171\u0172"+
		"\7>\2\2\u0172\u0173\7\22\2\2\u0173\u0174\7(\2\2\u0174\u0175\7\b\2\2\u0175"+
		"\u0176\7>\2\2\u0176\u0177\7\n\2\2\u0177\u0178\7\4\2\2\u0178\67\3\2\2\2"+
		"\u0179\u017a\7>\2\2\u017a\u017b\7\22\2\2\u017b\u017c\7)\2\2\u017c\u017d"+
		"\7\b\2\2\u017d\u017e\7>\2\2\u017e\u017f\7\n\2\2\u017f\u0180\7\4\2\2\u0180"+
		"9\3\2\2\2\u0181\u0182\7*\2\2\u0182\u0183\7\b\2\2\u0183\u0184\7>\2\2\u0184"+
		"\u0185\7\t\2\2\u0185\u0186\7>\2\2\u0186\u0187\7\n\2\2\u0187\u0188\7\4"+
		"\2\2\u0188;\3\2\2\2\u0189\u018a\7+\2\2\u018a\u018b\7\b\2\2\u018b\u018c"+
		"\7>\2\2\u018c\u018d\7\t\2\2\u018d\u018e\7>\2\2\u018e\u018f\7\n\2\2\u018f"+
		"\u0190\7\4\2\2\u0190=\3\2\2\2\u0191\u0192\7,\2\2\u0192\u0193\7\b\2\2\u0193"+
		"\u0194\7>\2\2\u0194\u0195\7\t\2\2\u0195\u0196\7>\2\2\u0196\u0197\7\n\2"+
		"\2\u0197\u0198\7\4\2\2\u0198?\3\2\2\2\u0199\u019a\7>\2\2\u019a\u019b\7"+
		"\22\2\2\u019b\u019c\7-\2\2\u019c\u019d\7\b\2\2\u019d\u019e\7>\2\2\u019e"+
		"\u019f\7\t\2\2\u019f\u01a0\7>\2\2\u01a0\u01a1\7\n\2\2\u01a1\u01a2\7\4"+
		"\2\2\u01a2A\3\2\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a5\7\22\2\2\u01a5\u01a6"+
		"\7.\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8\7>\2\2\u01a8\u01a9\7\t\2\2\u01a9"+
		"\u01aa\7>\2\2\u01aa\u01ab\7\n\2\2\u01ab\u01ac\7\4\2\2\u01acC\3\2\2\2\u01ad"+
		"\u01ae\7>\2\2\u01ae\u01af\7\22\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\7\b"+
		"\2\2\u01b1\u01b2\7>\2\2\u01b2\u01b3\7\t\2\2\u01b3\u01b4\5\30\r\2\u01b4"+
		"\u01b5\7\n\2\2\u01b5\u01b6\7\4\2\2\u01b6E\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8"+
		"\u01b9\7\22\2\2\u01b9\u01ba\7\60\2\2\u01ba\u01bb\7\b\2\2\u01bb\u01bc\7"+
		"B\2\2\u01bc\u01bd\7\n\2\2\u01bd\u01be\7\4\2\2\u01beG\3\2\2\2\u01bf\u01c0"+
		"\7\61\2\2\u01c0\u01c1\7\b\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7\t\2\2\u01c3"+
		"\u01c4\7B\2\2\u01c4\u01c5\7\62\2\2\u01c5\u01c6\7\n\2\2\u01c6\u01c7\7\4"+
		"\2\2\u01c7I\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9\u01ca\7\22\2\2\u01ca\u01cb"+
		"\7\63\2\2\u01cb\u01cc\7\b\2\2\u01cc\u01cd\7>\2\2\u01cd\u01ce\7\n\2\2\u01ce"+
		"\u01cf\7\4\2\2\u01cfK\3\2\2\2\u01d0\u01d1\7>\2\2\u01d1\u01d2\7\22\2\2"+
		"\u01d2\u01d3\7\64\2\2\u01d3\u01d4\7\b\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6"+
		"\7\n\2\2\u01d6\u01d7\7\4\2\2\u01d7M\3\2\2\2\u01d8\u01d9\7>\2\2\u01d9\u01da"+
		"\7\22\2\2\u01da\u01db\7\65\2\2\u01db\u01dc\7\b\2\2\u01dc\u01dd\7>\2\2"+
		"\u01dd\u01de\7\n\2\2\u01de\u01df\7\4\2\2\u01dfO\3\2\2\2\u01e0\u01e1\7"+
		">\2\2\u01e1\u01e2\7\22\2\2\u01e2\u01e3\7\66\2\2\u01e3\u01e4\7\b\2\2\u01e4"+
		"\u01e5\7>\2\2\u01e5\u01e6\7\t\2\2\u01e6\u01e7\7>\2\2\u01e7\u01e8\7\n\2"+
		"\2\u01e8\u01e9\7\4\2\2\u01e9Q\3\2\2\2\u01ea\u01eb\7>\2\2\u01eb\u01ec\7"+
		"\22\2\2\u01ec\u01ed\7\67\2\2\u01ed\u01ee\7\b\2\2\u01ee\u01ef\7>\2\2\u01ef"+
		"\u01f0\7\t\2\2\u01f0\u01f1\7@\2\2\u01f1\u01f2\7\n\2\2\u01f2\u01f3\7\4"+
		"\2\2\u01f3S\3\2\2\2\u01f4\u01f5\7>\2\2\u01f5\u01f6\7\22\2\2\u01f6\u01f7"+
		"\78\2\2\u01f7\u01f8\7\b\2\2\u01f8\u01f9\7>\2\2\u01f9\u01fa\7\t\2\2\u01fa"+
		"\u01fb\7@\2\2\u01fb\u01fc\7\t\2\2\u01fc\u01fd\7@\2\2\u01fd\u01fe\7\n\2"+
		"\2\u01fe\u01ff\7\4\2\2\u01ffU\3\2\2\2\u0200\u0201\7>\2\2\u0201\u0203\7"+
		"\22\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0205\7>\2\2\u0205\u0214\7\b\2\2\u0206\u0209\7>\2\2\u0207\u0209\5\36"+
		"\20\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\u0211\3\2\2\2\u020a"+
		"\u020d\7\t\2\2\u020b\u020e\7>\2\2\u020c\u020e\5\36\20\2\u020d\u020b\3"+
		"\2\2\2\u020d\u020c\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020a\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0214\u0208\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\7\n\2\2\u0217W\3\2\2\2&[`ix{\u0081\u0086\u008a"+
		"\u0095\u009c\u00a8\u00b1\u00b6\u00ba\u00c2\u00cd\u00d4\u00dc\u00e4\u00e7"+
		"\u00f0\u00fa\u0104\u010e\u0114\u011a\u0124\u0127\u012a\u0135\u014f\u0202"+
		"\u0208\u020d\u0211\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}