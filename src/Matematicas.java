public class Matematicas {
    //Método estático para la suma
    public static double suma(double a, double b) {
        return a + b;
    }

    //Método estático para la resta
    public static double resta(double a, double b) {
        return a - b;
    }

    //Método estático para la multiplicación
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    //Método estático para la división
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("La división por cero no está permitida.");
        }
        return a / b;
    }
}

//Clase de prueba
class PruebaMatematicas {
    public static void main(String[] args) {
        //Pruebas de los métodos estáticos
        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + Matematicas.suma(num1, num2));
        System.out.println("Resta: " + Matematicas.resta(num1, num2));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(num1, num2));
        System.out.println("División: " + Matematicas.division(num1, num2));

        //Prueba de división por cero
        try {
            System.out.println("División por cero: " + Matematicas.division(num1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
