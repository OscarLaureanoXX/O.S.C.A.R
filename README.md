# ProyectoCompiladores

## Lenguaje Oscar 1.0

---
## Developers

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

## Usuarios

---

El lenguaje se desarrolló para distribuciones de Linux con Python2
(aunque se puede correr en MacOs y Windows)
La guía de uso está diseñada para distribuciones de Linux con Python2

---

Para utilizar O.S.C.A.R es necesario contar con las siguientes librerias instaladas:

```python2
pip install numpy
pip install matplotlib
```
---

Al descargar el repositorio puedes colocar tus archivos a correr en el directorio tests
Para ejecutar tu código desde una terminal de estilo Unix necesitas ejecutar el siguiente
comando:
```
python2 ejecuccion.py tests/[tu programa].oscar
```

---
Código de ejemplo del lenguaje:

```
#oscar;
	var 
    	int a, b, c;
        list C;

main(){
  var 
  	float text;
  C = [1,2,3,4];
  text = "Print a string";
  print("Hello world");
  print(text);
}
```
---
Variables:
Las variables se pueden declarar dentro de las funciones (sólo pueden usarse en la función) o pueden declararse al inicio del programa y utilizarlas en cualquie función (global)
```
# oscar;
	var
    	int A; //Global
main(){
	var
    	int a; //Local
}
```
---
Expresiones:
Podemos realizar distintas expresiones aritméticas de manera "normal". Donde la jerarquía es (1 siendo el de más alta importancia):
|Operador|Orden|
|--------|-----|
|()|1|
|* / % | 2 |
|+ - | 3 |
| < > >= <= == != && or  | 4 |

```
# oscar;
main(){
	var
    	int float
        ;
    a = 10 * 2 ( 12 + 1 * 3) / 3;
}
```
---
Listas:
Podemos realizar distintas funciones de listas
|Función|Descripción|Parámetros|
|-------|-----------|----------|
|concat|Une dos strings| Lista 1 y Lista 2
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
|union| Regresa una nueva lista que contiene todos los elementos de las listas ignorando los repetidos | Dos listas |
|intersect| Regresa una lista con los valores que dos listas tienen en común | Dos listas |
|find| Regresa el índice en el que se encuentra el valor dentro de la lista | Una lista y un valor a buscar |
```
# oscar;
	var
  		list L = [0,1,2,3,4];
  		list M = [0,1,2,3,4];
main(){
	var
    	list Y;
	Y = concat(a, b);
    print(Y); //"hola mundo"
}
```
---
Graficas:
Podemos realizar distintos tipos de gráficos mandando listas como parámetros

|Función|Descripción|Parámetros|
|-------|-----------|----------|
|histograma| Gráfica un histograma tomando los valores de dos listas | Lista y Cantidad de Bins |
|pie_chart| Gráfica una gráfica de pastel tomando los valores de dos listas | Dos listas |
|bar_graph| Gráfica una gráfica de barras tomando los valores de dos listas | Dos listas |

```
# oscar;
	var
  		list L = [0,1,2,3,4];
  		list M = [0,1,2,3,4];
main(){
    pie_chart(L, M); // Aqui hace la gráfica
}
```
