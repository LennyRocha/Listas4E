package mx.edu.utez;

public class SinglyLinkedList {
    Nodo cabeza;

    SinglyLinkedList(){
        cabeza = null;
    }

    public void insertar(Integer valor){
        Nodo nuevo = new Nodo(valor); //Crear el nuevo
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo temp = cabeza; //Seleccionar el primer nodo
            //Recorrer los nodos
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo; //Creación de un nuevo nodo
        }
    }

    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato+" -> ");
            temp = temp.siguiente;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean buscandoANemo(Integer Nemo){
        if(cabeza == null){
            System.out.print("La lista esta vacia, ");
            return false;
        }else{
            Nodo temp = cabeza;
            while (temp != null) {
                if(temp.dato.equals(Nemo)){
                    System.out.print("Aquí está Nemo, ");
                    return true;
                }else{
                    temp = temp.siguiente;
                }
            }
            System.out.print("No se encontró a Nemo, ");
        }
        return false;
    }
}
