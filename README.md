# 📐 Derivación Numérica con el Método de Diferencias Centradas

Este proyecto implementa en Java una herramienta para aproximar derivadas de funciones reales mediante el **método de diferencias centradas**, una técnica clásica de análisis numérico. Está pensado como trabajo práctico para la materia **Analisis Numerico** y sirve como base para extender hacia análisis matemático computacional.

---

## 🧠 ¿Qué es el método de diferencias centradas?

El método de diferencias centradas permite **aproximar la derivada de una función** a partir de valores discretos. Se define como:

\[
f'(x) \approx \frac{f(x + h) - f(x - h)}{2h}
\]

Donde:
- \( f(x) \): es la función a derivar,
- \( h \): es un pequeño incremento (paso),
- \( f'(x) \): es la derivada aproximada en el punto \( x \).

Este método es más preciso que el de diferencias hacia adelante o hacia atrás, ya que toma información **a ambos lados del punto**.

---

## 🛠️ Estructura del proyecto

```bash
diferenciasCentradas/
├── src/
│   └── DiferenciasCentradas.java
├── README.md
└── .gitignore
