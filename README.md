# Interfaz con HBox y VBox en JavaFX

## Descripción

Este proyecto consiste en desarrollar una aplicación básica en **JavaFX** que utiliza los layouts **HBox** y **VBox** para organizar botones en la interfaz.

Se colocan dos botones en horizontal usando `HBox` y un tercer botón debajo de ellos utilizando `VBox`.

El objetivo del ejercicio es aprender a combinar distintos contenedores de JavaFX para crear interfaces estructuradas.

## Objetivos

- Crear una interfaz gráfica con JavaFX.
- Utilizar el layout `HBox` para organizar elementos en horizontal.
- Utilizar el layout `VBox` para organizar elementos en vertical.
- Combinar distintos contenedores.
- Practicar el diseño básico de interfaces.

## Funcionamiento

1. Se inicia la aplicación.
2. Se crea una ventana principal.
3. Se añade un `HBox` con dos botones en línea.
4. Debajo del `HBox` se añade un `VBox` con un tercer botón.
5. La interfaz se muestra organizada en dos niveles.

## Estructura del proyecto

```text
Proyecto/
│
├── src/
│   └── Main.java
│
├── resources/
│
└── README.md
```

## Ejemplo de interfaz

```text
+---------------------------+
|  [Botón 1]  [Botón 2]    |
|                           |
|        [Botón 3]         |
+---------------------------+
```
