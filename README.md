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
<<<<<<< HEAD
python antlr.py test.oscar
=======
python2 antlr.py tests/nombreArchivo.oscar
>>>>>>> master
```

[Antlr v4]: https://www.antlr.org/download.html
[guia de instalación]: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md