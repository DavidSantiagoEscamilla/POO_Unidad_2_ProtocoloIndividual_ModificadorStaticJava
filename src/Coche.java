public class Coche {
    //Atributos de la clase
    private String marca;
    private String modelo;

    //Atributo estático para contar las instancias
    private static int contadorCoches = 0;

    //Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        //Incrementa el contador cada vez que se crea un objeto
        contadorCoches++;
    }

    //Método estático
    public static int mostrarContadorCoches() {
        return contadorCoches;
    }

    //Método toString para mostrar la información del coche
    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
    }


    //Main para probar la clase
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Focus");
        Coche coche3 = new Coche("Honda", "Civic");

        //Mostrar la información de cada coche
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        //Mostrar cuántos coches se han creado
        System.out.println("Coches creados: " + Coche.mostrarContadorCoches());
    }
}
