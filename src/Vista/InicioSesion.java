/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bienvenid@");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Usurario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        Contra = new javax.swing.JLabel();
        contra = new javax.swing.JTextField();
        btnaceptarinicio = new javax.swing.JButton();
        btncancelarinicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 34, 59));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel1.png.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 0, 460, 580));

        Usurario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Usurario.setForeground(new java.awt.Color(0, 0, 0));
        Usurario.setText("Usuario");
        jPanel1.add(Usurario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        usuario.setText("jTextField1");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 300, 200, -1));

        Contra.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Contra.setForeground(new java.awt.Color(0, 0, 0));
        Contra.setText("Contraseña");
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        contra.setText("jTextField2");
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 370, 200, -1));

        btnaceptarinicio.setBackground(new java.awt.Color(169, 214, 229));
        btnaceptarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btnaceptarinicio.setText("Aceptar");
        jPanel1.add(btnaceptarinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        btncancelarinicio.setBackground(new java.awt.Color(169, 214, 229));
        btncancelarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btncancelarinicio.setText("Cancelar");
        btncancelarinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarinicioActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelarinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Todavía no tienes una cuenta?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        btnregistrar.setBackground(new java.awt.Color(97, 165, 194));
        btnregistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrar.setText("Registrarse");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        jPanel4.setBackground(new java.awt.Color(169, 214, 229));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 10, 20));

        jPanel5.setBackground(new java.awt.Color(169, 214, 229));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarinicioActionPerformed
        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_btncancelarinicioActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        Registro abrir= new Registro();
        abrir.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel Usurario;
    private javax.swing.JButton btnaceptarinicio;
    private javax.swing.JButton btncancelarinicio;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JTextField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
