/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTos;

import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB3
 */
public class TicTacToe_S extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form TicTacToe_S
     */
    public TicTacToe_S() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    
private void gameScore()
{
    jlblPlayerX.setText(String.valueOf(xCount));
    jlblPlayerO.setText(String.valueOf(oCount));
}

private void choose_a_Player()
{
    if(startGame.equalsIgnoreCase("X"))
    {
        startGame = "O";
    }
    else
    {
        startGame = "X";
    }
}

private void winningGame()
{
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    
    if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.yellow);
        jButton2.setBackground(java.awt.Color.yellow);
        jButton3.setBackground(java.awt.Color.yellow);
    }
    
    if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton4.setBackground(java.awt.Color.ORANGE);
        jButton5.setBackground(java.awt.Color.ORANGE);
        jButton6.setBackground(java.awt.Color.ORANGE);
    }
    
    if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton7.setBackground(java.awt.Color.MAGENTA);
        jButton8.setBackground(java.awt.Color.MAGENTA);
        jButton9.setBackground(java.awt.Color.MAGENTA);
    }
    
      if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.RED);
        jButton4.setBackground(java.awt.Color.RED);
        jButton7.setBackground(java.awt.Color.RED);
    }
    
        
    if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton2.setBackground(java.awt.Color.yellow);
        jButton5.setBackground(java.awt.Color.yellow);
        jButton8.setBackground(java.awt.Color.yellow);
    }
    
    if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton3.setBackground(java.awt.Color.RED);
        jButton6.setBackground(java.awt.Color.RED);
        jButton9.setBackground(java.awt.Color.RED);
    }
    
    if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.PINK);
        jButton5.setBackground(java.awt.Color.PINK);
        jButton9.setBackground(java.awt.Color.PINK);
    }
    
    if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton3.setBackground(java.awt.Color.ORANGE);
        jButton5.setBackground(java.awt.Color.ORANGE);
        jButton7.setBackground(java.awt.Color.ORANGE);
    }
    
      if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.MAGENTA);
        jButton2.setBackground(java.awt.Color.MAGENTA);
        jButton3.setBackground(java.awt.Color.MAGENTA);
    }
      
      if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton4.setBackground(java.awt.Color.yellow);
        jButton5.setBackground(java.awt.Color.yellow);
        jButton6.setBackground(java.awt.Color.yellow);
    }
      
      if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton7.setBackground(java.awt.Color.CYAN);
        jButton8.setBackground(java.awt.Color.CYAN);
        jButton9.setBackground(java.awt.Color.CYAN);
    }
      
      if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.PINK);
        jButton4.setBackground(java.awt.Color.PINK);
        jButton7.setBackground(java.awt.Color.PINK);
    }
      
      if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton2.setBackground(java.awt.Color.CYAN);
        jButton5.setBackground(java.awt.Color.CYAN);
        jButton8.setBackground(java.awt.Color.CYAN);
    }
      
      if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton3.setBackground(java.awt.Color.MAGENTA);
        jButton6.setBackground(java.awt.Color.MAGENTA);
        jButton9.setBackground(java.awt.Color.MAGENTA);
    }
      
      if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton1.setBackground(java.awt.Color.red);
        jButton5.setBackground(java.awt.Color.red);
        jButton9.setBackground(java.awt.Color.red);
    }
      
      if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
    {
        JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Joe", JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton3.setBackground(java.awt.Color.ORANGE);
        jButton5.setBackground(java.awt.Color.ORANGE);
        jButton7.setBackground(java.awt.Color.ORANGE);
    }
    
    
    
    
    
    
    
    
    
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jBtnReset = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jBtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Joe");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel11.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel12.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel16.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel17.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });
        jPanel21.add(jBtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPanel22.add(jBtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        jButton1.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton2.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton3.setBackground(java.awt.Color.LIGHT_GRAY);
        
        jButton4.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton5.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton6.setBackground(java.awt.Color.LIGHT_GRAY);
        
        jButton7.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton8.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton9.setBackground(java.awt.Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Joe",
        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);
        {
           System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
         {
             jButton1.setForeground(java.awt.Color.green);
         }
         else
         {
             jButton1.setForeground(java.awt.Color.blue);
         }
         choose_a_Player();
         winningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton2.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton3.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton4.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton5.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton6.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton7.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton8.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(java.awt.Color.green);
        }
        else
        {
            jButton9.setForeground(java.awt.Color.blue);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_S.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_S().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
