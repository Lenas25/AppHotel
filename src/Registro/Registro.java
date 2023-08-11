
package Registro;

import Usuario.*;
import Logica.*;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    Usuario user;
    InicioSesion newUsuario= new InicioSesion();
    InicioSesionDB us=new InicioSesionDB();
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Registro");
        user= new Usuario();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newnombre = new javax.swing.JTextField();
        btnini = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        newcontra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        newusuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrarse");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 140, 40));

        newnombre.setText("Ingrese su nombre y apellido");
        newnombre.setAlignmentX(2.0F);
        newnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newnombreMouseClicked(evt);
            }
        });
        newnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newnombreActionPerformed(evt);
            }
        });
        newnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newnombreKeyTyped(evt);
            }
        });
        jPanel1.add(newnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, 30));

        btnini.setBackground(new java.awt.Color(57, 113, 107));
        btnini.setForeground(new java.awt.Color(255, 255, 255));
        btnini.setText("Iniciar");
        btnini.setFocusPainted(false);
        btnini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btniniMouseClicked(evt);
            }
        });
        btnini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniActionPerformed(evt);
            }
        });
        jPanel1.add(btnini, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 210, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel2.jpg"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 260));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 70, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contra.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 50, 60));

        newcontra.setText("jPasswordField1");
        newcontra.setBorder(null);
        newcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newcontraMouseClicked(evt);
            }
        });
        jPanel1.add(newcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 210, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 160, 10));

        newusuario.setText("Ingrese nombre de usuario");
        newusuario.setAlignmentX(2.0F);
        newusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        newusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newusuarioMouseClicked(evt);
            }
        });
        newusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(newusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 166, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 160, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniActionPerformed
        
        boolean bool1=newusuario.getText().isEmpty()&&newcontra.getPassword().length==0&&newnombre.getText().isEmpty()||newcontra.getPassword().length==0||newusuario.getText().isEmpty()||newnombre.getText().isEmpty();
        boolean bool2=newusuario.getText().equals("Ingrese nombre de usuario")&&newcontra.getPassword().length==0&&newnombre.getText().equals("Ingrese su nombre y apellido")||newcontra.getPassword().length==0||newusuario.getText().equals("Ingrese nombre de usuario")||newnombre.getText().equals("Ingrese su nombre y apellido");
        if (bool1){
            JOptionPane.showMessageDialog(null, "Ingresa los datos requeridos para ingresar");
        }else if(bool2){
            JOptionPane.showMessageDialog(null, "Debes completar todos los datos");
        }else{
            newUsuario.setNombreApellido(newnombre.getText());
            newUsuario.setNombreUsuario(newusuario.getText());
            newUsuario.setContra(newcontra.getText());
            us.RegistrarUsuario(newUsuario);//llamado de metodo que agrega un usuario a la base de datos
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
            user.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btniniActionPerformed

    private void newnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newnombreActionPerformed
        
    }//GEN-LAST:event_newnombreActionPerformed

    private void newnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newnombreMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newnombre.setText("");
    }//GEN-LAST:event_newnombreMouseClicked

    private void newcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newcontraMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newcontra.setText("");
    }//GEN-LAST:event_newcontraMouseClicked

    private void newusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newusuarioMouseClicked
        //Al hacer click en el field se elimina el texto automatico
        this.newusuario.setText("");
    }//GEN-LAST:event_newusuarioMouseClicked

    private void newusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newusuarioActionPerformed
        
    }//GEN-LAST:event_newusuarioActionPerformed

    private void newnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newnombreKeyTyped
        int key = evt.getKeyChar(); // solo letras y numeros no puntos con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean letras = (key>=65 && key<=122)||key==32;
        
        if (!letras) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_newnombreKeyTyped

    private void btniniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniMouseClicked

    }//GEN-LAST:event_btniniMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField newcontra;
    private javax.swing.JTextField newnombre;
    private javax.swing.JTextField newusuario;
    // End of variables declaration//GEN-END:variables
}
