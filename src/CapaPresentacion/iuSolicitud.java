/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Solicitud;
import CapaNegocio.nCliente;
import CapaNegocio.nSolicitud;
import static CapaPresentacion.iuCliente.txtCedula_usuario;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class iuSolicitud extends javax.swing.JInternalFrame {

    /**
     * Creates new form iuSolicitud
     */
    public iuSolicitud() {
        this.setTitle("Gestionar Solicitudes");
       
        ((JPanel)getContentPane()).setOpaque(fal­se);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Archivo/fondo.jpg"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
        fondo.setBounds(0,0,uno.getIconWidth(),u­no.getIconHeight());
        initComponents();
        mostrar("");
       inhabilitar();
       nSolicitud f= new nSolicitud();
       f.cargar();
       f.LlenarCampos();
       cbEstado.setVisible(false);
     
    }

   void ocultar_columnas(){
       
   }
   
   void agregar(){
        btnGuardar.setEnabled(true);
         btnCancelar.setEnabled(true);
         btnEliminar.setEnabled(false);
         btnEditar.setEnabled(false);
        
   }
   void inhabilitar(){
       txtSolicitud.setVisible(false);
//       txtCedula_usuario.setVisible(false);
       txtCarga.setText("");
       txtCargamento.setText("");
       txtDestino.setText("");
     
       txtPrecio.setText("");
       txtCedula.setText("");
       txtCliente.setText("");
       txtSolicitud.setText("");
      
       txtCarga.setEnabled(false);
       txtCargamento.setEnabled(false);
       dcFecha_entrega.setEnabled(false);
       dcFecha_envio.setEnabled(false);
       cbEstado.setEnabled(false);
       txtPrecio.setEnabled(false);
       txtDestino.setEnabled(false);
       dcFecha_entrega.setDate(null);
       dcFecha_envio.setDate(null);
    txtTarifa_Kg.setEnabled(false);
       txtCedula.setEnabled(false);
      txtCliente.setEnabled(false);
       
       btnBuscarCliente.setEnabled(false);
       btnEliminar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnGuardar.setEnabled(false);
        
   }
   
   void habilitar(){
      //   txtCedula_usuario.setVisible();
       txtSolicitud.setVisible(false);
      // txtCedula_usuario.setVisible(false);
       txtCarga.setText("");
       txtCargamento.setText("");
       txtDestino.setText("");
      
       txtPrecio.setText("");
       txtCedula.setText("");
       txtCliente.setText("");
       txtSolicitud.setText("");
       txtTarifa_Kg.setEnabled(true);
       dcFecha_entrega.setDate(null);
       dcFecha_envio.setDate(null);
       txtCarga.setEnabled(true);
       txtCargamento.setEnabled(true);
       dcFecha_entrega.setEnabled(true);
       dcFecha_envio.setEnabled(true);
       cbEstado.setEnabled(true);
       txtPrecio.setEnabled(true);
      txtDestino.setEnabled(true);

       txtCedula.setEnabled(true);
      txtCliente.setEnabled(true);
      
        btnEliminar.setEnabled(true);
       btnEditar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnGuardar.setEnabled(true);
       btnBuscarCliente.setEnabled(true);
      //  txtCedula_usuario.setText("");
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
           nSolicitud func= new nSolicitud();
           modelo =func.buscar(select, busqueda);
           tablalistado.setModel(modelo);
           lblTotalRegistro.setText("Total de registro: "+ Integer.toString(func.TotalRegistros));
            ocultar_columnas();
          
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, e);
       }
   }
   void mostrar(String buscar){
       try {
           DefaultTableModel modelo;
           nSolicitud func= new nSolicitud();
           modelo=func.mostrar(buscar);
           
           tablalistado.setModel(modelo);
           lblTotalRegistro.setText("Total Registro: "+Integer.toString(func.TotalRegistros));
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(rootPane, e);
           
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtCargamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDestino = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dcFecha_envio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dcFecha_entrega = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        cbEstacionamiento = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtTarifa_Kg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        cbBuscar = new javax.swing.JComboBox();
        txtBuscar = new javax.swing.JTextField();
        lblTotalRegistro = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        cbEstado = new javax.swing.JComboBox();
        txtSolicitud = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Solicitudes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

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

        jLabel1.setText("Carga:");

        jLabel2.setText("Destino:");

        txtCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargaKeyTyped(evt);
            }
        });

        lblPrecio.setText("Precio:");

        jLabel4.setText("Cargamento:");

        txtDestino.setColumns(20);
        txtDestino.setRows(5);
        jScrollPane1.setViewportView(txtDestino);

        jLabel5.setText("Origen:");

        txtPrecio.setEditable(false);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtCedula.setEditable(false);

        jLabel3.setText("Fecha de envio:");

        dcFecha_envio.setDateFormatString("dd-MMM-yyyy HH:mm");

        jLabel6.setText("Fecha de entrega:");

        dcFecha_entrega.setDateFormatString("dd-MMM-yyyy HH:mm");

        jLabel8.setText("Cliente:");

        txtCliente.setEditable(false);

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/Buscar_p.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        cbEstacionamiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cbEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstacionamientoActionPerformed(evt);
            }
        });

        jLabel10.setText("Kg");

        txtTarifa_Kg.setEditable(false);
        txtTarifa_Kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifa_KgActionPerformed(evt);
            }
        });

        jLabel11.setText("Precio por Kg:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFecha_envio, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(dcFecha_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(lblPrecio)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTarifa_Kg, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargamento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCargamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTarifa_Kg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dcFecha_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dcFecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Solicitudes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.setToolTipText("");
        jPanel4.setOpaque(false);

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivo/guardars.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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
        jScrollPane3.setViewportView(tablalistado);

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N# de Solicitud", "Cedula del Cliente", "Fecha Envio", "Fecha Entrega" }));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblTotalRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalRegistro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnAsignar.setText("Asignar Vehiculo y Chofer");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enviado", "Pendiente" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAsignar)
                        .addGap(45, 45, 45)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignar)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

   
 
   
           
        //   JOptionPane.showMessageDialog(this, "debe ingresar una fechacorrecta");
       
       
//        jLabel9.setText(sdf.format(date));
        
        if(txtCedula.getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Debes sellecionar un cliente");
            txtCedula.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtCarga.getText().length()==0){
           JOptionPane.showMessageDialog(rootPane, "Ingrese el Nombre");
            txtCarga.requestFocus();//apunta el mouse a cedula
            return;
        }
        if(txtDestino.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el destino");
            txtDestino.requestFocus();//apunta el mouse a cedula
            return;
        }
         
          if(txtPrecio.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Ingrese el precio");
            txtPrecio.requestFocus();//apunta el mouse a cedula
            return;
        }
        Solicitud dts= new Solicitud();
        nSolicitud func=new nSolicitud();
        
            if(dcFecha_envio.getDate()==null){//verifica si el campo esta vacio o no del jdatechooser
                 JOptionPane.showMessageDialog(rootPane, "Ingrese la fecha del envio");
                 return;
         // dts.setFecha_entrega(new Timestamp(0,0,0,0,0,0,0));
            }
            
        
             if(dcFecha_envio.getDate()!=null) {    
                   Calendar cal;
                  
                   int d,m,a,h,mi,s;
                   cal=dcFecha_envio.getCalendar();
                   dcFecha_envio.setCalendar(null);
       d=cal.get(Calendar.DAY_OF_MONTH);
       m=cal.get(Calendar.MONTH);
       a=cal.get(Calendar.YEAR)-1900;
       h = cal.get(Calendar.HOUR_OF_DAY);
       mi = cal.get(Calendar.MINUTE);
       dts.setFecha_envio(new Timestamp(a,m,d,h,mi,0,0));
                  // int seleccionado=cbEstado.getSelectedIndex();
       //dts.setEstado((String)cbEstado.getItemAt(seleccionado));
       dts.setEstado("Pendiente");
            }   
           
        

      

     //   dts.setNumero_solicitud(Integer.parseInt(txtSolicitud.getText()));
       
        dts.setCedula_cliente(Integer.parseInt(txtCedula.getText()));
        dts.setCarga(Integer.parseInt(txtCarga.getText()));
        dts.setCargamento(txtCargamento.getText());
        dts.setDestino(txtDestino.getText());
        int selec=cbEstacionamiento.getSelectedIndex();
          dts.setOrigen((String)cbEstacionamiento.getItemAt(selec));
     //   dts.setOrigen(txtOrigen.getText());
       dts.setPrecio(Double.parseDouble(txtPrecio.getText()));
       
      /*Calendar cal;
     
       int d,m,a,h,mi,s;
       cal=dcFecha_envio.getCalendar();
       d=cal.get(Calendar.DAY_OF_MONTH);
       m=cal.get(Calendar.MONTH);
       a=cal.get(Calendar.YEAR)-1900;
       h = cal.get(Calendar.HOUR_OF_DAY);
       mi = cal.get(Calendar.MINUTE);
        
       dts.setFecha_envio(new Timestamp(a,m,d,h,mi,0,0));
       /*/
       
       
       
      
       
       
        if(func.insertar(dts)){
            JOptionPane.showMessageDialog(rootPane,"Solicitud registrado correctamente");
            mostrar("");//muestra todos los registro
            inhabilitar();

        }
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(dcFecha_entrega.getDate()!=null) 
        if(dcFecha_entrega.getDate().before(dcFecha_envio.getDate())){
          JOptionPane.showMessageDialog(this, "La fecha de entrega no puede ser posterior que la fecha de envio");
      return;
      }
        
        Solicitud dts= new Solicitud();
        nSolicitud func=new nSolicitud();

      
        dts.setNumero_solicitud(Integer.parseInt(txtSolicitud.getText()));
        dts.setCedula_cliente(Integer.parseInt(txtCedula.getText()));
        dts.setCarga(Integer.parseInt(txtCarga.getText()));
        dts.setCargamento(txtCargamento.getText());
        dts.setDestino(txtDestino.getText());
        int selec=cbEstacionamiento.getSelectedIndex();
          dts.setOrigen((String)cbEstacionamiento.getItemAt(selec));
       dts.setPrecio(Double.parseDouble(txtPrecio.getText()));
      
       Calendar cal;
     
        int d,m,a,h,mi,s;
       cal=dcFecha_envio.getCalendar();
       d=cal.get(Calendar.DAY_OF_MONTH);
       m=cal.get(Calendar.MONTH);
       a=cal.get(Calendar.YEAR)-1900;
       h = cal.get(Calendar.HOUR_OF_DAY);
       mi = cal.get(Calendar.MINUTE);
         
       dts.setFecha_envio(new Timestamp(a,m,d,h,mi,0,0));
         if(dcFecha_entrega.getDate()!=null){       
       dts.setEstado("Enviado");
            //Calendar cal2;
       cal=dcFecha_entrega.getCalendar();
       d=cal.get(Calendar.DAY_OF_MONTH);
       m=cal.get(Calendar.MONTH);
       a=cal.get(Calendar.YEAR)-1900;
       h = cal.get(Calendar.HOUR_OF_DAY);
       mi = cal.get(Calendar.MINUTE);
       dts.setFecha_entrega(new Timestamp(a,m,d,h,mi,0,0));
         }
         
          if(dcFecha_entrega.getDate()==null){
             dts.setFecha_entrega(null);
             dts.setEstado("Pendiente");
             System.out.print("che"+dcFecha_envio.getDate());
         }
         
         
       //int seleccionado=cbEstado.getSelectedIndex();
       //dts.setEstado((String)cbEstado.getItemAt(seleccionado));

        if(func.editar(dts)){
            JOptionPane.showMessageDialog(rootPane,"Solicitud modificado exitosamente");
            mostrar("");
            inhabilitar();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCargamento.setText("");
        txtCarga.setText("");
        txtDestino.setText("");
       
        txtDestino.setText("");
        txtCedula.setText("");
      

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        habilitar();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        dcFecha_entrega.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       nSolicitud func= new nSolicitud();
        int select=cbBuscar.getSelectedIndex();
        func.buscar(select,txtBuscar.getText());
        buscar(select,txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtSolicitud.getText().equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane,"Esta seguro de eliminar la solicitud","Confirmar",2);

            if(confirmacion==0){
                nSolicitud func= new nSolicitud();
                Solicitud dts= new Solicitud();

                dts.setNumero_solicitud(Integer.parseInt(txtSolicitud.getText()));
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

        int fila= tablalistado.rowAtPoint(evt.getPoint());//captura fila dodne se hace click
        txtSolicitud.setText(tablalistado.getValueAt(fila, 0).toString());
        txtCedula.setText(tablalistado.getValueAt(fila, 1).toString());
        txtCliente.setText(tablalistado.getValueAt(fila, 2).toString());
        txtCargamento.setText(tablalistado.getValueAt(fila, 3).toString());
        txtCarga.setText(tablalistado.getValueAt(fila, 4).toString());
        
         txtPrecio.setText(tablalistado.getValueAt(fila, 5).toString());
         // txtOrigen.setText(tablalistado.getValueAt(fila, 6).toString());
        cbEstacionamiento.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
           txtDestino.setText(tablalistado.getValueAt(fila, 7).toString());
            dcFecha_envio.setDate(Timestamp.valueOf(tablalistado.getValueAt(fila, 8).toString()));
          dcFecha_entrega.setDate(Timestamp.valueOf(tablalistado.getValueAt(fila, 9).toString()));
            cbEstado.setSelectedItem(tablalistado.getValueAt(fila, 10).toString());
            
             
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        mostrar("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
       iuVistaCliente form = new iuVistaCliente();
       iuMenu.Escritorio.add(form);
       form.toFront();
       form.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
int fila=tablalistado.getSelectedRow();
        iuKilometraje.Numero_solicitud=tablalistado.getValueAt(fila, 0).toString();
//String solicitud;
//solicitud=tablalistado.getValueAt(fila, 0).toString();
   iuKilometraje form= new iuKilometraje();
   iuMenu.Escritorio.add(form);
      form.toFront();
      //  iuKilometraje.txtNumero_solicitud.setText(solicitud);
      //  iuKilometraje form= new iuKilometraje();
      form.toFront();
      form.setVisible(true);
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void txtCargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaKeyTyped
       char c=evt.getKeyChar();
          if(Character.isLetter(c)&&c<'0' || c>'9') {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    

    }//GEN-LAST:event_txtCargaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
       char c=evt.getKeyChar();
          if(Character.isLetter(c)) {
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
    }    

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cbEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstacionamientoActionPerformed
        nSolicitud fun= new nSolicitud();
        //if(this.con>0)
        //fun.cargarCB();
        //  fun.cargar2();

    }//GEN-LAST:event_cbEstacionamientoActionPerformed

    private void txtTarifa_KgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifa_KgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifa_KgActionPerformed

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
  
    
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtCargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaKeyReleased
           if(txtCarga.getText().equals("")){
            txtPrecio.setText("");
        }
        else{
        Double precio;
       precio=Double.parseDouble(txtCarga.getText())*Double.parseDouble(txtTarifa_Kg.getText());
       txtPrecio.setText(""+(precio));
        }
    }//GEN-LAST:event_txtCargaKeyReleased

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        //   txtFecha.setText(dcFecha_entrega.toString());
    }//GEN-LAST:event_cbEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(iuSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iuSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iuSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iuSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iuSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox cbBuscar;
    public static javax.swing.JComboBox cbEstacionamiento;
    private javax.swing.JComboBox cbEstado;
    private com.toedter.calendar.JDateChooser dcFecha_entrega;
    private com.toedter.calendar.JDateChooser dcFecha_envio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotalRegistro;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtCargamento;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtDestino;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSolicitud;
    public static javax.swing.JTextField txtTarifa_Kg;
    // End of variables declaration//GEN-END:variables
}
