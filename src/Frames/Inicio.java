/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;
import proyect.pkg1.Dijkstra;
import proyect.pkg1.Funciones;
import proyect.pkg1.WeightList;
import proyect.pkg1.VertexList;
import proyect.pkg1.Grafo;
import proyect.pkg1.WeightNode;
import proyect.pkg1.Recorrido;
import proyect.pkg1.Vertex;
import org.graphstream.graph.Graph;

/**
 *
 * @author andy
 */
public class Inicio extends javax.swing.JFrame {
    public Grafo matrixre;
    public WeightList listaSimpe;
    public VertexList listaVersx;
    public Inicio window; 
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        Funciones func = new Funciones();
        
        listaVersx = func.Leer_matrix("test//lista.txt");
        listaSimpe = func.Leer_txt("test//lista.txt",listaVersx);
        matrixre = new Grafo (listaVersx,listaSimpe,listaVersx.getSize(),listaVersx.getSize());
        
        Vertex aux = listaVersx.getpFirst();
        while(aux!=null){
            matrixre.newVertex(aux);
            aux=aux.getSiguiente();
        }
        WeightNode pesa=listaSimpe.getpFirst();
        while(pesa!=null){
            matrixre.newArc(pesa.getVertex1(), pesa.getVertex2(), pesa.getWeight());
            pesa=pesa.getpNext();
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoAlmacen = new javax.swing.JButton();
        imprimirGrafo = new javax.swing.JButton();
        eliminarAlmacen = new javax.swing.JButton();
        agregarStock = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mostrarBFS = new javax.swing.JButton();
        mostrarDFS = new javax.swing.JButton();
        pedido = new javax.swing.JButton();
        algoritmoDijskstra = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevoAlmacen.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        nuevoAlmacen.setText("Nuevo almacen");
        nuevoAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 40));

        imprimirGrafo.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        imprimirGrafo.setText("Imprimir grafo");
        imprimirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(imprimirGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 40));

        eliminarAlmacen.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        eliminarAlmacen.setText("Eliminar almacen");
        eliminarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 40));

        agregarStock.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        agregarStock.setText("Agregar al Stock");
        agregarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarStockActionPerformed(evt);
            }
        });
        getContentPane().add(agregarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, -1, -1));

        mostrarBFS.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        mostrarBFS.setText("BFS");
        mostrarBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBFSActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 40));

        mostrarDFS.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        mostrarDFS.setText("DFS");
        mostrarDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDFSActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 40));

        pedido.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        pedido.setText("Hacer pedido");
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 190, 40));

        algoritmoDijskstra.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        algoritmoDijskstra.setText("Dijskstra");
        algoritmoDijskstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoritmoDijskstraActionPerformed(evt);
            }
        });
        getContentPane().add(algoritmoDijskstra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, 40));

        cargar.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        getContentPane().add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 40));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Salir.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/amazon-logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlmacenActionPerformed
        this.setVisible(false);
        AgregarAlmacen dis = new AgregarAlmacen(this);
        dis.setVisible(true);
    }//GEN-LAST:event_nuevoAlmacenActionPerformed

    private void imprimirGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirGrafoActionPerformed
        try{
            Graph grafico = getMatrixre().MotrarGraph();
           
            getMatrixre().CrearNodes(grafico);
            getMatrixre().CrearEdges(grafico);}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se puede crear el grafo", "Negativo", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_imprimirGrafoActionPerformed

    private void eliminarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAlmacenActionPerformed
        try{
            DeleteEl delW = new DeleteEl(this);
            delW.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No puede eliminarse", "Negativo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarAlmacenActionPerformed

    private void agregarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarStockActionPerformed
        try{
            this.setVisible(false);
            Stock dis = new Stock(this);
            dis.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No puede agregarse el almacen", "Error terrible", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
        }
    }//GEN-LAST:event_agregarStockActionPerformed

    private void mostrarBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBFSActionPerformed
        Recorrido reco=new Recorrido();    
        String s = reco.ReporteAlmacenBFS(matrixre,listaVersx);
        JOptionPane.showMessageDialog(null, s);
        reco.SetTrueBFS(matrixre, listaVersx);
    }//GEN-LAST:event_mostrarBFSActionPerformed

    private void mostrarDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDFSActionPerformed
        Recorrido reco=new Recorrido();    
        String s = reco.ReporteAlmacenDFS(matrixre,listaVersx);
        JOptionPane.showMessageDialog(null, s);
        reco.SetTrueDFS(matrixre, listaVersx);
        reco.SetTrueBFS(matrixre, listaVersx);
    }//GEN-LAST:event_mostrarDFSActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        this.setVisible(false);
        Pedido dis = new Pedido(this);
        dis.setVisible(true);
    }//GEN-LAST:event_pedidoActionPerformed

    private void algoritmoDijskstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoritmoDijskstraActionPerformed
      
        
        Dijkstra J=new Dijkstra(2, matrixre);
        J.caminosMinimos();
        JOptionPane.showMessageDialog(null, J.Print(matrixre,1));
        
        
    }//GEN-LAST:event_algoritmoDijskstraActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        this.setVisible(false);
        NewCargar dis = new NewCargar(this);
        dis.setVisible(true);
    }//GEN-LAST:event_cargarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton agregarStock;
    private javax.swing.JButton algoritmoDijskstra;
    private javax.swing.JButton cargar;
    private javax.swing.JButton eliminarAlmacen;
    private javax.swing.JButton imprimirGrafo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton mostrarBFS;
    private javax.swing.JButton mostrarDFS;
    private javax.swing.JButton nuevoAlmacen;
    private javax.swing.JButton pedido;
    // End of variables declaration//GEN-END:variables

    /**
     * @param matrixre the matrixre to set
     */
    public void setMatrixre(Grafo matrixre) {
        this.matrixre = matrixre;
    }

    /**
     * @param listaSimpe the listaSimpe to set
     */
    public void setListaSimpe(WeightList listaSimpe) {
        this.listaSimpe = listaSimpe;
    }

    /**
     * @param listaVersx the listaVersx to set
     */
    public void setListaVersx(VertexList listaVersx) {
        this.listaVersx = listaVersx;
    }

    /**
     * @return the matrixre
     */
    public Grafo getMatrixre() {
        return matrixre;
    }

    /**
     * @return the listaSimpe
     */
    public WeightList getListaSimpe() {
        return listaSimpe;
    }

    /**
     * @return the listaVersx
     */
    public VertexList getListaVersx() {
        return listaVersx;
    }
}
