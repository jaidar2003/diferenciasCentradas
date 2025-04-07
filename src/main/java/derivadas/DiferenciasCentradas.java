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

    }
}
