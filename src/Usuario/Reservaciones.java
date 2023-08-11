
package Usuario;

import Logica.*;
import javax.swing.JOptionPane;

public class Reservaciones extends javax.swing.JFrame {

   
    Usuario userprin;
    ReservasHotelDB resH= new ReservasHotelDB();
    ReservasHotel newRes= new ReservasHotel();
    
    public Reservaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        resH.ConsultarServicio(servicioUsuarioReservaciones);;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volverRes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        servicioUsuarioReservaciones = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        precioUsuarioReservaciones = new javax.swing.JTextField();
        reservanteUsuarioReservaciones = new javax.swing.JTextField();
        personasUsuarioReservaciones = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telefUsuarioReservaciones = new javax.swing.JTextField();
        realizarReservaUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fechaUsuarioReservaciones = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reservaciones");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        volverRes.setBackground(new java.awt.Color(255, 255, 255));
        volverRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/25618.png"))); // NOI18N
        volverRes.setBorder(null);
        volverRes.setFocusPainted(false);
        volverRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverResActionPerformed(evt);
            }
        });
        jPanel4.add(volverRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre del reservante: ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        servicioUsuarioReservaciones.setEditable(true);
        servicioUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        servicioUsuarioReservaciones.setForeground(new java.awt.Color(0, 0, 0));
        servicioUsuarioReservaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un servicio" }));
        servicioUsuarioReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioUsuarioReservacionesActionPerformed(evt);
            }
        });
        jPanel4.add(servicioUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 160, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Seleccione un servicio: ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        precioUsuarioReservaciones.setEditable(false);
        precioUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        precioUsuarioReservaciones.setForeground(new java.awt.Color(0, 0, 0));
        precioUsuarioReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioUsuarioReservacionesActionPerformed(evt);
            }
        });
        jPanel4.add(precioUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 80, -1));

        reservanteUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        reservanteUsuarioReservaciones.setForeground(new java.awt.Color(0, 0, 0));
        reservanteUsuarioReservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reservanteUsuarioReservacionesKeyTyped(evt);
            }
        });
        jPanel4.add(reservanteUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 270, -1));

        personasUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        personasUsuarioReservaciones.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jPanel4.add(personasUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nº Personas:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 20));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero de telefono:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 20));

        telefUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        telefUsuarioReservaciones.setForeground(new java.awt.Color(0, 0, 0));
        telefUsuarioReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefUsuarioReservacionesActionPerformed(evt);
            }
        });
        telefUsuarioReservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefUsuarioReservacionesKeyTyped(evt);
            }
        });
        jPanel4.add(telefUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 160, -1));

        realizarReservaUsuario.setBackground(new java.awt.Color(0, 102, 164));
        realizarReservaUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        realizarReservaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        realizarReservaUsuario.setText("Realizar Reserva");
        realizarReservaUsuario.setFocusPainted(false);
        realizarReservaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarReservaUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(realizarReservaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 230, 50));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de ingreso:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        fechaUsuarioReservaciones.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        fechaUsuarioReservaciones.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(1720747860000L), java.util.Calendar.DAY_OF_MONTH));
        jPanel4.add(fechaUsuarioReservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 160, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 490, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fernando-alvarez-rodriguez-M7GddPqJowg-unsplash.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1100, 750));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1050, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverResActionPerformed
        userprin=new Usuario();
        userprin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverResActionPerformed

    private void realizarReservaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarReservaUsuarioActionPerformed
        boolean bool=reservanteUsuarioReservaciones.getText().isEmpty()&&telefUsuarioReservaciones.getText().isEmpty()&&personasUsuarioReservaciones.getValue().equals(0);
        if (bool) {
            JOptionPane.showMessageDialog(null,"Debes ingresar todos los datos para poder realizar la reserva");
        }else{
            newRes.setNombrePersona(reservanteUsuarioReservaciones.getText());
            newRes.setNumeroPersonas(Integer.parseInt(personasUsuarioReservaciones.getValue().toString()));
            newRes.setServicio(servicioUsuarioReservaciones.getSelectedItem().toString());
            newRes.setPrecio(Double.valueOf(precioUsuarioReservaciones.getText()));
            newRes.setFechaIngreso(fechaUsuarioReservaciones.getValue().toString());
            newRes.setTelef(Integer.parseInt(telefUsuarioReservaciones.getText()));
            newRes.setCheck("Check In");
            resH.RegistrarReserva(newRes);
            JOptionPane.showMessageDialog(null,"Reservacion realizada, pronto alguien se comunicara contigo al numero de telefono brindado");
            reservanteUsuarioReservaciones.setText("");
            personasUsuarioReservaciones.setValue(0);
            precioUsuarioReservaciones.setText("");
            telefUsuarioReservaciones.setText("");
            servicioUsuarioReservaciones.setSelectedIndex(0);
        }
        
        
    }//GEN-LAST:event_realizarReservaUsuarioActionPerformed

    private void telefUsuarioReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefUsuarioReservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefUsuarioReservacionesActionPerformed

    private void precioUsuarioReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioUsuarioReservacionesActionPerformed
        
    }//GEN-LAST:event_precioUsuarioReservacionesActionPerformed

    private void telefUsuarioReservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefUsuarioReservacionesKeyTyped
        int key = evt.getKeyChar(); // solo numeros  con codigo ASCII

        boolean numeros = (key >= 48 && key <= 57) || key == 43||key==32;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_telefUsuarioReservacionesKeyTyped

    private void reservanteUsuarioReservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reservanteUsuarioReservacionesKeyTyped
        int key = evt.getKeyChar(); // solo letras con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean letras = (key>=65 && key<=122)||key==32;
        
        if (!letras) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_reservanteUsuarioReservacionesKeyTyped

    private void servicioUsuarioReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioUsuarioReservacionesActionPerformed
        int seleccion= servicioUsuarioReservaciones.getSelectedIndex();
        if (seleccion==0) {
            JOptionPane.showMessageDialog(null, "Debes elegir un servicio");
        }else{
            String servicioElegido=servicioUsuarioReservaciones.getSelectedItem().toString();
            newRes=resH.BuscarPrecio(servicioElegido);
            precioUsuarioReservaciones.setText(newRes.getPrecio().toString());
        }
    }//GEN-LAST:event_servicioUsuarioReservacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner fechaUsuarioReservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner personasUsuarioReservaciones;
    private javax.swing.JTextField precioUsuarioReservaciones;
    private javax.swing.JButton realizarReservaUsuario;
    private javax.swing.JTextField reservanteUsuarioReservaciones;
    private javax.swing.JComboBox<String> servicioUsuarioReservaciones;
    private javax.swing.JTextField telefUsuarioReservaciones;
    private javax.swing.JButton volverRes;
    // End of variables declaration//GEN-END:variables
}
