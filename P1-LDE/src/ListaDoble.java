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

public boolean estaVacia(){
        return true;
}

public void agregar(int valor){
    if(this.inicio == -1 || this.fin == -1){
        inicio = datos[0];
        fin = datos[0];
        datos[0] = valor;
        libre++;
    }else {
        fin = datos[libre];
    anterior[libre] = libre -1;
    siguiente[libre] = -1;
    datos[libre] = valor;
    libre++;
    }if(libre > capacidad ){
        System.out.println("La lista está llena\n");
    }
}

public void mostrarAdelante(){
    for(int sig = 0; sig < capacidad; sig++){
        System.out.println("Dato "+sig +" : "+datos[sig]);
        System.out.println("Anterior: " +anterior[sig]);
        System.out.println("Siguiente: "+siguiente[sig]);
    }
}
}