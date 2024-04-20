/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package loginform;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdellah
 */
public class Produit extends javax.swing.JPanel {
  
    public Produit() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        deleteB = new javax.swing.JButton();
        addB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        fDesignation = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        fidact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(97, 147, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable22.setBackground(new java.awt.Color(97, 147, 246));
        jTable22.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTable22.setForeground(new java.awt.Color(0, 0, 0));
        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPr", "DesignationP", "Price", "Idcat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable22.setGridColor(new java.awt.Color(0, 0, 0));
        jTable22.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jTable22.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable22.setShowGrid(true);
        jTable22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable22MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable22);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 280, 160));

        deleteB.setBackground(new java.awt.Color(255, 255, 255));
        deleteB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deleteB.setForeground(new java.awt.Color(25, 118, 211));
        deleteB.setText("Delete");
        deleteB.setBorder(null);
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });
        add(deleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 110, 40));

        addB.setBackground(new java.awt.Color(255, 255, 255));
        addB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        addB.setForeground(new java.awt.Color(25, 118, 211));
        addB.setText("Add");
        addB.setBorder(null);
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });
        add(addB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 110, 40));

        updateB.setBackground(new java.awt.Color(255, 255, 255));
        updateB.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        updateB.setForeground(new java.awt.Color(25, 118, 211));
        updateB.setText("Update");
        updateB.setBorder(null);
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });
        add(updateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 110, 40));

        fDesignation.setBackground(new java.awt.Color(97, 147, 246));
        fDesignation.setForeground(new java.awt.Color(0, 0, 0));
        fDesignation.setBorder(null);
        add(fDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 170, 30));

        fprice.setBackground(new java.awt.Color(97, 147, 246));
        fprice.setBorder(null);
        fprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpriceActionPerformed(evt);
            }
        });
        add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 160, 30));

        fidact.setBackground(new java.awt.Color(97, 147, 246));
        fidact.setBorder(null);
        fidact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidactActionPerformed(evt);
            }
        });
        add(fidact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(199, 226, 255));
        jLabel1.setText("Desgnation ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(199, 226, 255));
        jLabel2.setText("Price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 226, 255));
        jLabel3.setText("Idcat");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 40, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 150, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 10));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 70, 40));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 70, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel_3.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 70, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 70, 10));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 70, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
    String designation = fDesignation.getText();
    String price = fprice.getText();
    String category =fidact.getText();
    DefaultTableModel model = (DefaultTableModel) jTable22.getModel();
    try {
    Connection conn =  SingletonConnection.getConnection();
    String SQL = "INSERT INTO product (Designation, price, idCat) VALUES (?, ?, ?)";
    PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
    pstmt.setString(1, designation);
    pstmt.setString(2, price);
    pstmt.setString(3, category);
    int r = pstmt.executeUpdate();
    if (r == 1) {
        ResultSet generatedKeys = pstmt.getGeneratedKeys();
        if (generatedKeys.next()) {
            int generatedId = generatedKeys.getInt(1);
            JOptionPane.showMessageDialog(null, "Product added successfully with ID: " + generatedId);
            Object[] Data = { generatedId, designation, price, category };
            model.addRow(Data);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add product to the database", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    ex.printStackTrace(); 
    JOptionPane.showMessageDialog(null, "An error occurred while adding the new product:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_addBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
int selectedRow = jTable22.getSelectedRow();
if (selectedRow == -1) {
    JOptionPane.showMessageDialog(null, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
String Desg = fDesignation.getText();
String price = fprice.getText();
String idcaa = fidact.getText();
DefaultTableModel model = (DefaultTableModel) jTable22.getModel();
model.setValueAt(Desg, selectedRow, 1);
model.setValueAt(price, selectedRow, 2);
model.setValueAt(idcaa, selectedRow, 3);

Connection conn = SingletonConnection.getConnection();
try {
    PreparedStatement pstmt = conn.prepareStatement("UPDATE product SET Designation = ?, price = ?, idCat = ? WHERE idPr = ?");
    int idPr = (int) model.getValueAt(selectedRow, 0);
    pstmt.setString(1, Desg);
    pstmt.setString(2, price);
    pstmt.setString(3, idcaa);
    pstmt.setInt(4, idPr);
    int result = pstmt.executeUpdate();
    if (result == 1) {
        JOptionPane.showMessageDialog(null, "Product updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update product in the database", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Problem updating the product in the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_updateBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable22.getModel();
    if (jTable22.getSelectedRowCount() == 1) {
        int selectedRow = jTable22.getSelectedRow();
        int idToDelete = (int) model.getValueAt(selectedRow, 0); // Assuming idPr is in the first column

        model.removeRow(selectedRow);

        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM product WHERE idPr = ?");
            pstmt.setInt(1, idToDelete);

            int result = pstmt.executeUpdate();

            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Product removed successfully from the database", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to remove product from the database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem removing the product from the database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    }//GEN-LAST:event_deleteBActionPerformed

    private void jTable22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable22MouseClicked
       int ligne = jTable22.getSelectedRow();
     fDesignation.setText((String) jTable22.getValueAt(ligne,1));
     fprice.setText(jTable22.getValueAt(ligne,2).toString());
     fidact.setText(jTable22.getValueAt(ligne,3).toString());
    }//GEN-LAST:event_jTable22MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     fDesignation.setText("");
     fprice.setText("");
     fidact.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void fpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpriceActionPerformed

    private void fidactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fidactActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JButton deleteB;
    private javax.swing.JTextField fDesignation;
    private javax.swing.JTextField fidact;
    private javax.swing.JTextField fprice;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTable jTable22;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
