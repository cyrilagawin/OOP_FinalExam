
package dormmanagementsystem.screens;
import dormmanagementsystem.DBConnection;
import dormmanagementsystem.SessionManager;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        //uses the SessionManager class to see if there are any logged in admins or not
        if (!SessionManager.isLoggedIn()) {
            SwingUtilities.invokeLater(() -> new Login().setVisible(true));
            this.dispose(); 
            return; 
        }
        initComponents();
        loadOverviewData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        screenPanel = new javax.swing.JPanel();
        studentBtn = new javax.swing.JButton();
        roomBtn = new javax.swing.JButton();
        feeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        currentStudentsAssigned = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        availableRoomsLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalMonthlyFeesField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        complaintBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agawin Dormitory Management System");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        headerPanel.setBackground(new java.awt.Color(240, 237, 229));
        headerPanel.setPreferredSize(new java.awt.Dimension(900, 60));
        headerPanel.setVerifyInputWhenFocusTarget(false);

        jLabel6.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dormitory Management System");

        logoutBtn.setBackground(new java.awt.Color(237, 200, 114));
        logoutBtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(45, 45, 45))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(logoutBtn))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        mainPanel.add(headerPanel, java.awt.BorderLayout.NORTH);

        screenPanel.setBackground(new java.awt.Color(255, 255, 255));

        studentBtn.setBackground(new java.awt.Color(237, 200, 114));
        studentBtn.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        studentBtn.setForeground(new java.awt.Color(51, 51, 51));
        studentBtn.setText("Manage Students");
        studentBtn.setBorder(null);
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        roomBtn.setBackground(new java.awt.Color(237, 200, 114));
        roomBtn.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        roomBtn.setForeground(new java.awt.Color(51, 51, 51));
        roomBtn.setText("Manage Rooms");
        roomBtn.setBorder(null);
        roomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomBtnActionPerformed(evt);
            }
        });

        feeBtn.setBackground(new java.awt.Color(237, 200, 114));
        feeBtn.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        feeBtn.setForeground(new java.awt.Color(51, 51, 51));
        feeBtn.setText("Manage Fees");
        feeBtn.setBorder(null);
        feeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 222, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Current Students Assigned:");

        currentStudentsAssigned.setFont(new java.awt.Font("Alfabeto", 0, 24)); // NOI18N
        currentStudentsAssigned.setForeground(new java.awt.Color(51, 51, 51));
        currentStudentsAssigned.setText("0/0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(currentStudentsAssigned)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(71, Short.MAX_VALUE)
                    .addComponent(currentStudentsAssigned)
                    .addGap(27, 27, 27)))
        );

        jPanel2.setBackground(new java.awt.Color(235, 222, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Available Rooms:");

        availableRoomsLabel.setFont(new java.awt.Font("Alfabeto", 0, 24)); // NOI18N
        availableRoomsLabel.setForeground(new java.awt.Color(51, 51, 51));
        availableRoomsLabel.setText("0/0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableRoomsLabel)
                    .addComponent(jLabel2))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(availableRoomsLabel)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(235, 222, 195));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Total Fees Paid this Month:");

        totalMonthlyFeesField.setFont(new java.awt.Font("Alfabeto", 0, 24)); // NOI18N
        totalMonthlyFeesField.setForeground(new java.awt.Color(51, 51, 51));
        totalMonthlyFeesField.setText("PHP 0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalMonthlyFeesField)
                    .addComponent(jLabel3))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(totalMonthlyFeesField)
                .addGap(25, 25, 25))
        );

        jLabel4.setFont(new java.awt.Font("Alfabeto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Management Windows");

        complaintBtn.setBackground(new java.awt.Color(237, 200, 114));
        complaintBtn.setFont(new java.awt.Font("Alfabeto", 0, 18)); // NOI18N
        complaintBtn.setForeground(new java.awt.Color(51, 51, 51));
        complaintBtn.setText("Log Complaints");
        complaintBtn.setBorder(null);
        complaintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Alfabeto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Overview");

        javax.swing.GroupLayout screenPanelLayout = new javax.swing.GroupLayout(screenPanel);
        screenPanel.setLayout(screenPanelLayout);
        screenPanelLayout.setHorizontalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(screenPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, screenPanelLayout.createSequentialGroup()
                        .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complaintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(feeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        screenPanelLayout.setVerticalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(complaintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        mainPanel.add(screenPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
        new StudentManagement().setVisible(true);
    }//GEN-LAST:event_studentBtnActionPerformed

    private void complaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintBtnActionPerformed
        new ComplaintManagement().setVisible(true);
    }//GEN-LAST:event_complaintBtnActionPerformed

    private void roomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomBtnActionPerformed
        new RoomManagement().setVisible(true);
    }//GEN-LAST:event_roomBtnActionPerformed

    private void feeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeBtnActionPerformed
        new FeeManagement().setVisible(true);
    }//GEN-LAST:event_feeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        dormmanagementsystem.SessionManager.endSession(); //use the SessionManager's endSession

        JOptionPane.showMessageDialog(this, 
            "You have been securely logged out.", 
            "Logged Out", 
            JOptionPane.INFORMATION_MESSAGE);
        this.dispose();

        javax.swing.SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }//GEN-LAST:event_logoutBtnActionPerformed
    
    //FETCH the current data and render it to the overview panels
    private void loadOverviewData() {
        try {
            Connection con = DBConnection.getConnection(); 
            
            //Calculate Current Students Assigned
            int assignedStudents = 0;
            int totalCapacity = 0;
            
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS assigned FROM students WHERE room_number IS NOT NULL")) {
                if (rs.next()) assignedStudents = rs.getInt("assigned");
            }
            
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT SUM(capacity) AS total_cap FROM rooms")) {
                if (rs.next()) totalCapacity = rs.getInt("total_cap");
            }
            currentStudentsAssigned.setText(assignedStudents + " / " + totalCapacity);

            //Calculate Available Rooms
            int availableRooms = 0;
            int totalRooms = 0;
            
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS available FROM rooms WHERE status = 'Available'")) {
                if (rs.next()) availableRooms = rs.getInt("available");
            }
            
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM rooms")) {
                if (rs.next()) totalRooms = rs.getInt("total");
            }
            availableRoomsLabel.setText(availableRooms + " / " + totalRooms);

            //Calculate Total Fees Paid for the CURRENT MONTH
            double totalFeesPaid = 0.0;
            
            LocalDate now = LocalDate.now();
            LocalDate firstDay = now.withDayOfMonth(1);
            LocalDate lastDay = now.withDayOfMonth(now.lengthOfMonth());
            
            String feeSql = "SELECT SUM(amount) AS total_paid FROM fees WHERE status = 'Paid' AND due_date >= ? AND due_date <= ?";
            
            try (PreparedStatement pstmt = con.prepareStatement(feeSql)) {
                pstmt.setDate(1, java.sql.Date.valueOf(firstDay));
                pstmt.setDate(2, java.sql.Date.valueOf(lastDay));
                
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        totalFeesPaid = rs.getDouble("total_paid");
                    }
                }
            }      
            totalMonthlyFeesField.setText(String.format("PHP %.2f", totalFeesPaid));

        } catch (SQLException e) {
            System.err.println("Dashboard Data Error: " + e.getMessage());
        }
    }
 
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableRoomsLabel;
    private javax.swing.JButton complaintBtn;
    private javax.swing.JLabel currentStudentsAssigned;
    private javax.swing.JButton feeBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton roomBtn;
    private javax.swing.JPanel screenPanel;
    private javax.swing.JButton studentBtn;
    private javax.swing.JLabel totalMonthlyFeesField;
    // End of variables declaration//GEN-END:variables
}
