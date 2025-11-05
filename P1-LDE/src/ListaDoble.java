public class ListaDoble {
    private int[] datos;          // almacena los valores
    private int[] siguiente;      // almacena el índice del siguiente nodo
    private int[] anterior;       // almacena el índice del nodo anterior
    private int inicio;           // índice del primer elemento
    private int fin;              // índice del último elemento
    private int libre;            // índice del próximo espacio libre
    private int capacidad;        // tamaño máximo de la lista

public ListaDoble(int capacidad) {
    this.capacidad = capacidad;
    datos = new int[capacidad];
    siguiente = new int[capacidad];
    anterior = new int[capacidad];
    inicio = -1;
    fin = -1;
    libre = 0;
}
}