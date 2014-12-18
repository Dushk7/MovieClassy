/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movieclassy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.Font;

/**
 *
 * @author Dushk
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        result.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        txt1.setVisible(false);
        jb2.setVisible(false);
        jb3.setVisible(false);
        
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
        lbl3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jb2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jb1 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        lbl3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl3);
        lbl3.setBounds(500, 420, 120, 40);

        lbl2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jPanel1.add(lbl2);
        lbl2.setBounds(90, 420, 100, 40);

        jb2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jb2.setText("GENARATE");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jPanel1.add(jb2);
        jb2.setBounds(510, 310, 140, 40);

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 650, 150);

        jb1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jb1.setText("Click Here to Enter Plot");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jPanel1.add(jb1);
        jb1.setBounds(190, 100, 290, 30);

        jb3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jb3.setText("CLEAR");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jPanel1.add(jb3);
        jb3.setBounds(30, 310, 170, 40);

        result.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(result);
        result.setBounds(190, 320, 330, 50);

        lbl4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbl4.setForeground(java.awt.Color.orange);
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("1st Best Categorie");
        jPanel1.add(lbl4);
        lbl4.setBounds(20, 390, 240, 40);

        lbl5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbl5.setForeground(java.awt.Color.orange);
        lbl5.setText("2nd Best Categorie");
        jPanel1.add(lbl5);
        lbl5.setBounds(460, 390, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dushk\\Documents\\NetBeansProjects\\MovieClassy\\Resources\\images\\movie.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 682, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        result.setVisible(true);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        lbl4.setVisible(true);
        lbl5.setVisible(true);
        
        
        try {
            String newPot = txt1.getText();
            if(newPot.equals("")){
		            result.setText("Oops... Enter a plot!");
            }else{
                MC_reader.ReadCSV();
                try {
                        MC_reader.ReadPlot(newPot);
                        System.out.println(newPot);
                }catch (IOException e1) {
                    // TODO Auto-generated catch block
                    result.setText("No input");
                }
                MC_reader.check();
                String s = MC_reader.print();
                result.setText(s);
                //lbl2.setText(Integer.toString(MC_reader.first));
                //lbl3.setText(Integer.toString(MC_reader.second));
                lbl2.setText(MC_reader.genres[(MC_reader.first)]);
                lbl3.setText(MC_reader.genres[(MC_reader.second)]);
                //lbl4.setText(MC_reader.result2);
            }
            
            

            //     lbl1.setText();
        } catch (Exception e) {
        }
        
        jb2.setEnabled(false);
        
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
        jb2.setVisible(true);
        txt1.setVisible(true);
        jb3.setVisible(true);
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
        
        txt1.setText("");
        result.setText("");
        jb2.setEnabled(true);
        lbl2.setText("");
        lbl3.setText("");
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        jb2.setVisible(false);
        txt1.setVisible(false);
        
    }//GEN-LAST:event_jb3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
       EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel result;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
    
   

}

