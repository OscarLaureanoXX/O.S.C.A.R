# ProyectoCompiladores

## Lenguaje Oscar

---
## Version 0.2

Antes de compilar se debe descargar la herramienta [Antlr v4]
__Se recomienda seguir la [guia de instalación]__

Y se deben instalar las siguientes librerías en pip:

```python2
pip install antlr4-python2-runtime
```
---

Para compilar el archivo de la gramática (.g4) se utiliza el siguiente comando:

```java
java org.antlr.v4.Tool -Dlanguage=Python2 oscar.g4
```
O en su defecto:

```java
antlr4 -Dlanguage=Python2 oscar.g4
```
__De ahora en adelante solo se mostrarán los comandos que utilizan los aliases propuestos en la [guia de instalación]__

Para probar el lenguaje:

```python2
python2 ejecuccion.py tests/nombreArchivo.oscar
```
[Antlr v4]: https://www.antlr.org/download.html
[guia de instalación]: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md

---
Código de ejemplo del lenguaje:

```
#oscar;

main(){
  print("Hello world");
}
```
---

El lenguaje cuenta con distintas funciones especiales:

|---|---|---|
|Funcion|Descripción|Parámetros|
|concat|Une dos strings|
|sort| Regresa una lista ordenada, el tipo de ordenamiento se hace dependiendo del parámetro | Una lista, tipo ordenamiento |
|splice| Regresa una lista con los contenidos entre los dos indices proporcionados de la lista original | Una lista, dos índices |
|length| Regresa el tamaño de un string | Un string |
|length| Regresa el tamaño de una lista | Una lista |
|min| Regresa el valor mínimo de una lista | Una lista |
|max| Regresa el valor máximo de una lista | Una lista |
|mean| Regresa el promedio de los valores | Una lista |
|variance| Regresa la varianza de los valores | Una lista |
|median| Regresa el valor medio | Una lista |
|stdev| Regresa la desviación estándar de los valores | Una lista |
|head| Regresa el primer valor de la lista | Una lista |
|tail| Regresa el último valor de la lista | Una lista |
|import_csv| Carga los valores de un csv a una lista | 
|union| Regresa una nueva lista que contiene todos los elementos de las listas ignorando los repetidos | Dos listas |
|intersect| Regresa una lista con los valores que dos listas tienen en común | Dos listas |
|find| Regresa el índice en el que se encuentra el valor dentro de la lista | Una lista y un valor a buscar |
|histograma| Gráfica un histograma tomando los valores de dos listas | Dos listas |
|pie_chart| Gráfica una gráfica de pastel tomando los valores de dos listas | Dos listas |
|bar_graph| Gráfica una gráfica de barras tomando los valores de dos listas | Dos listas |
|export_csv| Exporta los contenidos de la lista hacia un archivo tipo CSV | Una lista y un nombre de archivo |