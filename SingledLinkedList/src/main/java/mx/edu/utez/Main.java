package mx.edu.utez;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.insertar(10);
        lista.insertar(20);
        lista.mostrar();
        lista.insertar(30);
        lista.mostrar();

        System.out.println(lista.buscandoANemo(10));
        System.out.println(lista.buscandoANemo(50));
    }
}