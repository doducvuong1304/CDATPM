/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.HideMessage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kingb
 */
public class HideMessageView extends javax.swing.JFrame {

    /**
     * Creates new form HideMessage
     */
    public HideMessageView() {
        initComponents();
        setTitle("Hide Message");
        setLocationRelativeTo(null);
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
        jLabel_enterTheLinkOfFile = new javax.swing.JLabel();
        jTextField_linkOfFile = new javax.swing.JTextField();
        jLabel_linkOfFileError = new javax.swing.JLabel();
        jLabel_enterTheMessage = new javax.swing.JLabel();
        jTextArea_message = new javax.swing.JTextArea();
        jLabel_messageError = new javax.swing.JLabel();
        jButton_okHideMessage = new javax.swing.JButton();
        jButton_mainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel_enterTheLinkOfFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_enterTheLinkOfFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/enter the link.jpg"))); // NOI18N

        jTextField_linkOfFile.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_linkOfFileError.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_linkOfFileError.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_linkOfFileError.setText("Please enter the link of file you need to hide the message!");

        jLabel_enterTheMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_enterTheMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/enter the message.jpg"))); // NOI18N

        jTextArea_message.setColumns(20);
        jTextArea_message.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea_message.setRows(5);

        jLabel_messageError.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel_messageError.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_messageError.setText("Please enter the message you want to hide!");

        jButton_okHideMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ok button.jpg"))); // NOI18N
        jButton_okHideMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okHideMessageActionPerformed(evt);
            }
        });

        jButton_mainMenu.setBackground(new java.awt.Color(0, 0, 0));
        jButton_mainMenu.setForeground(new java.awt.Color(255, 0, 0));
        jButton_mainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.jpg"))); // NOI18N
        jButton_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_enterTheMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_enterTheLinkOfFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_linkOfFileError)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField_linkOfFile, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(149, 149, 149)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jButton_okHideMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel_messageError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea_message, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel_enterTheLinkOfFile)
                .addGap(2, 2, 2)
                .addComponent(jTextField_linkOfFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_linkOfFileError)
                .addGap(5, 5, 5)
                .addComponent(jLabel_enterTheMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel_messageError)
                .addGap(25, 25, 25)
                .addComponent(jButton_okHideMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTextArea_message, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mainMenuActionPerformed
        // TODO add your handling code here:
        MainView mainView = new MainView();
        mainView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_mainMenuActionPerformed

    boolean checkText(String text){ // check xem Text co rong hay ko? neu rong tra ve true, nguoc lai tra ve false
        if(text.equals("") || text == null || text.trim().equals("")){
           return true;
       }
    return false;
    }
    
    private void jButton_okHideMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okHideMessageActionPerformed
        // TODO add your handling code here:
        String linkOfFile = this.jTextField_linkOfFile.getText();
        String message = this.jTextArea_message.getText();
        
        this.jLabel_linkOfFileError.setVisible(checkText(linkOfFile));
        this.jLabel_messageError.setVisible(checkText(message));
        
        if (this.jLabel_linkOfFileError.isVisible() || this.jLabel_messageError.isVisible()){
            System.out.println("chưa nhập đủ!");
        }
        else{
            System.out.println("đủ điều kiện để thực thi!");
            try {
                HideMessage.giauTin(message, Paths.get(linkOfFile));
                JOptionPane.showMessageDialog(null, "Hide the Message successfully!","SUCCESS!" , JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(HideMessageView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton_okHideMessageActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLabel_linkOfFileError.setVisible(false);
        jLabel_messageError.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HideMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HideMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HideMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HideMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HideMessage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_mainMenu;
    private javax.swing.JButton jButton_okHideMessage;
    private javax.swing.JLabel jLabel_enterTheLinkOfFile;
    private javax.swing.JLabel jLabel_enterTheMessage;
    private javax.swing.JLabel jLabel_linkOfFileError;
    private javax.swing.JLabel jLabel_messageError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea_message;
    private javax.swing.JTextField jTextField_linkOfFile;
    // End of variables declaration//GEN-END:variables
}