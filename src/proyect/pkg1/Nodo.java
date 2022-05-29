/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect.pkg1;

/**
 *
 * @author giubo
 */
public class Nodo <T> {
    private T Nombre_Almacen;
    private T ID;
    public String productos [][];
    private Nodo pnext;
    
     // Constructor cuando se que quiero que guarde mi Nodo pero no se a que quiero que apunte
    public Nodo(T Nombre_Almacen) {
        this.Nombre_Almacen =  Nombre_Almacen ;
        this.ID = ID;
        this.pnext = null;
        
    }
    // constructor cuando no se a que quiero que apunte mi Nodo y no se a que quiero que apunte
    public Nodo(){
        this.Nombre_Almacen  = Nombre_Almacen;
        this.productos = productos;
        this.pnext = null;
    }

    /**
     * @return the Nombre_Almacen
     */
    public T getNombre_Almacen() {
        return Nombre_Almacen;
    }

    /**
     * @param Nombre_Almacen the Nombre_Almacen to set
     */
    public void setNombre_Almacen(T Nombre_Almacen) {
        this.Nombre_Almacen = Nombre_Almacen;
    }

    /**
     * @return the ID
     */
    public T getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(T ID) {
        this.ID = ID;
    }

    /**
     * @return the pnext
     */
    public Nodo getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }

    /**
     * @return the productos
     */
    public String [][] getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(String[][] productos) {
        this.productos = productos;
    }
   
    
    
}