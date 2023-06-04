/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Vehiculo;
import CapaNegocio.nChofer;
import CapaNegocio.nCliente;
import CapaNegocio.nUsuario;
import CapaNegocio.nVehiculo;
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
public class iuVehiculo extends javax.swing.JInternalFrame {

   int con=0;
    public iuVehiculo() {
       ((JPanel)getContentPane()).setOpaque(fal­se);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Archivo/fondo.jpg"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
       
        initComponents();
        nVehiculo fun=new nVehiculo();
       
      
        //con++;
         inhabilitar();
         mostrar("");
    }
 void ocultar_columnas(){
        tablalistado.getColumnModel().getColumn(2).setMaxWidth(0);//idestacionamiento nose muestre ancho 0
    tablalistado.getColumnModel().getColumn(2).setMinWidth(0);
     tablalistado.getColumnModel().getColumn(2).setPreferredWidth(0);
   }
   void cargar(){
       
   }
   void agregar(){
        btnGuardar.setEnabled(true);
         btnCancelar.setEnabled(true);
         btnEliminar.setEnabled(false);
         btnEditar.setEnabled(false);
        
   }
   void inhabilitar(){
       txtObservacion.setText("");
       txtModelo.setText("");
       txtKilometraje.setText("");
       txtCapacidad.setText("");
       txtidEstacionamiento.setText("");
       txtObservacion.setText("");
       txtCapacidad.setText("");
       
     
       txtModelo.setEnabled(false);
       txtKilometraje.setEnabled(false);
       txtidEstacionamiento.setEnabled(false);
       txtCapacidad.setEnabled(false);
       txtObservacion.setEnabled(false);
       txtPlaca.setEnabled(false);
       btnMantenimiento.setEnabled(false);
       btnEliminar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnGuardar.setEnabled(false);
       txtNumero_solicitud.setVisible(false);
       
   }
   
   void habilitar(){
       txtObservacion.setText("");
       txtPlaca.setText("");
       txtKilometraje.setText("");
       txtModelo.setText("");
       txtidEstacionamiento.setText("");

       txtCapacidad.setText("");
       
       txtObservacion.setEnabled(true);
      txtModelo.setEnabled(true);
       txtKilometraje.setEnabled(true);
       txtidEstacionamiento.setEnabled(true);
       txtCapacidad.setEnabled(true);
       txtNumero_solicitud.setVisible(false);
        btnEliminar.setEnabled(true);
       btnEditar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnGuardar.setEnabled(true);
       txtPlaca.setEnabled(true);
   }
   
   void tabla(){
       btnEditar.setEnabled(true);
       btnEliminar.setEnabled(true);
   
       btnCancelar.setEnabled(false);
       btnGuardar.setEnabled(false);
   }
   
    void buscar(int select,String busqueda){
        try {
           DefaultTableModel modelo;
           nVehiculo func= new nVehiculo();
           modelo =func.buscar(select, busqueda);
           tablalistado.setModel(modelo);
            ocultar_columnas();
           lblTotalRegistro.setText("Total de registro: "+ Integer.toString(func.TotalRegistros));
           
           
           
       } catch (Exception e) {
          // JOptionPane.showMessageDialog(rootPane, e);
       }
   }
    void mostrar(String buscar){
       try {
           DefaultTableModel modelo;
           nVehiculo func= new nVehiculo();
           modelo =func.mostrar(buscar);
           tablalistado.setModel(modelo);
            ocultar_columnas();
           lblTotalRegistro.setText("Total de registro: "+ Integer.toString(func.TotalRegistros));
           
           
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, e);
       }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Observacion = new javax.swing.JLabel();
        Kilometraje = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        txtPlaca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtNumero_solicitud = new javax.swing.JTextField();
        txtKilometraje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtidEstacionamiento = new javax.swing.JTextField();
        btnBuscarEstacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnMantenimiento = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        cbBuscar = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        lblTotalRegistro = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Vehiculos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Vehiculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setText("Placa:");

        jLabel2.setText("Modelo:");

        Observacion.setText("Observacion:");

        Kilometraje.setText("Kilometraje:");

        lblEstado.setText("Estado:");

        jLabel7.setText("Capacidad:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Mantenimiento", "Ocupado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
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

        txtKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyTyped(evt);
            }
        });

        jLabel3.setText("Estacionamiento:");

        txtidEstacionamiento.setEditable(false);
        txtidEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEstacionamientoActionPerformed(evt);
            }
        });

        btnBuscarEstacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Buscar_p.png"))); // NOI18N
        btnBuscarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kilometraje)
                .addGap(567, 567, 567))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtidEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumero_solicitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Observacion)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Observacion)
                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kilometraje)
                    .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarEstacion)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtidEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtNumero_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Vehiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.setToolTipText("");
        jPanel5.setOpaque(false);

        btnMantenimiento.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/cog1.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMantenimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

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
        });
        jScrollPane5.setViewportView(tablalistado);

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Placa", "Estado" }));
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

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

        btnBuscar1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/guardars.png"))); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane5)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTotalRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalRegistro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed

    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtObservacion.setText("");
        txtModelo.setText("");
        txtKilometraje.setText("");
        txtidEstacionamiento.setText("");
     
        txtCapacidad.setText("");
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        habilitar();
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtPlaca.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane, "Ingrese la Placa");
            txtPlaca.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtModelo.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el Modelo");
            txtModelo.requestFocus();//apunta el mouse a cedula
            return;
        }
       
        if(txtCapacidad.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane, "Ingrese la Capacidad");
            txtCapacidad.requestFocus();//apunta el mouse a cedula
            return;
        }
       

        Vehiculo dts= new Vehiculo();
        nVehiculo func= new nVehiculo();

        int seleccionado=cbEstado.getSelectedIndex();
        dts.setEstado((String)cbEstado.getItemAt(seleccionado));
        
         
//dts.setIdEstacionamiento(select);

        dts.setPlaca(txtPlaca.getText());
        dts.setModelo(txtModelo.getText());
        dts.setObservacion(txtObservacion.getText());
        dts.setKilometraje(Double.parseDouble(txtKilometraje.getText()));
        dts.setCapacidad(Integer.parseInt(txtCapacidad.getText()));
        dts.setIdEstacionamiento(Integer.parseInt(txtidEstacionamiento.getText()));
       // dts.setIdEstacionamiento(Integer.parseInt(txtidEstacionamiento.getText()));

        if(func.insertar(dts)){
            JOptionPane.showMessageDialog(rootPane,"vehiculo registrado correctamente");
            mostrar("");//muestra todos los registro
            inhabilitar();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Vehiculo dts= new Vehiculo();
        nVehiculo func= new nVehiculo();

        int seleccionado=cbEstado.getSelectedIndex();
        dts.setEstado((String)cbEstado.getItemAt(seleccionado));
//dts.setEstado("Ocupado");
      dts.setPlaca(txtPlaca.getText());
        dts.setModelo(txtModelo.getText());
        dts.setObservacion(txtObservacion.getText());
       // dts.setKilometraje(Double.parseDouble(txtKilometraje.getText()));
        dts.setCapacidad(Integer.parseInt(txtCapacidad.getText()));
          dts.setIdEstacionamiento(Integer.parseInt(txtidEstacionamiento.getText()));
       // dts.setIdEstacionamiento(Integer.parseInt(txtidEstacionamiento.getText()));
       //  int select=cbEstacionamiento.getSelectedIndex(); 
       // dts.setIdEstacionamiento(select);

        if(func.editar(dts)){
            JOptionPane.showMessageDialog(rootPane,"vehiculo modificado exitosamente");
            mostrar("");
            inhabilitar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
int fila = tablalistado.getSelectedRow();
        iuMantenimiento.placa=tablalistado.getValueAt(fila, 0).toString();
        iuMantenimiento form= new iuMantenimiento();
        iuMenu.Escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtPlaca.getText().equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar el vehiculo","Confirmar",2);

            if(confirmacion==0){
                nVehiculo func= new nVehiculo();
                Vehiculo dts= new Vehiculo();

                dts.setPlaca(txtPlaca.getText());
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

        habilitar();
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnMantenimiento.setEnabled(true);

        int fila= tablalistado.rowAtPoint(evt.getPoint());//captura fila dodne se hace click
        txtPlaca.setText(tablalistado.getValueAt(fila, 0).toString());
        txtModelo.setText(tablalistado.getValueAt(fila, 1).toString());
        txtNumero_solicitud.setText(tablalistado.getValueAt(fila, 2).toString());
        txtObservacion.setText(tablalistado.getValueAt(fila, 3).toString());
        txtKilometraje.setText(tablalistado.getValueAt(fila, 4).toString());
        cbEstado.setSelectedItem(tablalistado.getValueAt(fila, 5).toString());
        txtCapacidad.setText(tablalistado.getValueAt(fila, 6).toString());
          txtidEstacionamiento.setText(tablalistado.getValueAt(fila,7 ).toString());
     //   cbEstacionamiento.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        mostrar("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtidEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEstacionamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEstacionamientoActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        nVehiculo func= new nVehiculo();
        int select=cbBuscar.getSelectedIndex();
          func.buscar(select,txtBuscar.getText());
        buscar(select,txtBuscar.getText());
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBuscarActionPerformed

    private void txtKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyTyped
      char c=evt.getKeyChar();
         if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    

    }//GEN-LAST:event_txtKilometrajeKeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
       char c=evt.getKeyChar();
          if(Character.isLetter(c)) {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    

    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void btnBuscarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstacionActionPerformed
iuVistaEstacionamiento form = new iuVistaEstacionamiento();
iuMenu.Escritorio.add(form);
form.setVisible(true);
form.toFront();
    }//GEN-LAST:event_btnBuscarEstacionActionPerformed

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
            java.util.logging.Logger.getLogger(iuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iuVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iuVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kilometraje;
    private javax.swing.JLabel Observacion;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscarEstacion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JComboBox cbBuscar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblTotalRegistro;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumero_solicitud;
    private javax.swing.JTextField txtObservacion;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtidEstacionamiento;
    // End of variables declaration//GEN-END:variables
}
