/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class QueueNode {
     private Vertex elemento;
     private QueueNode siguiente;
    
    /**
     * Constructor NodoCola
     * Constructor que se utilizara para inicializar las instancias de los 
     nodos de las colas
     * @author Giulianna
     * @param x 
     */
    
    public QueueNode (Vertex x){
        elemento=x;
        siguiente=null;
    }

    /**
     * Funcion getElemento
     * Con esta funcion se retornara el elemento
     * @author Giulianna
     * @return Vertex
     */
    public Vertex getElemento() {
        return elemento;
    }

     /**
     * Procedimiento setElemento
     * Con este procedimiento se le da un valor a la variable elemento
     * @author Giulianna
     * @param elemento the elemento to set
     */
    public void setElemento(Vertex elemento) {
        this.elemento = elemento;
    }

     /**
     * Funcion getSiguiente
     * Con esta funcion se obtiene el siguiente a un nodo
     * @author Giuliana
     * @return the siguiente
     */
    public QueueNode getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente
     * Con este procedimiento se le da el valor a el siguiente de un nodo
     * @author Giulianna
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(QueueNode siguiente) {
        this.siguiente = siguiente;
    }
}


