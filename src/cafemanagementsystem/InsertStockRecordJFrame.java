package cafemanagementsystem;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsertStockRecordJFrame extends javax.swing.JFrame {

    /**
     * Creates new form InsertStockRecordJFrame
     */
    int id;
    String userName = "root";
    String password = "password";

    public InsertStockRecordJFrame() {
        initComponents();

        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/cafe_management_system",
                    userName,
                    password
            );
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT MAX(prod_id) FROM stocks;";
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {
                id = resultSet.getInt("MAX(prod_id)") + 1;
            } else {
                id = 1;
            }
            jTextFieldProductId.setText(Integer.toString(id));

        } catch (ClassNotFoundException | SQLException exec) {
            JOptionPane.showMessageDialog(null, exec.getMessage());
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

        jPanelBackground = new javax.swing.JPanel();
        jButtonClear = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanelInsertCustomerRecord = new javax.swing.JPanel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabelCategory = new javax.swing.JLabel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelProductId = new javax.swing.JLabel();
        jTextFieldProductId = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelIdealStock = new javax.swing.JLabel();
        jTextFieldIdealStock = new javax.swing.JTextField();
        jLabelAvailableStock = new javax.swing.JLabel();
        jTextFieldAvailableStock = new javax.swing.JTextField();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jLabelInsertStockRecord = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Stock Record");
        setName("frameInsertStockRecord"); // NOI18N
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(255, 248, 220));

        jButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClear.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset-24.png"))); // NOI18N
        jButtonClear.setMnemonic('C');
        jButtonClear.setText("Clear");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSave.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-save-24.png"))); // NOI18N
        jButtonSave.setMnemonic('S');
        jButtonSave.setText("Save");
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jPanelInsertCustomerRecord.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInsertCustomerRecord.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldProductName.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelCategory.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelCategory.setText("Category:");

        jLabelProductName.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelProductName.setText("Product Name:");

        jLabelProductId.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelProductId.setText("Product id:");

        jTextFieldProductId.setEditable(false);
        jTextFieldProductId.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jTextFieldProductId.setFocusable(false);
        jTextFieldProductId.setHighlighter(null);
        jTextFieldProductId.setOpaque(false);

        jLabelPrice.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelPrice.setText("Price:");

        jTextFieldPrice.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelIdealStock.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelIdealStock.setText("Ideal Stock:");

        jTextFieldIdealStock.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelAvailableStock.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelAvailableStock.setText("Available Stock:");

        jTextFieldAvailableStock.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jComboBoxCategory.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "Cold Coffee", "Bread", "Cake", "Cookie", "Tea" }));

        javax.swing.GroupLayout jPanelInsertCustomerRecordLayout = new javax.swing.GroupLayout(jPanelInsertCustomerRecord);
        jPanelInsertCustomerRecord.setLayout(jPanelInsertCustomerRecordLayout);
        jPanelInsertCustomerRecordLayout.setHorizontalGroup(
            jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jTextFieldProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelIdealStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldIdealStock, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelAvailableStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldAvailableStock, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice)
                            .addComponent(jLabelCategory))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanelInsertCustomerRecordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelAvailableStock, jLabelCategory, jLabelIdealStock, jLabelPrice, jLabelProductId, jLabelProductName});

        jPanelInsertCustomerRecordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldAvailableStock, jTextFieldIdealStock, jTextFieldPrice, jTextFieldProductId, jTextFieldProductName});

        jPanelInsertCustomerRecordLayout.setVerticalGroup(
            jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductId)
                    .addComponent(jTextFieldProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdealStock)
                    .addComponent(jTextFieldIdealStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAvailableStock)
                    .addComponent(jTextFieldAvailableStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelInsertStockRecord.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabelInsertStockRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInsertStockRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-+-48.png"))); // NOI18N
        jLabelInsertStockRecord.setText("<html>\n\t<b style=\"color: #6f4e37;\">\n\t\t&nbsp;Insert Stock Record\n\t</b>\n</html>");

        jButtonClose.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClose.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(204, 0, 0));
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-macos-close-24.png"))); // NOI18N
        jButtonClose.setMnemonic('L');
        jButtonClose.setText("Close");
        jButtonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInsertCustomerRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClose))
                    .addComponent(jLabelInsertStockRecord))
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInsertStockRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelInsertCustomerRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String prodName = jTextFieldProductName.getText();
        String prodCat = (String) jComboBoxCategory.getSelectedItem();

        if (prodName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name Text Field Cannot Be Empty...");
        } else if (jTextFieldPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Price Text Field Cannot Be Empty...");
        } else if (jTextFieldIdealStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ideal Stock Text Field Cannot Be Empty...");
        } else if (jTextFieldAvailableStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Available Stock Text Field Cannot Be Empty...");
        } else {
            int price = Integer.parseInt(jTextFieldPrice.getText());
            int idealStock = Integer.parseInt(jTextFieldIdealStock.getText());
            int availStock = Integer.parseInt(jTextFieldAvailableStock.getText());

            try {
                Class.forName("java.sql.DriverManager");
                Connection conn = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1/cafe_management_system",
                        userName,
                        password
                );
                Statement stmt = (Statement) conn.createStatement();
                String query = "INSERT INTO stocks (prod_id, prod_name, prod_category, price, ideal_stock, avail_stock) "
                        + "VALUES (" + id + ", '" + prodName + "', '" + prodCat + "', " + price + ", " + idealStock + ", " + availStock + ");";
                if (stmt.executeUpdate(query) != 0) {
                    JOptionPane.showMessageDialog(this, "Stock Record Saved Successfully...");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to Save Stock Record...");
                }

                String queryGetID = "SELECT MAX(prod_id) FROM stocks;";
                ResultSet resultSet = stmt.executeQuery(queryGetID);
                if (resultSet.next()) {
                    id = resultSet.getInt("MAX(prod_id)") + 1;
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to Update Stocks Id...");
                }
                jTextFieldProductId.setText(Integer.toString(id));

            } catch (ClassNotFoundException | SQLException exce) {
                JOptionPane.showMessageDialog(this, exce.getMessage());
            }
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldProductName.setText("");
        jComboBoxCategory.setSelectedIndex(0);
        jTextFieldPrice.setText("");
        jTextFieldIdealStock.setText("");
        jTextFieldAvailableStock.setText("");

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();

    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(InsertStockRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertStockRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertStockRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertStockRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertStockRecordJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JLabel jLabelAvailableStock;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelIdealStock;
    private javax.swing.JLabel jLabelInsertStockRecord;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductId;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelInsertCustomerRecord;
    private javax.swing.JTextField jTextFieldAvailableStock;
    private javax.swing.JTextField jTextFieldIdealStock;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProductId;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables
}
