public class UsoIncorrectoStatic {
    // Atributo no estático
    private static int contador = 0;

    // Método estático intentando acceder al atributo no estático
    public static void incrementarContador() {
        contador++; // Error de compilación
    }

    public static void main(String[] args) {
        // Llamar al método estático
        incrementarContador();
    }
}
