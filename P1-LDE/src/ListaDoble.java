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
    for(int i= 0; i<capacidad; i++){
        anterior[i]=-1;
        siguiente[i]= -1;
    }
}

//la Lista está vacía si el inicio es nulo (-1)
public boolean estaVacia(){
        return inicio == -1;
}

//La lista está llena si libre = capacidad
public boolean estaLlena(){
    return libre == capacidad;
}

//se pasa por parametro un valor para agregar un elemento
public void agregar(int valor){
    //Si está llena no nos deja agregar y sale del metodo
    if (estaLlena()) {
            System.out.println("Error: La lista está llena. No se puede agregar " + valor);
            return;
        }
        
        // Guardamos el valor
        datos[libre] = valor;

        // Enlazamos el nodo a la Lista, dependiendo del estado
        if (estaVacia()) {
            //Inicio y fin serian 0 al ser el primer nodo
            inicio = libre;
            fin = libre;
            // 'anterior' y 'siguiente' ya están en -1 por la inicialización.
        } else {
            // Si ya hay elementos, lo agregamos al final.
            // El 'siguiente' del que era el último (fin) ahora es el nuevo.
            siguiente[fin] = libre;
            
            // El 'anterior' del nuevo es el que era el último (fin).
            anterior[libre] = fin;
            
            // El 'siguiente' del nuevo es -1 (es el nuevo último).
            // siguiente[libre] = -1;

            // Actualizamos 'fin' para que apunte al nuevo último elemento.
            fin = libre;
        }

        // Aumentamos 'libre' para la próxima vez
        libre++;
}

public void mostrarAdelante() {
    //si esta vacia solo imprimimos un mensaje
        if (estaVacia()) {
            System.out.println("Lista vacía.");
            return;
        }

        System.out.print("Lista (Adelante): ");
        // Empezamos en el 'inicio (0)'
        int actual = inicio;
        
        // Recorremos mientras el índice actual no sea -1 (nulo)
        while (actual != -1) {
            //Esto imprime los nodos anterior y siguiente para guiarme con los enlaces
            System.out.print("["+anterior[actual]+"]" + datos[actual] + "["+siguiente[actual]+"]"+ "-> ");
            // Saltamos al siguiente usando el arreglo 'siguiente'
            actual = siguiente[actual];
        }
        System.out.println("FIN");
    }
    //no digas giladas pa
}