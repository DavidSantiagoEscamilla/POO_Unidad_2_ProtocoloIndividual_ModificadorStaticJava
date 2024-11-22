package EjemploCuatro.ParteUno;

public class Main {
    public static void main(String[] args) {
    Contador c1 = new Contador();
    Contador c2 = new Contador();
    Contador c3 = new Contador();
    // Se accede al método estático usando el nombre de la clase
    Contador.mostrarContador(); // Muestra: Contador global: 3
    }
}