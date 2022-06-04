/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class StackNode {
     private Vertex elemento;
    private StackNode siguiente;
    
    
    /**
     * Constructor NodoPila
     * Constructor que se utilizaara al inicializar un nodo de una pila en el 
     programa
     * @author Giulianna
     * @param x 
     */
    
    public StackNode(Vertex x){
        elemento=x;
        siguiente=null;
    }
 /**
     * Funcion getElemento
     * En esta funcion se retornaria el elemento de un NodoPila
     * @author Giulianna
     * @return Vertex
     */
    public Vertex getElemento() {
        return elemento;
    }

    /**
     * Procedimiento setElemento
     * Con este procedimiento se le asignaria un valor a el elemento de un NodoPila
     * @author Giulianna
     * @param elemento
     */
    public void setElemento(Vertex elemento) {
        this.elemento = elemento;
    }

   /**
     * Funcion getSiguiente
     * En esta funcion se retornaria el siguiente nodo de un NodoPila
     * @author Giulianna
     * @return NodoPila
     */
    
    public StackNode getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente
     * Con este procedimiento se le asignaria un valor a el siguiente nodo
     de un NodoPila
     * @author Giulianna
     * @param siguiente
     */
    public void setSiguiente(StackNode siguiente) {
        this.siguiente = siguiente;
    }
}


