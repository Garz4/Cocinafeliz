package cocinafeliz;

import java.awt.Color;

public class Orden extends javax.swing.JFrame {
    int num;
    public Orden(int a) {
        initComponents();
        num=a;
        orden.setText(LogIn.lista[num-1]+"\n\nTotal: $"+LogIn.total[num-1]+".00");
        numMesa.setText("Mesa "+num);
        botonMesas.setBackground(new Color(0,0,0,0));
        botonPlatillos.setBackground(new Color(0,0,0,0));
        botonOrden.setBackground(new Color(0,0,0,0));
        botonSalir.setBackground(new Color(0,0,0,0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orden = new javax.swing.JTextArea();
        limpiarMesa = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        numMesa = new javax.swing.JLabel();
        botonPlatillos = new javax.swing.JButton();
        botonOrden = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        fondoOrden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        orden.setColumns(20);
        orden.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        orden.setRows(5);
        orden.setBorder(null);
        jScrollPane1.setViewportView(orden);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 150, 350, 660);

        limpiarMesa.setBackground(new java.awt.Color(0, 204, 0));
        limpiarMesa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        limpiarMesa.setText("Limpiar mesa");
        limpiarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMesaActionPerformed(evt);
            }
        });
        jPanel1.add(limpiarMesa);
        limpiarMesa.setBounds(210, 880, 300, 60);

        botonMesas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMesas.setForeground(new java.awt.Color(255, 255, 255));
        botonMesas.setText("Mesas");
        botonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMesasActionPerformed(evt);
            }
        });
        jPanel1.add(botonMesas);
        botonMesas.setBounds(0, 190, 170, 110);

        numMesa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(numMesa);
        numMesa.setBounds(180, 4, 360, 40);

        botonPlatillos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        botonPlatillos.setText("Platillos");
        botonPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlatillosActionPerformed(evt);
            }
        });
        jPanel1.add(botonPlatillos);
        botonPlatillos.setBounds(0, 300, 170, 110);

        botonOrden.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        botonOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonOrden.setText("Orden");
        jPanel1.add(botonOrden);
        botonOrden.setBounds(0, 410, 170, 110);

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir);
        botonSalir.setBounds(0, 850, 170, 110);

        fondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DESIGN_-05.jpg"))); // NOI18N
        jPanel1.add(fondoOrden);
        fondoOrden.setBounds(0, 0, 540, 960);

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

        setSize(new java.awt.Dimension(556, 999));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        new Mesas(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMesasActionPerformed

    private void botonPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlatillosActionPerformed
        new Platillos(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPlatillosActionPerformed

    private void limpiarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMesaActionPerformed
        new Alerta(num).setVisible(true);
    }//GEN-LAST:event_limpiarMesaActionPerformed
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
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Orden(1).setVisible(true);
        });
    }
    public static void limpiar(){

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonOrden;
    private javax.swing.JButton botonPlatillos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondoOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarMesa;
    private javax.swing.JLabel numMesa;
    private javax.swing.JTextArea orden;
    // End of variables declaration//GEN-END:variables
}
