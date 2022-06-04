/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class Queue {
   
    private QueueNode cimaCola;
    private QueueNode ultimoCola;
    
    
    /**
     * constructor
     * Este es el contructor que sirve como base para inicializar las colas
     * @author Frank,Giulianna
     */
    
    public Queue(){
        this.cimaCola=null;
        this.ultimoCola=null;
    }
    
       /**
     * Funcion QueueIsEmpty
     * Esta funcion se utiliza para determinar si una cola que se esta usando tiene elementos o no
     * @author Frank,Giulianna
     * @return boolean si la cola esta vacia o no
     */
    
    public boolean QueueIsEmpty(){
        return this.cimaCola==null;
    }
    
     /**
     * Funcion desencolar
     * Esta funcion se utiliza para desencolar elementos en una cola designada, dependiendo del caso
     si la cola no esta vacia se le dara a cimaCola el valor del siguiente al cimaCola anterior, si esta
     vacia no se hace nada a la estructura de la cola
     * @author Frank,Giulianna
     * @return NodoCola el nodo desencolado
     */
    
    public QueueNode desencolar(){
        QueueNode aux= this.cimaCola;
        if(!QueueIsEmpty()){
            try{
                aux = this.cimaCola;
                this.cimaCola = this.cimaCola.getSiguiente();
                aux.setSiguiente(null);
            }
            catch(Exception e){
                aux = this.cimaCola;
            }
        }
        else{
            aux=null;
        }
        return aux;
    }
    
    /**
     * Procedimeinto insertar
     * En este procedimiento se añade un elemento al final de la cola, solo de esta manera
     debido a la naturaleza de las colas, si la cola esta vacia solo se añade el elmento
     y se le asigna el valor cimaCola, si no esta vacia entonces se cambia ultimoCola al nuevo
     elemento incluido
     * @author Frank,Giulianna
     * @param elemento 
     */
    
    public void insertar(Vertex elemento){
        QueueNode nodo= new QueueNode(elemento);
        if(QueueIsEmpty()){
            this.cimaCola=nodo;
        }
        else{
            this.ultimoCola.setSiguiente(nodo);
        }
        this.ultimoCola = nodo;
    }
}


