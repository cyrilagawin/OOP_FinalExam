
package dormmanagementsystem.screens;

import dormmanagementsystem.DBConnection;
import dormmanagementsystem.DataValidator;
import dormmanagementsystem.IRecordManager;
import dormmanagementsystem.entities.Student;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class FeeManagement extends javax.swing.JFrame implements IRecordManager{
    private int selectedFeeId = -1; //for UPDATE operations
    private int lastSelectedRow = -1;
    private DefaultTableModel tableModel;

    public FeeManagement() {
        initComponents();
        loadStudentDropdown();
        loadRecords("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feeTable = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusCb = new javax.swing.JComboBox<>();
        markBtn = new javax.swing.JButton();
        billStudentBtn = new javax.swing.JButton();
        studentCb = new javax.swing.JComboBox<>();
        feeDateField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fee Management");
        setPreferredSize(new java.awt.Dimension(1500, 490));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(240, 237, 229));

        feeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fee ID", "Student", "Amount", "Due Date", "Status", "Date Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        feeTable.setMinimumSize(new java.awt.Dimension(500, 64));
        feeTable.setName(""); // NOI18N
        feeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feeTable);
        if (feeTable.getColumnModel().getColumnCount() > 0) {
            feeTable.getColumnModel().getColumn(0).setResizable(false);
            feeTable.getColumnModel().getColumn(1).setResizable(false);
            feeTable.getColumnModel().getColumn(2).setResizable(false);
            feeTable.getColumnModel().getColumn(3).setResizable(false);
            feeTable.getColumnModel().getColumn(4).setResizable(false);
            feeTable.getColumnModel().getColumn(5).setResizable(false);
        }

        mainPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(440, 490));

        jLabel1.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Fee Management Panel:");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Student Name:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Amount:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Status:");

        statusCb.setBackground(new java.awt.Color(237, 200, 114));
        statusCb.setForeground(new java.awt.Color(51, 51, 51));
        statusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Paid", "Overdue" }));
        statusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCbActionPerformed(evt);
            }
        });

        markBtn.setBackground(new java.awt.Color(237, 200, 114));
        markBtn.setForeground(new java.awt.Color(51, 51, 51));
        markBtn.setText("Mark as Paid");
        markBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markBtnActionPerformed(evt);
            }
        });

        billStudentBtn.setBackground(new java.awt.Color(226, 167, 29));
        billStudentBtn.setForeground(new java.awt.Color(51, 51, 51));
        billStudentBtn.setText("Bill Student");
        billStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billStudentBtnActionPerformed(evt);
            }
        });

        studentCb.setBackground(new java.awt.Color(237, 200, 114));
        studentCb.setForeground(new java.awt.Color(51, 51, 51));
        studentCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCbActionPerformed(evt);
            }
        });

        feeDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeDateFieldActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fee Date (YYYY-MM-DD):");

        refreshBtn.setBackground(new java.awt.Color(237, 200, 114));
        refreshBtn.setForeground(new java.awt.Color(51, 51, 51));
        refreshBtn.setText("Refresh List");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(237, 200, 114));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feeDateField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusCb, 0, 237, Short.MAX_VALUE)
                            .addComponent(amountField)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(billStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(109, 109, 109)
                        .addComponent(studentCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feeDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        mainPanel.add(controlPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markBtnActionPerformed
        updateRecord();
    }//GEN-LAST:event_markBtnActionPerformed

    private void billStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billStudentBtnActionPerformed
        addRecord();
    }//GEN-LAST:event_billStudentBtnActionPerformed

    private void studentCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentCbActionPerformed

    private void feeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeTableMouseClicked
        int selectedRow = feeTable.getSelectedRow();

        // Check if same row clicked again to unselect/reset
        if (selectedRow == lastSelectedRow) {
            feeTable.clearSelection();
            selectedFeeId = -1;
            lastSelectedRow = -1;
            clearForm(); // Reset fields to empty when unselecting
        } 
        else {
            lastSelectedRow = selectedRow;     
            selectedFeeId = Integer.parseInt(feeTable.getValueAt(selectedRow, 0).toString());
            
            //Set text fields (Strip out the "PHP" prefix from the table display safely)
            String rawAmount = feeTable.getValueAt(selectedRow, 2).toString().replace("PHP", "").trim();
            amountField.setText(rawAmount);
            feeDateField.setText(feeTable.getValueAt(selectedRow, 3).toString());
            
            //Select the matching Status inside the dropdown
            String rowStatus = feeTable.getValueAt(selectedRow, 4).toString();
            statusCb.setSelectedItem(rowStatus);
            
            //Match the Student Dropdown
            String rowStudentName = feeTable.getValueAt(selectedRow, 1).toString();
            for (int i = 0; i < studentCb.getItemCount(); i++) {
                if (studentCb.getItemAt(i).toString().equals(rowStudentName)) {
                    studentCb.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_feeTableMouseClicked

    private void feeDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeDateFieldActionPerformed

    private void statusCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCbActionPerformed
        String currentSelection = String.valueOf(statusCb.getSelectedItem());
        if ("Paid".equals(currentSelection)) {
            markBtn.setText("Mark as Paid");
        } else {
            markBtn.setText("Update Status");
        }
    }//GEN-LAST:event_statusCbActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        loadRecords("");
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    //custom methods
    private void loadStudentDropdown() {
        studentCb.removeAllItems();
      
        String sql = "SELECT student_id, first_name, last_name, room_number FROM students WHERE room_number IS NOT NULL";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // Create the Student object and add it to the dropdown
                Student s = new Student(
                    rs.getInt("student_id"), 
                    rs.getString("first_name"), 
                    rs.getString("last_name"), 
                    rs.getInt("room_number")
                );
                studentCb.addItem(s); 
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Error loading students: " + e.getMessage());
        }
    }
    //end of custom methods
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton billStudentBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JTextField feeDateField;
    private javax.swing.JTable feeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton markBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox<String> statusCb;
    private javax.swing.JComboBox<Student> studentCb;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadRecords(String search) {
        tableModel = (DefaultTableModel) feeTable.getModel(); 
        tableModel.setRowCount(0);
        
        String sql = "SELECT f.fee_id, CONCAT(s.first_name, ' ', s.last_name) AS student_name, " +
                     "f.amount, f.due_date, f.status, f.date_paid " +
                     "FROM dorm_management.fees f " +
                     "LEFT JOIN dorm_management.students s ON f.student_id = s.student_id " +
                     "ORDER BY f.fee_id DESC";
                     
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ResultSet rs = ps.executeQuery();
            java.text.SimpleDateFormat timeFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            while (rs.next()) {
                int id = rs.getInt("fee_id");
                String studentName = rs.getString("student_name");
                double amount = rs.getDouble("amount");
                String dueDate = rs.getString("due_date");
                String status = rs.getString("status");
                
                java.sql.Timestamp ts = rs.getTimestamp("date_paid");
                String paidTime = (ts != null) ? timeFormat.format(ts) : "Unpaid"; 
                
                tableModel.addRow(new Object[]{
                    id, 
                    (studentName != null ? studentName : "Unknown Student"), 
                    String.format("PHP%.2f", amount), 
                    dueDate, 
                    status, 
                    paidTime
                });
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }

    @Override
    public void addRecord() {
        if (studentCb.getSelectedItem() == null) {
            DataValidator.showError(this, "Please select a Student."); return;
        }
        if (!DataValidator.isNotEmpty(amountField.getText(), feeDateField.getText())) {
            DataValidator.showError(this, "Amount and Month are required."); return;
        } //obviously needed
        
        
        //to prevent the user from adding a record that is actually selected from the table
        if(selectedFeeId != -1){
            DataValidator.showError(this, "Cannot add an existing record."); return;
        }

        String sql = "INSERT INTO fees (student_id, amount, due_date, status) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
            
            // EXTRACT id via the Student class getStudentId method
            Student selectedStudent = (Student) studentCb.getSelectedItem();
            ps.setInt(1, selectedStudent.getStudentId());          
            ps.setDouble(2, Double.parseDouble(amountField.getText().trim()));
            
            //OPERATION: For DATE data handling 
            // Parse the text directly into a modern LocalDate object
            java.time.LocalDate enteredDate = java.time.LocalDate.parse(feeDateField.getText().trim());
            java.time.LocalDate today = java.time.LocalDate.now();
            
            //Stop if the typed date is after the current date
            if (enteredDate.isBefore(today)) {
                DataValidator.showError(this, "Invalid Date! The fee date cannot be past the current date (" + today + ").");
                return;
            }
            
            //Convert the safe LocalDate to an SQL-compatible Date
            java.sql.Date sqlDate = java.sql.Date.valueOf(enteredDate);
            ps.setDate(3, sqlDate); 
            
            ps.setString(4, statusCb.getSelectedItem().toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student Billed Successfully!");
            clearForm(); 
            loadRecords("");
            
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        } catch (NumberFormatException ex) {
            DataValidator.showError(this, "Amount must be a valid number.");
        } catch (IllegalArgumentException ex) {
            // NEW: Catches errors if the user types the date in the wrong format
            DataValidator.showError(this, "Invalid Date format! Please use YYYY-MM-DD (e.g., 2026-05-01).");
        }
        
    }

    @Override
    public void updateRecord() {
        if (selectedFeeId == -1) { 
            DataValidator.showError(this, "Select a fee record from the table to update."); 
            return; 
        }  
        
        try (Connection conn = DBConnection.getConnection()) {
            
            //Verify if already processed and finalized
            String checkSql = "SELECT status FROM fees WHERE fee_id = ?";
            try (PreparedStatement checkPst = conn.prepareStatement(checkSql)) {
                checkPst.setInt(1, selectedFeeId);
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next() && "Paid".equals(rs.getString("status"))) {
                        DataValidator.showError(this, "This fee has already been paid and cannot be modified.");
                        return;
                    }
                }
            }

            double typedAmount;
            java.sql.Date typedDueDate;
            try {
                typedAmount = Double.parseDouble(amountField.getText().trim());
                typedDueDate = java.sql.Date.valueOf(feeDateField.getText().trim());
            } catch (NumberFormatException e) {
                DataValidator.showError(this, "Amount must be a valid numeric value.");
                return;
            } catch (IllegalArgumentException e) {
                DataValidator.showError(this, "Invalid Date format! Please use YYYY-MM-DD.");
                return;
            }

            String selectedStatus = statusCb.getSelectedItem().toString();
            java.sql.Timestamp paidTimestamp = null;
            
            if ("Paid".equals(selectedStatus)) {
                paidTimestamp = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());
            }
            
            String sql = "UPDATE fees SET amount = ?, due_date = ?, status = ?, date_paid = ? WHERE fee_id = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setDouble(1, typedAmount);
                ps.setDate(2, typedDueDate); 
                ps.setString(3, selectedStatus);
                ps.setTimestamp(4, paidTimestamp);
                ps.setInt(5, selectedFeeId);
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Fee Record Updated successfully!");
                clearForm(); 
                loadRecords("");
            }

        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }
    
    @Override public void deleteRecord() {}

    @Override public void clearForm() { 
        if(studentCb.getItemCount() > 0) studentCb.setSelectedIndex(0); 
        amountField.setText(""); 
        feeDateField.setText("");
        statusCb.setSelectedIndex(0); 
    }
}
