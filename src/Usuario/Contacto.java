
package Usuario;

import Logica.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Contacto extends javax.swing.JFrame {
    
    Usuario userPrin;
    ContactoHotel cont= new ContactoHotel();
    ContactoDB contdb=new ContactoDB();
    
    public Contacto() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreContacto = new javax.swing.JTextField();
        telefContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailContacto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajeContacto = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enviarContacto = new javax.swing.JButton();
        volverContacto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1230, 795));

        jPanel1.setBackground(new java.awt.Color(169, 211, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contactanos!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans MT", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 56, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Celular:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        nombreContacto.setBackground(new java.awt.Color(204, 204, 204));
        nombreContacto.setForeground(new java.awt.Color(0, 0, 0));
        nombreContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContactoActionPerformed(evt);
            }
        });
        nombreContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreContactoKeyTyped(evt);
            }
        });
        jPanel3.add(nombreContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 242, -1));

        telefContacto.setBackground(new java.awt.Color(204, 204, 204));
        telefContacto.setForeground(new java.awt.Color(0, 0, 0));
        telefContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefContactoKeyTyped(evt);
            }
        });
        jPanel3.add(telefContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 182, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        emailContacto.setBackground(new java.awt.Color(204, 204, 204));
        emailContacto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(emailContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 242, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 170));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans MT", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        mensajeContacto.setBackground(new java.awt.Color(204, 204, 204));
        mensajeContacto.setColumns(20);
        mensajeContacto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        mensajeContacto.setForeground(new java.awt.Color(0, 0, 0));
        mensajeContacto.setLineWrap(true);
        mensajeContacto.setRows(5);
        mensajeContacto.setBorder(null);
        jScrollPane1.setViewportView(mensajeContacto);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dejanos tus mensaje y se comunicaran contigo");

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("lo mas pronto posible!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel7)
                        .addGap(66, 66, 66)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 400, 250));

        enviarContacto.setBackground(new java.awt.Color(153, 204, 255));
        enviarContacto.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        enviarContacto.setForeground(new java.awt.Color(255, 255, 255));
        enviarContacto.setText("Enviar");
        enviarContacto.setBorder(null);
        enviarContacto.setFocusPainted(false);
        enviarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarContactoActionPerformed(evt);
            }
        });
        jPanel2.add(enviarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 100, 40));

        volverContacto.setBackground(new java.awt.Color(153, 204, 255));
        volverContacto.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        volverContacto.setForeground(new java.awt.Color(255, 255, 255));
        volverContacto.setText("Volver");
        volverContacto.setBorder(null);
        volverContacto.setFocusPainted(false);
        volverContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverContactoActionPerformed(evt);
            }
        });
        jPanel2.add(volverContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 480, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/photo-1571003123894-1f0594d2b5d9.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

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

    private void nombreContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContactoActionPerformed
        
    }//GEN-LAST:event_nombreContactoActionPerformed

    private void volverContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverContactoActionPerformed
        userPrin=new Usuario();
        this.dispose();
        userPrin.setVisible(true);
    }//GEN-LAST:event_volverContactoActionPerformed

    private void telefContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefContactoKeyTyped
         int key = evt.getKeyChar(); // solo numeros no puntos con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean numeros = (key>=48 && key<=57)||key==43||key==32;
        
        if (!numeros) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_telefContactoKeyTyped

    private void enviarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarContactoActionPerformed
        boolean bool= nombreContacto.getText().isEmpty()||telefContacto.getText().isEmpty()||emailContacto.getText().isEmpty()||mensajeContacto.getText().isEmpty();
        if (bool) {
            JOptionPane.showMessageDialog(null,"Debes ingresar todos los datos que el formulario requiere", "", ERROR_MESSAGE);
        } else{
            cont.setNombrePersona(nombreContacto.getText());
            cont.setCorreoPersona(emailContacto.getText());
            cont.setCelularPersona(Integer.parseInt(telefContacto.getText()));
            cont.setMensaje(mensajeContacto.getText());
            contdb.RegistrarContacto(cont);
            JOptionPane.showMessageDialog(null, "Mensaje Enviado! Gracias por tu opinion");
            nombreContacto.setText("");
            telefContacto.setText("");
            emailContacto.setText("");
            mensajeContacto.setText("");
        }
    }//GEN-LAST:event_enviarContactoActionPerformed

    private void nombreContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreContactoKeyTyped
        int key = evt.getKeyChar(); // solo letras y numeros no puntos con codigo ASCII
        //BUSCAR PARA QUE SIRVE EXACTAMENTE
        boolean letras = (key>=65 && key<=122)||key==32;
        
        if (!letras) {
            evt.consume(); //impide la escritura de esos caracteres
        }
    }//GEN-LAST:event_nombreContactoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailContacto;
    private javax.swing.JButton enviarContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mensajeContacto;
    private javax.swing.JTextField nombreContacto;
    private javax.swing.JTextField telefContacto;
    private javax.swing.JButton volverContacto;
    // End of variables declaration//GEN-END:variables
}
