package cafemanagementsystem;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsertCustomerRecordJFrame extends javax.swing.JFrame {

    /**
     * Creates new form InsertCustomerRecordJFrame
     */
    int id;
    String userName = "root";
    String password = "password";

    private void addDays(int days) {
        for (int i = 1; i <= days; i++) {
            jComboBoxDay.addItem(Integer.toString(i));
        }
    }

    private void handleDateOfBirth() {
        int selectedMonth = jComboBoxMonth.getSelectedIndex() + 1;
        if (selectedMonth == 2) {
            jComboBoxDay.removeAllItems();
            addDays(28);
        } else if (selectedMonth < 8) {
            if (selectedMonth % 2 == 0) {
                jComboBoxDay.removeAllItems();
                addDays(30);
            } else {
                jComboBoxDay.removeAllItems();
                addDays(31);
            }
        } else {
            if (selectedMonth % 2 == 0) {
                jComboBoxDay.removeAllItems();
                addDays(31);
            } else {
                jComboBoxDay.removeAllItems();
                addDays(30);
            }
        }
    }

    public InsertCustomerRecordJFrame() {
        initComponents();

        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/cafe_management_system",
                    userName,
                    password
            );
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT MAX(cust_id) FROM customers;";
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {
                id = resultSet.getInt("MAX(cust_id)") + 1;
            } else {
                id = 1;
            }
            jTextFieldCustomerId.setText(Integer.toString(id));

        } catch (ClassNotFoundException | SQLException exec) {
            JOptionPane.showMessageDialog(null, exec.getMessage());
        }

        handleDateOfBirth();

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
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelCustomerId = new javax.swing.JLabel();
        jTextFieldCustomerId = new javax.swing.JTextField();
        jLabelEmailAddress = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jLabelDash1 = new javax.swing.JLabel();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jLabelDash2 = new javax.swing.JLabel();
        jTextFieldYear = new javax.swing.JTextField();
        jLabelInsertCustomerRecord = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Customer Record");
        setName("frameInsertCustomerRecord"); // NOI18N
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

        jTextFieldCustomerName.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelPhoneNumber.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelPhoneNumber.setText("Phone Number:");

        jLabelProductName.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelProductName.setText("Customer Name:");

        jLabelCustomerId.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelCustomerId.setText("Customer id:");

        jTextFieldCustomerId.setEditable(false);
        jTextFieldCustomerId.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jTextFieldCustomerId.setFocusable(false);
        jTextFieldCustomerId.setHighlighter(null);
        jTextFieldCustomerId.setOpaque(false);

        jLabelEmailAddress.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelEmailAddress.setText("Email Address:");

        jTextFieldPhoneNumber.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jTextFieldEmailAddress.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelDateOfBirth.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelDateOfBirth.setText("Date of Birth:");

        jComboBoxMonth.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jComboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonthActionPerformed(evt);
            }
        });

        jLabelDash1.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelDash1.setText("-");

        jComboBoxDay.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N

        jLabelDash2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabelDash2.setText("-");

        jTextFieldYear.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jTextFieldYear.setText("2022");

        javax.swing.GroupLayout jPanelInsertCustomerRecordLayout = new javax.swing.GroupLayout(jPanelInsertCustomerRecord);
        jPanelInsertCustomerRecord.setLayout(jPanelInsertCustomerRecordLayout);
        jPanelInsertCustomerRecordLayout.setHorizontalGroup(
            jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jLabelDateOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                                .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDash1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDash2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldYear))
                            .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertCustomerRecordLayout.createSequentialGroup()
                        .addComponent(jLabelEmailAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelInsertCustomerRecordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelCustomerId, jLabelDateOfBirth, jLabelEmailAddress, jLabelPhoneNumber, jLabelProductName});

        jPanelInsertCustomerRecordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCustomerId, jTextFieldCustomerName, jTextFieldEmailAddress, jTextFieldPhoneNumber});

        jPanelInsertCustomerRecordLayout.setVerticalGroup(
            jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerId)
                    .addComponent(jTextFieldCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateOfBirth)
                    .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDash1)
                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDash2)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInsertCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailAddress)
                    .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelInsertCustomerRecord.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabelInsertCustomerRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInsertCustomerRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-+-48.png"))); // NOI18N
        jLabelInsertCustomerRecord.setText("<html>\n\t<b style=\"color: #6f4e37;\">\n\t\t&nbsp;Insert Customer Record\n\t</b>\n</html>");

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
                    .addComponent(jLabelInsertCustomerRecord))
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInsertCustomerRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String custName = jTextFieldCustomerName.getText();
        String phoneNo = jTextFieldPhoneNumber.getText();
        String emailAddr = jTextFieldEmailAddress.getText();
        int day = jComboBoxDay.getSelectedIndex() + 1;
        int month = jComboBoxMonth.getSelectedIndex() + 1;
        String year = jTextFieldYear.getText();
        String dateOfBirth;

        if (custName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer Name Text Field Cannot Be Empty...");
        } else if (phoneNo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone Number Text Field Cannot Be Empty...");
        } else if (emailAddr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email Address Text Field Cannot Be Empty...");
        } else if (year.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date Of Birth (Year) Text Field Cannot Be Empty...");
        } else {
            dateOfBirth = year + "-" + month + "-" + day;

            try {
                Class.forName("java.sql.DriverManager");
                Connection conn = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1/cafe_management_system",
                        userName,
                        password
                );
                Statement stmt = (Statement) conn.createStatement();
                String query = "INSERT INTO customers (cust_id, cust_name, phone_no, cust_dob, email_addr) "
                        + "VALUES (" + id + ", '" + custName + "', '" + phoneNo + "', '" + dateOfBirth + "', '" + emailAddr + "');";
                if (stmt.executeUpdate(query) != 0) {
                    JOptionPane.showMessageDialog(this, "Customer Record Saved Successfully...");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to Save Customer Record...");
                }

                String queryGetID = "SELECT MAX(cust_id) FROM customers;";
                ResultSet resultSet = stmt.executeQuery(queryGetID);
                if (resultSet.next()) {
                    id = resultSet.getInt("MAX(cust_id)") + 1;
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to Update Customer Id...");
                }
                jTextFieldCustomerId.setText(Integer.toString(id));

            } catch (ClassNotFoundException | SQLException exce) {
                JOptionPane.showMessageDialog(this, exce.getMessage());
            }
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldCustomerName.setText("");
        jTextFieldPhoneNumber.setText("");
        jTextFieldEmailAddress.setText("");
        jComboBoxMonth.setSelectedIndex(0);
        jComboBoxDay.setSelectedIndex(0);
        jTextFieldYear.setText("2022");

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();

    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        handleDateOfBirth();

    }//GEN-LAST:event_jComboBoxMonthActionPerformed

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
            java.util.logging.Logger.getLogger(InsertCustomerRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertCustomerRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertCustomerRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertCustomerRecordJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertCustomerRecordJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JLabel jLabelCustomerId;
    private javax.swing.JLabel jLabelDash1;
    private javax.swing.JLabel jLabelDash2;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelEmailAddress;
    private javax.swing.JLabel jLabelInsertCustomerRecord;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelInsertCustomerRecord;
    private javax.swing.JTextField jTextFieldCustomerId;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
