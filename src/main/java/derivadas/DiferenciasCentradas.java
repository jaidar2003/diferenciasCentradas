<<<<<<< HEAD
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Scanner;

public class DiferenciasCentradas {

    // Evalúa una función en un punto x usando exp4j
    public static double evaluarFuncion(String funcion, double x) {
        Expression e = new ExpressionBuilder(funcion)
                .variable("x")
                .build()
                .setVariable("x", x);
        return e.evaluate();
    }

    // Aproximación de la derivada con diferencias centradas
    public static double derivada(String funcion, double x, double h) {
        return (evaluarFuncion(funcion, x + h) - evaluarFuncion(funcion, x - h)) / (2 * h);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la función en términos de x (ej: sin(3*x), x^2 + 2*x, exp(x)):");
        String funcion = scanner.nextLine();

        System.out.print("Ingresa el valor de x en el que deseas derivar: ");
        double x = scanner.nextDouble();

        System.out.print("Ingresa el valor de h (paso): ");
        double h = scanner.nextDouble();

        double resultado = derivada(funcion, x, h);
        System.out.println("Derivada aproximada de f(x) = " + funcion + " en x = " + x + " es: " + resultado);
=======
public class DiferenciasCentradas {

    // Función que queremos derivar
    public static double f(double x) {
        return Math.sin(x); // ← FUNCION ACTUAL

        // return Math.cos(x);           // Derivada: -sin(x)
        // return Math.exp(x);           // Derivada: exp(x)
        // return Math.log(x);           // Derivada: 1/x (x > 0)
        // return Math.pow(x, 2);        // Derivada: 2x
        // return Math.pow(x, 3);        // Derivada: 3x^2
        // return 1 / x;                 // Derivada: -1 / x^2 (x ≠ 0)
        // return Math.tan(x);           // Derivada: 1 / cos^2(x) (x ≠ π/2 + kπ)
        // return Math.abs(x);           // Derivada: No derivable en x = 0, pero vale ±1 fuera de ahí
        // return Math.sqrt(x);          // Derivada: 1 / (2√x) (x > 0)
    }

    // Aproximación de la derivada con diferencias centradas
    public static double derivada(double x, double h) {
        return (f(x + h) - f(x - h)) / (2 * h);
    }

    public static void main(String[] args) {
        double x = Math.PI / 4; // Cambiar este valor según la función
        double h = 0.001; // Tamaño del paso

        double derivadaAprox = derivada(x, h);

        System.out.println("Derivada aproximada en x = " + x + ": " + derivadaAprox);

>>>>>>> 1bda11f532b79500ad77d12d8dd12a2715f9ac4f
    }
}
