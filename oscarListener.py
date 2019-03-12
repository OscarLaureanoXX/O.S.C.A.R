# Generated from oscar.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .oscarParser import oscarParser
else:
    from oscarParser import oscarParser

# This class defines a complete listener for a parse tree produced by oscarParser.
class oscarListener(ParseTreeListener):

    # Enter a parse tree produced by oscarParser#programa.
    def enterPrograma(self, ctx:oscarParser.ProgramaContext):
        pass

    # Exit a parse tree produced by oscarParser#programa.
    def exitPrograma(self, ctx:oscarParser.ProgramaContext):
        pass


    # Enter a parse tree produced by oscarParser#modulo.
    def enterModulo(self, ctx:oscarParser.ModuloContext):
        pass

    # Exit a parse tree produced by oscarParser#modulo.
    def exitModulo(self, ctx:oscarParser.ModuloContext):
        pass


    # Enter a parse tree produced by oscarParser#main.
    def enterMain(self, ctx:oscarParser.MainContext):
        pass

    # Exit a parse tree produced by oscarParser#main.
    def exitMain(self, ctx:oscarParser.MainContext):
        pass


    # Enter a parse tree produced by oscarParser#param.
    def enterParam(self, ctx:oscarParser.ParamContext):
        pass

    # Exit a parse tree produced by oscarParser#param.
    def exitParam(self, ctx:oscarParser.ParamContext):
        pass


    # Enter a parse tree produced by oscarParser#bloque.
    def enterBloque(self, ctx:oscarParser.BloqueContext):
        pass

    # Exit a parse tree produced by oscarParser#bloque.
    def exitBloque(self, ctx:oscarParser.BloqueContext):
        pass


    # Enter a parse tree produced by oscarParser#vars_.
    def enterVars_(self, ctx:oscarParser.Vars_Context):
        pass

    # Exit a parse tree produced by oscarParser#vars_.
    def exitVars_(self, ctx:oscarParser.Vars_Context):
        pass


    # Enter a parse tree produced by oscarParser#id_.
    def enterId_(self, ctx:oscarParser.Id_Context):
        pass

    # Exit a parse tree produced by oscarParser#id_.
    def exitId_(self, ctx:oscarParser.Id_Context):
        pass


    # Enter a parse tree produced by oscarParser#condicion.
    def enterCondicion(self, ctx:oscarParser.CondicionContext):
        pass

    # Exit a parse tree produced by oscarParser#condicion.
    def exitCondicion(self, ctx:oscarParser.CondicionContext):
        pass


    # Enter a parse tree produced by oscarParser#escritura.
    def enterEscritura(self, ctx:oscarParser.EscrituraContext):
        pass

    # Exit a parse tree produced by oscarParser#escritura.
    def exitEscritura(self, ctx:oscarParser.EscrituraContext):
        pass


    # Enter a parse tree produced by oscarParser#lectura.
    def enterLectura(self, ctx:oscarParser.LecturaContext):
        pass

    # Exit a parse tree produced by oscarParser#lectura.
    def exitLectura(self, ctx:oscarParser.LecturaContext):
        pass


    # Enter a parse tree produced by oscarParser#expresion.
    def enterExpresion(self, ctx:oscarParser.ExpresionContext):
        pass

    # Exit a parse tree produced by oscarParser#expresion.
    def exitExpresion(self, ctx:oscarParser.ExpresionContext):
        pass


    # Enter a parse tree produced by oscarParser#exp.
    def enterExp(self, ctx:oscarParser.ExpContext):
        pass

    # Exit a parse tree produced by oscarParser#exp.
    def exitExp(self, ctx:oscarParser.ExpContext):
        pass


    # Enter a parse tree produced by oscarParser#termino.
    def enterTermino(self, ctx:oscarParser.TerminoContext):
        pass

    # Exit a parse tree produced by oscarParser#termino.
    def exitTermino(self, ctx:oscarParser.TerminoContext):
        pass


    # Enter a parse tree produced by oscarParser#factor.
    def enterFactor(self, ctx:oscarParser.FactorContext):
        pass

    # Exit a parse tree produced by oscarParser#factor.
    def exitFactor(self, ctx:oscarParser.FactorContext):
        pass


    # Enter a parse tree produced by oscarParser#var_cte.
    def enterVar_cte(self, ctx:oscarParser.Var_cteContext):
        pass

    # Exit a parse tree produced by oscarParser#var_cte.
    def exitVar_cte(self, ctx:oscarParser.Var_cteContext):
        pass


    # Enter a parse tree produced by oscarParser#tipo.
    def enterTipo(self, ctx:oscarParser.TipoContext):
        pass

    # Exit a parse tree produced by oscarParser#tipo.
    def exitTipo(self, ctx:oscarParser.TipoContext):
        pass


    # Enter a parse tree produced by oscarParser#estatuto.
    def enterEstatuto(self, ctx:oscarParser.EstatutoContext):
        pass

    # Exit a parse tree produced by oscarParser#estatuto.
    def exitEstatuto(self, ctx:oscarParser.EstatutoContext):
        pass


    # Enter a parse tree produced by oscarParser#ciclo.
    def enterCiclo(self, ctx:oscarParser.CicloContext):
        pass

    # Exit a parse tree produced by oscarParser#ciclo.
    def exitCiclo(self, ctx:oscarParser.CicloContext):
        pass


    # Enter a parse tree produced by oscarParser#estats.
    def enterEstats(self, ctx:oscarParser.EstatsContext):
        pass

    # Exit a parse tree produced by oscarParser#estats.
    def exitEstats(self, ctx:oscarParser.EstatsContext):
        pass


    # Enter a parse tree produced by oscarParser#asignacion.
    def enterAsignacion(self, ctx:oscarParser.AsignacionContext):
        pass

    # Exit a parse tree produced by oscarParser#asignacion.
    def exitAsignacion(self, ctx:oscarParser.AsignacionContext):
        pass


    # Enter a parse tree produced by oscarParser#element.
    def enterElement(self, ctx:oscarParser.ElementContext):
        pass

    # Exit a parse tree produced by oscarParser#element.
    def exitElement(self, ctx:oscarParser.ElementContext):
        pass


    # Enter a parse tree produced by oscarParser#llamada.
    def enterLlamada(self, ctx:oscarParser.LlamadaContext):
        pass

    # Exit a parse tree produced by oscarParser#llamada.
    def exitLlamada(self, ctx:oscarParser.LlamadaContext):
        pass


    # Enter a parse tree produced by oscarParser#mean.
    def enterMean(self, ctx:oscarParser.MeanContext):
        pass

    # Exit a parse tree produced by oscarParser#mean.
    def exitMean(self, ctx:oscarParser.MeanContext):
        pass


    # Enter a parse tree produced by oscarParser#variance.
    def enterVariance(self, ctx:oscarParser.VarianceContext):
        pass

    # Exit a parse tree produced by oscarParser#variance.
    def exitVariance(self, ctx:oscarParser.VarianceContext):
        pass


    # Enter a parse tree produced by oscarParser#median.
    def enterMedian(self, ctx:oscarParser.MedianContext):
        pass

    # Exit a parse tree produced by oscarParser#median.
    def exitMedian(self, ctx:oscarParser.MedianContext):
        pass


    # Enter a parse tree produced by oscarParser#stdev.
    def enterStdev(self, ctx:oscarParser.StdevContext):
        pass

    # Exit a parse tree produced by oscarParser#stdev.
    def exitStdev(self, ctx:oscarParser.StdevContext):
        pass


    # Enter a parse tree produced by oscarParser#head.
    def enterHead(self, ctx:oscarParser.HeadContext):
        pass

    # Exit a parse tree produced by oscarParser#head.
    def exitHead(self, ctx:oscarParser.HeadContext):
        pass


    # Enter a parse tree produced by oscarParser#tail.
    def enterTail(self, ctx:oscarParser.TailContext):
        pass

    # Exit a parse tree produced by oscarParser#tail.
    def exitTail(self, ctx:oscarParser.TailContext):
        pass


    # Enter a parse tree produced by oscarParser#histograma.
    def enterHistograma(self, ctx:oscarParser.HistogramaContext):
        pass

    # Exit a parse tree produced by oscarParser#histograma.
    def exitHistograma(self, ctx:oscarParser.HistogramaContext):
        pass


    # Enter a parse tree produced by oscarParser#pie_chart.
    def enterPie_chart(self, ctx:oscarParser.Pie_chartContext):
        pass

    # Exit a parse tree produced by oscarParser#pie_chart.
    def exitPie_chart(self, ctx:oscarParser.Pie_chartContext):
        pass


    # Enter a parse tree produced by oscarParser#bar_graph.
    def enterBar_graph(self, ctx:oscarParser.Bar_graphContext):
        pass

    # Exit a parse tree produced by oscarParser#bar_graph.
    def exitBar_graph(self, ctx:oscarParser.Bar_graphContext):
        pass


    # Enter a parse tree produced by oscarParser#union.
    def enterUnion(self, ctx:oscarParser.UnionContext):
        pass

    # Exit a parse tree produced by oscarParser#union.
    def exitUnion(self, ctx:oscarParser.UnionContext):
        pass


    # Enter a parse tree produced by oscarParser#intersect.
    def enterIntersect(self, ctx:oscarParser.IntersectContext):
        pass

    # Exit a parse tree produced by oscarParser#intersect.
    def exitIntersect(self, ctx:oscarParser.IntersectContext):
        pass


    # Enter a parse tree produced by oscarParser#find.
    def enterFind(self, ctx:oscarParser.FindContext):
        pass

    # Exit a parse tree produced by oscarParser#find.
    def exitFind(self, ctx:oscarParser.FindContext):
        pass


    # Enter a parse tree produced by oscarParser#import_csv.
    def enterImport_csv(self, ctx:oscarParser.Import_csvContext):
        pass

    # Exit a parse tree produced by oscarParser#import_csv.
    def exitImport_csv(self, ctx:oscarParser.Import_csvContext):
        pass


    # Enter a parse tree produced by oscarParser#export_csv.
    def enterExport_csv(self, ctx:oscarParser.Export_csvContext):
        pass

    # Exit a parse tree produced by oscarParser#export_csv.
    def exitExport_csv(self, ctx:oscarParser.Export_csvContext):
        pass


    # Enter a parse tree produced by oscarParser#length.
    def enterLength(self, ctx:oscarParser.LengthContext):
        pass

    # Exit a parse tree produced by oscarParser#length.
    def exitLength(self, ctx:oscarParser.LengthContext):
        pass


    # Enter a parse tree produced by oscarParser#min_.
    def enterMin_(self, ctx:oscarParser.Min_Context):
        pass

    # Exit a parse tree produced by oscarParser#min_.
    def exitMin_(self, ctx:oscarParser.Min_Context):
        pass


    # Enter a parse tree produced by oscarParser#max_.
    def enterMax_(self, ctx:oscarParser.Max_Context):
        pass

    # Exit a parse tree produced by oscarParser#max_.
    def exitMax_(self, ctx:oscarParser.Max_Context):
        pass


    # Enter a parse tree produced by oscarParser#concat.
    def enterConcat(self, ctx:oscarParser.ConcatContext):
        pass

    # Exit a parse tree produced by oscarParser#concat.
    def exitConcat(self, ctx:oscarParser.ConcatContext):
        pass


    # Enter a parse tree produced by oscarParser#sort.
    def enterSort(self, ctx:oscarParser.SortContext):
        pass

    # Exit a parse tree produced by oscarParser#sort.
    def exitSort(self, ctx:oscarParser.SortContext):
        pass


    # Enter a parse tree produced by oscarParser#splice.
    def enterSplice(self, ctx:oscarParser.SpliceContext):
        pass

    # Exit a parse tree produced by oscarParser#splice.
    def exitSplice(self, ctx:oscarParser.SpliceContext):
        pass


    # Enter a parse tree produced by oscarParser#userdef.
    def enterUserdef(self, ctx:oscarParser.UserdefContext):
        pass

    # Exit a parse tree produced by oscarParser#userdef.
    def exitUserdef(self, ctx:oscarParser.UserdefContext):
        pass


