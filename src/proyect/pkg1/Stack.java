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
public class Stack {
   private StackNode cima;
   private int in;
    
    
    /**
     * Procedimiento Stack
     * Constructor que se utilizara para inicializar una pila en el programa
     * @author Frank,Giulianna
     */
    
    public Stack()
    {
        this.cima = null;
        this.in = 0;        
    }

    /**
     * Funcion getCima
     * En esta funcion se retorna el elemento cima de la pila
     * @author Frank,Giulianna
     * @return StackNode la cima
     */
    
    public StackNode getCima() {
        return cima;
    }

     /**
     * Procedimiento setCima
     * En este procedimiento se le asigna un valor al elemento cima de la pila
     * @author Frank,Giulianna
     * @param cima 
     */
    
    public void setCima(StackNode cima) {
        this.cima = cima;
    }

     /**
     * Funcion getIn
     * En esta funcion se retorna el elemento in de la pila
     * @author Frank,Giulianna
     * @return int tamaño de la pila
     */
    
    
    public int getIn() {
        return in;
    }

     /**
     * Procedimiento setIn
     * En este procedimiento se le asigna un valor al elemento in de la pila
     * @author Frank,Giulianna
     * @param in 
     */
    
    public void setIn(int in) {
        this.in = in;
    }
    
     /**
     * Procedimiento Destructor
     * Este procedimiento se usa para dejar vacia una pila
     * @author Frank,Giulianna
     */
    
    
    public void Destructor(){
        this.in = 0;
        this.cima = null;
    }
    
    /**
     * Funcion IsEmpty
     * Esta funcion retorna un boolean con el cual se identifica si una pila esta
     vacia
     * @author Frank,Giulianna
     * @return boolean si la pila esta vacia
     */
    
    public boolean IsEmpty(){
        return cima == null;
    }
    
    /**
     * Funcion Cima
     * Devuelve el elemento del nodo que es la cima de la pila
     * @author Frank,Giulianna
     * @return Vertex el elemento 
     */
    
    public Vertex Cima(){
        return cima.getElemento();
    }
    
    /**
     * Procedimiento Apilar
     * En este procedimiento se apila un nuevo elemento a la pila
     * @author Frank
     * @param inf 
     */
    
    public void Apilar(Vertex inf){
        
        StackNode pNew = new StackNode(inf);
        pNew.setSiguiente(cima);
        cima = pNew;
        in ++;
        
    }
    
    /**
     * Funcion isEmpty
     * Se utiliza para determinar si una pila esta vacia
     * @author Giulianna
     * @return boolean true
     */
    
    public boolean isEmpty(){
        return true;
    }
    
    /**
     * Funcion Desapilar
     * Se utiliza para desapilar elementos en la pila 
     * @author Frank,Giulianna
     * @return Vertex el elemento que se desapilo
     */
    
    public Vertex Desapilar(){
        
        StackNode aux = this.cima;
        if (this.IsEmpty()) {
             JOptionPane.showMessageDialog(null, "Error! La pila esta vacia!");
        }else {
            this.cima = this.cima.getSiguiente();
            this.in--;
        }
        
        return aux.getElemento();         
       
    }
    
    /**
     * Funcion Invertir
     * Se utiliza para voltear una pila y retornarla
     * @author Frank
     * @return Pila la pila invertida
     */
    
    public Stack Invertir(){
        Stack nueva = new Stack();
        
        while(!this.IsEmpty()){
            nueva.Apilar(this.Desapilar());
        }
        
        return nueva;
    }
}
 

