/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class ProductsNode {
    private String nombre;
    private int cantidad;
    private ProductsNode proximo;
    private int tamanio;

    /**
     * Procedimiento Nodo_productos
     * Constructor que se utilizara para inicializar todas las instancias de un
     * Nodo_productos en el programa
     * @author Frank
     * @param nombre
     * @param cantidad 
     */
    
    public ProductsNode(String nombre, int cantidad){
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.proximo = null;
    this.tamanio = 0;
    }
    
    /**
     * Funcion getNombre
     * Con esta funcion se retornaria el elemento nombre de un Nodo_productos
     * @author Frank
     * @return String
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Procedimiento setNombre
     * Con esto se le asignaria un valor al elemento nombre de un Nodo_productos
     * @author Frank
     * @param nombre
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Funcion getCantidad
     * Con esta funcion se retornaria el elemento cantidad de un Nodo_productos
     * @author Frank
     * @return int
     */
    
    public int getCantidad() {
        return cantidad;
    }
    /**
     * Procedimiento setCantidad
     * Con esto se le asignaria un valor al elemento cantidad de un Nodo_productos
     * @author Frank
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Funcion getProximo
     * Con esta funcion se retornaria el elemento proximo de un Nodo_productos
     * @author Frank
     * @return Nodo_productos
     */
    public ProductsNode getProximo() {
        return proximo;
    }

    /**
     * Procedimiento setProximo
     * Con esto se le asignaria un valor al elemento proximo de un Nodo_productos
     * @author Frank
     * @param proximo
     */
    public void setProximo(ProductsNode proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
}


