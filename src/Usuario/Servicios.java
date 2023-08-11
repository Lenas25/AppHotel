
package Usuario;

import Logica.ServiciosHotel;
import Logica.ServiciosHotelDB;
import java.util.List;


public class Servicios extends javax.swing.JFrame {
    
    Usuario userPrin=new Usuario();
    ServiciosHotel servicios= new ServiciosHotel();
    ServiciosHotelDB ser= new ServiciosHotelDB();
    
    public Servicios() {
        initComponents();
        this.setLocationRelativeTo(null);
        ser.ConsultarServicio(buscarServ);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descDisponible = new javax.swing.JTextArea();
        precioDisponible = new javax.swing.JTextField();
        buscarServ = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        volverServicios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vita-vilcina-KtOid0FLjqU-unsplash.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franck-morisset-UFhM8kMuQbo-unsplash.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 170, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paolo-nicolello.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 320, 250));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sara-dubler-Koei_7yYtIo-unsplash.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 440, 580));

        descDisponible.setBackground(new java.awt.Color(255, 255, 255));
        descDisponible.setColumns(20);
        descDisponible.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        descDisponible.setForeground(new java.awt.Color(0, 0, 0));
        descDisponible.setLineWrap(true);
        descDisponible.setRows(5);
        descDisponible.setEnabled(false);
        descDisponible.setFocusable(false);
        descDisponible.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(descDisponible);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 350, 140));

        precioDisponible.setBackground(new java.awt.Color(255, 255, 255));
        precioDisponible.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        precioDisponible.setForeground(new java.awt.Color(0, 0, 0));
        precioDisponible.setEnabled(false);
        precioDisponible.setFocusable(false);
        precioDisponible.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(precioDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 230, 40));

        buscarServ.setBackground(new java.awt.Color(255, 255, 255));
        buscarServ.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        buscarServ.setForeground(new java.awt.Color(0, 0, 0));
        buscarServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno para ver detalles" }));
        buscarServ.setFocusTraversalPolicyProvider(true);
        buscarServ.setFocusable(false);
        buscarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarServActionPerformed(evt);
            }
        });
        jPanel1.add(buscarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 350, 40));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Servicios ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Disponibles");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        volverServicios.setBackground(new java.awt.Color(255, 255, 255));
        volverServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/25618.png"))); // NOI18N
        volverServicios.setBorder(null);
        volverServicios.setFocusPainted(false);
        volverServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(volverServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverServiciosActionPerformed
        userPrin=new Usuario();
        userPrin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverServiciosActionPerformed

    private void buscarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarServActionPerformed
       String servicioElegido=buscarServ.getSelectedItem().toString();
       servicios=ser.BuscarDatos(servicioElegido);
       precioDisponible.setText(String.valueOf(servicios.getPrecio()));
       descDisponible.setText(servicios.getDescripcion());
    }//GEN-LAST:event_buscarServActionPerformed
    
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> buscarServ;
    private javax.swing.JTextArea descDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precioDisponible;
    private javax.swing.JButton volverServicios;
    // End of variables declaration//GEN-END:variables
}
