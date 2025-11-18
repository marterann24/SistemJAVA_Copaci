/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;

/**
 *
 * @author marit
 */
public class LoginF extends javax.swing.JFrame {

    public LoginF() {
        initComponents();
    setupPlaceholders();

    btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        IniciarSesion();
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        LabelUser = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInicioSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtUsuario.setText("Ingresa tu usuario:");
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        txtPassword.setText("Ingresa tu contraseña:");
        txtPassword.setBorder(null);

        LabelUser.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        LabelUser.setText("Usuario:");

        LabelPassword.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        LabelPassword.setText("Contraseña:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/user1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInicioSesion.setBackground(new java.awt.Color(0, 0, 102));
        btnInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setText("Iniciar sesión");
        btnInicioSesion.setActionCommand("Ingresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(LabelPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(LabelUser)
                .addGap(39, 39, 39)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LabelPassword)
                .addGap(34, 34, 34)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnInicioSesion)
                .addGap(103, 103, 103))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

private void setupPlaceholders(){
    txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.GRAY));
    txtUsuario.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtUsuario.setText("Ingresa tu usuario:");  // ← ESTE TEXTO
    txtUsuario.setForeground(java.awt.Color.GRAY);
    txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtUsuario.getText().equals("Ingresa tu usuario:")) {  // ← DEBE COINCIDIR
                txtUsuario.setText("");
                txtUsuario.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtUsuario.getText().isEmpty()) {
                txtUsuario.setText("Ingresa tu usuario:");  // ← DEBE COINCIDIR
                txtUsuario.setForeground(java.awt.Color.GRAY);
            }
        }
    });
    
    txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.GRAY));
    txtPassword.setBackground(new java.awt.Color(0, 0, 0, 0));
    txtPassword.setText("Ingresa tu contraseña:");  // ← ESTE TEXTO
    txtPassword.setForeground(java.awt.Color.GRAY);
    txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtPassword.getText().equals("Ingresa tu contraseña:")) {  // ← DEBE COINCIDIR
                txtPassword.setText("");
                txtPassword.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtPassword.getText().isEmpty()) {
                txtPassword.setText("Ingresa tu contraseña:");  // ← DEBE COINCIDIR
                txtPassword.setForeground(java.awt.Color.GRAY);
            }
        }
    });
}   
private void IniciarSesion() {
        String usuario = txtUsuario.getText().trim();
        String password = txtPassword.getText().trim(); // <-- para JTextField funciona perfecto

        if (usuario.equals("Ingresa tu usuario:") || usuario.isEmpty()
                || password.equals("Ingresa tu contraseña:") || password.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Por favor ingresa usuario y contraseña");
            return;
        }

        BD.DataBase_Connection conexion = new BD.DataBase_Connection();
        java.sql.Connection conn = conexion.getConnection();

        try {
            String sql = "SELECT nombre FROM administrador WHERE usuario = ? AND password = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, password);

            java.sql.ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");

                JOptionPane.showMessageDialog(this,
                        "✔ Inicio de sesión exitoso\nBienvenido, " + nombre + "!");

                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "❌ Usuario o contraseña incorrectos");
            }

            rs.close();
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "❌ Error al conectar con la base de datos");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
