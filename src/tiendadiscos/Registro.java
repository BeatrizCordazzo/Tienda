/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tiendadiscos;

import javax.swing.JOptionPane;
import modelo.Encriptar;
import modelo.LoginApp;
import modelo.login;

/**
 *
 * @author Bia
 */
public class Registro extends javax.swing.JFrame {

    login lg = new login();
    LoginApp login = new LoginApp();

    /**
     * Creates new form inscricion
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void validar() {
        String correo = emailTxt.getText();
        String contrasena = String.valueOf(passTxt.getPassword());
        String nom = nomTxt.getText();
        String cargo = cargoCbx.getSelectedItem().toString();
        if (!"".equals(correo) || !"".equals(contrasena) || !"".equals(nom)) {
            lg.setNombre(nom);
            lg.setCorreo(correo);
            lg.setContrasena(contrasena);
            lg.setCargo(cargo);
            login.Registro(lg);
            Login iniciar = new Login();
            iniciar.setVisible(true);
            dispose();
        }
    }

    public void registrarUsuario(String correo, String contrasena) {
        String encriptedContrasena = Encriptar.hashPassword(contrasena);
        // Almacena el correo y la contraseña encriptada en tu base de datos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inscbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cargoCbx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Spin City Records");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misimg/tocadiscos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 180, 70));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 60, -1));

        nomTxt.setBackground(new java.awt.Color(204, 204, 204));
        nomTxt.setForeground(new java.awt.Color(0, 0, 0));
        nomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 380, 40));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, -1));

        passTxt.setBackground(new java.awt.Color(204, 204, 204));
        passTxt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 380, 40));

        loginbtn.setBackground(new java.awt.Color(204, 204, 204));
        loginbtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(0, 0, 0));
        loginbtn.setText("Iniciar sesión");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 110, 40));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ya tengo cuenta:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 140, -1));

        inscbtn.setBackground(new java.awt.Color(153, 153, 255));
        inscbtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        inscbtn.setForeground(new java.awt.Color(255, 255, 255));
        inscbtn.setText("Registrar");
        inscbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscbtnActionPerformed(evt);
            }
        });
        jPanel1.add(inscbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, 40));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Completo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 140, -1));

        emailTxt.setBackground(new java.awt.Color(204, 204, 204));
        emailTxt.setForeground(new java.awt.Color(0, 0, 0));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        jPanel1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 380, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cargo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 70, -1));

        cargoCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Gerente", "Vendedor" }));
        cargoCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoCbxActionPerformed(evt);
            }
        });
        jPanel1.add(cargoCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 330, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTxtActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void inscbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscbtnActionPerformed
        validar();
    }//GEN-LAST:event_inscbtnActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void cargoCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoCbxActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cargoCbx;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton inscbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField nomTxt;
    private javax.swing.JPasswordField passTxt;
    // End of variables declaration//GEN-END:variables
}
