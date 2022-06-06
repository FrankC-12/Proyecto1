/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */

public class Vertex {

    private String name;
    private ProductsList listaver;
    private int vertexNum;
    private int maxvertexNum;
    private Vertex siguiente;
    private boolean visitado;

    /**
     * Procedimiento Vertex Contructor con el que se inicializarian instancia de
     * Vertex
     *
     * @author Frank y Giulianna
     * @param x
     */
    public Vertex(String x) {
        name = x;
        vertexNum = -1;
        this.visitado = false;

    }

    /**
     * Procedimiento Vertex Contructor con el que se inicializarian instancia de
     * Vertex
     *
     * @author Frank y Giulianna
     * @param x
     * @param listaver
     */
    public Vertex(String x, ProductsList listaver) {
        this.name = x;
        this.listaver = listaver;
        vertexNum = 3;
        this.visitado = false;
        this.maxvertexNum = -1;
    }

    /**
     * Funcion vertexEquals Dice si el nombre es igual al nombre del vertice que
     * le pasas
     *
     * @author Frank y Giulianna
     * @param i
     * @return boolean si el nombre es igual o no
     */
    public boolean vertexEquals(Vertex i) {
        return getName().equals(i.getName());
    }

    /**
     * Procedimiento assingVtx Le asigna el mismo valor numerico a dos atributos
     *
     * @author Frank y Giulianna
     * @param n
     */
    public void assingVtx(int n) {
        this.setVertexNum(n);
        this.setRealvertexNum(n);
    }

    /**
     * Funcion isVisitado Dice si el vertice fue visitado en el proceso de
     * Dijsktra
     *
     * @author Frank,Giulianna
     * @return the Visitado
     */
    public boolean isVisitado() {
        return visitado;
    }
    
    //GETTERS Y SETTERS

    /**
     * Funcion getName Funcion en la cual se retorna el elemento name
     *
     * @author Frank y Giulianna
     * @return the name
     */

    public String getName() {
        return name;
    }

    /**
     * Procedimiento setName Se le asigna un valor al elemento name
     *
     * @author Frank y Giulianna
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Funcion getVertexNum Funcion en la cual se retorna el elemento vertexNum
     *
     * @author Frank, Giulianna
     * @return the vertexNum
     */
    public int getVertexNum() {
        return vertexNum;
    }

    /**
     * Procedimiento setVertexNum Se le asigna un valor al elemento vertexNum
     *
     * @author Frank, Giulianna
     * @param vertexNum the vertexNum to set
     */
    public void setVertexNum(int vertexNum) {
        this.vertexNum = vertexNum;
    }

    /**
     * Funcion getListaver Funcion en la cual se retorna el elemento listaver
     *
     * @author Frank,Giulianna
     * @return the listaver
     */
    public ProductsList getListaver() {
        return listaver;
    }

    /**
     * Procedimiento setListaver Se le asigna un valor al elemento listaver
     *
     * @author Frank,Giulianna
     * @param listaver the listaver to set
     */
    public void setListaver(ProductsList listaver) {
        this.listaver = listaver;
    }

    /**
     * Funcion getSiguiente Funcion en la cual se retorna el elemento siguiente
     *
     * @author Frank,Giulianna
     * @return the siguiente
     */
    public Vertex getSiguiente() {
        return siguiente;
    }

    /**
     * Procedimiento setSiguiente Se le asigna un valor al elemento siguiente
     *
     * @author Frank,Giulianna
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Vertex siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Procedimiento setVisitado Se le asigna un valor booleano a el elemento
     * Visitado
     *
     * @author Frank,Giulianna
     * @param Visitado the Visitado to set
     */
    public void setVisitado(boolean Visitado) {
        this.visitado = Visitado;
    }

    /**
     * Funcion getRealvertexNum Funcion en la cual se retorna el elemento
     * realvertexNum
     *
     * @author Frank,Giulianna
     * @return the realvertexNum
     */
    public int getRealvertexNum() {
        return maxvertexNum;
    }

    /**
     * Procedimiento setRealvertexNum Se le asigna un valor al elemento
     * realvertexNum
     *
     * @author Frank,Giulianna
     * @param realvertexNum the realvertexNum to set
     */
    public void setRealvertexNum(int realvertexNum) {
        this.maxvertexNum = realvertexNum;
    }

}
