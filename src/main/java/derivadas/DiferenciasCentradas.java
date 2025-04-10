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
    }
}
