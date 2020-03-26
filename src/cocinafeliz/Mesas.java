package cocinafeliz;
import java.awt.Color;
public class Mesas extends javax.swing.JFrame {
    int num;
    public Mesas(int a) {
        initComponents();
        num=a;
        numMesa.setText("Mesa "+num);
        botonMesas.setBackground(new Color(0,0,0,0));
        botonPlatillos.setBackground(new Color(0,0,0,0));
        botonOrden.setBackground(new Color(0,0,0,0));
        botonSalir.setBackground(new Color(0,0,0,0));
        switch(num){
            case 1: 
                mesaUno.setSelected(true);
                mesaDos.setSelected(false);
                mesaTres.setSelected(false);
                mesaCuatro.setSelected(false);
                mesaCinco.setSelected(false);
                break;
            case 2:
                mesaUno.setSelected(false);
                mesaDos.setSelected(true);
                mesaTres.setSelected(false);
                mesaCuatro.setSelected(false);
                mesaCinco.setSelected(false);
                break;
            case 3:
                mesaUno.setSelected(false);
                mesaDos.setSelected(false);
                mesaTres.setSelected(true);
                mesaCuatro.setSelected(false);
                mesaCinco.setSelected(false);
                break;
            case 4:
                mesaUno.setSelected(false);
                mesaDos.setSelected(false);
                mesaTres.setSelected(false);
                mesaCuatro.setSelected(true);
                mesaCinco.setSelected(false);
                break;
            case 5:
                mesaUno.setSelected(false);
                mesaDos.setSelected(false);
                mesaTres.setSelected(false);
                mesaCuatro.setSelected(false);
                mesaCinco.setSelected(true);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMesas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        mesaCinco = new javax.swing.JToggleButton();
        mesaCuatro = new javax.swing.JToggleButton();
        mesaTres = new javax.swing.JToggleButton();
        mesaDos = new javax.swing.JToggleButton();
        mesaUno = new javax.swing.JToggleButton();
        botonPlatillos = new javax.swing.JButton();
        botonOrden = new javax.swing.JButton();
        botonMesas = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        numMesa = new javax.swing.JLabel();
        fondoMesas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        grupoMesas.add(mesaCinco);
        mesaCinco.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        mesaCinco.setText("5");
        mesaCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaCincoActionPerformed(evt);
            }
        });
        jPanel1.add(mesaCinco);
        mesaCinco.setBounds(190, 480, 140, 140);

        grupoMesas.add(mesaCuatro);
        mesaCuatro.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        mesaCuatro.setText("4");
        mesaCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(mesaCuatro);
        mesaCuatro.setBounds(350, 330, 140, 140);

        grupoMesas.add(mesaTres);
        mesaTres.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        mesaTres.setText("3");
        mesaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaTresActionPerformed(evt);
            }
        });
        jPanel1.add(mesaTres);
        mesaTres.setBounds(190, 330, 140, 140);

        grupoMesas.add(mesaDos);
        mesaDos.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        mesaDos.setText("2");
        mesaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaDosActionPerformed(evt);
            }
        });
        jPanel1.add(mesaDos);
        mesaDos.setBounds(350, 180, 140, 140);

        grupoMesas.add(mesaUno);
        mesaUno.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        mesaUno.setSelected(true);
        mesaUno.setText("1");
        mesaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesaUnoActionPerformed(evt);
            }
        });
        jPanel1.add(mesaUno);
        mesaUno.setBounds(190, 180, 140, 140);

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

        botonOrden.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonOrden.setForeground(new java.awt.Color(255, 255, 255));
        botonOrden.setText("Orden");
        botonOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(botonOrden);
        botonOrden.setBounds(0, 410, 170, 110);

        botonMesas.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        botonMesas.setForeground(new java.awt.Color(255, 255, 255));
        botonMesas.setText("Mesas");
        jPanel1.add(botonMesas);
        botonMesas.setBounds(0, 190, 170, 110);

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

        numMesa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(numMesa);
        numMesa.setBounds(180, 4, 360, 40);

        fondoMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DESIGN_-03.jpg"))); // NOI18N
        jPanel1.add(fondoMesas);
        fondoMesas.setBounds(0, 0, 540, 960);

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

    private void botonPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlatillosActionPerformed
        new Platillos(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonPlatillosActionPerformed

    private void mesaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaUnoActionPerformed
        num=1;
        numMesa.setText("Mesa "+num);
    }//GEN-LAST:event_mesaUnoActionPerformed

    private void botonOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenActionPerformed
        new Orden(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonOrdenActionPerformed

    private void mesaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaDosActionPerformed
        num=2;
        numMesa.setText("Mesa "+num);
    }//GEN-LAST:event_mesaDosActionPerformed

    private void mesaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaTresActionPerformed
        num=3;
        numMesa.setText("Mesa "+num);
    }//GEN-LAST:event_mesaTresActionPerformed

    private void mesaCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaCuatroActionPerformed
        num=4;
        numMesa.setText("Mesa "+num);
    }//GEN-LAST:event_mesaCuatroActionPerformed

    private void mesaCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesaCincoActionPerformed
        num=5;
        numMesa.setText("Mesa "+num);
    }//GEN-LAST:event_mesaCincoActionPerformed
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
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Mesas(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonOrden;
    private javax.swing.JButton botonPlatillos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondoMesas;
    private javax.swing.ButtonGroup grupoMesas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton mesaCinco;
    private javax.swing.JToggleButton mesaCuatro;
    private javax.swing.JToggleButton mesaDos;
    private javax.swing.JToggleButton mesaTres;
    private javax.swing.JToggleButton mesaUno;
    private javax.swing.JLabel numMesa;
    // End of variables declaration//GEN-END:variables
}
