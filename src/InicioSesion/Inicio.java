
package InicioSesion;

import Admi.*;
import Logica.*;
import Registro.*;
import Usuario.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    Admi administrador;
    Usuario user;
    InicioSesion lg=new InicioSesion();
    InicioSesionDB login=new InicioSesionDB();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bienvenid@");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/revision.png")));
    }
    
    public void validar(){
        String nombreUser=usuario.getText();
        String pass=String.valueOf(contra.getText());
        lg=login.log(nombreUser, pass);
            if (lg.getNombreUsuario()!=null&&lg.getContra()!=null) {
                Usuario userPrin=new Usuario();
                userPrin.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra registrado ese Usuario, debes registrarte");
            }
        
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
        btnaceptarinicio = new javax.swing.JButton();
        btncancelarinicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(34, 34, 59));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel1.png.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, -1, -1));

        Usurario.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Usurario.setForeground(new java.awt.Color(0, 0, 0));
        Usurario.setText("Usuario");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        Contra.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Contra.setForeground(new java.awt.Color(0, 0, 0));
        Contra.setText("Contraseña");

        btnaceptarinicio.setBackground(new java.awt.Color(169, 214, 229));
        btnaceptarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btnaceptarinicio.setText("Aceptar");
        btnaceptarinicio.setFocusPainted(false);
        btnaceptarinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarinicioActionPerformed(evt);
            }
        });

        btncancelarinicio.setBackground(new java.awt.Color(169, 214, 229));
        btncancelarinicio.setForeground(new java.awt.Color(0, 0, 0));
        btncancelarinicio.setText("Cancelar");
        btncancelarinicio.setFocusPainted(false);
        btncancelarinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarinicioActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Todavía no tienes una cuenta?");

        btnregistrar.setBackground(new java.awt.Color(97, 165, 194));
        btnregistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnregistrar.setText("Registrarse");
        btnregistrar.setFocusPainted(false);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        contra.setText("jPasswordField1");
        contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Usurario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Contra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnaceptarinicio)
                        .addGap(68, 68, 68)
                        .addComponent(btncancelarinicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnregistrar)))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Usurario)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Contra)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaceptarinicio)
                    .addComponent(btncancelarinicio))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(btnregistrar))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        //para salir de la pantalla
        System.exit(0);
    }//GEN-LAST:event_btncancelarinicioActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        //crear objeto del JFrame registro, cuando se presione el boton podra ser visible el jframe de registro y el inicio de sesion desaparecera
        Registro registrarse= new Registro();
        registrarse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraMouseClicked
        //cuando presione automaticamente se quitara el texto
        contra.setText("");
    }//GEN-LAST:event_contraMouseClicked

    private void btnaceptarinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarinicioActionPerformed
        //BASE DE DATOS EVALUAR SI ESTA REGISTRADO O NO QUE SALGA UNA ADVERTENCIA SI NO LO ESTA Y SI SI, EVALUAR SI ES DE ADMI O USUARIO NORMAL
        
        if (usuario.getText().isEmpty()&&contra.getPassword().length==0||usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes ingresar tus datos completos");
        }else if(usuario.getText().equals("admi")&&contra.getText().equals("2023")){
            administrador=new Admi();
            administrador.setVisible(true);
            this.dispose();
        }else{
            validar();
        }
       
    }//GEN-LAST:event_btnaceptarinicioActionPerformed

        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel Usurario;
    private javax.swing.JButton btnaceptarinicio;
    private javax.swing.JButton btncancelarinicio;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JPasswordField contra;
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
