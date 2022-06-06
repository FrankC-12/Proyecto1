/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class WeightNode {

    private WeightNode pNext;
    private int weight;
    private String Vertex1;
    private String Vertex2;

    /**
     * Procedimiento Nodoweight Constructor que se utilizara para la
     * inicializacion de los Nodoweight en el programa
     *
     * @author Giulianna
     * @param verx1
     * @param verx2
     * @param weight
     */
    public WeightNode(String verx1, String verx2, int weight) {

        this.pNext = null;
        this.weight = weight;
        this.Vertex1 = verx1;
        this.Vertex2 = verx2;

    }

    /**
     * Procedimiento Nodoweight Constructor que se utilizara para la
     * inicializacion de los Nodoweight en el programa
     *
     * @author Giulianna
     * @param verx1
     * @param verx2
     */
    public WeightNode(String verx1, String verx2) {

        this.pNext = null;
        this.weight = 0;
        this.Vertex1 = verx1;
        this.Vertex2 = verx2;

    }

    /**
     * Funcion IsEmpty Retorna si un nodo esta vacia
     *
     * @author Giulianna
     * @return boolean
     */
    public boolean IsEmpty() {
        return true;
    }

    // GETTERS Y SETTERS
    /**
     * Funcion getWeight En esta funcion se retornar el elemento weight del nodo
     *
     * @author Giulianna
     * @return int
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Procedimiento setWeight En este procediiento se le dara valor el elemento
     * weight del nodo
     *
     * @author Giulianna
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;

    }

    /**
     * Procedimiento setVertex1 En este procediiento se le dara valor el
     * elemento Vertex1 del nodo
     *
     * @author Giulianna
     * @param Vertex1 the Vertex1 to set
     */
    public void setVertex1(String Vertex1) {
        this.Vertex1 = Vertex1;
    }

    /**
     * Procedimiento setVertex2 En este procediiento se le dara valor el
     * elemento Vertex2 del nodo
     *
     * @author Giulianna
     * @param Vertex2 the Vertex2 to set
     */
    public void setVertex2(String Vertex2) {
        this.Vertex2 = Vertex2;
    }

    /**
     * Funcion getVertex1 En esta funcion se retornar el elemento Vertex1 del
     * nodo
     *
     * @author Giulianna
     * @return String
     */
    public String getVertex1() {
        return Vertex1;
    }

    /**
     * Funcion getVertex2 En esta funcion se retornar el elemento Vertex2 del
     * nodo
     *
     * @author Giulianna
     * @return String
     */
    public String getVertex2() {
        return Vertex2;
    }

    /**
     * Funcion getpNext En esta funcion se retornar el elemento pNext del nodo
     *
     * @author Giulianna
     * @return Nodoweight
     */
    public WeightNode getpNext() {
        return pNext;
    }

    /**
     * Procedimiento setpNext En este procediiento se le dara valor el elemento
     * pNext del nodo
     *
     * @author Giulianna
     * @param pNext
     */
    public void setpNext(WeightNode pNext) {
        this.pNext = pNext;
    }

    /**
     * Procedimiento setElement En este procedimiento se le dara valor el
     * elemento element del nodo
     *
     * @author Giulianna
     * @param weight
     */
    public void setElement(int weight) {
        this.setWeight(weight);
    }

}
