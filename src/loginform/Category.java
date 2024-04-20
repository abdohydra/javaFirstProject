/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author Abdellah
 */
package loginform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Category extends javax.swing.JPanel {
  JpanelLoader jpload=new JpanelLoader(); 
    public Category() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecat = new javax.swing.JTable();
        clearB = new javax.swing.JButton();
        updatecat = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtfDesignationcat = new javax.swing.JTextField();
        txtfDescat1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(97, 147, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablecat.setBackground(new java.awt.Color(97, 147, 246));
        jTablecat.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTablecat.setForeground(new java.awt.Color(255, 255, 255));
        jTablecat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id ", "Designation", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablecat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablecatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablecat);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 300, 200));

        clearB.setBackground(new java.awt.Color(0, 0, 0));
        clearB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        clearB.setForeground(new java.awt.Color(255, 255, 255));
        clearB.setText("clear");
        clearB.setBorder(null);
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });
        add(clearB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 30));

        updatecat.setBackground(new java.awt.Color(255, 255, 255));
        updatecat.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        updatecat.setForeground(new java.awt.Color(25, 118, 211));
        updatecat.setText("Update");
        updatecat.setBorder(null);
        updatecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecatActionPerformed(evt);
            }
        });
        add(updatecat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(25, 118, 211));
        jButton3.setText("Delete");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 110, 30));

        txtid.setBackground(new java.awt.Color(97, 147, 246));
        txtid.setBorder(null);
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 226, 255));
        jLabel1.setText("Designation");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 226, 255));
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 130, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 90, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        txtfDesignationcat.setBackground(new java.awt.Color(97, 147, 246));
        txtfDesignationcat.setBorder(null);
        txtfDesignationcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDesignationcatActionPerformed(evt);
            }
        });
        add(txtfDesignationcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 20));

        txtfDescat1.setBackground(new java.awt.Color(97, 147, 246));
        txtfDescat1.setBorder(null);
        add(txtfDescat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 130, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, 10));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(25, 118, 211));
        jButton4.setText("Add");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_3.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 80, 10));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 90, 10));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTablecat.getModel();
        if (jTablecat.getSelectedRowCount() == 1) {
        int selectedRow = jTablecat.getSelectedRow();
         int idToDelete = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        model.removeRow(selectedRow);
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM category WHERE idcat = ?");
            pstmt.setInt(1, idToDelete);
            int result = pstmt.executeUpdate();
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "cat removed successfully from the database", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to remove cat from the database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem removing the cat from the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtfDesignationcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDesignationcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDesignationcatActionPerformed

    private void jTablecatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablecatMouseClicked
        int ligne = jTablecat.getSelectedRow();
        int id = Integer.parseInt(jTablecat.getValueAt(ligne, 0).toString());
        txtid.setText(String.valueOf(id));
        txtfDesignationcat.setText((String) jTablecat.getValueAt(ligne, 1));
        txtfDescat1.setText(jTablecat.getValueAt(ligne, 2).toString());
    }//GEN-LAST:event_jTablecatMouseClicked

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
    txtid.setText("");
    txtfDesignationcat.setText("");
    txtfDescat1.setText("");
    }//GEN-LAST:event_clearBActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      String designation = txtfDesignationcat.getText();
    String id = txtid.getText();
    String descrip = txtfDescat1.getText();
    DefaultTableModel model = (DefaultTableModel) jTablecat.getModel();
    
    try {
        Connection conn = SingletonConnection.getConnection();
        String SQL = "INSERT INTO category (idcat, Designation, Description) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, id);
        pstmt.setString(2, designation);
        pstmt.setString(3, descrip);
        int r = pstmt.executeUpdate();
        if (r == 1) {
            JOptionPane.showMessageDialog(null, "Category added");
            Object[] rowData = {id, designation, descrip};
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add category to the database", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "An error occurred while adding the new category:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updatecatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecatActionPerformed
  int selectedRow = jTablecat.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(null, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

String designation = txtfDesignationcat.getText();
String descrip = txtfDescat1.getText();
String id2 = txtid.getText();
DefaultTableModel model = (DefaultTableModel) jTablecat.getModel();
String idString = (String) model.getValueAt(selectedRow, 0);
int id = Integer.parseInt(idString);
Connection conn = SingletonConnection.getConnection();
try {
    if (conn == null) {
        JOptionPane.showMessageDialog(null, "Database connection is null", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String sql = "UPDATE category SET idcat = ?, Designation = ?, Description = ? WHERE idcat = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, id);
    pstmt.setString(2, designation);
    pstmt.setString(3, descrip);
    pstmt.setInt(4, id);
    System.out.println("SQL Query: " + pstmt.toString());

    int result = pstmt.executeUpdate();
    if (result == 1) {
        model.setValueAt(id2, selectedRow, 0);
        model.setValueAt(designation, selectedRow, 1);
        model.setValueAt(descrip, selectedRow, 2);
        JOptionPane.showMessageDialog(null, "Category updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update category in the database", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Problem updating the category in the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Invalid ID format: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_updatecatActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearB;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable jTablecat;
    private javax.swing.JTextField txtfDescat1;
    private javax.swing.JTextField txtfDesignationcat;
    private javax.swing.JTextField txtid;
    private javax.swing.JButton updatecat;
    // End of variables declaration//GEN-END:variables
}
