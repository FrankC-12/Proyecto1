/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

import javax.swing.JOptionPane;

public class VertexList {

    private Vertex pFirst;
    private Vertex pLast;
    private int size;

    public VertexList() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    public boolean IsEmpty() {
        return pFirst == null;
    }

    public void DestroyList() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    /**
     * Funcion getpFirst Con esta funcion se retorna el valor pFirst
     *
     * @author Frank,Giulianna
     * @return Vertex pFirst
     */
    public Vertex getpFirst() {
        return pFirst;
    }

    /**
     * Procedimiento setpFirst COn este procedimiento se le asigna valor a
     * pFirst
     *
     * @author Frank,Giulianna
     * @param pFirst
     */
    public void setpFirst(Vertex pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Funcion getpLast Con esta funcion se retorna el valor pLast
     *
     * @author Frank,Giulianna
     * @return Vertex pLast
     */
    public Vertex getpLast() {
        return pLast;
    }

    /**
     * Procedimiento setpLast COn este procedimiento se le asigna valor a pLast
     *
     * @author Frank,Giulianna
     * @param pLast
     */
    public void setpLast(Vertex pLast) {
        this.pLast = pLast;
    }

    /**
     * Funcion getSize Con esta funcion se retorna el valor size
     *
     * @author Frank,Giulianna
     * @return int size
     */
    public int getSize() {
        return size;
    }

    /**
     * Procedimiento setSize COn este procedimiento se le asigna valor a size
     *
     * @author Frank,Giulianna
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Funcion Proximo Esta funcion devolveria el siguiente nodo a un nodo dado
     *
     * @author Giulianna
     * @param pValue
     * @return WeightNode el proximo nodo
     */
    public WeightNode Proximo(WeightNode pValue) {

        if (pValue.getpNext() != null) {
            pValue = pValue.getpNext();
            return pValue;
        } else {
            return null;
        }
    }

    /**
     * Funcion printList Esta funcion devolveria un String en el cual estarian
     * los datos de las listas
     *
     * @author Frank,Giulianna
     * @return String la impresion de la lista
     */
    public String printList() {

        if (!IsEmpty()) {
            String lista_completa = "->";
            Vertex pAct = this.getpFirst();
            while (pAct != null) {
                lista_completa += pAct.getName() + "\n";
                pAct = pAct.getSiguiente();
            }

            return lista_completa;
        }

        return "->lista vacia";

    }

    /**
     * Procedimiento printAllElements Imprime en una lista los vertices
     *
     * @author Frank,Giulianna
     */
    public void printAllElements() {
        Vertex nodoTmp = pFirst;
        if (this.IsEmpty()) {
            JOptionPane.showMessageDialog(null, "The list is empty");
        }
        while (nodoTmp != null) {
            JOptionPane.showMessageDialog(null, nodoTmp);
            nodoTmp = nodoTmp.getSiguiente();
        }

    }

    /**
     * Procedimiento addAtEnd Agrega un vertice al final de la lista
     *
     * @author Frank,Giulianna
     * @param node
     */
    public void AddAtEnd(Vertex node) {
        if (this.IsEmpty()) {
            AddElementbegin(node);
        } else {
            Vertex tempo = this.pLast;
            tempo.setSiguiente(node);
            pLast = node;
        }
        size++;
    }

    /**
     * Procedimiento addElementbegin Agrega un vertice al principio de la lista
     *
     * @author Frank,Giulianna
     * @param newNodo
     */
    public void AddElementbegin(Vertex newNodo) {
        if (this.IsEmpty()) {
            pFirst = pLast = newNodo;
        } else {
            Vertex pNew = pFirst;
            pFirst = newNodo;
            pFirst.setSiguiente(pNew);

            size++;
        }

    }

    /**
     * Funcion Buscar Busca el vertice y devuelve su numero de vertice, si no lo
     * consigue devuelve -1
     *
     * @author Frank,Giulianna
     * @param nom
     * @return int el numero del vertice
     */
    public int Search(String nom) {

        VertexList aux = this;
        Vertex auxiliar1 = aux.getpFirst();
        while (auxiliar1 != null) {
            if (nom.equals(auxiliar1.getName())) {
                return auxiliar1.getVertexNum();
            }
            auxiliar1 = auxiliar1.getSiguiente();
        }
        return -1;
    }

    /**
     * Funcion BuscarVertex Busca en la lista y devuelve el vertice
     *
     * @author Frank,Giulianna
     * @param searched
     * @return Vertex vertice
     */
    public Vertex SearchVertex(String searched) {

        Vertex aux;
        try {
            for (aux = this.pFirst; aux != null; aux = aux.getSiguiente()) {
                if (searched.equals(aux.getName())) {
                    return aux;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    /**
     * Funcion returnAlmacenes Devuelve todos los almacenes
     *
     * @author Frank,Giulianna
     * @return String los almacenes
     */
    public String returnAlmacenes() {
        String almacenes = "";
        Vertex temp = this.pFirst;
        while (temp != null) {
            almacenes += temp.getName() + ",";
            temp = temp.getSiguiente();
        }
        return almacenes;
    }

    /**
     * Procedimiento DeleteAtEnd Elimina al final de la lista
     *
     * @author Frank,Giulianna
     */
    public void DeleteAtEnd() {
        Vertex temp = pFirst;
        if (pFirst == pLast) {
            pFirst = pLast = null;
        } else {
            while (temp.getSiguiente() != pLast) {
                temp = temp.getSiguiente();
            }
            pLast = temp;
            pLast.setSiguiente(null);
        }
    }

    /**
     * Procedimiento DeleteByName Elimina por nombre de almacen
     *
     * @author Frank,Giulianna
     * @param name
     */
    public void DeleteMyName(String name) {
        if (name.equals(this.pFirst.getName())) {
            this.pFirst = this.pFirst.getSiguiente();
        } else if (name.equals(this.pLast.getName())) {
            DeleteAtEnd();
        } else {
            int contador = 0;
            Vertex nodoTmp = this.pFirst;
            while (contador < size - 1 && nodoTmp.getSiguiente() != null) {
                if (name.equals(nodoTmp.getSiguiente().getName())) {
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente();
            }
        }
        size--;
    }

    /**
     * Funcion SumarLista Devuele un String con texto que tiene almacen y
     * productos
     *
     * @param lisver
     * @auhor Frank,Giulianna
     * @return String almacenes y productos
     */
    public String SumarLista(VertexList lisver) {

        String almacenes = "";
        Vertex temp = lisver.getpFirst();
        for (int s = 0; s < lisver.getSize(); s++) {
            almacenes += "Almacen " + temp.getName() + "\n";
            almacenes += temp.getListaver().returnInlistProducts();
            almacenes += "\n";
            temp = temp.getSiguiente();

        }
        JOptionPane.showMessageDialog(null, almacenes);
        return almacenes;

    }

}


