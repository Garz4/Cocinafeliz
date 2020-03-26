package cocinafeliz;
public class LogIn extends javax.swing.JFrame {
    public static String[] lista = new String[5];
    public static int[] total = new int[5];
    public LogIn() {
        lista[0]="";
        lista[1]="";
        lista[2]="";
        lista[3]="";
        lista[4]="";
        total[0]=0;
        total[1]=0;
        total[2]=0;
        total[3]=0;
        total[4]=0;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        incorrect = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fondoLogIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        incorrect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        incorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(incorrect);
        incorrect.setBounds(50, 470, 440, 40);

        pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass.setText("jPasswordField1");
        jPanel1.add(pass);
        pass.setBounds(50, 290, 440, 50);

        usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usuario.setText("usuario");
        jPanel1.add(usuario);
        usuario.setBounds(50, 200, 440, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 370, 170, 50);

        fondoLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DESIGN_-02.jpg"))); // NOI18N
        jPanel1.add(fondoLogIn);
        fondoLogIn.setBounds(0, 0, 540, 960);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(540, 960));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(usuario.getText().equals("admin") && pass.getText().equals("admin")){
            new Mesas(1).setVisible(true);
            this.setVisible(false);
        }
        else
            incorrect.setText("¡USUARIO O CONTRASEÑA INCORRECTOS!");
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLogIn;
    private javax.swing.JLabel incorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
