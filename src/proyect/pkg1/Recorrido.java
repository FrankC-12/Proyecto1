/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author giubo
 */
public class Recorrido {

    private int[][] pesos;
    private int[][] traza;
    private int[][] d;
    private String[][] almacenes;
    private int n;
    private int origen;
    private Grafo matrix;
    private int size;

    /**
     * Procedimiento Recorrido Se utilizara para inicializar una instancia de la
     * clase
     *
     * @author Frank,Giulianna
     * 
     */
    public Recorrido() {

    }

    public Recorrido(int s, Grafo matrix) {
        this.matrix = matrix;
        this.size = matrix.getVertices().getSize();
        this.origen = s;
    }

    /**
     * Funcion ReporteAlmacenDFS Realiza una busqueda en profundidad
     *
     * @author Frank,Giulianna
     * @param matrix
     * @param lisver
     * @return String el recorrido
     */
    public String ReporteAlmacenDFS(Grafo matrix, VertexList lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Stack pila = new Stack();
        String reporte = "<html><b>Tipo de Recorrido DFS (Depth-first search)-Busqueda en profundidad:</b><html>" + "\n";
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while (!pila.IsEmpty()) {
            vertice = pila.Desapilar();
            reporte += "Almacen: " + vertice.getName() + "\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo = matrix.getPeso().ReturnFE(vertice.getName());
            String primero = matrix.getPeso().ReturnSE(vertice.getName());
            String joint = primero + segundo;
            String[] jointvar = joint.split(",");
            for (int i = 0; i < jointvar.length; i++) {
                String st = jointvar[i];
                Vertex temporal = matrix.getVertices().SearchVertex(st);
                if (!temporal.isVisitado()) {
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
        return reporte;
    }

    /**
     * Procedimiento SetTrueDFS Realiza una busqueda en profundidad
     *
     * @author Frank,Giulianna
     * @param matrix
     * @param lisver
     */
    public void SetTrueDFS(Grafo matrix, VertexList lisver)//PROFUNDIDAD usar pila
    {
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Stack pila = new Stack();
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        pila.Apilar(pTemp);
        while (!pila.IsEmpty()) {
            vertice = pila.Desapilar();
            String segundo = matrix.getPeso().ReturnFE(vertice.getName());
            String primero = matrix.getPeso().ReturnSE(vertice.getName());
            String joint = primero + segundo;
            String[] jointvar = joint.split(",");
            for (int i = 0; i < jointvar.length; i++) {
                String st = jointvar[i];
                Vertex temporal = matrix.getVertices().SearchVertex(st);
                if (!temporal.isVisitado()) {
                    temporal.setVisitado(true);
                    pila.Apilar(temporal);
                }
            }
        }
    }

    /**
     * Funcion ReporteAlmacenBFS Se realiza la busqueda en anchura
     *
     * @author Frank,Giulianna
     * @param matrix
     * @param lisver
     * @return String el recorrido en anchura
     */
    public String ReporteAlmacenBFS(Grafo matrix, VertexList lisver)//ANCHURA usar cola
    {
        Queue cola = new Queue();
        String reporte = "<html><b>Tipo de Recorrido BFS (Breadth-first search)-Busqueda en Anchura:</b><html>" + "\n";
        JLabel label = new JLabel(reporte);
        label.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        //INICIA DESDE EL ALMACEN DE MENOR ID
        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);

        while (!cola.QueueIsEmpty()) {
            vertice = cola.desencolar().getElemento();

            reporte += "Almacen: " + vertice.getName() + "\n";
            reporte += vertice.getListaver().returnInlistProducts();
            reporte += "\n";
            String segundo = matrix.getPeso().ReturnFE(vertice.getName());
            String primero = matrix.getPeso().ReturnSE(vertice.getName());
            String joint = primero + segundo;
            String[] jointvar = joint.split(",");
            for (int i = 0; i < jointvar.length; i++) {
                String st = jointvar[i];
                Vertex temporal = matrix.getVertices().SearchVertex(st);
                if (!temporal.isVisitado()) {
                    temporal.setVisitado(true);
                    cola.insertar(temporal);
                }
            }
        }

        return reporte;
    }

    /**
     * Procedimiento SetTrueBFS Se realiza la busqueda en anchura
     *
     * @author Frank,Giulianna
     * @param matrix
     * @param lisver
     */
    public void SetTrueBFS(Grafo matrix, VertexList lisver)//ANCHURA usar cola
    {
        Queue cola = new Queue();

        Vertex pTemp = matrix.getVertices().getpFirst();
        Vertex vertice;
        pTemp.setVisitado(true);
        cola.insertar(pTemp);

        while (!cola.QueueIsEmpty()) {
            vertice = cola.desencolar().getElemento();

            String segundo = matrix.getPeso().ReturnFE(vertice.getName());
            String primero = matrix.getPeso().ReturnSE(vertice.getName());
            String joint = primero + segundo;
            String[] jointvar = joint.split(",");
            for (int i = 0; i < jointvar.length; i++) {
                String st = jointvar[i];
                Vertex temporal = matrix.getVertices().SearchVertex(st);
                if (temporal.isVisitado()) {
                    temporal.setVisitado(false);
                    cola.insertar(temporal);
                }
            }
        }
    }

    public Recorrido(Grafo matrix, VertexList lisver) {
        n = lisver.getSize();
        int[][] P = new int[n][n];
        String[][] F = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                P[i][j] = matrix.adyacentebynum(i, j);
                F[i][j] = matrix.getVerbyint(i).getName();
            }

        }

        pesos = P;
        almacenes = F;
        d = new int[n][n];
        traza = new int[n][n];
        this.matrix = matrix;

    }

    public String Print(Grafo matrix, int v, int vj) {

        String st = "";
        int anterior = traza[v][vj];
        if (anterior != -1) {
            st += " Almacen " + matrix.getVerbyint(vj).getName() + " ----> ";
            st += Print(matrix, v, anterior);

        } else {
            st += " Almacen " + matrix.getVerbyint(v).getName();
        }
        return st;

    }

    /**
     * Funcion RetornarMatriz Retorna una matriz para estudiar si es la correcta
     *
     * @author Frank
     * @return
     */
    public String RetornarMatriz() {
        String aux = "";
        for (int i = 0; i < this.n; i++) {
            String line = "";
            for (int j = 0; j < this.n; j++) {
                line += "\t" + "| " + this.traza[i][j] + " |" + "\t";
            }
            aux += line + "\n";

        }

        return aux;

    }

    /**
     * Funcion getPesos Se retorna el elemento pesos
     *
     * @author Frank,Giulianna
     * @return the pesos
     */
    public int[][] getPesos() {
        return pesos;
    }

    /**
     * Procedimiento setPesos Se le asigna valor a el elemento pesos
     *
     * @author Frank,Giulianna
     * @param pesos the pesos to set
     */
    public void setPesos(int[][] pesos) {
        this.pesos = pesos;
    }

    /**
     * Funcion getTraza Se retorna el elemento traza
     *
     * @author Frank,Giulianna
     * @return the traza
     */
    public int[][] getTraza() {
        return traza;
    }

    /**
     * Procedimiento setTraza Se le asigna valor a el elemento traza
     *
     * @author Frank,Giulianna
     * @param traza the traza to set
     */
    public void setTraza(int[][] traza) {
        this.traza = traza;
    }

    /**
     * Funcion getAlmacenes Se retorna el elemento almacenes
     *
     * @author Frank,Giulianna
     * @return the almacenes
     */
    public String[][] getAlmacenes() {
        return almacenes;
    }

    /**
     * Procedimiento setAlmacenes Se le asigna valor a el elemento almacenes
     *
     * @author Frank,Giulianna
     * @param almacenes the almacenes to set
     */
    public void setAlmacenes(String[][] almacenes) {
        this.almacenes = almacenes;
    }
}
