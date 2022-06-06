/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyect.pkg1.Funciones;
import proyect.pkg1.Grafo;
import org.graphstream.graph.Graph;

/**
 *
 * @author andy
 */
public class DeleteEl extends javax.swing.JFrame {
    public Inicio mywin;
    /**
     * Creates new form DeleteEl
     * @param mywin
     */
    public DeleteEl(Inicio mywin) {
        this.mywin = mywin;
        this.setLocationRelativeTo(null);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String almacenes = mywin.listaVersx.returnAlmacenes();
        String[] almacen = almacenes.split(",");
        Selector.setModel(new javax.swing.DefaultComboBoxModel(almacen));
    }

    private DeleteEl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selector = new javax.swing.JComboBox<>();
        borrarElemento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(286, 150));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Selector.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        Selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorActionPerformed(evt);
            }
        });
        getContentPane().add(Selector, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, 40));

        borrarElemento.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        borrarElemento.setText("Borrar");
        borrarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarElementoActionPerformed(evt);
            }
        });
        getContentPane().add(borrarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 110, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jLabel1.setText("Elemento a Eliminar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 240, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/nhs-las-empresas-baneadas-de-amazon-presentan-una-demanda-por-apropiacion-indebida-de-sus-fondos.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectorActionPerformed

    private void borrarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarElementoActionPerformed

        try{
            int counter = 0;
                
                mywin.listaVersx.DeleteByName(Selector.getSelectedItem().toString());
            for(;counter<12;counter++){
                mywin.listaSimpe.delByNameFE(Selector.getSelectedItem().toString());
                mywin.listaSimpe.delByNameSCE(Selector.getSelectedItem().toString());
            }
            String almacenes = mywin.listaVersx.returnAlmacenes();
            String[] almacen = almacenes.split(",");

            Grafo matrix = new Grafo (mywin.listaVersx,mywin.listaSimpe,mywin.listaSimpe.getSize(),mywin.listaVersx.getSize());


            Graph grafico = matrix.MotrarGraph();
            matrix.CrearNodes(grafico);
            matrix.CrearEdges(grafico);
            
            
            for (String almacen1 : almacen) {
                if (!mywin.listaSimpe.ExistFE(almacen1)) {
                    throw new Exception();
                }
            }
            Funciones func = new Funciones();
            func.writeTxt(mywin.listaVersx, mywin.listaSimpe);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hay un vertice aislado,reiniciando todo el programa");
            Inicio newWin=new Inicio();
            newWin.setVisible(true);
            mywin.dispose();
        }
    
    }//GEN-LAST:event_borrarElementoActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteEl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Selector;
    private javax.swing.JButton borrarElemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
