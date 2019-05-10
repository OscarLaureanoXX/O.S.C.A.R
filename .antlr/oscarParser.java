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
		RULE_ciclo = 17, RULE_estats = 18, RULE_acceso = 19, RULE_asignacion = 20, 
		RULE_igualdad = 21, RULE_sub_lista = 22, RULE_element = 23, RULE_llamadaret = 24, 
		RULE_llamadavoid = 25, RULE_mean = 26, RULE_variance = 27, RULE_median = 28, 
		RULE_stdev = 29, RULE_head = 30, RULE_tail = 31, RULE_union = 32, RULE_intersect = 33, 
		RULE_find = 34, RULE_import_csv = 35, RULE_length = 36, RULE_min_ = 37, 
		RULE_max_ = 38, RULE_concat = 39, RULE_sort = 40, RULE_splice = 41, RULE_userdef = 42, 
		RULE_histograma = 43, RULE_pie_chart = 44, RULE_bar_graph = 45, RULE_export_csv = 46;
	public static final String[] ruleNames = {
		"programa", "modulo", "main", "param", "bloque", "vars_", "id_", "condicion", 
		"escritura", "lectura", "expresion", "exp", "termino", "factor", "var_cte", 
		"tipo", "estatuto", "ciclo", "estats", "acceso", "asignacion", "igualdad", 
		"sub_lista", "element", "llamadaret", "llamadavoid", "mean", "variance", 
		"median", "stdev", "head", "tail", "union", "intersect", "find", "import_csv", 
		"length", "min_", "max_", "concat", "sort", "splice", "userdef", "histograma", 
		"pie_chart", "bar_graph", "export_csv"
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
			setState(94);
			match(T__0);
			setState(95);
			match(T__1);
			rules.create_function_table()
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(97);
				vars_();
				}
			}

			rules.generate_first_goto()
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(101);
				modulo();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			rules.fill_first_goto()
			setState(108);
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
			setState(111);
			match(T__2);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				{
				setState(112);
				((ModuloContext)_localctx).tipo = tipo();
				setState(113);
				((ModuloContext)_localctx).ID = match(ID);
				rules.add_to_func_table((((ModuloContext)_localctx).ID!=null?((ModuloContext)_localctx).ID.getText():null), (((ModuloContext)_localctx).tipo!=null?_input.getText(((ModuloContext)_localctx).tipo.start,((ModuloContext)_localctx).tipo.stop):null))
				}
				break;
			case T__3:
				{
				setState(116);
				match(T__3);
				setState(117);
				((ModuloContext)_localctx).ID = match(ID);
				rules.add_to_func_table((((ModuloContext)_localctx).ID!=null?((ModuloContext)_localctx).ID.getText():null), 'void')
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			param();
			setState(122);
			bloque();
			rules.set_func_end()
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
			setState(125);
			match(T__4);
			rules.add_to_func_table('main','main')
			setState(127);
			param();
			setState(128);
			bloque();
			rules.create_packet_main()
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
			setState(131);
			match(T__5);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(132);
				id_();
				rules.update_func_firm()
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(134);
					match(T__6);
					setState(135);
					id_();
					rules.update_func_firm()
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
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
			setState(147);
			match(T__8);
			rules.set_func_start()
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(149);
				vars_();
				}
			}

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__28) | (1L << T__31) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				estatuto();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(158);
				match(T__9);
				setState(159);
				exp();
				setState(160);
				match(T__1);
				rules.create_return()
				}
			}

			setState(165);
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
			setState(167);
			match(T__11);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				((Vars_Context)_localctx).tipo = tipo();
				setState(169);
				((Vars_Context)_localctx).ID = match(ID);
				rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
				rules.add_to_operand_stack((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(172);
					match(T__12);
					setState(173);
					((Vars_Context)_localctx).CTE_I = match(CTE_I);
					rules.addRows((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(175);
						match(T__6);
						setState(176);
						((Vars_Context)_localctx).CTE_I = match(CTE_I);
						rules.addColumns((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
						}
					}

					setState(180);
					match(T__13);
					}
				}

				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(183);
					igualdad();
					}
				}

				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(186);
					match(T__6);
					setState(187);
					((Vars_Context)_localctx).ID = match(ID);
					rules.add_to_var_table((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
					rules.add_to_operand_stack((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null), (((Vars_Context)_localctx).tipo!=null?_input.getText(((Vars_Context)_localctx).tipo.start,((Vars_Context)_localctx).tipo.stop):null))
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(190);
						match(T__12);
						setState(191);
						((Vars_Context)_localctx).CTE_I = match(CTE_I);
						rules.addRows((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__6) {
							{
							setState(193);
							match(T__6);
							setState(194);
							((Vars_Context)_localctx).CTE_I = match(CTE_I);
							rules.addColumns((((Vars_Context)_localctx).ID!=null?((Vars_Context)_localctx).ID.getText():null),(((Vars_Context)_localctx).CTE_I!=null?((Vars_Context)_localctx).CTE_I.getText():null))
							}
						}

						setState(198);
						match(T__13);
						}
					}

					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29) {
						{
						setState(201);
						igualdad();
						}
					}

					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__1);
				}
				}
				setState(213); 
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
			setState(215);
			((Id_Context)_localctx).tipo = tipo();
			setState(216);
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
			setState(219);
			match(T__14);
			setState(220);
			match(T__5);
			setState(221);
			expresion();
			setState(222);
			match(T__7);
			rules.add_conditional()
			setState(224);
			estats();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(225);
				match(T__15);
				rules.add_else()
				setState(227);
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
		public List<AccesoContext> acceso() {
			return getRuleContexts(AccesoContext.class);
		}
		public AccesoContext acceso(int i) {
			return getRuleContext(AccesoContext.class,i);
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
			setState(232);
			match(T__16);
			setState(233);
			match(T__5);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(234);
				expresion();
				rules.add_print()
				}
				break;
			case 2:
				{
				setState(237);
				match(CTE_STRING);
				}
				break;
			case 3:
				{
				setState(238);
				acceso();
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(241);
				match(T__6);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(242);
					expresion();
					rules.add_print()
					}
					break;
				case 2:
					{
					setState(245);
					match(CTE_STRING);
					}
					break;
				case 3:
					{
					setState(246);
					acceso();
					}
					break;
				}
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__7);
			setState(255);
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
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(257);
			match(T__17);
			setState(258);
			match(T__5);
			setState(259);
			((LecturaContext)_localctx).tipo = tipo();
			setState(260);
			match(T__7);
			rules.generate_read((((LecturaContext)_localctx).tipo!=null?_input.getText(((LecturaContext)_localctx).tipo.start,((LecturaContext)_localctx).tipo.stop):null))
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
			setState(263);
			exp();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELACIONALES || _la==LOGICOS) {
				{
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELACIONALES:
					{
					setState(264);
					((ExpresionContext)_localctx).RELACIONALES = match(RELACIONALES);
					rules.add_to_operator_stack((((ExpresionContext)_localctx).RELACIONALES!=null?((ExpresionContext)_localctx).RELACIONALES.getText():null))
					}
					break;
				case LOGICOS:
					{
					setState(266);
					((ExpresionContext)_localctx).LOGICOS = match(LOGICOS);
					rules.add_to_operator_stack((((ExpresionContext)_localctx).LOGICOS!=null?((ExpresionContext)_localctx).LOGICOS.getText():null))
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270);
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
			setState(275);
			termino();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(276);
					match(T__18);
					rules.add_to_operator_stack('+')
					}
					break;
				case T__19:
					{
					setState(278);
					match(T__19);
					rules.add_to_operator_stack('-')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282);
				termino();
				rules.pop_sum_from_stack()
				}
				}
				setState(289);
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
			setState(290);
			factor();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(291);
					match(T__20);
					rules.add_to_operator_stack('*')
					}
					break;
				case T__21:
					{
					setState(293);
					match(T__21);
					rules.add_to_operator_stack('/')
					}
					break;
				case T__22:
					{
					setState(295);
					match(T__22);
					rules.add_to_operator_stack('%')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				factor();
				rules.pop_mult_from_stack()
				}
				}
				setState(306);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(307);
				match(T__5);
				rules.add_to_operator_stack('(')
				setState(309);
				expresion();
				setState(310);
				match(T__7);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__19) {
					{
					setState(312);
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

				setState(315);
				var_cte();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode CTE_I() { return getToken(oscarParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(oscarParser.CTE_F, 0); }
		public TerminalNode CTE_B() { return getToken(oscarParser.CTE_B, 0); }
		public TerminalNode CTE_STRING() { return getToken(oscarParser.CTE_STRING, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_cte);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((Var_cteContext)_localctx).ID = match(ID);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).ID!=null?((Var_cteContext)_localctx).ID.getText():null), 'var')
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(321);
					element();
					}
				}

				}
				break;
			case CTE_I:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((Var_cteContext)_localctx).CTE_I = match(CTE_I);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_I!=null?((Var_cteContext)_localctx).CTE_I.getText():null), 'int')
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				((Var_cteContext)_localctx).CTE_F = match(CTE_F);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_F!=null?((Var_cteContext)_localctx).CTE_F.getText():null), 'float')
				}
				break;
			case CTE_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				((Var_cteContext)_localctx).CTE_B = match(CTE_B);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_B!=null?((Var_cteContext)_localctx).CTE_B.getText():null), 'bool')
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((Var_cteContext)_localctx).CTE_STRING = match(CTE_STRING);
				rules.add_to_operand_stack((((Var_cteContext)_localctx).CTE_STRING!=null?((Var_cteContext)_localctx).CTE_STRING.getText():null), 'string')
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
			setState(334);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				escritura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				ciclo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
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
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(343);
				match(T__28);
				setState(344);
				((CicloContext)_localctx).ID = match(ID);
				rules.add_to_operand_stack((((CicloContext)_localctx).ID!=null?((CicloContext)_localctx).ID.getText():null), 'var')
				setState(346);
				match(T__29);
				rules.add_to_operator_stack('=')
				setState(348);
				exp();
				rules.pop_equals_from_stack()
				setState(350);
				match(T__30);
				rules.add_for_inicio((((CicloContext)_localctx).ID!=null?((CicloContext)_localctx).ID.getText():null))
				setState(352);
				exp();
				rules.add_for_limite()
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(354);
					match(T__30);
					setState(355);
					exp();
					rules.add_for_step()
					}
				}

				setState(360);
				estats();
				rules.add_for_final()
				}
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(363);
				match(T__31);
				rules.add_while()
				setState(365);
				match(T__5);
				setState(366);
				expresion();
				setState(367);
				match(T__7);
				rules.add_expr_while()
				setState(369);
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
			setState(374);
			match(T__8);
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				estatuto();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__28) | (1L << T__31) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << ID))) != 0) );
			setState(380);
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

	public static class AccesoContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public AccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso; }
	}

	public final AccesoContext acceso() throws RecognitionException {
		AccesoContext _localctx = new AccesoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_acceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((AccesoContext)_localctx).ID = match(ID);
			rules.add_to_operand_stack((((AccesoContext)_localctx).ID!=null?((AccesoContext)_localctx).ID.getText():null), 'var')
			setState(384);
			element();
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
		enterRule(_localctx, 40, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			((AsignacionContext)_localctx).ID = match(ID);
			rules.add_to_operand_stack((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), 'var')
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(388);
				element();
				}
			}

			setState(391);
			igualdad();
			setState(392);
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
		public AccesoContext acceso() {
			return getRuleContext(AccesoContext.class,0);
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
		enterRule(_localctx, 42, RULE_igualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__29);
			rules.add_to_operator_stack('=')
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(396);
				expresion();
				}
				break;
			case 2:
				{
				setState(397);
				acceso();
				}
				break;
			case 3:
				{
				{
				setState(398);
				match(T__12);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
					{
					setState(403);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
					case T__17:
					case T__18:
					case T__19:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case T__36:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
					case T__41:
					case T__42:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case ID:
					case CTE_B:
					case CTE_I:
					case CTE_F:
					case CTE_STRING:
						{
						setState(399);
						exp();
						rules.crear_array(1)
						}
						break;
					case T__12:
						{
						setState(402);
						sub_lista();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(405);
						match(T__6);
						setState(410);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__5:
						case T__17:
						case T__18:
						case T__19:
						case T__32:
						case T__33:
						case T__34:
						case T__35:
						case T__36:
						case T__37:
						case T__38:
						case T__39:
						case T__40:
						case T__41:
						case T__42:
						case T__43:
						case T__44:
						case T__45:
						case T__46:
						case T__47:
						case ID:
						case CTE_B:
						case CTE_I:
						case CTE_F:
						case CTE_STRING:
							{
							setState(406);
							exp();
							rules.crear_array(1)
							}
							break;
						case T__12:
							{
							setState(409);
							sub_lista();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(419);
				match(T__13);
				rules.asignar_array(1)
				}
				}
				break;
			case 4:
				{
				setState(421);
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
		enterRule(_localctx, 44, RULE_sub_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__12);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(427);
				exp();
				rules.crear_array(2)
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(429);
					match(T__6);
					setState(430);
					exp();
					rules.crear_array(2)
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(440);
			match(T__13);
			rules.asignar_array(2)
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
		enterRule(_localctx, 46, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			rules.nombre_arreglo()
			setState(444);
			match(T__12);
			setState(445);
			exp();
			rules.verifica_index(1)
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(447);
				match(T__6);
				setState(448);
				exp();
				rules.verifica_index(2)
				}
			}

			setState(453);
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
		public UserdefContext userdef;
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
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
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
		enterRule(_localctx, 48, RULE_llamadaret);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				concat();
				rules.add_special('string')
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				sort();
				rules.add_special('list')
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				splice();
				rules.add_special('string')
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				length();
				rules.add_special('int')
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				min_();
				rules.add_special('int')
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				max_();
				rules.add_special('int')
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(473);
				mean();
				rules.add_special('float')
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(476);
				variance();
				rules.add_special('float')
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(479);
				median();
				rules.add_special('list')
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 10);
				{
				setState(482);
				stdev();
				rules.add_special('float')
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 11);
				{
				setState(485);
				head();
				rules.add_special('list')
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 12);
				{
				setState(488);
				tail();
				rules.add_special('list')
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(491);
				import_csv();
				rules.add_special('list')
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 14);
				{
				setState(494);
				union();
				rules.add_special('list')
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 15);
				{
				setState(497);
				intersect();
				rules.add_special('list')
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 16);
				{
				setState(500);
				find();
				rules.add_special('int')
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 17);
				{
				setState(503);
				lectura();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 18);
				{
				setState(504);
				((LlamadaretContext)_localctx).userdef = userdef();
				rules.add_return_value((((LlamadaretContext)_localctx).userdef!=null?_input.getText(((LlamadaretContext)_localctx).userdef.start,((LlamadaretContext)_localctx).userdef.stop):null))
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
		enterRule(_localctx, 50, RULE_llamadavoid);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				histograma();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				pie_chart();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				bar_graph();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				export_csv();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(513);
				userdef();
				setState(514);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public MeanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mean; }
	}

	public final MeanContext mean() throws RecognitionException {
		MeanContext _localctx = new MeanContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__32);
			setState(519);
			match(T__5);
			setState(520);
			((MeanContext)_localctx).ID = match(ID);
			rules.generate_special_function("mean", (((MeanContext)_localctx).ID!=null?((MeanContext)_localctx).ID.getText():null))
			setState(522);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public VarianceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance; }
	}

	public final VarianceContext variance() throws RecognitionException {
		VarianceContext _localctx = new VarianceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__33);
			setState(525);
			match(T__5);
			setState(526);
			((VarianceContext)_localctx).ID = match(ID);
			rules.generate_special_function("variance", (((VarianceContext)_localctx).ID!=null?((VarianceContext)_localctx).ID.getText():null))
			setState(528);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public MedianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_median; }
	}

	public final MedianContext median() throws RecognitionException {
		MedianContext _localctx = new MedianContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_median);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__34);
			setState(531);
			match(T__5);
			setState(532);
			((MedianContext)_localctx).ID = match(ID);
			rules.generate_special_function("median", (((MedianContext)_localctx).ID!=null?((MedianContext)_localctx).ID.getText():null))
			setState(534);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public StdevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdev; }
	}

	public final StdevContext stdev() throws RecognitionException {
		StdevContext _localctx = new StdevContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stdev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__35);
			setState(537);
			match(T__5);
			setState(538);
			((StdevContext)_localctx).ID = match(ID);
			rules.generate_special_function("stdev", (((StdevContext)_localctx).ID!=null?((StdevContext)_localctx).ID.getText():null))
			setState(540);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(T__36);
			setState(543);
			match(T__5);
			setState(544);
			((HeadContext)_localctx).ID = match(ID);
			rules.generate_special_function("head", (((HeadContext)_localctx).ID!=null?((HeadContext)_localctx).ID.getText():null))
			setState(546);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__37);
			setState(549);
			match(T__5);
			setState(550);
			((TailContext)_localctx).ID = match(ID);
			rules.generate_special_function("tail", (((TailContext)_localctx).ID!=null?((TailContext)_localctx).ID.getText():null))
			setState(552);
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
		public Token ID;
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
		enterRule(_localctx, 64, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__38);
			setState(555);
			match(T__5);
			setState(556);
			((UnionContext)_localctx).ID = match(ID);
			rules.add_special_stack((((UnionContext)_localctx).ID!=null?((UnionContext)_localctx).ID.getText():null), 'list')
			setState(558);
			match(T__6);
			setState(559);
			((UnionContext)_localctx).ID = match(ID);
			rules.add_special_stack((((UnionContext)_localctx).ID!=null?((UnionContext)_localctx).ID.getText():null), 'list')
			setState(561);
			match(T__7);
			rules.generate_special_function2("union")
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
		public Token ID;
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
		enterRule(_localctx, 66, RULE_intersect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__39);
			setState(565);
			match(T__5);
			setState(566);
			((IntersectContext)_localctx).ID = match(ID);
			rules.add_special_stack((((IntersectContext)_localctx).ID!=null?((IntersectContext)_localctx).ID.getText():null), 'list')
			setState(568);
			match(T__6);
			setState(569);
			((IntersectContext)_localctx).ID = match(ID);
			rules.add_special_stack((((IntersectContext)_localctx).ID!=null?((IntersectContext)_localctx).ID.getText():null), 'list')
			setState(571);
			match(T__7);
			rules.generate_special_function2("intersect")
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
		public Token ID;
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
		enterRule(_localctx, 68, RULE_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__40);
			setState(575);
			match(T__5);
			setState(576);
			((FindContext)_localctx).ID = match(ID);
			rules.add_special_stack((((FindContext)_localctx).ID!=null?((FindContext)_localctx).ID.getText():null), 'list')
			setState(578);
			match(T__6);
			setState(579);
			exp();
			##FALTA
			setState(581);
			match(T__7);
			rules.generate_special_function2("find")
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
		public Token CTE_STRING;
		public TerminalNode CTE_STRING() { return getToken(oscarParser.CTE_STRING, 0); }
		public Import_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_csv; }
	}

	public final Import_csvContext import_csv() throws RecognitionException {
		Import_csvContext _localctx = new Import_csvContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_import_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__41);
			setState(585);
			match(T__5);
			setState(586);
			((Import_csvContext)_localctx).CTE_STRING = match(CTE_STRING);
			setState(587);
			match(T__7);
			rules.generate_special_function("import", (((Import_csvContext)_localctx).CTE_STRING!=null?((Import_csvContext)_localctx).CTE_STRING.getText():null))
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(590);
			match(T__42);
			setState(591);
			match(T__5);
			setState(592);
			((LengthContext)_localctx).ID = match(ID);
			rules.generate_special_function("length", (((LengthContext)_localctx).ID!=null?((LengthContext)_localctx).ID.getText():null))
			setState(594);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(596);
			match(T__43);
			setState(597);
			match(T__5);
			setState(598);
			((Min_Context)_localctx).ID = match(ID);
			rules.generate_special_function("min", (((Min_Context)_localctx).ID!=null?((Min_Context)_localctx).ID.getText():null))
			setState(600);
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(602);
			match(T__44);
			setState(603);
			match(T__5);
			setState(604);
			((Max_Context)_localctx).ID = match(ID);
			rules.generate_special_function("max", (((Max_Context)_localctx).ID!=null?((Max_Context)_localctx).ID.getText():null))
			setState(606);
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
		public Token ID;
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
			setState(608);
			match(T__45);
			setState(609);
			match(T__5);
			setState(610);
			((ConcatContext)_localctx).ID = match(ID);
			rules.add_special_stack((((ConcatContext)_localctx).ID!=null?((ConcatContext)_localctx).ID.getText():null), 'string')
			setState(612);
			match(T__6);
			setState(613);
			((ConcatContext)_localctx).ID = match(ID);
			rules.add_special_stack((((ConcatContext)_localctx).ID!=null?((ConcatContext)_localctx).ID.getText():null), 'string')
			setState(615);
			match(T__7);
			rules.generate_special_function2("concat")
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
		public Token ID;
		public Token CTE_I;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(618);
			match(T__46);
			setState(619);
			match(T__5);
			setState(620);
			((SortContext)_localctx).ID = match(ID);
			rules.add_special_stack((((SortContext)_localctx).ID!=null?((SortContext)_localctx).ID.getText():null), 'list')
			setState(622);
			match(T__6);
			setState(623);
			((SortContext)_localctx).CTE_I = match(CTE_I);
			rules.add_special_stack((((SortContext)_localctx).CTE_I!=null?((SortContext)_localctx).CTE_I.getText():null), 'int')
			setState(625);
			match(T__7);
			rules.generate_special_function2("sort")
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
		public Token ID;
		public Token CTE_I;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
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
			setState(628);
			match(T__47);
			setState(629);
			match(T__5);
			setState(630);
			((SpliceContext)_localctx).ID = match(ID);
			rules.add_special_stack((((SpliceContext)_localctx).ID!=null?((SpliceContext)_localctx).ID.getText():null), 'string')
			setState(632);
			match(T__6);
			setState(633);
			((SpliceContext)_localctx).CTE_I = match(CTE_I);
			rules.add_special_stack((((SpliceContext)_localctx).CTE_I!=null?((SpliceContext)_localctx).CTE_I.getText():null), 'int')
			setState(635);
			match(T__6);
			setState(636);
			((SpliceContext)_localctx).CTE_I = match(CTE_I);
			rules.add_special_stack((((SpliceContext)_localctx).CTE_I!=null?((SpliceContext)_localctx).CTE_I.getText():null), 'int')
			setState(638);
			match(T__7);
			rules.generate_special_function3("splice")
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
		public Token ID;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
			setState(641);
			((UserdefContext)_localctx).ID = match(ID);
			rules.func_call_validation((((UserdefContext)_localctx).ID!=null?((UserdefContext)_localctx).ID.getText():null))
			setState(643);
			match(T__5);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << ID) | (1L << CTE_B) | (1L << CTE_I) | (1L << CTE_F) | (1L << CTE_STRING))) != 0)) {
				{
				setState(644);
				exp();
				rules.func_add_argument()
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(646);
					match(T__6);
					setState(647);
					exp();
					rules.func_add_argument()
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(657);
			match(T__7);
			rules.func_gosub()
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
		public Token ID;
		public Token CTE_I;
		public TerminalNode ID() { return getToken(oscarParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(oscarParser.CTE_I, 0); }
		public HistogramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_histograma; }
	}

	public final HistogramaContext histograma() throws RecognitionException {
		HistogramaContext _localctx = new HistogramaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_histograma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(T__48);
			setState(661);
			match(T__5);
			setState(662);
			((HistogramaContext)_localctx).ID = match(ID);
			rules.add_special_stack((((HistogramaContext)_localctx).ID!=null?((HistogramaContext)_localctx).ID.getText():null), 'list')
			setState(664);
			match(T__6);
			setState(665);
			((HistogramaContext)_localctx).CTE_I = match(CTE_I);
			rules.add_special_stack((((HistogramaContext)_localctx).CTE_I!=null?((HistogramaContext)_localctx).CTE_I.getText():null), 'int')
			setState(667);
			match(T__7);
			rules.generate_special_function2("histogram")
			setState(669);
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
		public Token ID;
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
		enterRule(_localctx, 88, RULE_pie_chart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__49);
			setState(672);
			match(T__5);
			setState(673);
			((Pie_chartContext)_localctx).ID = match(ID);
			rules.add_special_stack((((Pie_chartContext)_localctx).ID!=null?((Pie_chartContext)_localctx).ID.getText():null), 'list')
			setState(675);
			match(T__6);
			setState(676);
			((Pie_chartContext)_localctx).ID = match(ID);
			rules.add_special_stack((((Pie_chartContext)_localctx).ID!=null?((Pie_chartContext)_localctx).ID.getText():null), 'list')
			setState(678);
			match(T__7);
			rules.generate_special_function2("pie_chart")
			setState(680);
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
		public Token ID;
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
		enterRule(_localctx, 90, RULE_bar_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__50);
			setState(683);
			match(T__5);
			setState(684);
			((Bar_graphContext)_localctx).ID = match(ID);
			rules.add_special_stack((((Bar_graphContext)_localctx).ID!=null?((Bar_graphContext)_localctx).ID.getText():null), 'list')
			setState(686);
			match(T__6);
			setState(687);
			((Bar_graphContext)_localctx).ID = match(ID);
			rules.add_special_stack((((Bar_graphContext)_localctx).ID!=null?((Bar_graphContext)_localctx).ID.getText():null), 'list')
			setState(689);
			match(T__7);
			rules.generate_special_function2("bar_graph")
			setState(691);
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
		enterRule(_localctx, 92, RULE_export_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__51);
			setState(694);
			match(T__5);
			setState(695);
			match(ID);
			setState(696);
			match(T__6);
			setState(697);
			match(CTE_STRING);
			setState(698);
			match(T__52);
			setState(699);
			match(T__7);
			###FALTA
			rules.generate_special_function("export")
			setState(702);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u02c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\5\2e\n\2\3\2\3\2\7\2"+
		"i\n\2\f\2\16\2l\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3z\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\5\5\u0092\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\5\6\u0099\n\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00b5\n\7\3\7\5\7\u00b8\n\7\3\7\5\7\u00bb\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c7\n\7\3\7\5\7\u00ca\n\7\3\7\5\7\u00cd\n"+
		"\7\7\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\6\7\u00d6\n\7\r\7\16\7\u00d7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e7\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00fa\n\n\7\n\u00fc\n\n\f\n\16\n\u00ff\13\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u010f\n\f\3\f\3\f\3\f\5\f"+
		"\u0114\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u011b\n\r\3\r\3\r\3\r\7\r\u0120\n\r"+
		"\f\r\16\r\u0123\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012c\n\16"+
		"\3\16\3\16\3\16\7\16\u0131\n\16\f\16\16\16\u0134\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u013c\n\17\3\17\3\17\5\17\u0140\n\17\3\20\3\20\3"+
		"\20\5\20\u0145\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u014f"+
		"\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0158\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0169"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0177\n\23\3\24\3\24\6\24\u017b\n\24\r\24\16\24\u017c\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0188\n\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0196\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u019d\n\27\7\27\u019f\n\27\f\27\16\27\u01a2\13\27\5\27\u01a4"+
		"\n\27\3\27\3\27\3\27\5\27\u01a9\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01b4\n\30\f\30\16\30\u01b7\13\30\5\30\u01b9\n\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c6\n\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01fe\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0207\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\7,\u028d\n,\f,\16,\u0290\13,\5,\u0292\n,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\4\3\2\25\26\3\2\32\36\2\u02e1"+
		"\2`\3\2\2\2\4q\3\2\2\2\6\177\3\2\2\2\b\u0085\3\2\2\2\n\u0095\3\2\2\2\f"+
		"\u00a9\3\2\2\2\16\u00d9\3\2\2\2\20\u00dd\3\2\2\2\22\u00ea\3\2\2\2\24\u0103"+
		"\3\2\2\2\26\u0109\3\2\2\2\30\u0115\3\2\2\2\32\u0124\3\2\2\2\34\u013f\3"+
		"\2\2\2\36\u014e\3\2\2\2 \u0150\3\2\2\2\"\u0157\3\2\2\2$\u0176\3\2\2\2"+
		"&\u0178\3\2\2\2(\u0180\3\2\2\2*\u0184\3\2\2\2,\u018c\3\2\2\2.\u01ac\3"+
		"\2\2\2\60\u01bd\3\2\2\2\62\u01fd\3\2\2\2\64\u0206\3\2\2\2\66\u0208\3\2"+
		"\2\28\u020e\3\2\2\2:\u0214\3\2\2\2<\u021a\3\2\2\2>\u0220\3\2\2\2@\u0226"+
		"\3\2\2\2B\u022c\3\2\2\2D\u0236\3\2\2\2F\u0240\3\2\2\2H\u024a\3\2\2\2J"+
		"\u0250\3\2\2\2L\u0256\3\2\2\2N\u025c\3\2\2\2P\u0262\3\2\2\2R\u026c\3\2"+
		"\2\2T\u0276\3\2\2\2V\u0283\3\2\2\2X\u0296\3\2\2\2Z\u02a1\3\2\2\2\\\u02ac"+
		"\3\2\2\2^\u02b7\3\2\2\2`a\7\3\2\2ab\7\4\2\2bd\b\2\1\2ce\5\f\7\2dc\3\2"+
		"\2\2de\3\2\2\2ef\3\2\2\2fj\b\2\1\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\b\2\1\2no\5\6\4\2op\b\2\1\2p\3\3"+
		"\2\2\2qy\7\5\2\2rs\5 \21\2st\7=\2\2tu\b\3\1\2uz\3\2\2\2vw\7\6\2\2wx\7"+
		"=\2\2xz\b\3\1\2yr\3\2\2\2yv\3\2\2\2z{\3\2\2\2{|\5\b\5\2|}\5\n\6\2}~\b"+
		"\3\1\2~\5\3\2\2\2\177\u0080\7\7\2\2\u0080\u0081\b\4\1\2\u0081\u0082\5"+
		"\b\5\2\u0082\u0083\5\n\6\2\u0083\u0084\b\4\1\2\u0084\7\3\2\2\2\u0085\u0091"+
		"\7\b\2\2\u0086\u0087\5\16\b\2\u0087\u008e\b\5\1\2\u0088\u0089\7\t\2\2"+
		"\u0089\u008a\5\16\b\2\u008a\u008b\b\5\1\2\u008b\u008d\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\n\2\2\u0094\t\3\2\2\2\u0095\u0096"+
		"\7\13\2\2\u0096\u0098\b\6\1\2\u0097\u0099\5\f\7\2\u0098\u0097\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u009c\5\"\22\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a5\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5\30"+
		"\r\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\b\6\1\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\r"+
		"\2\2\u00a8\13\3\2\2\2\u00a9\u00d5\7\16\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac"+
		"\7=\2\2\u00ac\u00ad\b\7\1\2\u00ad\u00b7\b\7\1\2\u00ae\u00af\7\17\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\u00b4\b\7\1\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\7?\2"+
		"\2\u00b3\u00b5\b\7\1\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\7\20\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5,\27\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00d0\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\7=\2\2\u00be"+
		"\u00bf\b\7\1\2\u00bf\u00c9\b\7\1\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\7"+
		"?\2\2\u00c2\u00c6\b\7\1\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\u00c7\b\7\1\2\u00c6\u00c3\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\7\20\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00cd\5,\27\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00bc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00aa\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\r\3\2\2\2"+
		"\u00d9\u00da\5 \21\2\u00da\u00db\7=\2\2\u00db\u00dc\b\b\1\2\u00dc\17\3"+
		"\2\2\2\u00dd\u00de\7\21\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\5\26\f\2\u00e0"+
		"\u00e1\7\n\2\2\u00e1\u00e2\b\t\1\2\u00e2\u00e6\5&\24\2\u00e3\u00e4\7\22"+
		"\2\2\u00e4\u00e5\b\t\1\2\u00e5\u00e7\5&\24\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\t\1\2\u00e9\21\3\2\2"+
		"\2\u00ea\u00eb\7\23\2\2\u00eb\u00f1\7\b\2\2\u00ec\u00ed\5\26\f\2\u00ed"+
		"\u00ee\b\n\1\2\u00ee\u00f2\3\2\2\2\u00ef\u00f2\7A\2\2\u00f0\u00f2\5(\25"+
		"\2\u00f1\u00ec\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00fd"+
		"\3\2\2\2\u00f3\u00f9\7\t\2\2\u00f4\u00f5\5\26\f\2\u00f5\u00f6\b\n\1\2"+
		"\u00f6\u00fa\3\2\2\2\u00f7\u00fa\7A\2\2\u00f8\u00fa\5(\25\2\u00f9\u00f4"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\n\2\2\u0101"+
		"\u0102\7\4\2\2\u0102\23\3\2\2\2\u0103\u0104\7\24\2\2\u0104\u0105\7\b\2"+
		"\2\u0105\u0106\5 \21\2\u0106\u0107\7\n\2\2\u0107\u0108\b\13\1\2\u0108"+
		"\25\3\2\2\2\u0109\u0113\5\30\r\2\u010a\u010b\79\2\2\u010b\u010f\b\f\1"+
		"\2\u010c\u010d\7:\2\2\u010d\u010f\b\f\1\2\u010e\u010a\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\30\r\2\u0111\u0112\b\f\1\2"+
		"\u0112\u0114\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u0114\3\2\2\2\u0114\27"+
		"\3\2\2\2\u0115\u0121\5\32\16\2\u0116\u0117\7\25\2\2\u0117\u011b\b\r\1"+
		"\2\u0118\u0119\7\26\2\2\u0119\u011b\b\r\1\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5\32\16\2\u011d\u011e\b"+
		"\r\1\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\31\3\2\2\2\u0123\u0121\3\2\2"+
		"\2\u0124\u0132\5\34\17\2\u0125\u0126\7\27\2\2\u0126\u012c\b\16\1\2\u0127"+
		"\u0128\7\30\2\2\u0128\u012c\b\16\1\2\u0129\u012a\7\31\2\2\u012a\u012c"+
		"\b\16\1\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\5\34\17\2\u012e\u012f\b\16\1\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\33\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136"+
		"\7\b\2\2\u0136\u0137\b\17\1\2\u0137\u0138\5\26\f\2\u0138\u0139\7\n\2\2"+
		"\u0139\u0140\3\2\2\2\u013a\u013c\t\2\2\2\u013b\u013a\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\5\36\20\2\u013e\u0140\5\62\32"+
		"\2\u013f\u0135\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013e\3\2\2\2\u0140\35"+
		"\3\2\2\2\u0141\u0142\7=\2\2\u0142\u0144\b\20\1\2\u0143\u0145\5\60\31\2"+
		"\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014f\3\2\2\2\u0146\u0147"+
		"\7?\2\2\u0147\u014f\b\20\1\2\u0148\u0149\7@\2\2\u0149\u014f\b\20\1\2\u014a"+
		"\u014b\7>\2\2\u014b\u014f\b\20\1\2\u014c\u014d\7A\2\2\u014d\u014f\b\20"+
		"\1\2\u014e\u0141\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u0148\3\2\2\2\u014e"+
		"\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014f\37\3\2\2\2\u0150\u0151\t\3\2"+
		"\2\u0151!\3\2\2\2\u0152\u0158\5*\26\2\u0153\u0158\5\20\t\2\u0154\u0158"+
		"\5\22\n\2\u0155\u0158\5$\23\2\u0156\u0158\5\64\33\2\u0157\u0152\3\2\2"+
		"\2\u0157\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156"+
		"\3\2\2\2\u0158#\3\2\2\2\u0159\u015a\7\37\2\2\u015a\u015b\7=\2\2\u015b"+
		"\u015c\b\23\1\2\u015c\u015d\7 \2\2\u015d\u015e\b\23\1\2\u015e\u015f\5"+
		"\30\r\2\u015f\u0160\b\23\1\2\u0160\u0161\7!\2\2\u0161\u0162\b\23\1\2\u0162"+
		"\u0163\5\30\r\2\u0163\u0168\b\23\1\2\u0164\u0165\7!\2\2\u0165\u0166\5"+
		"\30\r\2\u0166\u0167\b\23\1\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5&\24\2\u016b\u016c\b\23"+
		"\1\2\u016c\u0177\3\2\2\2\u016d\u016e\7\"\2\2\u016e\u016f\b\23\1\2\u016f"+
		"\u0170\7\b\2\2\u0170\u0171\5\26\f\2\u0171\u0172\7\n\2\2\u0172\u0173\b"+
		"\23\1\2\u0173\u0174\5&\24\2\u0174\u0175\b\23\1\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0159\3\2\2\2\u0176\u016d\3\2\2\2\u0177%\3\2\2\2\u0178\u017a\7\13\2\2"+
		"\u0179\u017b\5\"\22\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\r\2\2\u017f"+
		"\'\3\2\2\2\u0180\u0181\7=\2\2\u0181\u0182\b\25\1\2\u0182\u0183\5\60\31"+
		"\2\u0183)\3\2\2\2\u0184\u0185\7=\2\2\u0185\u0187\b\26\1\2\u0186\u0188"+
		"\5\60\31\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2"+
		"\u0189\u018a\5,\27\2\u018a\u018b\7\4\2\2\u018b+\3\2\2\2\u018c\u018d\7"+
		" \2\2\u018d\u01a8\b\27\1\2\u018e\u01a9\5\26\f\2\u018f\u01a9\5(\25\2\u0190"+
		"\u01a3\7\17\2\2\u0191\u0192\5\30\r\2\u0192\u0193\b\27\1\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0196\5.\30\2\u0195\u0191\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u01a0\3\2\2\2\u0197\u019c\7\t\2\2\u0198\u0199\5\30\r\2\u0199\u019a\b"+
		"\27\1\2\u019a\u019d\3\2\2\2\u019b\u019d\5.\30\2\u019c\u0198\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u0197\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u0195\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7\20\2\2\u01a6\u01a9\b\27\1\2\u01a7\u01a9\5\62\32\2\u01a8"+
		"\u018e\3\2\2\2\u01a8\u018f\3\2\2\2\u01a8\u0190\3\2\2\2\u01a8\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b\27\1\2\u01ab-\3\2\2\2\u01ac\u01b8"+
		"\7\17\2\2\u01ad\u01ae\5\30\r\2\u01ae\u01b5\b\30\1\2\u01af\u01b0\7\t\2"+
		"\2\u01b0\u01b1\5\30\r\2\u01b1\u01b2\b\30\1\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ad\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\7\20\2\2\u01bb\u01bc\b"+
		"\30\1\2\u01bc/\3\2\2\2\u01bd\u01be\b\31\1\2\u01be\u01bf\7\17\2\2\u01bf"+
		"\u01c0\5\30\r\2\u01c0\u01c5\b\31\1\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\5"+
		"\30\r\2\u01c3\u01c4\b\31\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\20\2\2\u01c8\61\3\2\2"+
		"\2\u01c9\u01ca\5P)\2\u01ca\u01cb\b\32\1\2\u01cb\u01fe\3\2\2\2\u01cc\u01cd"+
		"\5R*\2\u01cd\u01ce\b\32\1\2\u01ce\u01fe\3\2\2\2\u01cf\u01d0\5T+\2\u01d0"+
		"\u01d1\b\32\1\2\u01d1\u01fe\3\2\2\2\u01d2\u01d3\5J&\2\u01d3\u01d4\b\32"+
		"\1\2\u01d4\u01fe\3\2\2\2\u01d5\u01d6\5L\'\2\u01d6\u01d7\b\32\1\2\u01d7"+
		"\u01fe\3\2\2\2\u01d8\u01d9\5N(\2\u01d9\u01da\b\32\1\2\u01da\u01fe\3\2"+
		"\2\2\u01db\u01dc\5\66\34\2\u01dc\u01dd\b\32\1\2\u01dd\u01fe\3\2\2\2\u01de"+
		"\u01df\58\35\2\u01df\u01e0\b\32\1\2\u01e0\u01fe\3\2\2\2\u01e1\u01e2\5"+
		":\36\2\u01e2\u01e3\b\32\1\2\u01e3\u01fe\3\2\2\2\u01e4\u01e5\5<\37\2\u01e5"+
		"\u01e6\b\32\1\2\u01e6\u01fe\3\2\2\2\u01e7\u01e8\5> \2\u01e8\u01e9\b\32"+
		"\1\2\u01e9\u01fe\3\2\2\2\u01ea\u01eb\5@!\2\u01eb\u01ec\b\32\1\2\u01ec"+
		"\u01fe\3\2\2\2\u01ed\u01ee\5H%\2\u01ee\u01ef\b\32\1\2\u01ef\u01fe\3\2"+
		"\2\2\u01f0\u01f1\5B\"\2\u01f1\u01f2\b\32\1\2\u01f2\u01fe\3\2\2\2\u01f3"+
		"\u01f4\5D#\2\u01f4\u01f5\b\32\1\2\u01f5\u01fe\3\2\2\2\u01f6\u01f7\5F$"+
		"\2\u01f7\u01f8\b\32\1\2\u01f8\u01fe\3\2\2\2\u01f9\u01fe\5\24\13\2\u01fa"+
		"\u01fb\5V,\2\u01fb\u01fc\b\32\1\2\u01fc\u01fe\3\2\2\2\u01fd\u01c9\3\2"+
		"\2\2\u01fd\u01cc\3\2\2\2\u01fd\u01cf\3\2\2\2\u01fd\u01d2\3\2\2\2\u01fd"+
		"\u01d5\3\2\2\2\u01fd\u01d8\3\2\2\2\u01fd\u01db\3\2\2\2\u01fd\u01de\3\2"+
		"\2\2\u01fd\u01e1\3\2\2\2\u01fd\u01e4\3\2\2\2\u01fd\u01e7\3\2\2\2\u01fd"+
		"\u01ea\3\2\2\2\u01fd\u01ed\3\2\2\2\u01fd\u01f0\3\2\2\2\u01fd\u01f3\3\2"+
		"\2\2\u01fd\u01f6\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fe"+
		"\63\3\2\2\2\u01ff\u0207\5X-\2\u0200\u0207\5Z.\2\u0201\u0207\5\\/\2\u0202"+
		"\u0207\5^\60\2\u0203\u0204\5V,\2\u0204\u0205\7\4\2\2\u0205\u0207\3\2\2"+
		"\2\u0206\u01ff\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0201\3\2\2\2\u0206\u0202"+
		"\3\2\2\2\u0206\u0203\3\2\2\2\u0207\65\3\2\2\2\u0208\u0209\7#\2\2\u0209"+
		"\u020a\7\b\2\2\u020a\u020b\7=\2\2\u020b\u020c\b\34\1\2\u020c\u020d\7\n"+
		"\2\2\u020d\67\3\2\2\2\u020e\u020f\7$\2\2\u020f\u0210\7\b\2\2\u0210\u0211"+
		"\7=\2\2\u0211\u0212\b\35\1\2\u0212\u0213\7\n\2\2\u02139\3\2\2\2\u0214"+
		"\u0215\7%\2\2\u0215\u0216\7\b\2\2\u0216\u0217\7=\2\2\u0217\u0218\b\36"+
		"\1\2\u0218\u0219\7\n\2\2\u0219;\3\2\2\2\u021a\u021b\7&\2\2\u021b\u021c"+
		"\7\b\2\2\u021c\u021d\7=\2\2\u021d\u021e\b\37\1\2\u021e\u021f\7\n\2\2\u021f"+
		"=\3\2\2\2\u0220\u0221\7\'\2\2\u0221\u0222\7\b\2\2\u0222\u0223\7=\2\2\u0223"+
		"\u0224\b \1\2\u0224\u0225\7\n\2\2\u0225?\3\2\2\2\u0226\u0227\7(\2\2\u0227"+
		"\u0228\7\b\2\2\u0228\u0229\7=\2\2\u0229\u022a\b!\1\2\u022a\u022b\7\n\2"+
		"\2\u022bA\3\2\2\2\u022c\u022d\7)\2\2\u022d\u022e\7\b\2\2\u022e\u022f\7"+
		"=\2\2\u022f\u0230\b\"\1\2\u0230\u0231\7\t\2\2\u0231\u0232\7=\2\2\u0232"+
		"\u0233\b\"\1\2\u0233\u0234\7\n\2\2\u0234\u0235\b\"\1\2\u0235C\3\2\2\2"+
		"\u0236\u0237\7*\2\2\u0237\u0238\7\b\2\2\u0238\u0239\7=\2\2\u0239\u023a"+
		"\b#\1\2\u023a\u023b\7\t\2\2\u023b\u023c\7=\2\2\u023c\u023d\b#\1\2\u023d"+
		"\u023e\7\n\2\2\u023e\u023f\b#\1\2\u023fE\3\2\2\2\u0240\u0241\7+\2\2\u0241"+
		"\u0242\7\b\2\2\u0242\u0243\7=\2\2\u0243\u0244\b$\1\2\u0244\u0245\7\t\2"+
		"\2\u0245\u0246\5\30\r\2\u0246\u0247\b$\1\2\u0247\u0248\7\n\2\2\u0248\u0249"+
		"\b$\1\2\u0249G\3\2\2\2\u024a\u024b\7,\2\2\u024b\u024c\7\b\2\2\u024c\u024d"+
		"\7A\2\2\u024d\u024e\7\n\2\2\u024e\u024f\b%\1\2\u024fI\3\2\2\2\u0250\u0251"+
		"\7-\2\2\u0251\u0252\7\b\2\2\u0252\u0253\7=\2\2\u0253\u0254\b&\1\2\u0254"+
		"\u0255\7\n\2\2\u0255K\3\2\2\2\u0256\u0257\7.\2\2\u0257\u0258\7\b\2\2\u0258"+
		"\u0259\7=\2\2\u0259\u025a\b\'\1\2\u025a\u025b\7\n\2\2\u025bM\3\2\2\2\u025c"+
		"\u025d\7/\2\2\u025d\u025e\7\b\2\2\u025e\u025f\7=\2\2\u025f\u0260\b(\1"+
		"\2\u0260\u0261\7\n\2\2\u0261O\3\2\2\2\u0262\u0263\7\60\2\2\u0263\u0264"+
		"\7\b\2\2\u0264\u0265\7=\2\2\u0265\u0266\b)\1\2\u0266\u0267\7\t\2\2\u0267"+
		"\u0268\7=\2\2\u0268\u0269\b)\1\2\u0269\u026a\7\n\2\2\u026a\u026b\b)\1"+
		"\2\u026bQ\3\2\2\2\u026c\u026d\7\61\2\2\u026d\u026e\7\b\2\2\u026e\u026f"+
		"\7=\2\2\u026f\u0270\b*\1\2\u0270\u0271\7\t\2\2\u0271\u0272\7?\2\2\u0272"+
		"\u0273\b*\1\2\u0273\u0274\7\n\2\2\u0274\u0275\b*\1\2\u0275S\3\2\2\2\u0276"+
		"\u0277\7\62\2\2\u0277\u0278\7\b\2\2\u0278\u0279\7=\2\2\u0279\u027a\b+"+
		"\1\2\u027a\u027b\7\t\2\2\u027b\u027c\7?\2\2\u027c\u027d\b+\1\2\u027d\u027e"+
		"\7\t\2\2\u027e\u027f\7?\2\2\u027f\u0280\b+\1\2\u0280\u0281\7\n\2\2\u0281"+
		"\u0282\b+\1\2\u0282U\3\2\2\2\u0283\u0284\7=\2\2\u0284\u0285\b,\1\2\u0285"+
		"\u0291\7\b\2\2\u0286\u0287\5\30\r\2\u0287\u028e\b,\1\2\u0288\u0289\7\t"+
		"\2\2\u0289\u028a\5\30\r\2\u028a\u028b\b,\1\2\u028b\u028d\3\2\2\2\u028c"+
		"\u0288\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0286\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\7\n\2\2\u0294\u0295\b,"+
		"\1\2\u0295W\3\2\2\2\u0296\u0297\7\63\2\2\u0297\u0298\7\b\2\2\u0298\u0299"+
		"\7=\2\2\u0299\u029a\b-\1\2\u029a\u029b\7\t\2\2\u029b\u029c\7?\2\2\u029c"+
		"\u029d\b-\1\2\u029d\u029e\7\n\2\2\u029e\u029f\b-\1\2\u029f\u02a0\7\4\2"+
		"\2\u02a0Y\3\2\2\2\u02a1\u02a2\7\64\2\2\u02a2\u02a3\7\b\2\2\u02a3\u02a4"+
		"\7=\2\2\u02a4\u02a5\b.\1\2\u02a5\u02a6\7\t\2\2\u02a6\u02a7\7=\2\2\u02a7"+
		"\u02a8\b.\1\2\u02a8\u02a9\7\n\2\2\u02a9\u02aa\b.\1\2\u02aa\u02ab\7\4\2"+
		"\2\u02ab[\3\2\2\2\u02ac\u02ad\7\65\2\2\u02ad\u02ae\7\b\2\2\u02ae\u02af"+
		"\7=\2\2\u02af\u02b0\b/\1\2\u02b0\u02b1\7\t\2\2\u02b1\u02b2\7=\2\2\u02b2"+
		"\u02b3\b/\1\2\u02b3\u02b4\7\n\2\2\u02b4\u02b5\b/\1\2\u02b5\u02b6\7\4\2"+
		"\2\u02b6]\3\2\2\2\u02b7\u02b8\7\66\2\2\u02b8\u02b9\7\b\2\2\u02b9\u02ba"+
		"\7=\2\2\u02ba\u02bb\7\t\2\2\u02bb\u02bc\7A\2\2\u02bc\u02bd\7\67\2\2\u02bd"+
		"\u02be\7\n\2\2\u02be\u02bf\b\60\1\2\u02bf\u02c0\b\60\1\2\u02c0\u02c1\7"+
		"\4\2\2\u02c1_\3\2\2\2\61djy\u008e\u0091\u0098\u009d\u00a5\u00b4\u00b7"+
		"\u00ba\u00c6\u00c9\u00cc\u00d0\u00d7\u00e6\u00f1\u00f9\u00fd\u010e\u0113"+
		"\u011a\u0121\u012b\u0132\u013b\u013f\u0144\u014e\u0157\u0168\u0176\u017c"+
		"\u0187\u0195\u019c\u01a0\u01a3\u01a8\u01b5\u01b8\u01c5\u01fd\u0206\u028e"+
		"\u0291";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}