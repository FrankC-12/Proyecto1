/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author giubo
 */
public class WeightList {

    private WeightNode pFirst;
    private WeightNode pLast;
    private int size;

    /**
     * Constructor ListaSimple Este seria el constructor con el que se
     * inicializarian las instancias de ListaSimple
     *
     * @author Giulianna
     */
    public WeightList() {

        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    /**
     * Procedimiento DestroyList Este es el destructor para vaciar una lista por
     * completo
     *
     * @author Giulianna
     */
    public void DestroyList() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    /**
     * Funcion IsEmpty Esta es la funcion que determina si una lista esta vacia
     * o no
     *
     * @author Giulianna
     * @return boolean si es vacia o no
     */
    public boolean IsEmpty() {
        return getpFirst() == null;
    }

    /**
     * Funcion Proximo Esta funcion devolveria el siguiente nodo a un nodo dado
     *
     * @author Frank
     * @param pValue
     * @return Nodoweight el proximo
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
     * @author Giulianna
     * @return String la impresion de la lista
     */
    public String printList() {

        if (!IsEmpty()) {
            String lista_completa = "->";
            WeightNode pAct = this.getpFirst();
            while (pAct != null) {
                lista_completa += pAct.getWeight() + "\n";
                pAct = pAct.getpNext();
            }

            return lista_completa;
        }

        return "->lista vacia";

    }

    /**
     * Procedimiento pntAllelmnt Con este procedimiento se mostraria en pantalla
     * todos los elmentos de una lista
     *
     * @author Giulianna
     */
    public void pntAllelmnt() {
        WeightNode nodoTmp = pFirst;
        if (this.IsEmpty()) {
            JOptionPane.showMessageDialog(null, "The list is empty");
        }
        while (nodoTmp != null) {
            JOptionPane.showMessageDialog(null, nodoTmp.getVertex1());
            nodoTmp = nodoTmp.getpNext();
        }

    }

    /**
     * Procedimiento addAtEnd Con este procedimiento se agrega un elemento al
     * final de la lista
     *
     * @author Giulianna
     * @param node
     */
    public void addAtEnd(WeightNode node) {
        if (this.IsEmpty()) {
            addElementbegin(node);
        } else {
            WeightNode tempo = this.pLast;
            tempo.setpNext(node);
            pLast = node;
            size++;
        }
    }

    /**
     * Procedimiento addElementbegin Con este procedimiento se añade un elemento
     * al principio de la lista
     *
     * @author Frank
     * @param newNodo
     */
    public void addElementbegin(WeightNode newNodo) {
        if (this.IsEmpty()) {
            pFirst = pLast = newNodo;
        } else {
            WeightNode pNew = pFirst;
            pFirst = newNodo;
            pFirst.setpNext(pNew);

        }
        size++;

    }

    /**
     * Funcion Buscar Esta funcion devuelve el peso del arco si existe
     *
     * @author Frank
     * @param nom
     * @param nom2
     * @return int el peso
     */
    public int Buscar(String nom, String nom2) {

        WeightList aux = this;
        WeightNode auxiliar1 = this.pFirst;
        while (auxiliar1 != null) {
            if (nom.equals(aux.getpFirst().getVertex1())) {
                if (nom2.equals(aux.pFirst.getpNext().getVertex2())) {
                    return aux.getpFirst().getWeight();
                }
            }
            auxiliar1 = auxiliar1.getpNext();
        }
        return -1;
    }

    /**
     * Funcion ReturnFE Esta funcion comprueba si existe el nodo en el primer
     * elemento y lo retorna
     *
     * @author Frank,Giulianna
     * @param name
     * @return String el nombre
     */
    public String ReturnFE(String name) {
        WeightNode actual = pFirst;
        String myStr = "";

        boolean founded = false;
        while (actual != null) {
            founded = actual.getVertex2().equals(name);
            if (founded) {
                myStr += actual.getVertex1() + ",";
            }
            actual = actual.getpNext();
        }
        return myStr;
    }

    /**
     * Funcion ReturnSE Esta funcion comprueba si existe el nodo en el ultimo
     * elemento
     *
     * @author Frank,Giulianna
     * @param name
     * @return String el name
     */
    public String ReturnSE(String name) {
        String myStr = "";
        WeightNode actual = pFirst;
        boolean founded = false;
        while (actual != null) {
            founded = actual.getVertex1().equals(name);
            if (founded) {
                myStr += actual.getVertex2() + ",";
            }
            actual = actual.getpNext();
        }
        return myStr;
    }

    /**
     * Procedimiento delByNameSCE Elimina por nombre el segundo elemento
     *
     * @author Frank,Giulianna
     * @param name
     */
    public void delByNameSCE(String name) {
        WeightNode actual = pFirst;
        WeightNode anterior = null;
        boolean founded = false;
        while (actual != null && !founded) {
            founded = actual.getVertex1().equals(name);
            if (!founded) {
                anterior = actual;
                actual = actual.getpNext();
            }

        }
        if (actual != null) {
            if (actual == pFirst) {
                pFirst = actual.getpNext();
                if (actual == pFirst) {
                    pFirst = actual.getpNext();
                }
            } else {
                anterior.setpNext(actual.getpNext());
            }
            actual = null;
        }
    }

    /**
     * Procedimiento delByNameFE Elimina por nombre el primer elemento
     *
     * @author Frank,Giulianna
     * @param name
     */
    public void delByNameFE(String name) {
        WeightNode actual = pFirst;
        WeightNode anterior = null;
        boolean founded = false;
        while (actual != null && !founded) {
            founded = actual.getVertex2().equals(name);
            if (!founded) {
                anterior = actual;
                actual = actual.getpNext();
            }
        }
        if (actual != null) {
            if (actual == pFirst) {
                pFirst = actual.getpNext();
            } else {
                anterior.setpNext(actual.getpNext());
            }
            actual = null;

        }
    }

    /**
     * Funcion ExistFE Retorna si existe o no el primer elemento
     *
     * @author Frank,Giulianna
     * @param name
     * @return boolena si existe o no
     */
    public boolean ExistFE(String name) {
        WeightNode actual = pFirst;
        boolean founded = false;
        while (actual != null && !founded) {
            founded = actual.getVertex2().equals(name);
            if (!founded) {
                actual = actual.getpNext();
            }
            if (founded) {
                return true;
            }
        }
        return false;
    }

    /**
     * Funcion ExistSE Retorna si existe o no el segundo elemento
     *
     * @author Frank,Giulianna
     * @param name
     * @return
     */
    public boolean ExistSE(String name) {
        WeightNode actual = pFirst;
        boolean founded = false;
        while (actual != null && !founded) {
            founded = actual.getVertex1().equals(name);
            if (!founded) {
                actual = actual.getpNext();
            }
            if (founded) {
                return true;
            }
        }
        return false;
    }

//GETTERS Y SETTERS
    /**
     * Funcion getpFirst Esta funcion devuelve el valor pFirst
     *
     * @author Giulianna
     * @return Nodoweight pFirst
     */
    public WeightNode getpFirst() {
        return pFirst;
    }

    /**
     * Procedimiento setpFirst Con este procedimiento se le asigna un valor a
     * pFirst
     *
     * @author Giulianna
     * @param pFirst
     */
    public void setpFirst(WeightNode pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Funcion getpLast Esta funcion devuelve el valor pLast
     *
     * @author Giulianna
     * @return Nodoweight pLast
     */
    public WeightNode getpLast() {
        return pLast;
    }

    /**
     * Procedimiento setpLast Con este procedimiento se le asigna un valor a
     * pLast
     *
     * @author Giulianna
     * @param pLast
     */
    public void setpLast(WeightNode pLast) {
        this.pLast = pLast;
    }

    /**
     * Funcion getSize Esta funcion devuelve el valor size
     *
     * @author Giuliana
     * @return int size
     */
    public int getSize() {
        return size;
    }

    /**
     * Procedimiento setSize Con este procedimiento se le asigna un valor a size
     *
     * @author Giulianna
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

}
