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
public class ProductsList {

    private ProductsNode primer_producto;
    private ProductsNode siguiente;
    private int size;

    /**
     * Procedimiento ProductList Es el constructor mediante el cual se
     * inicializaran las instancias de esta clase
     *
     * @author Frank.Giulianna
     */
    public ProductsList() {
        this.primer_producto = null;
        this.siguiente = null;
        this.size = 0;

    }

    /**
     * Funcion returnInlistProducts Retorna un String con los datos de la lista
     *
     * @author Frank,Giulianna
     * @return String productos
     */
    public String returnInlistProducts() {
        String toPrint = "";
        ProductsNode nodoTmp = this.getPrimer_producto();
        if (this.IsEmpty()) {
            toPrint = "The list is empty";
        }
        while (nodoTmp != null) {
            toPrint += "Producto: " + nodoTmp.getNombre() + "  Cantidad: " + nodoTmp.getCantidad() + "\n";
            nodoTmp = nodoTmp.getProximo();
        }
        return toPrint;
    }

    /**
     * Funcion IsEmpty verifica si una lista esta vacia
     *
     * @author Frank,Giulianna
     * @return boolean si esta vacia o no
     */
    public boolean IsEmpty() {
        return this.primer_producto == null;
    }

    /**
     * Procedimiento AddElementbegin Agrega un elemento al principio de la lista
     *
     * @author Frank,Giulianna
     * @param newNodo
     */
    public void AddElementbegin(ProductsNode newNodo) {
        if (this.IsEmpty()) {
            this.primer_producto = this.siguiente = newNodo;
        } else {
            ProductsNode pNew = primer_producto;
            primer_producto = newNodo;
            primer_producto.setProximo(pNew);
        }
        size++;
    }

    /**
     * Procedimiento AddAtEnd Agrega un elemento al final de la lista
     *
     * @author Frank,Giulianna
     * @param node
     */
    public void AddAtEnd(ProductsNode node) {
        if (this.IsEmpty()) {
            AddElementbegin(node);
        } else {
            ProductsNode tempo = this.getUltimo_producto();
            tempo.setProximo(node);
            siguiente = node;
            size++;
        }
    }

    /**
     * Procedimiento pntAllelmntinList Imprime un String con los elemento de la
     * lista
     *
     * @author Frank,Giulianna
     */
    public void pntAllelmntinList() {
        String toPrint = "";
        ProductsNode nodoTmp = this.getPrimer_producto();
        if (this.IsEmpty()) {
            JOptionPane.showMessageDialog(null, "The list is empty");
        }
        while (nodoTmp != null) {
            toPrint += "Producto: " + nodoTmp.getNombre() + " Cantidad: " + nodoTmp.getCantidad() + "\n";
            nodoTmp = nodoTmp.getProximo();
        }
        JOptionPane.showMessageDialog(null, toPrint);
    }

    /**
     * Funcion BuscarProducto Busca si un elemento con el mismo nombre dado esta
     * en la lista
     *
     * @author Frank,Giulianna
     * @param searched
     * @return Nodo_productos producto buscado
     */
    public ProductsNode BuscarProducto(String searched) {

        ProductsNode aux;
        try {
            for (aux = this.getPrimer_producto(); aux != null; aux = aux.getProximo()) {
                if (searched.equals(aux.getNombre())) {
                    return aux;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    /**
     * Funcion getPrimer_producto Retorna el atriburo primer_producto
     *
     * @author Frank,Giulianna
     * @return the primer_producto
     */
    public ProductsNode getPrimer_producto() {
        return primer_producto;
    }

    /**
     * Procedimiento setPrimer_producto Se le asigna un valor a primer_producto
     *
     * @author Frank,Giulianna
     * @param primer_producto the primer_producto to set
     */
    public void setPrimer_producto(ProductsNode primer_producto) {
        this.primer_producto = primer_producto;
    }

    /**
     * Funcion getUltimo_producto Retorna el atriburo siguiente
     *
     * @author Frank,Giulianna
     * @return the ultimo_producto
     */
    public ProductsNode getUltimo_producto() {
        return siguiente;
    }

    /**
     * Procedimiento setUltimo_producto Se le asigna un valor a siguiente
     *
     * @author Frank,Giulianna
     * @param ultimo_producto the ultimo_producto to set
     */
    public void setUltimo_producto(ProductsNode ultimo_producto) {
        this.siguiente = ultimo_producto;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    public ProductsList addVarios(ProductsList lispro, String a, int b, String c, int d, String e, int f, String g, int h) {
        ProductsNode nodPro = new ProductsNode (a, b);
        ProductsNode nodPro1 = new ProductsNode (c, d);
        ProductsNode  nodPro2 = new ProductsNode (e, f);
        ProductsNode nodPro3 = new ProductsNode (g, h);
        if (a != null) {
            lispro.AddAtEnd(nodPro);
        }
        if (c != null) {
            lispro.AddAtEnd(nodPro1);
        }
        if (e != null) {
            lispro.AddAtEnd(nodPro2);
        }
        if (g != null) {
            lispro.AddAtEnd(nodPro3);
        }
        return lispro;
    }

}


