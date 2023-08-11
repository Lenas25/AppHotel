
package Usuario;


public class Usuario extends javax.swing.JFrame {

    Contacto contactanos;
    Reservaciones reservas;
    Servicios servicios;
    
    public Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Imgprin = new javax.swing.JLabel();
        serviciosUser = new javax.swing.JButton();
        contactoUser = new javax.swing.JButton();
        resUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 247, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡Bienvenido a Hidden Hotel!");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 420, -1));

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Explora nuestras habitaciones y suites, donde la elegancia\nse combina con el confort moderno, donde la belleza y \nel misterio se entrelazan para crear una experiencia única \nen su clase. Descubre el lujo escondido en cada y déjate \nllevar por el encanto cautivador que solo podemos \nofrecerte. Disfruta de servicios de clase mundial, desde \nnuestro spa de primer nivel hasta nuestra deliciosa oferta \ngastronómica. ¡Tu viaje hacia lo inolvidable comienza aquí!");
        jTextArea1.setAlignmentX(4.0F);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 460, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 660, 380));

        Imgprin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/valeriia-bugaiova-_pPHgeHz1uk-unsplash.jpg"))); // NOI18N
        jPanel1.add(Imgprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1500, 800));

        serviciosUser.setBackground(new java.awt.Color(248, 247, 255));
        serviciosUser.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        serviciosUser.setForeground(new java.awt.Color(51, 51, 51));
        serviciosUser.setText("Servicios");
        serviciosUser.setBorder(null);
        serviciosUser.setBorderPainted(false);
        serviciosUser.setFocusPainted(false);
        serviciosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosUserActionPerformed(evt);
            }
        });
        jPanel1.add(serviciosUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 140, 60));

        contactoUser.setBackground(new java.awt.Color(248, 247, 255));
        contactoUser.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        contactoUser.setForeground(new java.awt.Color(51, 51, 51));
        contactoUser.setText("Contactanos");
        contactoUser.setBorder(null);
        contactoUser.setBorderPainted(false);
        contactoUser.setFocusPainted(false);
        contactoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactoUserActionPerformed(evt);
            }
        });
        jPanel1.add(contactoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 130, 60));

        resUser.setBackground(new java.awt.Color(248, 247, 255));
        resUser.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        resUser.setForeground(new java.awt.Color(51, 51, 51));
        resUser.setText("Reservaciones");
        resUser.setBorder(null);
        resUser.setBorderPainted(false);
        resUser.setFocusPainted(false);
        resUser.setOpaque(true);
        resUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resUserActionPerformed(evt);
            }
        });
        jPanel1.add(resUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 190, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resUserActionPerformed
        reservas=new Reservaciones();
        reservas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_resUserActionPerformed

    private void serviciosUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosUserActionPerformed
        servicios=new Servicios();
        servicios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_serviciosUserActionPerformed

    private void contactoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactoUserActionPerformed
        contactanos=new Contacto();
        contactanos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_contactoUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imgprin;
    private javax.swing.JButton contactoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton resUser;
    private javax.swing.JButton serviciosUser;
    // End of variables declaration//GEN-END:variables
}
