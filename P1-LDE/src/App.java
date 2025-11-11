public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // Ejercicio 5: Prueba en Main
        System.out.println("Creando ListaDoble con capacidad 10");
        ListaDoble lista = new ListaDoble(10);

        // Agregar al menos 5 números
        System.out.println("\nAgregando 5 números: 10, 20, 30, 40, 50");
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("\nMostrando listas:");
        lista.mostrarAdelante();
    }
}
