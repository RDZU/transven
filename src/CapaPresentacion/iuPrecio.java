/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Precio;
import CapaNegocio.nPrecio;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class iuPrecio extends javax.swing.JInternalFrame {

    /**
     * Creates new form iuPrecio
     */
    public iuPrecio() {
        initComponents();
     this.setTitle("Gestionar Solicitudes");
       
        ((JPanel)getContentPane()).setOpaque(fal­se);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Archivo/fondo.jpg"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
        initComponents();
        nPrecio f = new nPrecio();
        f.LlenarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTarifa_Kg = new javax.swing.JTextField();
        txtTarifa_Viaje = new javax.swing.JTextField();
        txtTarifa_Km = new javax.swing.JTextField();
        txtTarifa_Viatico = new javax.swing.JTextField();
        txtSueldo_base = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarifas y sueldo"));
        jPanel1.setOpaque(false);

        jLabel5.setText("Sueldo Base");

        txtTarifa_Kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifa_KgActionPerformed(evt);
            }
        });
        txtTarifa_Kg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifa_KgKeyTyped(evt);
            }
        });

        txtTarifa_Viaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifa_ViajeActionPerformed(evt);
            }
        });
        txtTarifa_Viaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifa_ViajeKeyTyped(evt);
            }
        });

        txtTarifa_Km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifa_KmActionPerformed(evt);
            }
        });
        txtTarifa_Km.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifa_KmKeyTyped(evt);
            }
        });

        txtTarifa_Viatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifa_ViaticoActionPerformed(evt);
            }
        });
        txtTarifa_Viatico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifa_ViaticoKeyTyped(evt);
            }
        });

        txtSueldo_base.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldo_baseKeyTyped(evt);
            }
        });

        jLabel1.setText("Tarifa por Kg:");

        jLabel2.setText("Tarifa por viaje ");

        jLabel3.setText("Tarifa por Km");

        jLabel4.setText("Tarifa por viatico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTarifa_Kg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTarifa_Viaje)
                            .addComponent(txtTarifa_Km)
                            .addComponent(txtTarifa_Viatico)
                            .addComponent(txtSueldo_base, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTarifa_Kg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTarifa_Viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTarifa_Km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTarifa_Viatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSueldo_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Guardar.png"))); // NOI18N
        btnGuardar.setText("Actualizar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTarifa_KgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifa_KgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifa_KgActionPerformed

    private void txtTarifa_ViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifa_ViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifa_ViajeActionPerformed

    private void txtTarifa_KmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifa_KmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifa_KmActionPerformed

    private void txtTarifa_ViaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifa_ViaticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifa_ViaticoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtTarifa_Km.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese la tarifa por Km");
            txtTarifa_Km.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtTarifa_Kg.getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Ingrese la tarifa por Kg");
            txtTarifa_Kg.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtSueldo_base.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el Sueldo Base");
            txtSueldo_base.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtTarifa_Viaje.getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Ingrese Tarifa por viaje");
            txtTarifa_Viaje.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtTarifa_Viatico.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese la tarifa por dias de viatico");
            txtTarifa_Viatico.requestFocus();//apunta el mouse a cedula
            return;
        }

        Precio dts= new Precio();
        nPrecio func= new nPrecio();

        dts.setTarifa_Kg(Double.parseDouble(txtTarifa_Kg.getText()));
        dts.setTarifa_Km(Double.parseDouble(txtTarifa_Km.getText()));
        dts.setTarifa_viaje(Double.parseDouble(txtTarifa_Viaje.getText()));
        dts.setTarifa_viatico(Double.parseDouble(txtTarifa_Viatico.getText()));
        dts.setSueldo_base(Double.parseDouble(txtSueldo_base.getText()));
        if(func.editar(dts)){
            JOptionPane.showMessageDialog(rootPane,"Precio actualizado correctamente");
            // mostrar("");//muestra todos los registro
            // inhabilitar();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTarifa_KgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifa_KgKeyTyped
 char c=evt.getKeyChar();
          if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }          
    }//GEN-LAST:event_txtTarifa_KgKeyTyped

    private void txtTarifa_ViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifa_ViajeKeyTyped
       char c=evt.getKeyChar();
           if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    
    }//GEN-LAST:event_txtTarifa_ViajeKeyTyped

    private void txtTarifa_KmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifa_KmKeyTyped
       char c=evt.getKeyChar();
           if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    
    }//GEN-LAST:event_txtTarifa_KmKeyTyped

    private void txtTarifa_ViaticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifa_ViaticoKeyTyped
       char c=evt.getKeyChar();
           if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    
    }//GEN-LAST:event_txtTarifa_ViaticoKeyTyped

    private void txtSueldo_baseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldo_baseKeyTyped
        char c=evt.getKeyChar();
          if(Character.isLetter(c)) {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    
    }//GEN-LAST:event_txtSueldo_baseKeyTyped

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
            java.util.logging.Logger.getLogger(iuPrecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iuPrecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iuPrecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iuPrecio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iuPrecio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtSueldo_base;
    public static javax.swing.JTextField txtTarifa_Kg;
    public static javax.swing.JTextField txtTarifa_Km;
    public static javax.swing.JTextField txtTarifa_Viaje;
    public static javax.swing.JTextField txtTarifa_Viatico;
    // End of variables declaration//GEN-END:variables
}
