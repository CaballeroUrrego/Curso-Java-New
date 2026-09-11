# Manipulación de Cadenas de Texto (`String`) en Java

Este proyecto contiene un ejemplo práctico sobre el uso de la clase `String` en Java y los métodos esenciales para inspeccionar, transformar y manipular cadenas de texto.

---

## 👨‍💻 Autor y Créditos

* **Desarrollador:** Caballero Urrego Dev
* **Fecha:** 07/09/2026

---

## 📌 Descripción del Proyecto

El archivo `App.java` demuestra cómo trabajar con cadenas de texto utilizando una variable de prueba con espacios de relleno al inicio y al final:

### 📌 Cadena de Ejemplo

El programa utiliza la siguiente variable de prueba con espacios en blanco de relleno para evaluar el comportamiento de cada método:

### 📌 Cadena de Ejemplo

El programa utiliza la siguiente variable de prueba con espacios en blanco de relleno para evaluar el comportamiento de cada método:



### 🛠️ Métodos Explicados en el Código

| Método | Descripción | Ejemplo en Código |
| :--- | :--- | :--- |
| `length()` | Cuenta el número total de caracteres (incluye espacios). | Mide la longitud de `texto`. |
| `charAt(index)` | Devuelve el carácter en la posición indicada (desde `0`). | Obtiene el primer carácter. |
| `substring(start, end)` | Extrae un texto desde `start` hasta `end - 1`. | Corta desde la posición 5 a la 15. |
| `toLowerCase()` | Convierte todo el texto a minúsculas. | Pasa la cadena a minúsculas. |
| `toUpperCase()` | Convierte todo el texto a MAYÚSCULAS. | Pasa la cadena a mayúsculas. |
| `indexOf(target)` | Busca la posición donde inicia una palabra/carácter. | Busca la palabra `"variable"`. |
| `replace(old, new)` | Reemplaza un texto por otro nuevo. | Cambia `"texto"` por `"parrafo"`. |
| `contains(target)` | Verifica si contiene un texto (`true`/`false`). | Busca si contiene `"asignado"`. |
| `trim()` | Elimina espacios sobrantes al inicio y al final. | Quita espacios en los bordes. |


# ☕ Fundamentos de Java & Operadores

Bienvenido a la bitácora de aprendizaje y código del curso **Java desde Cero** por **serg code**. En este espacio se exploran los conceptos fundamentales del lenguaje Java, desde la declaración de variables hasta la implementación de lógica booleana y tablas de la verdad.

---

## 📌 Descripción del Proyecto

Este proyecto reúne ejercicios prácticos y explicaciones conceptuales para comprender el funcionamiento interno de Java. Se abarcan temas esenciales como:

* **Sintaxis y Estructura:** Uso de métodos principales (`main`) y manejo de archivos `.java`.
* **Operadores Aritméticos:** Operaciones elementales (`+`, `-`, `*`, `/`) y cálculo de residuo o paridad mediante el operador módulo (`%`).
* **Tipos de Datos:** Manejo de enteros (`int`), decimales (`double`) y tipos booleanos (`boolean`)[cite: 1].
* **Operadores de Asignación:** Modificación rápida de variables (`+=`, `-=`, `*=`, `/=`, `++`, `--`)[cite: 1].
* **Operadores de Comparación:** Evaluación relacional (`>`, `<`, `==`) que retornan valores booleanos[cite: 1].
* **Lógica Booleana:** Compuertas y lógica mediante los operadores `&&`, `||` y `!`[cite: 1].

---
## 📊 Tabla de la Verdad (Guía de Referencia)

| Operación | Operador en Java | Condición para ser Verdadero (`true`) | Ejemplo | Resultado |
| :--- | :---: | :--- | :--- | :---: |
| **AND** (Y) | `&&` | Ambos operandos deben ser `true` | `true && true`<br>`true && false` | **`true`**<br>**`false`** |
| **OR** (Ó) | `\|\|` | Al menos uno de los operandos debe ser `true` | `true \|\| false`<br>`false \|\| false` | **`true`**<br>**`false`** |
| **NOT** (NO) | `!` | Invierte el valor actual (de `true` a `false` y viceversa) | `!true`<br>`!false` | **`false`**<br>**`true`** |



## 10/09/2026
## Estructuras de control :
## Explicación del Código: Estructuras de Control en Java

Este programa demuestra el uso de **estructuras condicionales relacionales y lógicas** (`if`, `else if`, `else`) para evaluar el acceso de un usuario a un establecimiento según su edad.

### Flujo de Lógica:
* **`edad > 18 && edad <= 60`**: Permite el ingreso regular para personas en el rango de 19 a 60 años.
* **`edad > 60`**: Restringe el acceso a personas mayores de 60 años.
* **`edad == 18`**: Permite el acceso exacto a los 18 años con recordatorio de identificación.
* **`else`**: Deniega el acceso a menores de 18 años.

