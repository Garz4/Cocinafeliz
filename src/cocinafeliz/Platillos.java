package cocinafeliz;

import java.awt.Color;

public class Platillos extends javax.swing.JFrame {
    int num;
    public Platillos(int a) {
        initComponents();
        num=a;
        numMesa.setText("Mesa "+num);
        botonMesas.setBackground(new Color(0,0,0,0));
        botonPlatillos.setBackground(new Color(0,0,0,0));
        botonOrden.setBackground(new Color(0,0,0,0));
        botonSalir.setBackground(new Color(0,0,0,0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPlatillos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        platilloDos = new javax.swing.JToggleButton();
        platilloCuatro = new javax.swing.JToggleButton();
        platilloUno = new javax.swing.JToggleButton();
        platilloDiez = new javax.swing.JToggleButton();
        platilloNueve = new javax.swing.JToggleButton();
        platilloOcho = new javax.swing.JToggleButton();
        platilloSiete = new javax.swing.JToggleButton();
        platilloSeis = new javax.swing.JToggleButton();
        platilloCinco = new javax.swing.JToggleButton();
        platilloTres = new javax.swing.JToggleButton();
        botonAdd = new javax.swing.JButton();
        contComida = new javax.swing.JSpinner();
        botonMesas = new javax.swing.JButton();
        botonPlatillos = new javax.swing.JButton();
        botonOrden = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        numMesa = new javax.swing.JLabel();
        fondoPlatillos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        grupoPlatillos.add(platilloDos);
        platilloDos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        platilloDos.setText("Pambazo");
        platilloDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloDosActionPerformed(evt);
            }
        });
        jPanel1.add(platilloDos);
        platilloDos.setBounds(350, 180, 140, 140);

        grupoPlatillos.add(platilloCuatro);
        platilloCuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        platilloCuatro.setText("Enchiladas");
        platilloCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(platilloCuatro);
        platilloCuatro.setBounds(350, 330, 140, 140);

        grupoPlatillos.add(platilloUno);
        platilloUno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        platilloUno.setSelected(true);
        platilloUno.setText("Pozole");
        platilloUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloUnoActionPerformed(evt);
            }
        });
        jPanel1.add(platilloUno);
        platilloUno.setBounds(190, 180, 140, 140);

        grupoPlatillos.add(platilloDiez);
        platilloDiez.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        platilloDiez.setText("Agua");
        platilloDiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloDiezActionPerformed(evt);
            }
        });
        jPanel1.add(platilloDiez);
        platilloDiez.setBounds(350, 780, 140, 140);

        grupoPlatillos.add(platilloNueve);
        platilloNueve.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        platilloNueve.setText("Coca lata");
        platilloNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloNueveActionPerformed(evt);
            }
        });
        jPanel1.add(platilloNueve);
        platilloNueve.setBounds(190, 780, 140, 140);

        grupoPlatillos.add(platilloOcho);
        platilloOcho.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        platilloOcho.setText("Jugo");
        platilloOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloOchoActionPerformed(evt);
            }
        });
        jPanel1.add(platilloOcho);
        platilloOcho.setBounds(350, 630, 140, 140);

        grupoPlatillos.add(platilloSiete);
        platilloSiete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        platilloSiete.setText("Cerveza");
        platilloSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloSieteActionPerformed(evt);
            }
        });
        jPanel1.add(platilloSiete);
        platilloSiete.setBounds(190, 630, 140, 140);

        grupoPlatillos.add(platilloSeis);
        platilloSeis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        platilloSeis.setText("Orden tacos");
        platilloSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloSeisActionPerformed(evt);
            }
        });
        jPanel1.add(platilloSeis);
        platilloSeis.setBounds(350, 480, 140, 140);

        grupoPlatillos.add(platilloCinco);
        platilloCinco.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        platilloCinco.setText("Torta");
        platilloCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloCincoActionPerformed(evt);
            }
        });
        jPanel1.add(platilloCinco);
        platilloCinco.setBounds(190, 480, 140, 140);

        grupoPlatillos.add(platilloTres);
        platilloTres.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        platilloTres.setText("Tamal");
        platilloTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloTresActionPerformed(evt);
            }
        });
        jPanel1.add(platilloTres);
        platilloTres.setBounds(190, 330, 140, 140);

        botonAdd.setBackground(new java.awt.Color(0, 204, 0));
        botonAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonAdd.setText("Añadir");
        botonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddActionPerformed(evt);
            }
        });
        jPanel1.add(botonAdd);
        botonAdd.setBounds(340, 63, 180, 50);

        contComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(contComida);
        contComida.setBounds(200, 60, 130, 50);

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

        botonPlatillos.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        botonPlatillos.setForeground(new java.awt.Color(255, 255, 255));
        botonPlatillos.setText("Platillos");
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

        fondoPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DESIGN_-04.jpg"))); // NOI18N
        jPanel1.add(fondoPlatillos);
        fondoPlatillos.setBounds(0, 0, 540, 960);

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMesasActionPerformed
        new Mesas(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonMesasActionPerformed

    private void botonOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenActionPerformed
        new Orden(num).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonOrdenActionPerformed

    private void platilloCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloCuatroActionPerformed
    }//GEN-LAST:event_platilloCuatroActionPerformed

    private void platilloUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloUnoActionPerformed
    }//GEN-LAST:event_platilloUnoActionPerformed

    private void platilloDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloDosActionPerformed
    }//GEN-LAST:event_platilloDosActionPerformed

    private void platilloTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloTresActionPerformed
    }//GEN-LAST:event_platilloTresActionPerformed

    private void platilloCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloCincoActionPerformed
    }//GEN-LAST:event_platilloCincoActionPerformed

    private void platilloSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloSeisActionPerformed
    }//GEN-LAST:event_platilloSeisActionPerformed

    private void platilloSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloSieteActionPerformed
    }//GEN-LAST:event_platilloSieteActionPerformed

    private void platilloOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloOchoActionPerformed
    }//GEN-LAST:event_platilloOchoActionPerformed

    private void platilloNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloNueveActionPerformed
    }//GEN-LAST:event_platilloNueveActionPerformed

    private void platilloDiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloDiezActionPerformed
    }//GEN-LAST:event_platilloDiezActionPerformed

    private void botonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddActionPerformed
        if(platilloUno.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Pozole $30.00";
            LogIn.total[num-1] += 30*(int)(contComida.getValue());
        }
        if(platilloDos.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Pambazo $20.00";
            LogIn.total[num-1] += 20*(int)(contComida.getValue());
        }
        if(platilloTres.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Tamal $20.00";
            LogIn.total[num-1] += 20*(int)(contComida.getValue());
        }
        if(platilloCuatro.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Enchiladas $50.00";
            LogIn.total[num-1] += 50*(int)(contComida.getValue());
        }
        if(platilloCinco.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Torta $40.00";
            LogIn.total[num-1] += 40*(int)(contComida.getValue());
        }
        if(platilloSeis.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Orden tacos $50.00";
            LogIn.total[num-1] += 50*(int)(contComida.getValue());
        }
        if(platilloSiete.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Cerveza $35.00";
            LogIn.total[num-1] += 35*(int)(contComida.getValue());
        }
        if(platilloOcho.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Jugo $20.00";
            LogIn.total[num-1] += 20*(int)(contComida.getValue());
        }
        if(platilloNueve.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Coca lata $20.00";
            LogIn.total[num-1] += 20*(int)(contComida.getValue());
        }
        if(platilloDiez.isSelected()){
            LogIn.lista[num-1] = LogIn.lista[num-1]+"\n"+(int)(contComida.getValue())+" Agua $15.00";
            LogIn.total[num-1] += 15*(int)(contComida.getValue());
        }
    }//GEN-LAST:event_botonAddActionPerformed
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
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Platillos(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdd;
    private javax.swing.JButton botonMesas;
    private javax.swing.JButton botonOrden;
    private javax.swing.JButton botonPlatillos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JSpinner contComida;
    private javax.swing.JLabel fondoPlatillos;
    private javax.swing.ButtonGroup grupoPlatillos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numMesa;
    private javax.swing.JToggleButton platilloCinco;
    private javax.swing.JToggleButton platilloCuatro;
    private javax.swing.JToggleButton platilloDiez;
    private javax.swing.JToggleButton platilloDos;
    private javax.swing.JToggleButton platilloNueve;
    private javax.swing.JToggleButton platilloOcho;
    private javax.swing.JToggleButton platilloSeis;
    private javax.swing.JToggleButton platilloSiete;
    private javax.swing.JToggleButton platilloTres;
    private javax.swing.JToggleButton platilloUno;
    // End of variables declaration//GEN-END:variables
}
