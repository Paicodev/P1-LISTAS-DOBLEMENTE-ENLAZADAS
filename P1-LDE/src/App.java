public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListaDoble ld1 = new ListaDoble(4);

        ld1.agregar(1);
        ld1.agregar(5);
        ld1.agregar(7);
        ld1.agregar(2);
        ld1.mostrarAdelante();
    }
}
