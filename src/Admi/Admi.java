
package Admi;

import Logica.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Admi extends javax.swing.JFrame {

    //Crear objetos de otros paneles para poder utilizarlo y configurarlo
    DefaultTableModel tabla;
    Reservas panelRes;
    ServiciosHotel newServicio= new ServiciosHotel();
    ServiciosHotelDB ser= new ServiciosHotelDB();
    
    public Admi() {
        panelRes=new Reservas();
        initComponents();
        this.setLocationRelativeTo(null);
        this.tabla();
        this.ListarServicios();
    }
    
    public void ListarServicios(){
        List<ServiciosHotel> ListarS=ser.ListarServicio();
        tabla= (DefaultTableModel) tablaservicio.getModel();
        Object[] obj=new Object[5];
        for (int i = 0; i < ListarS.size(); i++) {
            obj[0]=ListarS.get(i).getId();
            obj[1]=ListarS.get(i).getNombreServicio();
            obj[2]=ListarS.get(i).getPrecio();
            obj[3]=ListarS.get(i).getDescripcion();
            obj[4]=ListarS.get(i).getDisponibilidad();
            tabla.addRow(obj);
        }
        tablaservicio.setModel(tabla);
    }
    
    public final void tabla(){
        tabla = new DefaultTableModel(); //nombre de una tabla personalizada, creacion completa del objeto
        tabla.addColumn("Id");//agregar columnas
        tabla.addColumn("Nombre");//agregar columnas
        tabla.addColumn("Precio");
        tabla.addColumn("Descripcion");
        tabla.addColumn("Disponibilidad");
        tablaservicio.setModel(tabla);//importar el modelo creado a jTable1
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraAgregar = new javax.swing.JFrame();
        deAgregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        newdis = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acceptAgregar = new javax.swing.JButton();
        cancelAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        newdescp = new javax.swing.JTextArea();
        newprecio = new javax.swing.JTextField();
        newservicio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        reservas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        services = new javax.swing.JButton();
        fact = new javax.swing.JButton();
        res = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaservicio = new javax.swing.JTable();
        servicios2 = new javax.swing.JPanel();
        eliminarad = new javax.swing.JButton();
        agregarad = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        deAgregar.setBackground(new java.awt.Color(255, 255, 255));
        deAgregar.setPreferredSize(new java.awt.Dimension(596, 440));
        deAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agregar servicio");
        deAgregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        newdis.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        newdis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        newdis.setBorder(null);
        deAgregar.add(newdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Habitaciones:");
        deAgregar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Servicio:");
        deAgregar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        acceptAgregar.setBackground(new java.awt.Color(70, 73, 75));
        acceptAgregar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        acceptAgregar.setForeground(new java.awt.Color(255, 255, 255));
        acceptAgregar.setText("Aceptar");
        acceptAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptAgregarActionPerformed(evt);
            }
        });
        deAgregar.add(acceptAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, 30));

        cancelAgregar.setBackground(new java.awt.Color(70, 73, 75));
        cancelAgregar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        cancelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        cancelAgregar.setText("Cancelar");
        cancelAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAgregarActionPerformed(evt);
            }
        });
        deAgregar.add(cancelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, 30));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");
        deAgregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion:");
        deAgregar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        deAgregar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 127, -1));
        deAgregar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 118, -1));

        newdescp.setColumns(20);
        newdescp.setForeground(new java.awt.Color(0, 0, 0));
        newdescp.setLineWrap(true);
        newdescp.setRows(5);
        jScrollPane3.setViewportView(newdescp);

        deAgregar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 360, -1));

        newprecio.setForeground(new java.awt.Color(0, 0, 0));
        newprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newprecioActionPerformed(evt);
            }
        });
        newprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newprecioKeyTyped(evt);
            }
        });
        deAgregar.add(newprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 116, -1));

        newservicio.setForeground(new java.awt.Color(0, 0, 0));
        newservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newservicioActionPerformed(evt);
            }
        });
        deAgregar.add(newservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 360, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        deAgregar.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 600, 30));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        deAgregar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 440));

        javax.swing.GroupLayout paraAgregarLayout = new javax.swing.GroupLayout(paraAgregar.getContentPane());
        paraAgregar.getContentPane().setLayout(paraAgregarLayout);
        paraAgregarLayout.setHorizontalGroup(
            paraAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(paraAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paraAgregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        paraAgregarLayout.setVerticalGroup(
            paraAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(paraAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paraAgregarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(deAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reservas.setBackground(new java.awt.Color(255, 255, 255));
        reservas.setPreferredSize(new java.awt.Dimension(1175, 730));
        reservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        reservas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 280, 220));

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
        reservas.add(services, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, 40));

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
        reservas.add(fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 170, 40));

        res.setBackground(new java.awt.Color(0, 0, 0));
        res.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        res.setForeground(new java.awt.Color(255, 255, 255));
        res.setText("Reservas");
        res.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        res.setFocusPainted(false);
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        reservas.add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 170, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaservicio.setBackground(new java.awt.Color(204, 204, 204));
        tablaservicio.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        tablaservicio.setForeground(new java.awt.Color(0, 0, 0));
        tablaservicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Servicio", "Precio", "Descripcion", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaservicio);

        servicios2.setBackground(new java.awt.Color(255, 255, 255));
        servicios2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarad.setBackground(new java.awt.Color(0, 0, 0));
        eliminarad.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        eliminarad.setForeground(new java.awt.Color(255, 255, 255));
        eliminarad.setText("Eliminar");
        eliminarad.setBorder(null);
        eliminarad.setFocusPainted(false);
        eliminarad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaradActionPerformed(evt);
            }
        });
        servicios2.add(eliminarad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 87, 34));

        agregarad.setBackground(new java.awt.Color(0, 0, 0));
        agregarad.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        agregarad.setForeground(new java.awt.Color(255, 255, 255));
        agregarad.setText("Agregar");
        agregarad.setBorder(null);
        agregarad.setFocusPainted(false);
        agregarad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaradActionPerformed(evt);
            }
        });
        servicios2.add(agregarad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 91, 34));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Servicios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(servicios2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(servicios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        reservas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 810, 620));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        reservas.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 850, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void servicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesActionPerformed
        this.setVisible(false); //boton de servicios de admi, todo este codigo para que se vuelva a mostrar
        this.setVisible(true);
    }//GEN-LAST:event_servicesActionPerformed

    private void eliminaradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaradActionPerformed
        int fila = tablaservicio.getSelectedRow(); //para que fila tenga el valor de la fila de la tabla seleccionada
        if (fila >= 0) { //si el numero de filas seleccionada es mayor a 0
            int id=Integer.parseInt(tablaservicio.getValueAt(fila, 0).toString());
            ser.EliminarServicio(id);//metodo para que se borre en la base de datos
            tabla.removeRow(fila);//remover la fila o las filas seleccionadas
            ser.ListarServicio();
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar Fila");
        }
    }//GEN-LAST:event_eliminaradActionPerformed

    private void agregaradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaradActionPerformed
        paraAgregar.setVisible(true);//para ver el panel extra de agregar
        paraAgregar.setTitle("Agregar servicios");
        paraAgregar.setSize(596, 478);
        paraAgregar.setLocationRelativeTo(null);
        tablaservicio.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_agregaradActionPerformed

    private void cancelAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAgregarActionPerformed
        paraAgregar.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_cancelAgregarActionPerformed

    private void acceptAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptAgregarActionPerformed
        this.setVisible(false);
        String[] info = new String[5]; //creacion de array de 1 dimension, una fila con 4 espacios
        //evaluar si los label del jframe estan vacios
        boolean bool=newservicio.getText().isEmpty()&&newprecio.getText().isEmpty()&&newdescp.getText().isEmpty();
        if (bool) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos requeridos");
        }else{
            info[1] = newservicio.getText();
            info[2] = newprecio.getText();
            info[3] = newdescp.getText();
            info[4] = newdis.getValue().toString();
            newServicio.setNombreServicio(newservicio.getText());
            newServicio.setPrecio(Double.parseDouble(newprecio.getText()));
            newServicio.setDescripcion(newdescp.getText());
            newServicio.setDisponibilidad((int) newdis.getValue());
            ser.RegistrarServicio(newServicio);
            tabla.addRow(info);//agregar la fila
            //para limpiar los datos luego de presionar guardar
            newservicio.setText("");
            newprecio.setText("");
            newdescp.setText("");
            newdis.setValue(0);
            paraAgregar.dispose(); //luego borrar el panel para agregar 
            this.setVisible(true); //y ver nuevamente la tabla con todo ya agregado
        }
    }//GEN-LAST:event_acceptAgregarActionPerformed

    private void newprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newprecioActionPerformed
        
    }//GEN-LAST:event_newprecioActionPerformed

    private void newprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newprecioKeyTyped
        int key = evt.getKeyChar(); // solo numeros y punto con codigo ASCII

        boolean numeros = key >= 46 && key <= 57 && key != 47||key==44;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_newprecioKeyTyped

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        panelRes=new Reservas();
        this.setVisible(false);
        panelRes.setVisible(true);
    }//GEN-LAST:event_resActionPerformed

    private void newservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newservicioActionPerformed

    private void factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factActionPerformed
        JOptionPane.showMessageDialog(null, "Debes elegir una fila de la tabla de reservas para hacer la facturacion");
    }//GEN-LAST:event_factActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptAgregar;
    private javax.swing.JButton agregarad;
    private javax.swing.JButton cancelAgregar;
    private javax.swing.JPanel deAgregar;
    private javax.swing.JButton eliminarad;
    private javax.swing.JButton fact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea newdescp;
    private javax.swing.JSpinner newdis;
    private javax.swing.JTextField newprecio;
    private javax.swing.JTextField newservicio;
    private javax.swing.JFrame paraAgregar;
    private javax.swing.JButton res;
    private javax.swing.JPanel reservas;
    private javax.swing.JButton services;
    private javax.swing.JPanel servicios2;
    private javax.swing.JTable tablaservicio;
    // End of variables declaration//GEN-END:variables
}
