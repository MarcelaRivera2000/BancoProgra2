/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_proyectoprogra2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mvrivera
 */
public class BANCO extends javax.swing.JFrame {

    /**
     * Creates new form BANCO
     */
    public BANCO() {
        initComponents();
        this.setLocationRelativeTo(null);
        ar.Leer();
        for (Clientes y : ar.getLista()) {
            clientes.add(y);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ClienteEntrante = new javax.swing.JFrame();
        C_numerocuenta = new javax.swing.JTextField();
        C_saldo = new javax.swing.JTextField();
        C_usuario = new javax.swing.JTextField();
        C_valorcompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        C_saldo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("VER CLIENTES");

        jButton3.setText("ACTIVAR BANCO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal.getContentPane());
        Principal.getContentPane().setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(294, 294, 294))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(228, 228, 228))
        );

        jLabel3.setText("NUMERO DE CUENTA:");

        jLabel4.setText("USUARIO:");

        jLabel5.setText("SALDO ACTUAL:");

        jLabel6.setText("VALOR DE LA COMPRA:");

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("TOTAL:");

        javax.swing.GroupLayout ClienteEntranteLayout = new javax.swing.GroupLayout(ClienteEntrante.getContentPane());
        ClienteEntrante.getContentPane().setLayout(ClienteEntranteLayout);
        ClienteEntranteLayout.setHorizontalGroup(
            ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteEntranteLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(C_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteEntranteLayout.createSequentialGroup()
                            .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(44, 44, 44)
                            .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C_numerocuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteEntranteLayout.createSequentialGroup()
                            .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C_saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(C_valorcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ClienteEntranteLayout.setVerticalGroup(
            ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteEntranteLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_numerocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(C_valorcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(ClienteEntranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_saldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("USER:");

        jLabel2.setText("PASS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal.pack();
        Principal.setLocationRelativeTo(this);
        Principal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       try {
            Banco_ProyectoProgra2.main(null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void textoaqui(String j) {
        ClienteEntrante.pack();
        ClienteEntrante.setLocationRelativeTo(this);
        ClienteEntrante.setVisible(true);
        try {
            String[] tokens = j.split(",");
            double u = Double.parseDouble(tokens[4]);
            Clientes c = new Clientes(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]) - u);
            C_saldo.setText(" "+ tokens[3]);
            C_valorcompra.setText(" " + u);
            C_usuario.setText(" " + c.getUsuario());
            C_numerocuenta.setText(" " + c.getN_cuenta());
            C_saldo1.setText(" " + c.getDineroAcutal());
            clientes.add(c);
            ar.Leer();
            ar.setCliente(c);
            ar.Escribir();
        } catch (Exception ex) {
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Principal.pack();
        Principal.setLocationRelativeTo(this);
        Principal.setVisible(true);
        ClienteEntrante.pack();
        ClienteEntrante.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BANCO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BANCO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BANCO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BANCO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BANCO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C_numerocuenta;
    private javax.swing.JTextField C_saldo;
    private javax.swing.JTextField C_saldo1;
    private javax.swing.JTextField C_usuario;
    private javax.swing.JTextField C_valorcompra;
    private javax.swing.JFrame ClienteEntrante;
    private javax.swing.JFrame Principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    ArrayList<Clientes> clientes = new ArrayList();
    ArchivosTexto ar = new ArchivosTexto("./ClientesBanco.txt", clientes);
}
