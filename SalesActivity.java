/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockbroker9;

import static stockbroker9.Driver.cl;
import static stockbroker9.Driver.homeContainer;
import static stockbroker9.Driver.client;

/**
 *
 * @author Gary
 */
public class SalesActivity extends javax.swing.JPanel {

    /**
     * Creates new form SalesActivity
     */
    public SalesActivity() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        buttonMainMenu = new javax.swing.JButton();
        buttonMonthly = new javax.swing.JButton();
        buttonWeekly = new javax.swing.JButton();
        buttonDaily = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelGraph = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonMainMenu.setText("Main Menu");
        buttonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 31, 27, 29);
        jPanel1.add(buttonMainMenu, gridBagConstraints);

        buttonMonthly.setText("Monthly");
        buttonMonthly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMonthlyMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 31, 0, 29);
        jPanel1.add(buttonMonthly, gridBagConstraints);

        buttonWeekly.setText("Weekly");
        buttonWeekly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonWeeklyMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 31, 0, 29);
        jPanel1.add(buttonWeekly, gridBagConstraints);

        buttonDaily.setText("Daily");
        buttonDaily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDailyMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 31, 0, 29);
        jPanel1.add(buttonDaily, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose Graph");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 31, 0, 29);
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 0, 12);
        add(jPanel1, gridBagConstraints);

        labelGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockbroker9/graphpsd29.jpg"))); // NOI18N
        labelGraph.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -83;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 90, 56, 0);
        add(labelGraph, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sales Activity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 364;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 90, 0, 0);
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainMenuActionPerformed
        cl.show(homeContainer, "Main Menu");
    }//GEN-LAST:event_buttonMainMenuActionPerformed

    private void buttonDailyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDailyMouseClicked
        labelGraph.setIcon(client.getImage(0));
    }//GEN-LAST:event_buttonDailyMouseClicked

    private void buttonWeeklyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWeeklyMouseClicked
        labelGraph.setIcon(client.getImage(1));
    }//GEN-LAST:event_buttonWeeklyMouseClicked

    private void buttonMonthlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMonthlyMouseClicked
        labelGraph.setIcon(client.getImage(2));
    }//GEN-LAST:event_buttonMonthlyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDaily;
    private javax.swing.JButton buttonMainMenu;
    private javax.swing.JButton buttonMonthly;
    private javax.swing.JButton buttonWeekly;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelGraph;
    // End of variables declaration//GEN-END:variables
}
