/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class Lista_Stock <T> {
     private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista_Stock() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    //PRIMITIVAS
    public boolean isEmpty() {
        return pFirst == null;
    }

    public void InitialInsert(T data) {
        Nodo<T> nuevo = new Nodo(data);
        if (isEmpty()) {
            pFirst = nuevo;
            pLast = nuevo;
        } else {
            Nodo aux = pFirst;
            nuevo.setPnext(aux);
            pFirst = nuevo;
        }
        size += 1;

    }
    
    public void FinalInsertNodo(Nodo nodito) {
        if (isEmpty()) {
            pFirst = nodito;
            pLast = nodito;
        } else {
            Nodo aux = pLast;
            aux.setPnext(nodito);
            pLast = nodito;
        }
        size += 1;

    }


    public void InitialInsertNodo(Nodo nodito) {
        if (isEmpty()) {
            pFirst = nodito;
            pLast = nodito;
        } else {
            Nodo aux = pFirst;
            nodito.setPnext(aux);
            pFirst = nodito;
        }
        size += 1;

    }


    public int getPosicion(Nodo nodito) {
        if (!isEmpty()) {
            Nodo aux = pFirst;
            int contador = 1;
            while (aux != nodito) {
                contador++;
                aux = aux.getPnext();
            }
            return contador;
        } else {
            return -1;
        }
    }

    public Nodo getNodo(int pos) {
        if (!isEmpty()) {
            if (pos == size){
                return pLast;
            }else if (pos == 1){
                return pFirst;
            }else{
                Nodo aux = pFirst;
            for (int i = 0; i < pos-1; i++) {
                aux = aux.getPnext();
            }
             return aux;
           }
           
        } else {
            return null;
        }
    }
    

    public T SearchGetValue(int pos) {
        if (!isEmpty() && pos <= size && pos > 0) {
            Nodo aux = pFirst;
            while (aux != null) {
                if (getPosicion(aux) == pos) {
                    return (T) aux.getNombre_Almacen();

                } else {
                    aux = aux.getPnext();
                }
            }
        } else {
            System.out.println("La lista esta vacia o la posicion no es valida");
        }
        return null;
    }

    
}
