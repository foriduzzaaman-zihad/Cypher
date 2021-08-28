/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cypher;

/**
 *
 * @author Foriduzzaman Zihad
 */
public class ScreenFrame extends javax.swing.JFrame {

    /**
     * Creates new form ScreenFrame
     */
    public ScreenFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EncryptedTextBox = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        MessageBox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OutputBox = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CompressedLevel = new javax.swing.JPanel();
        EncryptButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CompressedLevel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PasswordBox2 = new javax.swing.JPanel();
        DecryptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setText("Enter Your Message Here :");

        EncryptedTextBox.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EncryptedTextBoxLayout = new javax.swing.GroupLayout(EncryptedTextBox);
        EncryptedTextBox.setLayout(EncryptedTextBoxLayout);
        EncryptedTextBoxLayout.setHorizontalGroup(
            EncryptedTextBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        EncryptedTextBoxLayout.setVerticalGroup(
            EncryptedTextBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MessageBox.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MessageBoxLayout = new javax.swing.GroupLayout(MessageBox);
        MessageBox.setLayout(MessageBoxLayout);
        MessageBoxLayout.setHorizontalGroup(
            MessageBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        MessageBoxLayout.setVerticalGroup(
            MessageBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        jPanel3.add(MessageBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setText("Enter Encrypted Text Here :");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setText("Output: ");

        OutputBox.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout OutputBoxLayout = new javax.swing.GroupLayout(OutputBox);
        OutputBox.setLayout(OutputBoxLayout);
        OutputBoxLayout.setHorizontalGroup(
            OutputBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        OutputBoxLayout.setVerticalGroup(
            OutputBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setText("Compressed Level: ");

        PasswordBox.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PasswordBoxLayout = new javax.swing.GroupLayout(PasswordBox);
        PasswordBox.setLayout(PasswordBoxLayout);
        PasswordBoxLayout.setHorizontalGroup(
            PasswordBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        PasswordBoxLayout.setVerticalGroup(
            PasswordBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setText("Password: ");

        CompressedLevel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CompressedLevelLayout = new javax.swing.GroupLayout(CompressedLevel);
        CompressedLevel.setLayout(CompressedLevelLayout);
        CompressedLevelLayout.setHorizontalGroup(
            CompressedLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        CompressedLevelLayout.setVerticalGroup(
            CompressedLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        EncryptButton.setBackground(new java.awt.Color(0, 0, 153));
        EncryptButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        EncryptButton.setText("Encrypt");
        EncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel6.setText("Password: ");

        CompressedLevel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CompressedLevel2Layout = new javax.swing.GroupLayout(CompressedLevel2);
        CompressedLevel2.setLayout(CompressedLevel2Layout);
        CompressedLevel2Layout.setHorizontalGroup(
            CompressedLevel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        CompressedLevel2Layout.setVerticalGroup(
            CompressedLevel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel7.setText("Compressed Level: ");

        PasswordBox2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PasswordBox2Layout = new javax.swing.GroupLayout(PasswordBox2);
        PasswordBox2.setLayout(PasswordBox2Layout);
        PasswordBox2Layout.setHorizontalGroup(
            PasswordBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        PasswordBox2Layout.setVerticalGroup(
            PasswordBox2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        DecryptButton.setBackground(new java.awt.Color(0, 0, 153));
        DecryptButton.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        DecryptButton.setText("Decrypt");
        DecryptButton.setMaximumSize(new java.awt.Dimension(93, 27));
        DecryptButton.setMinimumSize(new java.awt.Dimension(93, 27));
        DecryptButton.setPreferredSize(new java.awt.Dimension(102, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2)
                                        .addComponent(EncryptedTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(OutputBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CompressedLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(834, Short.MAX_VALUE)
                    .addComponent(CompressedLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(PasswordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(EncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OutputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(PasswordBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EncryptedTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CompressedLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(DecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(CompressedLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(577, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncryptButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CompressedLevel;
    private javax.swing.JPanel CompressedLevel2;
    private javax.swing.JButton DecryptButton;
    private javax.swing.JButton EncryptButton;
    private javax.swing.JPanel EncryptedTextBox;
    private javax.swing.JPanel MessageBox;
    private javax.swing.JPanel OutputBox;
    private javax.swing.JPanel PasswordBox;
    private javax.swing.JPanel PasswordBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
