
package dormmanagementsystem.screens;
import dormmanagementsystem.DBConnection;
import dormmanagementsystem.DataValidator;
import dormmanagementsystem.IRecordManager;
import dormmanagementsystem.entities.Student;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ComplaintManagement extends javax.swing.JFrame implements IRecordManager{
    
    private int selectedTicketId = -1; //for UPDATE operations
    private int lastSelectedRow = -1; 
    private DefaultTableModel tableModel;
    
    //initializes everything
    public ComplaintManagement() {
        initComponents();
        loadStudentDropdown();
        loadRoomDropdown();
        loadRecords("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaintTable = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        issueTypeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusCb = new javax.swing.JComboBox<>();
        markBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();
        studentCb = new javax.swing.JComboBox<>();
        roomNumCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descField = new javax.swing.JTextArea();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complaints Management");
        setPreferredSize(new java.awt.Dimension(1550, 555));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        complaintTable.setBackground(new java.awt.Color(255, 255, 255));
        complaintTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket ID", "Student Name", "Room No.", "Issue", "Dsecription", "Status", "Date Resolved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        complaintTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complaintTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(complaintTable);
        if (complaintTable.getColumnModel().getColumnCount() > 0) {
            complaintTable.getColumnModel().getColumn(0).setResizable(false);
            complaintTable.getColumnModel().getColumn(1).setResizable(false);
            complaintTable.getColumnModel().getColumn(2).setResizable(false);
            complaintTable.getColumnModel().getColumn(3).setResizable(false);
            complaintTable.getColumnModel().getColumn(4).setResizable(false);
            complaintTable.getColumnModel().getColumn(5).setResizable(false);
            complaintTable.getColumnModel().getColumn(6).setResizable(false);
        }

        mainPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(400, 490));

        jLabel1.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Complaint Management Panel:");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Student:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Room No:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Issue (e.g: Plumbing):");

        statusCb.setBackground(new java.awt.Color(240, 237, 229));
        statusCb.setForeground(new java.awt.Color(51, 51, 51));
        statusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open", "In Progress", "Resolved" }));
        statusCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCbActionPerformed(evt);
            }
        });

        markBtn.setBackground(new java.awt.Color(237, 200, 114));
        markBtn.setForeground(new java.awt.Color(51, 51, 51));
        markBtn.setText("Mark as Resolved");
        markBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markBtnActionPerformed(evt);
            }
        });

        logBtn.setBackground(new java.awt.Color(226, 167, 29));
        logBtn.setForeground(new java.awt.Color(51, 51, 51));
        logBtn.setText("Log Complaint");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });

        studentCb.setBackground(new java.awt.Color(240, 237, 229));
        studentCb.setForeground(new java.awt.Color(51, 51, 51));

        roomNumCb.setBackground(new java.awt.Color(240, 237, 229));
        roomNumCb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Status:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Description (Optional):");

        descField.setColumns(20);
        descField.setRows(5);
        jScrollPane2.setViewportView(descField);

        refreshBtn.setBackground(new java.awt.Color(237, 200, 114));
        refreshBtn.setForeground(new java.awt.Color(51, 51, 51));
        refreshBtn.setText("Refresh List");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(logBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(roomNumCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issueTypeField)
                            .addComponent(statusCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(roomNumCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
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

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        addRecord();
    }//GEN-LAST:event_logBtnActionPerformed

    private void complaintTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complaintTableMouseClicked
        int selectedRow = complaintTable.getSelectedRow();

        // Check if same row clicked again to unselect/reset
        if (selectedRow == lastSelectedRow) {
            complaintTable.clearSelection();
            selectedTicketId = -1;
            lastSelectedRow = -1;
            clearForm(); // Reset fields to empty when unselecting
        } 
        else {
            lastSelectedRow = selectedRow;     
            selectedTicketId = Integer.parseInt(complaintTable.getValueAt(selectedRow, 0).toString());

            // Set text fields
            issueTypeField.setText(complaintTable.getValueAt(selectedRow, 3).toString());

            // Handle optional description column safely
            Object descValue = complaintTable.getValueAt(selectedRow, 4);
            descField.setText(descValue != null ? descValue.toString() : "");

            // Select the matching Status inside the dropdown
            String rowStatus = complaintTable.getValueAt(selectedRow, 5).toString();
            statusCb.setSelectedItem(rowStatus);

            //Match the Student Dropdown (Matches by student name string)
            String rowStudentName = complaintTable.getValueAt(selectedRow, 1).toString();
            for (int i = 0; i < studentCb.getItemCount(); i++) {
                if (studentCb.getItemAt(i).toString().equals(rowStudentName)) {
                    studentCb.setSelectedIndex(i);
                    break;
                }
            }
            //Match the Room Dropdown
            String rowRoom = complaintTable.getValueAt(selectedRow, 2).toString();
            for (int i = 0; i < roomNumCb.getItemCount(); i++) {
                if (roomNumCb.getItemAt(i).equals(rowRoom)) {
                    roomNumCb.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_complaintTableMouseClicked

    private void statusCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCbActionPerformed
        //check if the user intends to either update the value or finalize it, so that the button text can dynamically change its text
        String currentSelection = String.valueOf(statusCb.getSelectedItem());
        if ("Resolved".equals(currentSelection)) {
            markBtn.setText("Mark as Resolved");
        } else {
            markBtn.setText("Update Status");
        }
    }//GEN-LAST:event_statusCbActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        loadRecords("");
    }//GEN-LAST:event_refreshBtnActionPerformed
  
    //fetch Student data and put it to the dropdown
    private void loadStudentDropdown() {
        studentCb.removeAllItems();
        String sql = "SELECT student_id, first_name, last_name, room_number FROM students WHERE room_number IS NOT NULL";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Student s = new Student(
                    rs.getInt("student_id"), 
                    rs.getString("first_name"), 
                    rs.getString("last_name"), 
                    rs.getInt("room_number")
                );
                studentCb.addItem(s); // Automatically uses toString() to display Name
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Error loading students: " + e.getMessage());
        }
    }
    
    //fetch room numbers and put it to the dropdown
    private void loadRoomDropdown() {
        roomNumCb.removeAllItems();
        String sql = "SELECT room_number FROM rooms";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                roomNumCb.addItem(String.valueOf(rs.getInt("room_number")));
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Error loading rooms: " + e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable complaintTable;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JTextArea descField;
    private javax.swing.JTextField issueTypeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton markBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox<String> roomNumCb;
    private javax.swing.JComboBox<String> statusCb;
    private javax.swing.JComboBox<Student> studentCb;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadRecords(String search) {
        tableModel = (DefaultTableModel) complaintTable.getModel();
        tableModel.setRowCount(0);
        
        //really long query
        String sql = "SELECT c.complaint_id, CONCAT(s.first_name, ' ', s.last_name) AS student_name, " +
                     "c.room_number, c.issue_type, c.description, c.status, c.date_resolved " +
                     "FROM dorm_management.complaints c " +
                     "LEFT JOIN dorm_management.students s ON c.student_id = s.student_id " +
                     "ORDER BY c.complaint_id DESC";
                     
        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
                  
            try (ResultSet rs = ps.executeQuery()) {
                java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                
                while (rs.next()) {
                    int id = rs.getInt("complaint_id");
                    String studentName = rs.getString("student_name");
                    int roomNum = rs.getInt("room_number");
                    String issue = rs.getString("issue_type");
                    String desc = rs.getString("description");
                    String status = rs.getString("status");
                    
                    java.sql.Timestamp ts = rs.getTimestamp("date_resolved");
                    String resolvedTime = (ts != null) ? format.format(ts) : "Pending";
                    
                    tableModel.addRow(new Object[]{id, (studentName != null ? studentName : "Unknown"), roomNum, issue, desc, status, resolvedTime});
                }
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }

    @Override
    public void addRecord() {
        //In case of null combo boxes
        if (studentCb.getSelectedItem() == null || roomNumCb.getSelectedItem() == null) {
            DataValidator.showError(this, "Student and Room Number must be selected."); return;
        }
        
        //We do need to ensure that the repairmen can know what issue to resolve, so...
        if (!DataValidator.isNotEmpty(issueTypeField.getText())) {
            DataValidator.showError(this, "Issue description is required."); return; 
        }
        
        //To prevent the user from adding a record that is actually selected from the table
        if(selectedTicketId != -1){
            DataValidator.showError(this, "Cannot add an existing record."); return;
        }

        String sql = "INSERT INTO complaints (student_id, room_number, issue_type, description, status) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
            
            //Extract ID variable from Student class first, cuz you know, it is stored in the student class
            Student selectedStudent = (Student) studentCb.getSelectedItem();
            ps.setInt(1, selectedStudent.getStudentId());
            
            ps.setInt(2, Integer.parseInt(roomNumCb.getSelectedItem().toString()));
            ps.setString(3, issueTypeField.getText().trim());
            ps.setString(4, descField.getText().trim());
            ps.setString(5, statusCb.getSelectedItem().toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Complaint Transaction Logged!");
            clearForm(); loadRecords("");
        } catch (SQLException e) { DataValidator.showError(this, "Database Error: " + e.getMessage()); }
    }

    @Override
    public void updateRecord() {
        //to indicate that the user did not select a record from the table
        if (selectedTicketId == -1) { 
            DataValidator.showError(this, "Select a complaint from the table to update."); 
            return; 
        }

        try (Connection conn = DBConnection.getConnection()) {
            //Check if the record is already fully completed/resolved
            String checkSql = "SELECT status FROM complaints WHERE complaint_id = ?";
            try (PreparedStatement checkPst = conn.prepareStatement(checkSql)) {
                checkPst.setInt(1, selectedTicketId);
                try (ResultSet rs = checkPst.executeQuery()) {
                    if (rs.next() && "Resolved".equals(rs.getString("status"))) {
                        DataValidator.showError(this, "This complaint is already marked as Resolved and can no longer be edited.");
                        return;
                    }
                }
            }

            //Handle the resolved timestamp, as a way to handle this delicate Timestamp variable
            String selectedStatus = statusCb.getSelectedItem().toString();
            java.sql.Timestamp resolvedTimestamp = null;

            if ("Resolved".equals(selectedStatus)) {
                resolvedTimestamp = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()); 
            }

            String sql = "UPDATE complaints SET issue_type = ?, description = ?, status = ?, date_resolved = ? WHERE complaint_id = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, issueTypeField.getText().trim()); 
                ps.setString(2, descField.getText().trim());
                ps.setString(3, selectedStatus);
                ps.setTimestamp(4, resolvedTimestamp);
                ps.setInt(5, selectedTicketId);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Complaint Status Updated successfully!");
                clearForm(); 
                loadRecords("");
            }

        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteRecord() {} //we're not deleting anything here
    
    //reset the entire form
    @Override public void clearForm() { 
        if(studentCb.getItemCount() > 0) studentCb.setSelectedIndex(0); 
        if(roomNumCb.getItemCount() > 0) roomNumCb.setSelectedIndex(0); 
        issueTypeField.setText("");
        statusCb.setSelectedIndex(0); }
}
