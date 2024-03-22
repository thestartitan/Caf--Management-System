package cafemanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GenerateBillJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GenerateBillJFrame
     */
    int billTotal = 0;

    String prodName;
    String prodCat;

    String customerName;
    String phoneNumber;
    String emailAddress;

    String billHeader = "";
    String billContent = "";

    String userName = "root";
    String password = "password";

    private void getProductDetails() {
        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/cafe_management_system",
                    userName,
                    password
            );
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT prod_name, prod_category, price FROM stocks;";
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {
                do {
                    prodName = resultSet.getString("prod_name");
                    prodCat = resultSet.getString("prod_category");
                    jComboBoxProduct.addItem(prodName
                            + " "
                            + prodCat
                    );
                } while (resultSet.next());
            }
        } catch (ClassNotFoundException | SQLException exce) {
            JOptionPane.showMessageDialog(null, exce.getMessage());
        }
    }

    public GenerateBillJFrame() {
        initComponents();

        DefaultTableModel customerRecordsTable = (DefaultTableModel) jTableCustomerRecords.getModel();

        int tableRows = customerRecordsTable.getRowCount();
        if (tableRows > 0) {
            for (int i = 0; i < tableRows; i++) {
                customerRecordsTable.removeRow(0);
            }
        }

        try {
            Class.forName("java.sql.DriverManager");
            Connection conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/cafe_management_system",
                    userName,
                    password
            );
            Statement stmt = (Statement) conn.createStatement();
            String query = "SELECT cust_id, cust_name, phone_no, cust_dob, email_addr FROM customers;";
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {
                do {
                    int id = resultSet.getInt("cust_id");
                    String custName = resultSet.getString("cust_name");
                    String phoneNo = resultSet.getString("phone_no");
                    String dateOfBirth = resultSet.getString("cust_dob");
                    String emailAddr = resultSet.getString("email_addr");
                    customerRecordsTable.addRow(new Object[]{
                        id, custName, phoneNo, dateOfBirth, emailAddr
                    });
                } while (resultSet.next());
            }
        } catch (ClassNotFoundException | SQLException exce) {
            JOptionPane.showMessageDialog(null, exce.getMessage());
        }

        /* Function */
        getProductDetails();

        jTextAreaBill.setTabSize(10);
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
        jLabelGenerateBill = new javax.swing.JLabel();
        jPanelSearchCustomerRecord = new javax.swing.JPanel();
        jLabelAttribute = new javax.swing.JLabel();
        jComboBoxAttribute = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValue = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jScrollPaneCustomerRecords = new javax.swing.JScrollPane();
        jTableCustomerRecords = new javax.swing.JTable();
        jPanelProductDetails = new javax.swing.JPanel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jComboBoxProduct = new javax.swing.JComboBox<>();
        jButtonClose = new javax.swing.JButton();
        jButtonPrintBill = new javax.swing.JButton();
        jPanelBill = new javax.swing.JPanel();
        jScrollPaneBill = new javax.swing.JScrollPane();
        jTextAreaBill = new javax.swing.JTextArea();
        jButtonGenerateBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate Bill");
        setName("frameManageBill"); // NOI18N
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(255, 248, 220));

        jLabelGenerateBill.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabelGenerateBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGenerateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-bill-48.png"))); // NOI18N
        jLabelGenerateBill.setText("<html> \t<b style=\"color: #6f4e37;\"> \t\t&nbsp;Cafe Management System - Generate Bill\t</b> </html>");

        jPanelSearchCustomerRecord.setBackground(new java.awt.Color(255, 248, 220));
        jPanelSearchCustomerRecord.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search Customer Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        jLabelAttribute.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabelAttribute.setText("Attribute:");

        jComboBoxAttribute.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jComboBoxAttribute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer id", "Customer Name", "Phone Number", "DOB", "Email Address" }));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel1.setText("Value:");

        jTextFieldValue.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N

        jButtonSearch.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-24.png"))); // NOI18N
        jButtonSearch.setMnemonic('S');
        jButtonSearch.setText("Search");
        jButtonSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchCustomerRecordLayout = new javax.swing.GroupLayout(jPanelSearchCustomerRecord);
        jPanelSearchCustomerRecord.setLayout(jPanelSearchCustomerRecordLayout);
        jPanelSearchCustomerRecordLayout.setHorizontalGroup(
            jPanelSearchCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAttribute)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSearchCustomerRecordLayout.setVerticalGroup(
            jPanelSearchCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchCustomerRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchCustomerRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAttribute)
                    .addComponent(jComboBoxAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSearchCustomerRecordLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonSearch, jComboBoxAttribute, jLabel1, jLabelAttribute, jTextFieldValue});

        jTableCustomerRecords.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jTableCustomerRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Phone Number", "DOB", "Email Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCustomerRecords.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableCustomerRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerRecordsMouseClicked(evt);
            }
        });
        jScrollPaneCustomerRecords.setViewportView(jTableCustomerRecords);

        jPanelProductDetails.setBackground(new java.awt.Color(255, 248, 220));
        jPanelProductDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        jLabelProductName.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabelProductName.setText("Product Name:");

        jLabelQuantity.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabelQuantity.setText("Quantity:");

        jTextFieldPrice.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabelPrice.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabelPrice.setText("Price :");

        jTextFieldQuantity.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jTextFieldQuantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-plus-+-24.png"))); // NOI18N
        jButtonAdd.setMnemonic('A');
        jButtonAdd.setText("Add Product");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClear.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset-24.png"))); // NOI18N
        jButtonClear.setMnemonic('C');
        jButtonClear.setText("Clear");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabelTotal.setText("Bill Total:");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jComboBoxProduct.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelProductDetailsLayout = new javax.swing.GroupLayout(jPanelProductDetails);
        jPanelProductDetails.setLayout(jPanelProductDetailsLayout);
        jPanelProductDetailsLayout.setHorizontalGroup(
            jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClear))
                    .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                        .addComponent(jLabelProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                        .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabelPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabelQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelProductDetailsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelPrice, jLabelProductName, jLabelQuantity, jLabelTotal});

        jPanelProductDetailsLayout.setVerticalGroup(
            jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantity)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonClear))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonClose.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClose.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
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

        jButtonPrintBill.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPrintBill.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jButtonPrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-print-24.png"))); // NOI18N
        jButtonPrintBill.setMnemonic('P');
        jButtonPrintBill.setText("Print Bill");
        jButtonPrintBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintBillActionPerformed(evt);
            }
        });

        jPanelBill.setBackground(new java.awt.Color(255, 248, 220));
        jPanelBill.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 12))); // NOI18N

        jTextAreaBill.setEditable(false);
        jTextAreaBill.setBackground(new java.awt.Color(255, 248, 220));
        jTextAreaBill.setColumns(20);
        jTextAreaBill.setRows(5);
        jScrollPaneBill.setViewportView(jTextAreaBill);

        jButtonGenerateBill.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerateBill.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jButtonGenerateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-bill-24.png"))); // NOI18N
        jButtonGenerateBill.setMnemonic('G');
        jButtonGenerateBill.setText("Generate Bill");
        jButtonGenerateBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGenerateBill.setEnabled(false);
        jButtonGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBillLayout = new javax.swing.GroupLayout(jPanelBill);
        jPanelBill.setLayout(jPanelBillLayout);
        jPanelBillLayout.setHorizontalGroup(
            jPanelBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneBill)
                    .addComponent(jButtonGenerateBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBillLayout.setVerticalGroup(
            jPanelBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneBill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenerateBill)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGenerateBill)
                    .addComponent(jPanelSearchCustomerRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneCustomerRecords)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jButtonPrintBill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClose))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelGenerateBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanelSearchCustomerRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneCustomerRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonPrintBill))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        DefaultTableModel customerRecordsTable = (DefaultTableModel) jTableCustomerRecords.getModel();

        String attribute = "";
        int selectedIndex = jComboBoxAttribute.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                attribute = "cust_id";
                break;
            case 1:
                attribute = "cust_name";
                break;
            case 2:
                attribute = "phone_no";
                break;
            case 3:
                attribute = "cust_dob";
                break;
            case 4:
                attribute = "email_addr";
                break;
            default:
                break;
        }

        String value = jTextFieldValue.getText();
        if (!value.trim().isEmpty()) {
            int tableRows = customerRecordsTable.getRowCount();
            if (tableRows > 0) {
                for (int i = 0; i < tableRows; i++) {
                    customerRecordsTable.removeRow(0);
                }
            }

            try {
                Class.forName("java.sql.DriverManager");
                Connection conn = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1/cafe_management_system",
                        userName,
                        password
                );
                Statement stmt = (Statement) conn.createStatement();
                String query = "SELECT cust_id, cust_name, phone_no, cust_dob, email_addr "
                        + "FROM customers WHERE " + attribute + " LIKE '%" + value + "%';";
                ResultSet resultSet = stmt.executeQuery(query);
                if (resultSet.next()) {
                    do {
                        int id = resultSet.getInt("cust_id");
                        String custName = resultSet.getString("cust_name");
                        String phoneNo = resultSet.getString("phone_no");
                        String dateOfBirth = resultSet.getString("cust_dob");
                        String emailAddr = resultSet.getString("email_addr");
                        customerRecordsTable.addRow(new Object[]{
                            id, custName, phoneNo, dateOfBirth, emailAddr
                        });
                    } while (resultSet.next());
                } else {
                    JOptionPane.showMessageDialog(this, "No Customer Record Found...");
                }
            } catch (ClassNotFoundException | SQLException exce) {
                JOptionPane.showMessageDialog(this, exce.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Value Text Field Cannot Be Empty...");
        }

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String productName = (String) jComboBoxProduct.getSelectedItem();

        if (jTextFieldQuantity.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Quantity Text Field Cannot Be Empty...");
        } else {
            int id = jComboBoxProduct.getSelectedIndex() + 1;
            int price = Integer.parseInt(jTextFieldPrice.getText());
            int quantity = Integer.parseInt(jTextFieldQuantity.getText());

            String productList = "";
            for (int i = 0; i < quantity; i++) {
                billContent += productList + "\n" + productName + "\t\t" + price;

                /* SET avail_stock = avail_stock - 1 */
                try {
                    Class.forName("java.sql.DriverManager");
                    Connection conn = (Connection) DriverManager.getConnection(
                            "jdbc:mysql://127.0.0.1/cafe_management_system",
                            userName,
                            password
                    );
                    Statement stmt = (Statement) conn.createStatement();
                    String query = "UPDATE stocks "
                            + "SET avail_stock = avail_stock - 1 "
                            + "WHERE prod_id = " + id + ";";
                    if (stmt.executeUpdate(query) == 0) {
                        JOptionPane.showMessageDialog(this, "Failed to Update Stock Record...");
                    }
                } catch (ClassNotFoundException | SQLException exce) {
                    JOptionPane.showMessageDialog(null, exce.getMessage());
                }
            }

            billTotal += price * quantity;
            jTextFieldTotal.setText(Integer.toString(billTotal));
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateBillActionPerformed
        if (billTotal == 0) {
            JOptionPane.showMessageDialog(null, "Bill Total Cannot Be Empty...");
        } else {
            jTextAreaBill.setText("");
            jTextAreaBill.append(billHeader);
            jTextAreaBill.append(billContent);
            jTextAreaBill.append("\n"
                    + "===================================="
                    + "\nTotal:"
                    + "\t\t" + Integer.toString(billTotal)
            );
        }

    }//GEN-LAST:event_jButtonGenerateBillActionPerformed

    private void jTableCustomerRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerRecordsMouseClicked
        DefaultTableModel customerRecordsTable = (DefaultTableModel) jTableCustomerRecords.getModel();
        int selectedRowIndex = jTableCustomerRecords.getSelectedRow();
        customerName = (String) customerRecordsTable.getValueAt(selectedRowIndex, 1);
        phoneNumber = (String) customerRecordsTable.getValueAt(selectedRowIndex, 2);
        emailAddress = (String) customerRecordsTable.getValueAt(selectedRowIndex, 4);
        billHeader = "Sold To:"
                + "\n" + customerName
                + "\n" + phoneNumber
                + "\n" + emailAddress
                + "\n\n===================================="
                + "\nItems"
                + "\t\t"
                + "Price";
        jButtonGenerateBill.setEnabled(true);

    }//GEN-LAST:event_jTableCustomerRecordsMouseClicked

    private void jButtonPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintBillActionPerformed
        if (jTextAreaBill.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Bill Text Area Cannot Be Empty...");
        } else {
            try {
                boolean printingCompleted = jTextAreaBill.print();
                if (printingCompleted) {
                    JOptionPane.showMessageDialog(null, "Done Printing...");
                } else {
                    JOptionPane.showMessageDialog(null, "Printing...");
                }
            } catch (PrinterException exce) {
                JOptionPane.showMessageDialog(null, "Printing Failed...");
            }
        }

    }//GEN-LAST:event_jButtonPrintBillActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();

    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jComboBoxProduct.setSelectedIndex(0);
        jTextFieldPrice.setText("");
        jTextFieldQuantity.setText("");
        jTextFieldTotal.setText("");
        jTextAreaBill.setText("");
        billContent = "";
        billTotal = 0;

    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateBillJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GenerateBillJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonGenerateBill;
    private javax.swing.JButton jButtonPrintBill;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxAttribute;
    private javax.swing.JComboBox<String> jComboBoxProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAttribute;
    private javax.swing.JLabel jLabelGenerateBill;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelBill;
    private javax.swing.JPanel jPanelProductDetails;
    private javax.swing.JPanel jPanelSearchCustomerRecord;
    private javax.swing.JScrollPane jScrollPaneBill;
    private javax.swing.JScrollPane jScrollPaneCustomerRecords;
    private javax.swing.JTable jTableCustomerRecords;
    private javax.swing.JTextArea jTextAreaBill;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValue;
    // End of variables declaration//GEN-END:variables
}
