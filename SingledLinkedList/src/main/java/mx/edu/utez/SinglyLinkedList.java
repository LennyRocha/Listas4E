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
            while (temp.getSiguiente() != null) {
                temp.setSiguiente(temp);
            }
            temp.setSiguiente(nuevo); //Creación de un nuevo nodo
        }
    }

    public void mostrar(){
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato()+" -> ");
            temp = temp.getSiguiente();
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
                if(temp.getDato().equals(Nemo)){
                    System.out.print("Aquí está Nemo, ");
                    return true;
                }else{
                    temp = temp.getSiguiente();
                }
            }
            System.out.print("No se encontró a Nemo, ");
        }
        return false;
    }
}
