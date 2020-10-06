/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contador.gui;

import contador.logica.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author chamo
 */
public class JFrameContador extends javax.swing.JFrame {
    Contador contador = new ContadorDecimal();
    Timer timer = new Timer();
    boolean contando;
    /**
     * Creates new form JFrameContador
     */
    public JFrameContador() {
        initComponents();
        contando = false;
        timer.schedule(new Tarea(), 0, 500);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSistema = new javax.swing.ButtonGroup();
        lblDisplay = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnRadioBinario = new javax.swing.JRadioButton();
        btnRadioOctal = new javax.swing.JRadioButton();
        btnRadioDecimal = new javax.swing.JRadioButton();
        btnRadioHexa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDisplay.setBackground(new java.awt.Color(255, 255, 255));
        lblDisplay.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnGroupSistema.add(btnRadioBinario);
        btnRadioBinario.setText("Binario");
        btnRadioBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioBinarioActionPerformed(evt);
            }
        });

        btnGroupSistema.add(btnRadioOctal);
        btnRadioOctal.setText("Octal");
        btnRadioOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioOctalActionPerformed(evt);
            }
        });

        btnGroupSistema.add(btnRadioDecimal);
        btnRadioDecimal.setText("Decimal");
        btnRadioDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioDecimalActionPerformed(evt);
            }
        });

        btnGroupSistema.add(btnRadioHexa);
        btnRadioHexa.setText("Hexa");
        btnRadioHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadioHexaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnContar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnParar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRadioBinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRadioOctal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRadioDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRadioHexa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContar)
                    .addComponent(btnParar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRadioBinario)
                    .addComponent(btnRadioOctal)
                    .addComponent(btnRadioDecimal)
                    .addComponent(btnRadioHexa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        contando = true;
    }//GEN-LAST:event_btnContarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        contando = false;
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnRadioBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioBinarioActionPerformed
        contador = new ContadorBinario();
    }//GEN-LAST:event_btnRadioBinarioActionPerformed

    private void btnRadioOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioOctalActionPerformed
        contador = new ContadorOctal();
    }//GEN-LAST:event_btnRadioOctalActionPerformed

    private void btnRadioDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioDecimalActionPerformed
        contador = new ContadorDecimal();
    }//GEN-LAST:event_btnRadioDecimalActionPerformed

    private void btnRadioHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadioHexaActionPerformed
        contador = new ContadorHexadecimal();
    }//GEN-LAST:event_btnRadioHexaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.ButtonGroup btnGroupSistema;
    private javax.swing.JButton btnParar;
    private javax.swing.JRadioButton btnRadioBinario;
    private javax.swing.JRadioButton btnRadioDecimal;
    private javax.swing.JRadioButton btnRadioHexa;
    private javax.swing.JRadioButton btnRadioOctal;
    private javax.swing.JLabel lblDisplay;
    // End of variables declaration//GEN-END:variables

    private class Tarea extends TimerTask{

        @Override
        public void run() {
            if(contando){
                contador.contar();  
            }
            lblDisplay.setText(contador.mostrarConteo());
        }
        
    }
}