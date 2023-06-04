/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaNegocio.nRespaldarBDD;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class iuMenu extends javax.swing.JFrame {

    /**
     * Creates new form iuMenu
     */
    public iuMenu() {
        initComponents();
        mnRestaurar.setVisible(false);
        this.setExtendedState(iuInicio.MAXIMIZED_BOTH);//abarque toda la pantalla
        this.setTitle(" Menu Principal");
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        mnUsuario = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnSolicitud = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        mnChofer = new javax.swing.JMenuItem();
        mnVehiculo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnEstacionamiento = new javax.swing.JMenuItem();
        menuEstadisticas = new javax.swing.JMenu();
        mnEstadisticas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnReportes = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        mnRestaurar = new javax.swing.JMenuItem();
        mnRespaldar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bienvenido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("jLabel2");

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("jLabel3");

        lblAcceso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceso.setText("jLabel4");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Acceso:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula:");

        lblCedula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcceso)
                    .addComponent(lblCedula)
                    .addComponent(lblApellido)
                    .addComponent(lblNombre))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAcceso))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Escritorio.add(jPanel1);
        jPanel1.setBounds(40, 430, 242, 210);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/empleados.png"))); // NOI18N
        menuUsuario.setMnemonic('e');
        menuUsuario.setText("Usuario");

        mnUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/user_business_close_32.png"))); // NOI18N
        mnUsuario.setText("Configuracion de Usuarios");
        mnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(mnUsuario);

        menuBar.add(menuUsuario);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/proveedores_m.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Clientes y Solicitudes");

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/cliente_m.png"))); // NOI18N
        mnCliente.setMnemonic('c');
        mnCliente.setText("Gestionar Clientes");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        helpMenu.add(mnCliente);

        mnSolicitud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/documento.png"))); // NOI18N
        mnSolicitud.setMnemonic('a');
        mnSolicitud.setText("Gestionar Solicitud");
        mnSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSolicitudActionPerformed(evt);
            }
        });
        helpMenu.add(mnSolicitud);

        menuBar.add(helpMenu);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/chofer.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Choferes y vehiculos");

        mnChofer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/choferuno.png"))); // NOI18N
        mnChofer.setText("Gestionar Choferes ");
        mnChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChoferActionPerformed(evt);
            }
        });
        fileMenu.add(mnChofer);

        mnVehiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/gandola.png"))); // NOI18N
        mnVehiculo.setText("Gestionar Vehiculos");
        mnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVehiculoActionPerformed(evt);
            }
        });
        fileMenu.add(mnVehiculo);

        menuBar.add(fileMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/estacionamiento.png"))); // NOI18N
        jMenu1.setText("Estacionamiento");

        mnEstacionamiento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnEstacionamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Estacionar.png"))); // NOI18N
        mnEstacionamiento.setText("Gestionar Estacionamiento");
        mnEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstacionamientoActionPerformed(evt);
            }
        });
        jMenu1.add(mnEstacionamiento);

        menuBar.add(jMenu1);

        menuEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/ventasrealizadas1.png"))); // NOI18N
        menuEstadisticas.setText("Estadisticas");

        mnEstadisticas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/comprasdetalladas.png"))); // NOI18N
        mnEstadisticas.setText("Consultar Estadisticas");
        mnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstadisticasActionPerformed(evt);
            }
        });
        menuEstadisticas.add(mnEstadisticas);

        menuBar.add(menuEstadisticas);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/report.png"))); // NOI18N
        jMenu4.setText("Reportes");

        mnReportes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Listar.png"))); // NOI18N
        mnReportes.setText("Generar Reportes");
        mnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportesActionPerformed(evt);
            }
        });
        jMenu4.add(mnReportes);

        menuBar.add(jMenu4);

        menuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/cog1.png"))); // NOI18N
        menuSistema.setText("Configuracion del Sistema");

        mnRestaurar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/restaurar.png"))); // NOI18N
        mnRestaurar.setText("Restaurar BDD");
        mnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRestaurarActionPerformed(evt);
            }
        });
        menuSistema.add(mnRestaurar);

        mnRespaldar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        mnRespaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Database.png"))); // NOI18N
        mnRespaldar.setText("Respaldar BDD");
        mnRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRespaldarActionPerformed(evt);
            }
        });
        menuSistema.add(mnRespaldar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/coins.png"))); // NOI18N
        jMenuItem1.setText("Actualizar Precio ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSistema.add(jMenuItem1);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRestaurarActionPerformed
   //    NewJFrame n= new NewJFrame();
   //    Escritorio.add(n);
   //    n.setVisible(true);
   //    n.toFront();
    }//GEN-LAST:event_mnRestaurarActionPerformed

    private void mnRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRespaldarActionPerformed
        nRespaldarBDD res=new nRespaldarBDD();
        Escritorio.add(res);
      res.setVisible(true);
      res.toFront();
        
    }//GEN-LAST:event_mnRespaldarActionPerformed

    private void mnSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSolicitudActionPerformed
       iuSolicitud form = new iuSolicitud();
       Escritorio.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_mnSolicitudActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
      iuCliente form= new iuCliente();
      Escritorio.add(form);
      form.toFront();
      form.setVisible(true);
     // iuCliente.txtCedula_usuario.setText(lblCedula.getText());
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChoferActionPerformed
iuChofer form = new iuChofer();
Escritorio.add(form);
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_mnChoferActionPerformed

    private void mnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVehiculoActionPerformed
       iuVehiculo form= new iuVehiculo();
       Escritorio.add(form);
       form.toFront();
       form.setVisible(true);
    }//GEN-LAST:event_mnVehiculoActionPerformed

    private void mnEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstacionamientoActionPerformed
       iuEstacionamiento form = new iuEstacionamiento();
       Escritorio.add(form);
       form.toFront();
       form.setVisible(true);
               
    }//GEN-LAST:event_mnEstacionamientoActionPerformed

    private void mnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportesActionPerformed
     iuReportes form = new iuReportes();
     Escritorio.add(form);
    form.toFront();
     form.setVisible(true);
    }//GEN-LAST:event_mnReportesActionPerformed

    private void mnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuarioActionPerformed
        iuUsuario form=new iuUsuario();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_mnUsuarioActionPerformed

    private void mnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstadisticasActionPerformed
        iuEstadistica form= new iuEstadistica();
        Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_mnEstadisticasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      iuPrecio form= new iuPrecio();
      Escritorio.add(form);
       form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(iuMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iuMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iuMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iuMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iuMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblCedula;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuEstadisticas;
    public static javax.swing.JMenu menuSistema;
    public static javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem mnChofer;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnEstacionamiento;
    private javax.swing.JMenuItem mnEstadisticas;
    private javax.swing.JMenuItem mnReportes;
    private javax.swing.JMenuItem mnRespaldar;
    private javax.swing.JMenuItem mnRestaurar;
    private javax.swing.JMenuItem mnSolicitud;
    private javax.swing.JMenuItem mnUsuario;
    private javax.swing.JMenuItem mnVehiculo;
    // End of variables declaration//GEN-END:variables

}
