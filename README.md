# Guía APE-6: Arreglos y Listas

Ejercicios en Java de la guía práctica **SW-AyLP-APE-06: Arreglos y Listas**, de la asignatura **Algoritmos y Lógica de Programación**.

## Datos

| | |
|---|---|
| **Universidad** | Universidad Técnica de Ambato (UTA) |
| **Facultad** | Ingeniería en Sistemas, Electrónica e Industrial |
| **Carrera** | Software |
| **Nivel y paralelo** | Primero - B |
| **Estudiante** | Valeria Valentina Ortiz Mosquera |
| **Docente** | José Caiza Caizabuano |
| **Ciclo académico** | Julio 2026 - Diciembre 2026 |

## Objetivo

Conocer el manejo de arreglos y listas que permiten la manipulación de grandes cantidades de datos.

## Estructura del proyecto

```
Guia-Ape-6/
├── README.md
└── src/
    ├── Ejercicio1.java
    ├── Ejercicio2.java
    ├── Ejercicio3.java
    ├── Ejercicio4.java
    ├── Ejercicio5.java
    └── Ejercicio6.java
```

## Ejercicios

### Sección 1: Declaración e índices

| Archivo | Descripción |
|---|---|
| `Ejercicio1.java` | Declaración e índices: crea el arreglo `edades = {18, 21, 19, 25, 30}`, imprime el primer elemento, cambia el índice 2 por el valor 22 y muestra el último elemento usando `length`. |
| `Ejercicio2.java` | Recorrido inverso: recorre de atrás hacia adelante, con un ciclo `for`, el arreglo de texto de los días de la semana (Lunes a Viernes). |

### Sección 2: Operaciones y entrada de datos

| Archivo | Descripción |
|---|---|
| `Ejercicio3.java` | Suma y promedio: calcula la suma total y el promedio exacto, con decimales, del arreglo `notas = {14, 16, 12, 19}`. |
| `Ejercicio4.java` | Control de gastos semanales y ajuste por inflación: lee los gastos de 7 días, calcula el total y el promedio, aplica un 10 % de aumento a los días que superaron el promedio, muestra el arreglo en orden inverso y cuenta los días con incremento. |
| `Ejercicio5.java` | Filtro y suma condicionada de producción: lee 10 turnos, suma las piezas de los índices pares, cuenta los turnos con cantidad impar mayor a 15 y muestra el promedio general con 2 decimales. |
| `Ejercicio6.java` | Análisis de asistencia y rendimiento: lee las notas (validadas entre 0 y 20) de `n` estudiantes, calcula el promedio, cuenta aprobados (nota ≥ 14) y reprobados, y lista los estudiantes con nota por debajo del promedio. |

## Requisitos

- JDK 11 o superior (probado con JDK 21).

## Cómo ejecutar

Desde la carpeta raíz del proyecto:

```bash
# Compilar todos los ejercicios
javac -d out src/*.java

# Ejecutar un ejercicio (cambia el número)
java -cp out Ejercicio1
```

También se puede ejecutar un archivo directamente (JDK 11 o superior):

```bash
java src/Ejercicio1.java
```

Los ejercicios 4, 5 y 6 piden datos por teclado. Los números decimales se escriben con el separador que use la configuración regional del equipo (punto o coma).

## Ejemplos de salida

**Ejercicio 1**

```
Primer elemento: 18
Índice 2 modificado: 22
Último elemento: 30
```

**Ejercicio 3**

```
Suma total: 61
Promedio: 15.25
```

**Ejercicio 4** (gastos: 10, 20, 15, 30, 5, 25, 12)

```
Gasto total: 117.00
Promedio diario: 16.71
Arreglo actualizado (orden inverso):
Día 7: 12.00
Día 6: 27.50
Día 5: 5.00
Día 4: 33.00
Día 3: 15.00
Día 2: 22.00
Día 1: 10.00
Días con incremento: 3
```

**Ejercicio 5** (piezas: 12, 17, 8, 21, 10, 15, 20, 19, 6, 13)

```
Suma en índices pares: 56
Turnos impares > 15: 3
Promedio general: 14.10
```

**Ejercicio 6** (n = 5, notas: 15, 8, 19, 12, 14)

```
Promedio general: 13.60
Aprobados: 3
Reprobados: 2
Estudiantes bajo el promedio:
Estudiante 2 (nota 8)
Estudiante 4 (nota 12)
```

## Autora

Valeria Valentina Ortiz Mosquera, estudiante de Software, Universidad Técnica de Ambato.
