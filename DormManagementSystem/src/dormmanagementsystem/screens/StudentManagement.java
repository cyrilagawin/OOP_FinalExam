
package dormmanagementsystem.screens;
import dormmanagementsystem.DBConnection;
import dormmanagementsystem.DataValidator;
import dormmanagementsystem.IRecordManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentManagement extends javax.swing.JFrame implements IRecordManager{
    
    private int selectedStudentId = -1; //for UPDATE and DELETE operations
    private int lastSelectedRow = -1;
    private DefaultTableModel tableModel;

    public StudentManagement() {
        initComponents();
        loadRoomDropdown();
        loadRecords(""); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        roomNumberCb = new javax.swing.JComboBox<>();
        updateStudentBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Management");
        setPreferredSize(new java.awt.Dimension(1175, 500));

        searchPanel.setBackground(new java.awt.Color(240, 237, 229));
        searchPanel.setPreferredSize(new java.awt.Dimension(1016, 50));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Search Name:");

        searchBtn.setBackground(new java.awt.Color(237, 200, 114));
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(10, 10, 10))
        );

        getContentPane().add(searchPanel, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        studentTable.setBackground(new java.awt.Color(255, 255, 255));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Last Name", "First Name", "Room No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.getTableHeader().setReorderingAllowed(false);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
            studentTable.getColumnModel().getColumn(2).setResizable(false);
            studentTable.getColumnModel().getColumn(3).setResizable(false);
        }

        mainPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(400, 490));

        jLabel1.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Student Management Panel:");

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Last Name:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("First Name:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Room No:");

        roomNumberCb.setBackground(new java.awt.Color(237, 200, 114));

        updateStudentBtn.setBackground(new java.awt.Color(237, 200, 114));
        updateStudentBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateStudentBtn.setText("Update Student");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });

        addStudentBtn.setBackground(new java.awt.Color(226, 167, 29));
        addStudentBtn.setForeground(new java.awt.Color(51, 51, 51));
        addStudentBtn.setText("Add Student");
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        deleteStudentBtn.setBackground(new java.awt.Color(225, 93, 93));
        deleteStudentBtn.setText("Delete Student");
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(237, 200, 114));
        refreshBtn.setForeground(new java.awt.Color(51, 51, 51));
        refreshBtn.setText("Refresh List");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(237, 200, 114));
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameField))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomNumberCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameField)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNumberCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        mainPanel.add(controlPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        updateRecord();
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        addRecord();
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        deleteRecord();
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        int selectedRow = studentTable.getSelectedRow();

        // Check if same row clicked again
        if(selectedRow == lastSelectedRow) {

            // Unselect table row
            studentTable.clearSelection();

            // Clear stored ID
            selectedStudentId = -1;

            // Clear text fields
            lastNameField.setText("");
            firstNameField.setText("");

            // Reset tracker
            lastSelectedRow = -1;
        }
        else {
            // Store selected row
            lastSelectedRow = selectedRow;
            
            selectedStudentId = Integer.parseInt(studentTable.getValueAt(selectedRow, 0).toString());
            lastNameField.setText(studentTable.getValueAt(selectedRow, 1).toString());
            firstNameField.setText(studentTable.getValueAt(selectedRow, 2).toString());
            
        }
    }//GEN-LAST:event_studentTableMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        loadRecords(searchField.getText().trim());
    }//GEN-LAST:event_searchBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        loadRecords("");
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    //Fetch available rooms in the database
    private void loadRoomDropdown() {
        roomNumberCb.removeAllItems();
        String sql = "SELECT room_number FROM rooms WHERE status = 'Available'"; 
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                roomNumberCb.addItem(String.valueOf(rs.getInt("room_number")));
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Error loading rooms: " + e.getMessage());
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox<String> roomNumberCb;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton updateStudentBtn;
    // End of variables declaration//GEN-END:variables
    
    
    //Interface Section
    
     @Override
    public void loadRecords(String search) {
        tableModel = (DefaultTableModel) studentTable.getModel();
        tableModel.setRowCount(0);
        String sql = "SELECT * FROM students WHERE first_name LIKE ? OR last_name LIKE ?";
        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("student_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("room_number")});
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }
    
    @Override
    public void addRecord() {
        if (!DataValidator.isNotEmpty(firstNameField.getText(), lastNameField.getText())) {
            DataValidator.showError(this, "Names cannot be empty."); return;
        }
        if (roomNumberCb.getSelectedItem() == null) {
            DataValidator.showError(this, "Please select a room."); return;
        }

        String sql = "INSERT INTO students (first_name, last_name, room_number) VALUES (?, ?, ?)";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            pst.setString(1, firstNameField.getText());
            pst.setString(2, lastNameField.getText());
            pst.setInt(3, Integer.parseInt(roomNumberCb.getSelectedItem().toString()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added successfully!");
            clearForm(); loadRecords("");
        } catch (SQLException e) { DataValidator.showError(this, e.getMessage()); }
    }

    @Override
    public void updateRecord() {
        
        //validation checking
        if (selectedStudentId == -1) { DataValidator.showError(this, "Select a record to update."); return; }
        if (roomNumberCb.getSelectedItem() == null) { DataValidator.showError(this, "Please select a room."); return; }
        
        String sql = "UPDATE students SET last_name=?, first_name=?, room_number=? WHERE student_id=?";
        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, lastNameField.getText());
            ps.setString(2, firstNameField.getText());
            ps.setInt(3, Integer.parseInt(roomNumberCb.getSelectedItem().toString()));
            ps.setInt(4, selectedStudentId);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated successfully!");
            clearForm(); loadRecords("");
        } catch (SQLException e) { DataValidator.showError(this, e.getMessage()); }
    }

    @Override
    public void deleteRecord() {
        //validation checking
        if (selectedStudentId == -1) { DataValidator.showError(this, "Select a record to remove."); return; }
        
        if (JOptionPane.showConfirmDialog(this, "Delete this record?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM students WHERE student_id=?";
            try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql)) {
                ps.setInt(1, selectedStudentId);
                ps.executeUpdate();
                
                clearForm(); loadRecords("");
            } catch (SQLException e) { DataValidator.showError(this, e.getMessage()); }
        }
    }

    @Override
    public void clearForm() {
        firstNameField.setText(""); 
        lastNameField.setText(""); 
        if(roomNumberCb.getItemCount() > 0) roomNumberCb.setSelectedIndex(0); 
        studentTable.clearSelection();
    }
}
