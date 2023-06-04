/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Chofer;
import CapaDatos.Kilometraje;
import CapaDatos.Vehiculo;
import CapaNegocio.nChofer;
import CapaNegocio.nKilometraje;
import CapaNegocio.nVehiculo;
import javax.print.event.PrintJobEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class iuKilometraje extends javax.swing.JInternalFrame {
public static String Numero_solicitud;
    /**
     * Creates new form iuKilometraje
     */
    public iuKilometraje() {
        this.setTitle("Registrar Kilometraje");
        ((JPanel)getContentPane()).setOpaque(fal­se);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Archivo/fondo.jpg"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
        initComponents();
        btnEditar.setVisible(false);
        mostrar(Numero_solicitud);
        inhabilitar();
          //txtNumero_solicitud.setVisible(false);
        txtNumero_solicitud.setText(Numero_solicitud);
      
    }
void ocultar_columnas(){
    tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
     tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
     tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
     
      tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
     tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
     tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
}
  void agregar(){
        btnGuardar.setEnabled(true);
         btnCancelar.setEnabled(true);
         btnEliminar.setEnabled(false);
         btnEditar.setEnabled(false);
        
   }
  
   void tabla(){
       btnEditar.setEnabled(true);
       btnEliminar.setEnabled(true);
   
       btnCancelar.setEnabled(false);
       btnGuardar.setEnabled(false);
   }
  void inhabilitar(){
       txtKm_final.setText("");
       txtKm_inicial.setText("");
     //  txtNumero_solicitud.setText("");
      txtChofer.setText("");
      txtChofer2.setText("");
      txtPlaca.setText("");
      txtPlaca.setEnabled(false);
      txtChofer.setEnabled(false);
      txtChofer2.setEnabled(false);
       btnGuardar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnEliminar.setEnabled(false);
       txtKm_final.setEnabled(false);
       txtKm_inicial.setEnabled(false);
       txtNum_viaje.setVisible(false);
       txtNum_viaje2.setVisible(false);
       txtDiaViatico.setVisible(false);
       txtDiaViatico2.setVisible(false);
       txtKm_recorrido.setVisible(false);
       txtKm_recorrido2.setVisible(false);
       btnEliminar.setVisible(false);
       txtID.setVisible(false);
       btnBuscarChofer.setEnabled(false);
       btnBuscarChofer2.setEnabled(false);
       btnBuscarvehiculo.setEnabled(false);
       
       btnListar.setVisible(false);
       
   }
   
    void habilitar(){
       txtKm_final.setText("");
       txtKm_inicial.setText("");
     //  txtNumero_solicitud.setText("");
         txtChofer.setText("");
      txtChofer2.setText("");
      txtPlaca.setText("");
       btnGuardar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnEliminar.setEnabled(true);
       txtKm_final.setEnabled(true);
       txtKm_inicial.setEnabled(true);
        btnBuscarChofer.setEnabled(true);
       btnBuscarChofer2.setEnabled(true);
       btnBuscarvehiculo.setEnabled(true);
   }
    
    void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            nKilometraje func = new nKilometraje();
            modelo=func.mostrar(buscar);
            tablalistado.setModel(modelo);
            ocultar_columnas();
            lblTotalRegistro.setText("Numero de Choferes: "+Integer.toString(func.TotalRegistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero_solicitud = new javax.swing.JTextField();
        txtKm_final = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarvehiculo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        lblTotalRegistro = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtChofer = new javax.swing.JTextField();
        txtNum_viaje = new javax.swing.JTextField();
        btnBuscarChofer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtChofer2 = new javax.swing.JTextField();
        txtNum_viaje2 = new javax.swing.JTextField();
        btnBuscarChofer2 = new javax.swing.JButton();
        txtKm_recorrido = new javax.swing.JTextField();
        txtKm_recorrido2 = new javax.swing.JTextField();
        txtDiaViatico = new javax.swing.JTextField();
        txtDiaViatico2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKm_inicial = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        txtNumero_solicitud.setEditable(false);
        txtNumero_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero_solicitudActionPerformed(evt);
            }
        });

        txtKm_final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKm_finalKeyTyped(evt);
            }
        });

        jLabel1.setText("Vehiculo:");

        jLabel2.setText("Km Inicial:");

        jLabel3.setText("Km Final:");

        btnBuscarvehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Buscar_p.png"))); // NOI18N
        btnBuscarvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarvehiculoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setOpaque(false);

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Reservas.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Solicitudes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.setToolTipText("");
        jPanel5.setOpaque(false);

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.setOpaque(false);
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tablalistado);

        lblTotalRegistro.setText("TotalResgistro");

        btnListar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTotalRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalRegistro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txtChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChoferActionPerformed(evt);
            }
        });

        btnBuscarChofer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Buscar_p.png"))); // NOI18N
        btnBuscarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarChoferActionPerformed(evt);
            }
        });

        jLabel4.setText("Chofer #1:");

        jLabel5.setText("Chofer: #2:");

        txtChofer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChofer2ActionPerformed(evt);
            }
        });

        btnBuscarChofer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Buscar_p.png"))); // NOI18N
        btnBuscarChofer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarChofer2ActionPerformed(evt);
            }
        });

        txtKm_recorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKm_recorridoActionPerformed(evt);
            }
        });

        jLabel6.setText("N# Solicitud:");

        txtKm_inicial.setEditable(false);
        txtKm_inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKm_inicialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBuscarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtKm_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)))
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKm_final, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtNum_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtKm_recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txtChofer2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(28, 28, 28)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(btnBuscarChofer2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtDiaViatico, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(txtNum_viaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKm_recorrido2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiaViatico2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKm_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtKm_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBuscarChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNum_viaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKm_recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaViatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtChofer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBuscarChofer2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum_viaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKm_recorrido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaViatico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumero_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero_solicitudActionPerformed

    private void btnBuscarvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarvehiculoActionPerformed
        iuVistaVehiculo form = new iuVistaVehiculo();
        iuMenu.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscarvehiculoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(Double.parseDouble(txtKm_inicial.getText())>=Double.parseDouble(txtKm_final.getText())){
              JOptionPane.showMessageDialog(rootPane, "EL km final del vehiculo debe ser mayor que el km inicial");
              txtKm_final.requestFocus();
              return;
        }
        if(txtPlaca.getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Seleccione un vehiculo");
            btnBuscarvehiculo.requestFocus();//apunta el mouse a cedula
            return;
        }
        
         if(txtChofer.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un chofer");
            btnBuscarvehiculo.requestFocus();//apunta el mouse a cedula
            return;
        }
         
         if(txtKm_final.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el Km Final");
            btnBuscarvehiculo.requestFocus();//apunta el mouse a cedula
            return;
        }
        
Kilometraje dts= new Kilometraje();
      nKilometraje func= new nKilometraje();
       nKilometraje fun= new nKilometraje();
  

        dts.setNumero_solicitud(Integer.parseInt(txtNumero_solicitud.getText()));
dts.setPlaca(txtPlaca.getText());
dts.setKm_inicial(Double.parseDouble(txtKm_inicial.getText()));
dts.setKm_final(Double.parseDouble(txtKm_final.getText()));
dts.setCedula_chofer(Integer.parseInt(txtChofer.getText()));

        if(func.insertar(dts)){
           
           // JOptionPane.showMessageDialog(rootPane," Registrado correctamente");
            mostrar(Numero_solicitud);//muestra todos los registro
          //  inhabilitar();
Double kilo,kiloChofer;
 int con=Integer.parseInt(txtNum_viaje.getText());
 int viatico=Integer.parseInt(txtDiaViatico.getText());
  con++;
kilo=Double.parseDouble(txtKm_recorrido.getText())+Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
kiloChofer=Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
        if(kiloChofer>0 && kiloChofer<=400)
               viatico++;
           else if(kiloChofer>400 &&kiloChofer<=800)
               viatico+=2;
           else if(kiloChofer>800 && kiloChofer<=1200)
               viatico+=3;
           else if(kiloChofer>1200 && kiloChofer<=1600)
               viatico+=4;
           else if(kiloChofer>1600)
               viatico+=5;
        
Chofer dts2= new Chofer();
            nChofer func2= new nChofer();
           
            dts2.setCedula_chofer(Integer.parseInt(txtChofer.getText()));
                dts2.setNum_viajes(con);
                dts2.setKm_recorrido(kilo);
                dts2.setDia_viaje(viatico);
                func2.ViaticoSueldo(dts2);
            
            dts2.setEstado("Ocupado");
            func2.OcuparChofer(dts2);
        
            
          // 
           
            
           
       
        }

if(txtChofer2.getText().length()!=0){
  dts.setCedula_chofer(Integer.parseInt(txtChofer2.getText()));

 if(func.insertar(dts)){
           
            mostrar(Numero_solicitud);//muestra todos los registro
          

            Double kilo,kiloChofer;
 int con=Integer.parseInt(txtNum_viaje2.getText());
 int viatico=Integer.parseInt(txtDiaViatico2.getText());
  con++;
kilo=Double.parseDouble(txtKm_recorrido2.getText())+Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
kiloChofer=Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
        if(kiloChofer>0 && kiloChofer<=400)
               viatico++;
           else if(kiloChofer>400 &&kiloChofer<=800)
               viatico+=2;
           else if(kiloChofer>800 && kiloChofer<=1200)
               viatico+=3;
           else if(kiloChofer>1200 && kiloChofer<=1600)
               viatico+=4;
           else if(kiloChofer>1600)
               viatico+=5;
            
            Chofer dts2= new Chofer();
            nChofer func2= new nChofer();
            
            dts2.setCedula_chofer(Integer.parseInt(txtChofer2.getText()));
             dts2.setNum_viajes(con);
                dts2.setKm_recorrido(kilo);
                dts2.setDia_viaje(viatico);
                func2.ViaticoSueldo(dts2);
            dts2.setEstado("Ocupado");
            func2.OcuparChofer(dts2);
            
            
      //      Double Kilo;
       //     Kilo=Double.parseDouble(txtKm_inicial.getText())+Double.parseDouble(txtKm_final.getText());
        //    dts2.setPago(Kilo);
        }

 
}


          Vehiculo dts3 = new Vehiculo();
          nVehiculo func3 = new nVehiculo();
         // Double kilo;
         // kilo=Double.parseDouble(txtKm_final.getText());
          dts3.setKilometraje(Double.parseDouble(txtKm_final.getText()));
         // dts3.setKilometraje(txtKm_final);
          dts3.setPlaca(txtPlaca.getText());
          func3.Registrokilometraje(dts3);
          inhabilitar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       Kilometraje dts= new Kilometraje();
      nKilometraje func= new nKilometraje();
      
dts.setNumero_solicitud(Integer.parseInt(txtNumero_solicitud.getText()));
dts.setPlaca(txtPlaca.getText());
dts.setCedula_chofer(Integer.parseInt(txtChofer.getText()));
dts.setKm_inicial(Double.parseDouble(txtKm_inicial.getText()));
dts.setKm_final(Double.parseDouble(txtKm_final.getText()));
dts.setID(Integer.parseInt(txtID.getText()));
        
        if(func.editar(dts)){
            JOptionPane.showMessageDialog(rootPane," modificado exitosamente");
            mostrar(Numero_solicitud);
            inhabilitar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtKm_inicial.setText("");
         txtKm_final.setText("");
        txtPlaca.setText("");
        

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        habilitar();
       agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtID.getText().equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar el vehiculo","Confirmar",2);

            if(confirmacion==0){
                 mostrar(Numero_solicitud);
                nKilometraje func= new nKilometraje();
                Kilometraje dts= new Kilometraje();

                dts.setID(Integer.parseInt(txtID.getText()));
                func.eliminar(dts);
                //////
                Double kilo,kiloChofer;
               
 int con=0;
 con=Integer.parseInt(txtNum_viaje.getText());
 int viatico=Integer.parseInt(txtDiaViatico.getText());
  con--;
kilo=Double.parseDouble(txtKm_recorrido.getText())-Double.parseDouble(txtKm_final.getText())+Double.parseDouble(txtKm_inicial.getText());
kiloChofer=Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
        if(kiloChofer>0 && kiloChofer<=400)
               viatico--;
           else if(kiloChofer>400 &&kiloChofer<=800)
               viatico-=2;
           else if(kiloChofer>800 && kiloChofer<=1200)
               viatico-=3;
           else if(kiloChofer>1200 && kiloChofer<=1600)
               viatico-=4;
           else if(kiloChofer>1600)
               viatico-=5;
                 Chofer dts2= new Chofer();
            nChofer func2= new nChofer();
            
            dts2.setCedula_chofer(Integer.parseInt(txtChofer2.getText()));
             dts2.setNum_viajes(con);
                dts2.setKm_recorrido(kilo);
                dts2.setDia_viaje(viatico);
                func2.ViaticoSueldo(dts2);
           // dts2.setEstado("Ocupado");
           // func2.OcuparChofer(dts2);
               
                Vehiculo dts3 = new Vehiculo();
          nVehiculo func3 = new nVehiculo();
         // Double kilo;
         // kilo=Double.parseDouble(txtKm_final.getText());
         Double kilo2;
         kilo2=Double.parseDouble(txtKm_final.getText())-Double.parseDouble(txtKm_inicial.getText());
          dts3.setKilometraje(Double.parseDouble(txtKm_final.getText())-kilo2);
         // dts3.setKilometraje(txtKm_final);
          dts3.setPlaca(txtPlaca.getText());
          func3.Registrokilometraje(dts3);
           inhabilitar();
            }
        }
        

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

        habilitar();
        tabla();
        btnCancelar.setEnabled(false);
       // btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(true);
    

        int fila= tablalistado.rowAtPoint(evt.getPoint());//captura fila dodne se hace click
         txtID.setText(tablalistado.getValueAt(fila, 0).toString());
          txtNumero_solicitud.setText(tablalistado.getValueAt(fila, 1).toString());
        txtPlaca.setText(tablalistado.getValueAt(fila, 2).toString());
        txtChofer.setText(tablalistado.getValueAt(fila, 3).toString());
       txtKm_inicial.setText(tablalistado.getValueAt(fila, 4).toString());
        txtKm_final.setText(tablalistado.getValueAt(fila, 5).toString());
       

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        mostrar("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChoferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChoferActionPerformed

    private void btnBuscarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarChoferActionPerformed
iuVistaChofer form= new iuVistaChofer();
iuMenu.Escritorio.add(form);
form.toFront();
form.setVisible(true);
    }//GEN-LAST:event_btnBuscarChoferActionPerformed

    private void txtChofer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChofer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChofer2ActionPerformed

    private void btnBuscarChofer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarChofer2ActionPerformed
        iuVistaChofer form= new iuVistaChofer();
        iuMenu.Escritorio.add(form);
form.toFront();
form.setVisible(true);

    }//GEN-LAST:event_btnBuscarChofer2ActionPerformed

    private void txtKm_recorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKm_recorridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKm_recorridoActionPerformed

    private void txtKm_finalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKm_finalKeyTyped
       char c=evt.getKeyChar();
          if(Character.isLetter(c)) {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    

    }//GEN-LAST:event_txtKm_finalKeyTyped

    private void txtKm_inicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKm_inicialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKm_inicialKeyTyped

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
         if(evt.getClickCount()==1){
          int fila=tablalistado.getSelectedRow();
        
          
         
             String kmI = tablalistado.getValueAt(fila, 4).toString();
             String kmF = tablalistado.getValueAt(fila, 5).toString();
          
          
      }
                     
    }//GEN-LAST:event_tablalistadoMousePressed

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
            java.util.logging.Logger.getLogger(iuKilometraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iuKilometraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iuKilometraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iuKilometraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iuKilometraje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarChofer;
    private javax.swing.JButton btnBuscarChofer2;
    private javax.swing.JButton btnBuscarvehiculo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTotalRegistro;
    private javax.swing.JTable tablalistado;
    public static javax.swing.JTextField txtChofer;
    public static javax.swing.JTextField txtChofer2;
    public static javax.swing.JTextField txtDiaViatico;
    public static javax.swing.JTextField txtDiaViatico2;
    private javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtKm_final;
    public static javax.swing.JTextField txtKm_inicial;
    public static javax.swing.JTextField txtKm_recorrido;
    public static javax.swing.JTextField txtKm_recorrido2;
    public static javax.swing.JTextField txtNum_viaje;
    public static javax.swing.JTextField txtNum_viaje2;
    private javax.swing.JTextField txtNumero_solicitud;
    public static javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
