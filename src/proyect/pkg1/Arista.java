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

    private int almacen_origen;
    private int almacen_destino;
    private int peso;


    public Arista(int origen, int destino, int peso) {
        this.almacen_origen = origen;
        this.almacen_destino = destino;
        this.peso = peso;

    }

    /**
     * @return the almacen_origen
     */
    public int getAlmacen_origen() {
        return almacen_origen;
    }

    /**
     * @param almacen_origen the almacen_origen to set
     */
    public void setAlmacen_origen(int almacen_origen) {
        this.almacen_origen = almacen_origen;
    }

    /**
     * @return the almacen_destino
     */
    public int getAlmacen_destino() {
        return almacen_destino;
    }

    /**
     * @param almacen_destino the almacen_destino to set
     */
    public void setAlmacen_destino(int almacen_destino) {
        this.almacen_destino = almacen_destino;
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