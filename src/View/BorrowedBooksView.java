/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ViewReport;
import Model.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BorrowedBooksView extends javax.swing.JDialog {

    /**
     * Creates new form BorrowedBooksView
     */
    
    ButtonGroup rb=new ButtonGroup();
    ButtonGroup RB=new ButtonGroup();
    public BorrowedBooksView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        rb.add(rb1);
        rb.add(rb2);
        RB.add(rb3);
        RB.add(rb4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBorrowedBooks = new javax.swing.JTable();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        txtSearchRecords = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("Borrowed Books Reports");

        tblBorrowedBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBorrowedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Book ID", "Borrowed Date", "Due Date", "Is Returned"
            }
        ));
        jScrollPane1.setViewportView(tblBorrowedBooks);

        rb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb1.setSelected(true);
        rb1.setText("View all");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb2.setText("View only not returned books");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        rb3.setSelected(true);
        rb3.setText("Search By Member ID");

        rb4.setText("Search By Book ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeading)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb1)
                            .addComponent(rb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb3)
                                    .addComponent(rb4))
                                .addGap(13, 13, 13)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchRecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(735, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel tblModel=(DefaultTableModel)tblBorrowedBooks.getModel();
        ViewReport report=new ViewReport();
        report.viewAllBorrowedBooks(tblModel);
    }//GEN-LAST:event_formWindowOpened

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        txtSearchRecords.setText(null);
        DefaultTableModel tblModel=(DefaultTableModel)tblBorrowedBooks.getModel();
        tblModel.setRowCount(0);
        ViewReport report=new ViewReport();
        report.viewOnlyNotReturnedBooks(tblModel);
        
        
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        txtSearchRecords.setText(null);
        DefaultTableModel tblModel=(DefaultTableModel)tblBorrowedBooks.getModel();
        tblModel.setRowCount(0);
        ViewReport report=new ViewReport();
        report.viewAllBorrowedBooks(tblModel);
    }//GEN-LAST:event_rb1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel=(DefaultTableModel)tblBorrowedBooks.getModel();
        tblModel.setRowCount(0);
        ViewReport report=new ViewReport();
        if(rb1.isSelected() && rb3.isSelected()){
            report.searchRecordsByMemberId(tblModel,txtSearchRecords.getText());
        }
        else if(rb2.isSelected() && rb3.isSelected()){
            report.searchRecordsByMemberId1(tblModel, txtSearchRecords.getText());
        }
        else if(rb1.isSelected() && rb4.isSelected()){
            report.searchRecordsByBookId(tblModel, txtSearchRecords.getText());
        }
        else{
            report.searchRecordsByBookId1(tblModel, txtSearchRecords.getText());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowedBooksView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooksView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooksView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooksView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BorrowedBooksView dialog = new BorrowedBooksView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTable tblBorrowedBooks;
    private javax.swing.JTextField txtSearchRecords;
    // End of variables declaration//GEN-END:variables
}
