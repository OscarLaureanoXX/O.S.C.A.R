# ProyectoCompiladores

## Lenguaje Oscar

---

### Version 1.0

Antes de compilar se debe descargar la herramienta [Antlr v4]

__Se recomienda seguir la [guia de instalación]__

Para compilar el archivo de la gramática (.g4) se utiliza el siguiente comando:

```java
java org.antlr.v4.Tool -Dlanguage=Python2 oscar.g4
```
O en su defecto:

```java
antlr4 -Dlanguage=Python2 oscar.g4
```

De ahora en adelante solo se mostrarán los comandos que utilizan los aliases propuestos en la [guia de instalación]

Para probar el análisis léxico y sintáctico se utiliza el comando:

```python2
python oscar.py < test.oscar
```

[Antlr v4]: https://www.antlr.org/download.html
[guia de instalación]: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md