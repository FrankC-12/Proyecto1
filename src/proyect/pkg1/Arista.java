/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class Arista {
    private String almacen_principio;
   private  String almacen_final;
    
   private  Lista_Stock stock;
   private int peso;

    public Arista(String almacen_principio, String almacen_final, int peso) {
        this.almacen_principio = almacen_principio;
        this.almacen_final = almacen_final;
        this.peso = peso;
    }

    /**
     * @return the almacen_principio
     */
    public String getAlmacen_principio() {
        return almacen_principio;
    }

    /**
     * @param almacen_principio the almacen_principio to set
     */
    public void setAlmacen_principio(String almacen_principio) {
        this.almacen_principio = almacen_principio;
    }

    /**
     * @return the almacen_final
     */
    public String getAlmacen_final() {
        return almacen_final;
    }

    /**
     * @param almacen_final the almacen_final to set
     */
    public void setAlmacen_final(String almacen_final) {
        this.almacen_final = almacen_final;
    }

    /**
     * @return the stock
     */
    public Lista_Stock getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Lista_Stock stock) {
        this.stock = stock;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
   
   
}
