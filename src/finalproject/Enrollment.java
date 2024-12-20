/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package finalproject;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nisrienmahri
 */
public class Enrollment extends javax.swing.JFrame {

    /** Creates new form Enrollment
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException */
    public Enrollment() throws SQLException, ClassNotFoundException {
        initComponents();
        populateCombo();
    }
    
    public void populateCombo() throws SQLException, ClassNotFoundException {
    final String QUERY = "SELECT * FROM Schools";

    try (Connection conn = FinalProject.getConnection()) {
        // Check if the connection is null and handle it accordingly
        if (conn == null) {
            System.err.println("Failed to connect to the database.");
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            return; // Exit the method if connection is null
        }


    try (Statement s = conn.createStatement();
         ResultSet rs = s.executeQuery(QUERY)) {

        boolean hasRows = false; // To check if the result set has any rows

        while (rs.next()) {
            hasRows = true; // Mark that there are rows
            schoolcb.addItem(rs.getString("SchoolName"));
        }

        // Check if the ResultSet was empty
        if (!hasRows) {
            JOptionPane.showMessageDialog(this, "No schools found in the database.");
        }

    } catch (SQLException ex) {
        Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error loading schools: " + ex.getMessage());
    }
    }       catch (IOException ex) {
            Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subjectcb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        schoolcb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        firstnametf = new javax.swing.JTextField();
        lastnametf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        backarrow = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel1.setText("and skills is greatly appreciated. ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 360, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setText("Please fill in the required data below");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        subjectcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Indonesian", "Physics", "Biology", "Economics", "History" }));
        jPanel1.add(subjectcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 166, -1));

        jLabel3.setText("First Name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel4.setText("Last Name : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel5.setText("School : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabel6.setText("Subject : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel7.setText("Email : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel8.setText("Phone Number : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        schoolcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolcbActionPerformed(evt);
            }
        });
        jPanel1.add(schoolcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 166, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 80, 30));
        jPanel1.add(firstnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 166, -1));
        jPanel1.add(lastnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 166, -1));
        jPanel1.add(emailtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 166, -1));
        jPanel1.add(phonetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 166, -1));

        jLabel10.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel10.setText("Your decision to give back to the");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 330, -1));

        jLabel11.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel11.setText("You will not only make a difference in");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 360, -1));

        jLabel12.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel12.setText("the lives of those you help, but you will  ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 400, -1));

        jLabel13.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel13.setText("experiences and a sense of fulfillment. ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 360, -1));

        jLabel14.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel14.setText("community by volunteering your time ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 360, -1));

        jLabel15.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel15.setText("Thank you for your generosity and");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 360, -1));

        jLabel16.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel16.setText("working together with Volunteach!");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 360, -1));

        jLabel19.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        jLabel19.setText("also enrich your own life by gaining new");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 380, -1));

        backarrow.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        backarrow.setText("< back");
        backarrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backarrowMouseClicked(evt);
            }
        });
        jPanel1.add(backarrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/11111.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/volsbigbg.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void schoolcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolcbActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
            String firstname = firstnametf.getText();
            String lastname = lastnametf.getText();
            String email = emailtf.getText();
            String phone = phonetf.getText();
            
            if (firstname.isBlank() || lastname.isBlank()|| email.isBlank()|| phone.isBlank()) {
           JOptionPane.showMessageDialog(null, "First Name, Last Name, Email, or Phone number is empty");
            }else {
                int i = JOptionPane.showConfirmDialog(this, "Are you sure the data inputted is correct?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0){ //yes
            try {
                java.sql.Connection conn = FinalProject.getConnection();
                
                PreparedStatement prep = conn.prepareStatement ("INSERT INTO Enrollment (FirstName, LastName, Email, PhoneNumber, School, Subject) VALUES (?, ?, ?, ?, ?, ?)");
                        
                prep.setString(1, firstname);
                prep.setString(2, lastname);
                prep.setString(3, email);
                prep.setString(4, phone);
                prep.setString(5, (String) schoolcb.getSelectedItem());
                prep.setString(6, (String) subjectcb.getSelectedItem());
                
                prep.execute();
                JOptionPane.showMessageDialog (null, "Thank you for making a change");
                
                new MainPage().setVisible(true);
                this.dispose();
                
            }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }       catch (IOException ex) {
                        Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                }
        }
   
    }//GEN-LAST:event_jButton1MouseClicked

    private void backarrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backarrowMouseClicked
        try {
            new MainPage().setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backarrowMouseClicked

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
            java.util.logging.Logger.getLogger(Enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Enrollment().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(Enrollment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backarrow;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField firstnametf;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnametf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JComboBox<String> schoolcb;
    private javax.swing.JComboBox<String> subjectcb;
    // End of variables declaration//GEN-END:variables

}
