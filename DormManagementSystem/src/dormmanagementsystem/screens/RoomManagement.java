
package dormmanagementsystem.screens;

import dormmanagementsystem.DBConnection;
import dormmanagementsystem.DataValidator;
import dormmanagementsystem.IRecordManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RoomManagement extends javax.swing.JFrame implements IRecordManager{
    
    private int selectedRoomNum = -1; //for UPDATE and DELETE operations
    private int lastSelectedRow = -1;
    private DefaultTableModel tableModel;

    public RoomManagement() {
        initComponents();
        loadRecords("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        controlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        capacityField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusCb = new javax.swing.JComboBox<>();
        updateRoomBtn = new javax.swing.JButton();
        addRoomBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        roomNumField = new javax.swing.JTextField();
        deleteRoomBtn1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room Management");
        setPreferredSize(new java.awt.Dimension(1100, 500));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Capacity", "Occupied", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.setMinimumSize(new java.awt.Dimension(300, 0));
        roomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomTable);
        if (roomTable.getColumnModel().getColumnCount() > 0) {
            roomTable.getColumnModel().getColumn(0).setResizable(false);
            roomTable.getColumnModel().getColumn(1).setResizable(false);
            roomTable.getColumnModel().getColumn(3).setResizable(false);
        }

        mainPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(400, 490));

        jLabel1.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Room Management Panel");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Room No:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Capacity:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Status:");

        statusCb.setBackground(new java.awt.Color(237, 200, 114));
        statusCb.setForeground(new java.awt.Color(51, 51, 51));
        statusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Full", "Maintenance" }));

        updateRoomBtn.setBackground(new java.awt.Color(237, 200, 114));
        updateRoomBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateRoomBtn.setText("Update Room");
        updateRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoomBtnActionPerformed(evt);
            }
        });

        addRoomBtn.setBackground(new java.awt.Color(226, 167, 29));
        addRoomBtn.setForeground(new java.awt.Color(51, 51, 51));
        addRoomBtn.setText("Add Room");
        addRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomBtnActionPerformed(evt);
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

        deleteRoomBtn1.setBackground(new java.awt.Color(225, 93, 93));
        deleteRoomBtn1.setText("Delete Room");
        deleteRoomBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomBtn1ActionPerformed(evt);
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
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(capacityField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomNumField)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteRoomBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(roomNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteRoomBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        mainPanel.add(controlPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        searchPanel.setBackground(new java.awt.Color(240, 237, 229));
        searchPanel.setPreferredSize(new java.awt.Dimension(1016, 50));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Search Room No.:");

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
                .addContainerGap(697, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoomBtnActionPerformed
        updateRecord();
    }//GEN-LAST:event_updateRoomBtnActionPerformed

    private void addRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBtnActionPerformed
        addRecord();
    }//GEN-LAST:event_addRoomBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        loadRecords("");
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void roomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomTableMouseClicked
        int selectedRow = roomTable.getSelectedRow();

        // Check if same row clicked again
        if(selectedRow == lastSelectedRow) {

            // Unselect table row
            roomTable.clearSelection();

            // Clear stored ID
            selectedRoomNum = -1;
            

            // Clear text fields
            roomNumField.setText("");
            capacityField.setText("");

            // Reset tracker
            lastSelectedRow = -1;
            statusCb.setSelectedIndex(0);
   
        }
        else {
            // Store selected row
            lastSelectedRow = selectedRow;
            
            selectedRoomNum = Integer.parseInt(roomTable.getValueAt(selectedRow, 0).toString());
            roomNumField.setText(roomTable.getValueAt(selectedRow, 0).toString());
            capacityField.setText(roomTable.getValueAt(selectedRow, 1).toString());
            statusCb.setSelectedItem(roomTable.getValueAt(selectedRow, 3).toString());

            roomTable.getValueAt(selectedRow, 3).toString();
            
        }
    }//GEN-LAST:event_roomTableMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        loadRecords(searchField.getText().trim());
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteRoomBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRoomBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    //check for duplicate room numbers
    private boolean isRoomExists(int roomNumber) {
        String sql = "SELECT room_number FROM rooms WHERE room_number = ?";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            pst.setInt(1, roomNumber);
            ResultSet rs = pst.executeQuery();
            return rs.next(); // Returns true if a record is found, meaning it's a duplicate!
        } catch (SQLException e) {
            System.err.println("Database check error: " + e.getMessage());
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField capacityField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton deleteRoomBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField roomNumField;
    private javax.swing.JTable roomTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> statusCb;
    private javax.swing.JButton updateRoomBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void loadRecords(String search) {
        tableModel = (DefaultTableModel) roomTable.getModel();
        tableModel.setRowCount(0);
        
        // counts the actual number of students assigned to each room live
        String sql = "SELECT r.room_number, r.capacity, r.status, COUNT(s.student_id) AS occupied_count " +
                     "FROM rooms r " +
                     "LEFT JOIN students s ON r.room_number = s.room_number " +
                     "WHERE CAST(r.room_number AS CHAR) LIKE ? " +
                     "GROUP BY r.room_number, r.capacity, r.status";
                     
 
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int roomNum = rs.getInt("room_number");
                int capacity = rs.getInt("capacity");
                int occupied = rs.getInt("occupied_count"); // Fetches the dynamic live count
                String status = rs.getString("status");
                
                tableModel.addRow(new Object[]{roomNum, capacity, occupied, status});
            }
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: " + e.getMessage());
        }
    }

    @Override
    public void addRecord() {
        if(!DataValidator.isInteger(roomNumField.getText()) || !DataValidator.isInteger(capacityField.getText())) {
             DataValidator.showError(this, "Room Number and Capacity must be valid integers.");
             return;
        }
        //check if the entered room number exist in the database, cuz you know
        int roomNum = Integer.parseInt(roomNumField.getText().trim());
        if (isRoomExists(roomNum)) {
            DataValidator.showError(this, "Room Number " + roomNum + " already exists! Please enter a unique room number.");
            return;
        }

        String sql = "INSERT INTO rooms (room_number, capacity, status) VALUES (?, ?, ?)";
        try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
            pst.setInt(1, Integer.parseInt(roomNumField.getText().trim()));
            pst.setInt(2, Integer.parseInt(capacityField.getText().trim()));
            pst.setString(3, statusCb.getSelectedItem().toString());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Room Added Successfully!");
            clearForm();
            loadRecords("");
        } catch (SQLException e) {
            DataValidator.showError(this, "Database Error: Room number might already exist! \n" + e.getMessage());
        }
    }

    @Override
    public void updateRecord() {
        if (selectedRoomNum == -1) { 
            DataValidator.showError(this, "Select a room from the table to update."); return; 
        }
        if (!DataValidator.isNotEmpty(capacityField.getText())) {
            DataValidator.showError(this, "Capacity cannot be empty."); return;
        }

        int newCapacity;
        try {
            newCapacity = Integer.parseInt(capacityField.getText().trim());
        } catch (NumberFormatException ex) {
            DataValidator.showError(this, "Capacity must be a valid number."); return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            //Check current live occupancy first
            int currentOccupancy = 0;
            String countSql = "SELECT COUNT(*) AS cnt FROM students WHERE room_number = ?";
            try (PreparedStatement countPst = conn.prepareStatement(countSql)) {
                countPst.setInt(1, selectedRoomNum);
                try (ResultSet rs = countPst.executeQuery()) {
                    if (rs.next()) currentOccupancy = rs.getInt("cnt");
                }
            }

            //Reject if the new capacity is too low
            if (newCapacity < currentOccupancy) {
                DataValidator.showError(this, "Cannot update! The room currently has " + currentOccupancy + 
                                              " student(s). Capacity cannot be lower than the current occupancy.");
                return;
            }

            //If no problems, proceed to the update
            String sql = "UPDATE rooms r " +
                         "LEFT JOIN (SELECT room_number, COUNT(*) as cnt FROM students GROUP BY room_number) s " +
                         "ON r.room_number = s.room_number " +
                         "SET r.capacity = ?, " +
                         "    r.status = IF(IFNULL(s.cnt, 0) >= ?, 'Full', 'Available') " +
                         "WHERE r.room_number = ?";

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, newCapacity);
                ps.setInt(2, newCapacity); 
                ps.setInt(3, selectedRoomNum); 
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Room Updated Successfully!");
                clearForm(); loadRecords("");
            }
            
        } catch (SQLException e) { 
            DataValidator.showError(this, "Database Error: " + e.getMessage()); 
        }
    }

    @Override
    public void deleteRecord() {
        if (selectedRoomNum == -1) {
            DataValidator.showError(this, "Please select a room to delete."); 
            return; 
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this room? (Students in this room will lose their room assignment)", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int roomNumber = selectedRoomNum;
            String sql = "DELETE FROM rooms WHERE room_number = ?";
            
            try (PreparedStatement pst = DBConnection.getConnection().prepareStatement(sql)) {
                pst.setInt(1, roomNumber);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Room Deleted Successfully!");
                clearForm();
                loadRecords("");
            } catch (SQLException e) {
                DataValidator.showError(this, "Database Error: " + e.getMessage());
            }
        }
    }

    @Override
    public void clearForm() {
        roomNumField.setText("");
        capacityField.setText("");
        statusCb.setSelectedIndex(0);
        roomTable.clearSelection();
    }
}
