
package Admi;

import Logica.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class Reservas extends javax.swing.JFrame {

    Admi panelAdmi;
    DefaultTableModel tabla2;
    DefaultTableModel tabla3;
    ReservasHotelDB resH= new ReservasHotelDB();
    ReservasHotel newRes= new ReservasHotel();
    
    public Reservas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tabla2();
        this.tabla3();
        resH.ConsultarServicio(busquedaRes);
        this.ListarReservas();
    }
    
     public void ListarReservas(){
        List<ReservasHotel> ListaR=resH.ListarReserva();
        tabla2= (DefaultTableModel) tablareservaciones.getModel();
        Object[] obj=new Object[7];
        for (int i = 0; i < ListaR.size(); i++) {
            obj[0]=ListaR.get(i).getNombrePersona();
            obj[1]=ListaR.get(i).getNumeroPersonas();
            obj[2]=ListaR.get(i).getServicio();
            obj[3]=ListaR.get(i).getPrecio();
            obj[4]=ListaR.get(i).getFechaIngreso();
            obj[5]=ListaR.get(i).getTelef();
            obj[6]=ListaR.get(i).getCheck();
            tabla2.addRow(obj);
        }
        tablareservaciones.setModel(tabla2);
    }
    
    public final void tabla2(){
        tabla2 = new DefaultTableModel(); //nombre de una tabla personalizada, creacion completa del objeto
        tabla2.addColumn("Nombre");//agregar columnas
        tabla2.addColumn("Nº Personas");
        tabla2.addColumn("Servicio");
        tabla2.addColumn("Precio S/.");
        tabla2.addColumn("Fecha Ingreso");
        tabla2.addColumn("Telefono");
        tabla2.addColumn("Check in");
        tablareservaciones.setModel(tabla2);//importar el modelo creado a jTable1
    }
    
    public final void tabla3(){
        tabla3 = new DefaultTableModel(); //nombre de una tabla personalizada, creacion completa del objeto
        tabla3.addColumn("Adicional");//agregar columnas
        tabla3.addColumn("Precio");
        tablaAdicionales.setModel(tabla3);//importar el modelo creado a jTable1
    }
    
    public double totalPagarFacturacion(){
        double totalServicio=Double.parseDouble(precioFacturacion.getText());
        double totalAdicionales = 0, total;
        for (int i = 0; i < tablaAdicionales.getRowCount(); i++) {
            totalAdicionales=Double.parseDouble((String) tablaAdicionales.getValueAt(i, 1));
        }
        total=totalServicio+totalAdicionales;
        return total;
    }
    
    public int seleccionTablaReserva(){
        return tablareservaciones.getSelectedRow();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraFacturacion = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pdfFacturacion = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nombreFacturacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        servicioFacturacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telefFacturacion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fechaSalidaFacturacion = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        totalFacturacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAdicionales = new javax.swing.JTable();
        adicionalFacturacion = new javax.swing.JToggleButton();
        precioFacturacion = new javax.swing.JTextField();
        generarTotalFacturacion = new javax.swing.JButton();
        fechaIngresoFacturacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        volverFacturacion = new javax.swing.JButton();
        paraAgregarAdicional = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombreAdicional = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        precioAdicional = new javax.swing.JTextField();
        aceptarAdicional = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        services = new javax.swing.JButton();
        reservas = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareservaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numPersonasRes = new javax.swing.JSpinner();
        checkoutRes = new javax.swing.JButton();
        perRes = new javax.swing.JTextField();
        aceptarReservas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fechaRes = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        telefRes = new javax.swing.JTextField();
        busquedaRes = new javax.swing.JComboBox<>();

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jLabel12.setText("jLabel1");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 280, 220));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Facturacion");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        pdfFacturacion.setBackground(new java.awt.Color(0, 0, 0));
        pdfFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        pdfFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        pdfFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Adobe_PDF-logo-DFB83F69E2-seeklogo.com (1).png"))); // NOI18N
        pdfFacturacion.setText("  Generar Boleta");
        pdfFacturacion.setToolTipText("");
        pdfFacturacion.setFocusPainted(false);
        pdfFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(pdfFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 220, 70));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre del Reservante: ");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        nombreFacturacion.setEditable(false);
        nombreFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nombreFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        nombreFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(nombreFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 260, -1));

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Hora de Ingreso:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        servicioFacturacion.setEditable(false);
        servicioFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        servicioFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        servicioFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(servicioFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, -1));

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Servicios Adicionales:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono: ");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        telefFacturacion.setEditable(false);
        telefFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        telefFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        telefFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(telefFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, -1));

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Servicio Adquirido: ");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        fechaSalidaFacturacion.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(1752362280000L), java.util.Calendar.DAY_OF_MONTH));
        jPanel8.add(fechaSalidaFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total: ");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        totalFacturacion.setEditable(false);
        totalFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        totalFacturacion.setForeground(new java.awt.Color(0, 0, 0));
        totalFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(totalFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 220, 60));

        tablaAdicionales.setBackground(new java.awt.Color(204, 204, 204));
        tablaAdicionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Adicional", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAdicionales.setEnabled(false);
        jScrollPane2.setViewportView(tablaAdicionales);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 490, 100));

        adicionalFacturacion.setBackground(new java.awt.Color(0, 0, 0));
        adicionalFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        adicionalFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        adicionalFacturacion.setText("Agregar Adicional");
        adicionalFacturacion.setFocusPainted(false);
        adicionalFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionalFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(adicionalFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 170, 40));

        precioFacturacion.setEditable(false);
        jPanel8.add(precioFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 130, -1));

        generarTotalFacturacion.setBackground(new java.awt.Color(0, 0, 0));
        generarTotalFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        generarTotalFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        generarTotalFacturacion.setText("Generar Total");
        generarTotalFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarTotalFacturacionActionPerformed(evt);
            }
        });
        jPanel8.add(generarTotalFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 150, 40));

        fechaIngresoFacturacion.setEditable(false);
        jPanel8.add(fechaIngresoFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, -1));

        jLabel19.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Hora de Salida:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 850, 640));

        volverFacturacion.setBackground(new java.awt.Color(0, 0, 0));
        volverFacturacion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        volverFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        volverFacturacion.setText("Volver Menu");
        volverFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverFacturacionActionPerformed(evt);
            }
        });
        jPanel7.add(volverFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 130, 40));

        javax.swing.GroupLayout paraFacturacionLayout = new javax.swing.GroupLayout(paraFacturacion.getContentPane());
        paraFacturacion.getContentPane().setLayout(paraFacturacionLayout);
        paraFacturacionLayout.setHorizontalGroup(
            paraFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        paraFacturacionLayout.setVerticalGroup(
            paraFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Adicional");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        nombreAdicional.setBackground(new java.awt.Color(0, 0, 0));
        nombreAdicional.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        nombreAdicional.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(nombreAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 243, -1));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        precioAdicional.setBackground(new java.awt.Color(0, 0, 0));
        precioAdicional.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        precioAdicional.setForeground(new java.awt.Color(255, 255, 255));
        precioAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioAdicionalActionPerformed(evt);
            }
        });
        precioAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioAdicionalKeyTyped(evt);
            }
        });
        jPanel4.add(precioAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        aceptarAdicional.setBackground(new java.awt.Color(0, 0, 0));
        aceptarAdicional.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        aceptarAdicional.setForeground(new java.awt.Color(255, 255, 255));
        aceptarAdicional.setText("Aceptar");
        aceptarAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAdicionalActionPerformed(evt);
            }
        });
        jPanel4.add(aceptarAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -40, -1, -1));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 30, 30));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        javax.swing.GroupLayout paraAgregarAdicionalLayout = new javax.swing.GroupLayout(paraAgregarAdicional.getContentPane());
        paraAgregarAdicional.getContentPane().setLayout(paraAgregarAdicionalLayout);
        paraAgregarAdicionalLayout.setHorizontalGroup(
            paraAgregarAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        paraAgregarAdicionalLayout.setVerticalGroup(
            paraAgregarAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 220));

        services.setBackground(new java.awt.Color(0, 0, 0));
        services.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        services.setForeground(new java.awt.Color(255, 255, 255));
        services.setText("Servicios");
        services.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        services.setFocusPainted(false);
        services.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesActionPerformed(evt);
            }
        });
        jPanel1.add(services, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 40));

        reservas.setBackground(new java.awt.Color(0, 0, 0));
        reservas.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        reservas.setForeground(new java.awt.Color(255, 255, 255));
        reservas.setText("Reservas");
        reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reservas.setFocusPainted(false);
        reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasActionPerformed(evt);
            }
        });
        jPanel1.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 200, 40));

        fact.setBackground(new java.awt.Color(0, 0, 0));
        fact.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        fact.setForeground(new java.awt.Color(255, 255, 255));
        fact.setText("Facturacion");
        fact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fact.setFocusPainted(false);
        fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factActionPerformed(evt);
            }
        });
        jPanel1.add(fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 200, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablareservaciones = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablareservaciones.setBackground(new java.awt.Color(204, 204, 204));
        tablareservaciones.setForeground(new java.awt.Color(0, 0, 0));
        tablareservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nº Personas", "Servicio", "Precio", "Fecha Ingreso", "Telefono", "Check in"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablareservaciones);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 670, 290));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Reservaciones");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de la persona: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jlabel.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jlabel.setForeground(new java.awt.Color(0, 0, 0));
        jlabel.setText("Fecha de Ingreso:");
        jPanel3.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        numPersonasRes.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        numPersonasRes.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        numPersonasRes.setBorder(null);
        jPanel3.add(numPersonasRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, -1));

        checkoutRes.setBackground(new java.awt.Color(0, 0, 0));
        checkoutRes.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        checkoutRes.setForeground(new java.awt.Color(255, 255, 255));
        checkoutRes.setText("Check out");
        checkoutRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutResActionPerformed(evt);
            }
        });
        jPanel3.add(checkoutRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, -1, -1));

        perRes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        perRes.setForeground(new java.awt.Color(0, 0, 0));
        perRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perResActionPerformed(evt);
            }
        });
        perRes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                perResKeyTyped(evt);
            }
        });
        jPanel3.add(perRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 300, -1));

        aceptarReservas.setBackground(new java.awt.Color(0, 0, 0));
        aceptarReservas.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        aceptarReservas.setForeground(new java.awt.Color(255, 255, 255));
        aceptarReservas.setText("Agregar");
        aceptarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarReservasActionPerformed(evt);
            }
        });
        jPanel3.add(aceptarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 130, 40));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nº Personas:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        fechaRes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        fechaRes.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(1752107460000L), java.util.Calendar.DAY_OF_MONTH));
        jPanel3.add(fechaRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 30));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Servicio:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        telefRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefResActionPerformed(evt);
            }
        });
        telefRes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefResKeyTyped(evt);
            }
        });
        jPanel3.add(telefRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, -1));

        busquedaRes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion" }));
        busquedaRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaResActionPerformed(evt);
            }
        });
        jPanel3.add(busquedaRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 240, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 780, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void servicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesActionPerformed
        this.setVisible(false); //boton de servicios de admi, todo este codigo para que se vuelva a mostrar
        panelAdmi=new Admi();
        panelAdmi.setVisible(true);
    }//GEN-LAST:event_servicesActionPerformed

    private void aceptarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarReservasActionPerformed
        String servicioElegido=busquedaRes.getSelectedItem().toString();
        newRes=resH.BuscarPrecio(servicioElegido);
        
        String[] info2 = new String[7]; //creacion de array de 1 dimension, una fila con 7 espacios
        //evaluar si los label del jframe estan vacios
        boolean bool;
        bool = perRes.getText().isEmpty()&&numPersonasRes.getValue().equals(0)&&busquedaRes.getSelectedItem().equals(0)||perRes.getText().isEmpty()||numPersonasRes.getValue().equals(0)||busquedaRes.getSelectedItem().equals(0);
        if (bool) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos requeridos");
        }else{
            info2[0] = perRes.getText();
            info2[1] = numPersonasRes.getValue().toString();
            info2[2] = busquedaRes.getSelectedItem().toString();
            info2[3] = newRes.getPrecio().toString();
            info2[4] = fechaRes.getValue().toString();
            info2[5] = telefRes.getText();
            info2[6] = "Check In";
            newRes.setNombrePersona(info2[0]);
            newRes.setNumeroPersonas(Integer.parseInt(info2[1]));
            newRes.setServicio(info2[2]);
            newRes.setPrecio(Double.parseDouble(info2[3]));
            newRes.setFechaIngreso(info2[4]);
            newRes.setTelef(Integer.parseInt(info2[5]));
            newRes.setCheck(info2[6]);
            tabla2.addRow(info2);//agregar la fila
            resH.RegistrarReserva(newRes);
            perRes.setText("");
            telefRes.setText("");
            numPersonasRes.setValue(0);
            busquedaRes.setSelectedIndex(0);
            //busquedaRes.setSelectedIndex(0);
            
            this.setVisible(true); //y ver nuevamente la tabla con todo ya agregado
        }
           
    }//GEN-LAST:event_aceptarReservasActionPerformed

    private void perResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perResActionPerformed

    private void perResKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perResKeyTyped
        int key = evt.getKeyChar(); // solo letras con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean letras = (key>=65 && key<=122)||key==32;
        
        if (!letras) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_perResKeyTyped

    private void reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasActionPerformed
        this.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_reservasActionPerformed

    private void checkoutResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutResActionPerformed
        int seleccion=seleccionTablaReserva();
        if (seleccion>= 0) { //si el numero de filas seleccionada es mayor a 0  donde este numero es la primera fila xq va en array
            tablareservaciones.setValueAt("Check Out", seleccion, 6);
            newRes.setCheck(tablareservaciones.getValueAt(seleccion, 6).toString());
            newRes.setNombrePersona(tablareservaciones.getValueAt(seleccion, 0).toString());
            resH.ActualizarCheck(newRes.getCheck(), newRes.getNombrePersona());
        } else { //sino aparece una advertencia
            JOptionPane.showMessageDialog(null, "Selecciona una fila para cambiar el estado");
        }
    }//GEN-LAST:event_checkoutResActionPerformed

    
    
    
    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        int seleccion= seleccionTablaReserva();
        if (seleccion>=0) {
            if (tablareservaciones.getValueAt(seleccion, 6).equals("Check In")) {
                JOptionPane.showMessageDialog(null, "Para realizar la facturacion de un cliente primero debe retirarse, presiona el Check Out");
            }else{
                this.setVisible(false);
                paraFacturacion.setVisible(true);
                paraFacturacion.setTitle("Realizar la facturacion");
                paraFacturacion.setSize(1150, 740);
                paraFacturacion.setLocationRelativeTo(null);
                nombreFacturacion.setText(tablareservaciones.getValueAt(seleccion, 0).toString());
                servicioFacturacion.setText(tablareservaciones.getValueAt(seleccion, 2).toString());
                precioFacturacion.setText(tablareservaciones.getValueAt(seleccion, 3).toString());
                fechaIngresoFacturacion.setText(tablareservaciones.getValueAt(seleccion, 4).toString());
                telefFacturacion.setText(tablareservaciones.getValueAt(seleccion, 5).toString());
            }
                for (int i = 0; i < tablaAdicionales.getRowCount(); i++) {
                tabla3.removeRow(i);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Debes elegir una fila de la tabla de reservas para hacer la facturacion");
        }
    }//GEN-LAST:event_factActionPerformed

    private void telefResKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefResKeyTyped
       int key = evt.getKeyChar(); // solo numeros y punto con codigo ASCII

        boolean numeros = (key >= 48 && key <= 57) || key == 43||key==32;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_telefResKeyTyped

    private void pdfFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfFacturacionActionPerformed
        
        //Hacer visible la interfaz de reservas, generar el PDF AUTOMATICAMENTE
        boolean bool=totalFacturacion.getText().isEmpty();
        if (!bool) {
            this.pdf();
            paraFacturacion.dispose();
            totalFacturacion.setText("");
            this.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Debes generar el total para poder crear la boleta");
        }
    }//GEN-LAST:event_pdfFacturacionActionPerformed

    private void totalFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFacturacionActionPerformed
        
    }//GEN-LAST:event_totalFacturacionActionPerformed

    private void nombreFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFacturacionActionPerformed
      
    }//GEN-LAST:event_nombreFacturacionActionPerformed

    private void servicioFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioFacturacionActionPerformed
        
    }//GEN-LAST:event_servicioFacturacionActionPerformed

    private void telefFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefFacturacionActionPerformed

    }//GEN-LAST:event_telefFacturacionActionPerformed

    private void adicionalFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionalFacturacionActionPerformed
        paraAgregarAdicional.setVisible(true);
        paraAgregarAdicional.setLocationRelativeTo(null);
        paraAgregarAdicional.setTitle("Agregar Servicios Adicionales");
        paraAgregarAdicional.setSize(445, 300);
    }//GEN-LAST:event_adicionalFacturacionActionPerformed

    private void precioAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioAdicionalActionPerformed
       
    }//GEN-LAST:event_precioAdicionalActionPerformed

    private void precioAdicionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioAdicionalKeyTyped
        int key = evt.getKeyChar(); // solo numeros y punto con codigo ASCII

        boolean numeros = (key >= 48 && key <= 57)|| key == 46;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_precioAdicionalKeyTyped

    private void aceptarAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAdicionalActionPerformed
        String[] info = new String[2]; //creacion de array de 1 dimension, una fila con 2 espacios
        //evaluar si los label del jframe estan vacios
        boolean bool=nombreAdicional.getText().isEmpty()&&precioAdicional.getText().isEmpty();
        if (bool) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos completos");
        }else{
            info[0] = nombreAdicional.getText();
            info[1] = precioAdicional.getText();
            tabla3.addRow(info);//agregar la fila
            nombreAdicional.setText("");
            precioAdicional.setText("");
            paraAgregarAdicional.dispose(); //luego borrar el panel para agregar 
        }
    }//GEN-LAST:event_aceptarAdicionalActionPerformed

    private void telefResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefResActionPerformed

    private void volverFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverFacturacionActionPerformed
        paraAgregarAdicional.dispose();
        totalFacturacion.setText("");
        this.setVisible(true);
    }//GEN-LAST:event_volverFacturacionActionPerformed

    private void generarTotalFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarTotalFacturacionActionPerformed
        double precioServicio=Double.parseDouble(precioFacturacion.getText());
        double sumaAdicional=0, total;
        for (int i = 0; i < tablaAdicionales.getRowCount(); i++) {
            sumaAdicional+=Double.parseDouble(tablaAdicionales.getValueAt(i, 1).toString());
        }
        total=precioServicio+sumaAdicional;
        totalFacturacion.setText("S/."+String.valueOf(total));
        
    }//GEN-LAST:event_generarTotalFacturacionActionPerformed

    private void busquedaResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaResActionPerformed
        
    }//GEN-LAST:event_busquedaResActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarAdicional;
    private javax.swing.JButton aceptarReservas;
    private javax.swing.JToggleButton adicionalFacturacion;
    private javax.swing.JComboBox<String> busquedaRes;
    private javax.swing.JButton checkoutRes;
    private javax.swing.JButton fact;
    private javax.swing.JTextField fechaIngresoFacturacion;
    private javax.swing.JSpinner fechaRes;
    private javax.swing.JSpinner fechaSalidaFacturacion;
    private javax.swing.JButton generarTotalFacturacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTextField nombreAdicional;
    private javax.swing.JTextField nombreFacturacion;
    private javax.swing.JSpinner numPersonasRes;
    private javax.swing.JFrame paraAgregarAdicional;
    private javax.swing.JFrame paraFacturacion;
    private javax.swing.JButton pdfFacturacion;
    private javax.swing.JTextField perRes;
    private javax.swing.JTextField precioAdicional;
    private javax.swing.JTextField precioFacturacion;
    private javax.swing.JButton reservas;
    private javax.swing.JButton services;
    private javax.swing.JTextField servicioFacturacion;
    private javax.swing.JTable tablaAdicionales;
    private javax.swing.JTable tablareservaciones;
    private javax.swing.JTextField telefFacturacion;
    private javax.swing.JTextField telefRes;
    private javax.swing.JTextField totalFacturacion;
    private javax.swing.JButton volverFacturacion;
    // End of variables declaration//GEN-END:variables

    //Metodo para crear reportes en PDF
    
    public void pdf(){
        try{
            int index=tablareservaciones.getSelectedRow();
            FileOutputStream archivo;
            String url=FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            File file=new File(url+File.separator+index+"venta.pdf");
            archivo=new FileOutputStream(file);
            Document doc=new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img=Image.getInstance("src/images/logo.png");
            
            Paragraph fecha=new Paragraph();
            Font negrita=new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD, BaseColor.WHITE);
            fecha.add(Chunk.NEWLINE);
            Date date=new Date();
            fecha.add("Fecha: "+new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n\n");
            
            PdfPTable Encabezado=new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f,30f,70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Encabezado.addCell(img);
            
            String ruc="736492736";
            String nom="Hidden Hotel";
            String telef="4560317";
            String dir="Lima";
            
            Encabezado.addCell("");
            Encabezado.addCell("Ruc: "+ruc+"\nNombre: "+nom+"\nTelef: "+telef+"\nDireccion: "+dir);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cli=new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del Reservante"+"\n\n");
            doc.add(cli);
            
            PdfPTable tablacli=new PdfPTable(4);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] ColumnaCli=new float[]{50f,40f,60f,60f};
            tablacli.setWidths(ColumnaCli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1=new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl2=new PdfPCell(new Phrase("Telefono",negrita));
            PdfPCell cl3=new PdfPCell(new Phrase("Hora de Ingreso",negrita));
            PdfPCell cl4=new PdfPCell(new Phrase("Hora de Salida",negrita));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
            cl1.setBackgroundColor(BaseColor.DARK_GRAY);
            cl2.setBackgroundColor(BaseColor.DARK_GRAY);
            cl3.setBackgroundColor(BaseColor.DARK_GRAY);
            cl4.setBackgroundColor(BaseColor.DARK_GRAY);
            tablacli.addCell(cl1);
            tablacli.addCell(cl2);
            tablacli.addCell(cl3);
            tablacli.addCell(cl4);
            tablacli.addCell(nombreFacturacion.getText());
            tablacli.addCell(telefFacturacion.getText());
            tablacli.addCell(fechaIngresoFacturacion.getText());
            tablacli.addCell(fechaSalidaFacturacion.getValue().toString());
            
            doc.add(tablacli);
            
            //servicios y adicionales
            PdfPTable tablaserv=new PdfPTable(2);
            tablaserv.setWidthPercentage(100);
            tablaserv.getDefaultCell().setBorder(0);
            float[] Columnaserv=new float[]{60f,50f};
            tablaserv.setWidths(Columnaserv);
            tablaserv.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell serv1=new PdfPCell (new Phrase("Servicio", negrita));
            PdfPCell serv2=new PdfPCell (new Phrase("Precio",negrita));
            serv1.setBorder(0);
            serv2.setBorder(0);
            serv1.setBackgroundColor(BaseColor.DARK_GRAY);
            serv2.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaserv.addCell(serv1);
            tablaserv.addCell(serv2);
            tablaserv.addCell(servicioFacturacion.getText());
            tablaserv.addCell(precioFacturacion.getText());
            for (int i = 0; i < tablaAdicionales.getRowCount(); i++) {
                String servicioA=tablaAdicionales.getValueAt(i, 0).toString();
                String precioA=tablaAdicionales.getValueAt(i, 1).toString();
                tablaserv.addCell(servicioA);
                tablaserv.addCell(precioA);
            }
            doc.add(tablaserv);
            
            Paragraph info=new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: "+totalFacturacion.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            Paragraph firma=new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelacion y Firma\n\n");
            firma.add("-----------------------------------------");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            Paragraph mensaje=new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su compra");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        }catch(DocumentException | IOException e){
            System.out.println(e.toString());
        }
    }
    

}
