/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;
import proyect.pkg1.Funciones;
import proyect.pkg1.ProductsList;
import proyect.pkg1.ProductsNode;
import proyect.pkg1.Vertex;

/**
 *
 * @author andy
 */
public class Stock extends javax.swing.JFrame {
    
    public Inicio mywin;
    /**
     * Creates new form newFrame
     * @param mywin
     */
    public Stock(Inicio mywin) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mywin = mywin;
        String almacenes = mywin.listaVersx.returnAlmacenes();
        String[] almacen = almacenes.split(",");
        SelectorAlmacen.setModel(new javax.swing.DefaultComboBoxModel(almacen));
    }

    private Stock() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        SelectorAlmacen = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Producto1 = new javax.swing.JTextField();
        Producto2 = new javax.swing.JTextField();
        Producto3 = new javax.swing.JTextField();
        Producto4 = new javax.swing.JTextField();
        Cantidad4 = new javax.swing.JTextField();
        Cantidad3 = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JTextField();
        Cantidad1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 571));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jLabel3.setText("Gestión de Stock");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel22.setText("Producto:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel23.setText("Producto:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel24.setText("Producto:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel25.setText("Producto:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel13.setText("Cantidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel14.setText("Cantidad:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel29.setText("Cantidad:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel30.setText("Cantidad:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 30));

        Cancelar.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, 60));

        Aceptar.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 120, 60));

        SelectorAlmacen.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        SelectorAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SelectorAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(SelectorAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel6.setText("Almacen:");
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 140, 30));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Producto1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Producto1.setText("<Producto>");
        Producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto1ActionPerformed(evt);
            }
        });
        Producto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto1KeyTyped(evt);
            }
        });
        jPanel3.add(Producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, 30));

        Producto2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto2ActionPerformed(evt);
            }
        });
        Producto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto2KeyTyped(evt);
            }
        });
        jPanel3.add(Producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 30));

        Producto3.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Producto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto3ActionPerformed(evt);
            }
        });
        Producto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto3KeyTyped(evt);
            }
        });
        jPanel3.add(Producto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, 30));

        Producto4.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Producto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto4ActionPerformed(evt);
            }
        });
        Producto4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Producto4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Producto4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Producto4KeyTyped(evt);
            }
        });
        jPanel3.add(Producto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 30));

        Cantidad4.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Cantidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad4ActionPerformed(evt);
            }
        });
        Cantidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad4KeyTyped(evt);
            }
        });
        jPanel3.add(Cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 50, 30));

        Cantidad3.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Cantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad3ActionPerformed(evt);
            }
        });
        Cantidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad3KeyTyped(evt);
            }
        });
        jPanel3.add(Cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 50, 30));

        Cantidad2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Cantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad2ActionPerformed(evt);
            }
        });
        Cantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad2KeyTyped(evt);
            }
        });
        jPanel3.add(Cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 50, 30));

        Cantidad1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        Cantidad1.setText("0");
        Cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad1ActionPerformed(evt);
            }
        });
        Cantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidad1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad1KeyTyped(evt);
            }
        });
        jPanel3.add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 50, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 470, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/amazon-resenas-falsas-empresas-chinas.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1ActionPerformed

    private void Producto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyPressed

    private void Producto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyReleased

    private void Producto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto1KeyTyped

    private void Producto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3ActionPerformed

    private void Producto3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyPressed

    private void Producto3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyReleased

    private void Producto3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto3KeyTyped

    private void Producto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4ActionPerformed

    private void Producto4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyPressed

    private void Producto4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyReleased

    private void Producto4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto4KeyTyped

    private void Cantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2ActionPerformed

    private void Cantidad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyPressed

    private void Cantidad2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyReleased

    private void Cantidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad2KeyTyped

    private void Cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1ActionPerformed

    private void Cantidad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyPressed

    private void Cantidad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyReleased

    private void Cantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad1KeyTyped

    private void Cantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3ActionPerformed

    private void Cantidad3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyPressed

    private void Cantidad3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyReleased

    private void Cantidad3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad3KeyTyped

    private void Cantidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4ActionPerformed

    private void Cantidad4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyPressed

    private void Cantidad4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyReleased

    private void Cantidad4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad4KeyTyped

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        mywin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Vertex myver= mywin.listaVersx.SearchVertex(SelectorAlmacen.getSelectedItem().toString());
        ProductsList mylistVer= myver.getListaver();
        try{
            if (!"".equals(Producto1.getText().toUpperCase()) && !"".equals(Cantidad1.getText())){
                String a = Producto1.getText().toUpperCase();
                ProductsNode mynod = myver.getListaver().BuscarProducto(a);
                if(mynod!=null){
                    if(a.equals(mynod.getNombre())){
                        int b = Integer.parseInt(Cantidad1.getText());
                        int delb = mynod.getCantidad();
                        int bb = delb + b;
                        mynod.setCantidad(bb);
                        
                    }
                    
                }
                else{
                    int bbb = Integer.parseInt(Cantidad1.getText());
                    ProductsNode nodMine = new ProductsNode(a,bbb);
                    mylistVer.AddAtEnd(nodMine);
                }
                
            }
            if (!"".equals(Producto2.getText().toUpperCase()) && !"".equals(Cantidad2.getText())){
                String c = Producto2.getText().toUpperCase();
                ProductsNode mynod1 = myver.getListaver().BuscarProducto(c);
                if(mynod1!=null){
                    if(c.equals(mynod1.getNombre())){
                        int d = Integer.parseInt(Cantidad2.getText());
                        int deld = mynod1.getCantidad();
                        int dd = deld + d;
                        mynod1.setCantidad(dd);
                        
                        
                    }
                }
                else{
                    int ddd = Integer.parseInt(Cantidad2.getText());
                    ProductsNode nodMine2 = new ProductsNode(c,ddd);
                    mylistVer.AddAtEnd(nodMine2);
                
                }
            }
                
            if (!"".equals(Producto3.getText().toUpperCase()) && !"".equals(Cantidad3.getText())){
                String e = Producto3.getText().toUpperCase();
                ProductsNode mynod3 = myver.getListaver().BuscarProducto(e);
                if(mynod3!=null){
                    if(e.equals(mynod3.getNombre())){
                        int f = Integer.parseInt(Cantidad3.getText());
                        int delf = mynod3.getCantidad();
                        int ff = delf + f;
                        mynod3.setCantidad(ff);

                        
                    }
                }
                else{
                    int fff = Integer.parseInt(Cantidad3.getText());
                    ProductsNode nodMine3 = new ProductsNode(e,fff);
                    mylistVer.AddAtEnd(nodMine3);
                }
                
            }
            if (!"".equals(Producto4.getText()) && !"".equals(Cantidad4.getText())){
                String g = Producto4.getText();
                ProductsNode mynod4 = myver.getListaver().BuscarProducto(g);
                if(mynod4!=null){
                    if(g.equals(mynod4.getNombre())){
                        int h = Integer.parseInt(Cantidad4.getText());
                        int delh = mynod4.getCantidad();
                        int hh = delh + h;
                        mynod4.setCantidad(hh);
                        
                        
                    }
                }
                else{
                    int hhh = Integer.parseInt(Cantidad4.getText());
                    ProductsNode nodMine4 = new ProductsNode(g,hhh);
                    mylistVer.AddAtEnd(nodMine4);
                }
                
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El tipo de dato introducido es erróneo","Error!",JOptionPane.ERROR_MESSAGE);
        }
        Funciones func = new Funciones();
        func.writeTxt(mywin.listaVersx, mywin.listaSimpe);
    }//GEN-LAST:event_AceptarActionPerformed

    private void Producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2ActionPerformed

    private void Producto2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyPressed

    private void Producto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyReleased

    private void Producto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Producto2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Producto2KeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void SelectorAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectorAlmacenActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Stock().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Cantidad1;
    private javax.swing.JTextField Cantidad2;
    private javax.swing.JTextField Cantidad3;
    private javax.swing.JTextField Cantidad4;
    private javax.swing.JTextField Producto1;
    private javax.swing.JTextField Producto2;
    private javax.swing.JTextField Producto3;
    private javax.swing.JTextField Producto4;
    private javax.swing.JComboBox<String> SelectorAlmacen;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}