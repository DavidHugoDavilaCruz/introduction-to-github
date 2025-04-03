public class Main {
    public static void main(String[] args) {
        Nombre miNombre = new Nombre("David Hugo"); // Reemplaza "TuNombre" con tu nombre
        Edad miEdad = new Edad(24); // Reemplaza 25 con tu edad

        System.out.println("Hola, mi nombre es " + miNombre.getNombre() + " y tengo " + miEdad.getEdad() + " años.");
    }
}
