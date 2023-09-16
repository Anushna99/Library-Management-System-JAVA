/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BorrowBook;
import Controller.SearchBook;
import Controller.SearchMember;
import Model.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BorrowBooks extends javax.swing.JDialog {

    /**
     * Creates new form BorrowBooks
     */
    public BorrowBooks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtBookId.setEditable(false);
        txtBorrowedDate.setEditable(false);
        txtDueDate.setEditable(false);
        txtMemberId.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        lblMemberId = new javax.swing.JLabel();
        lblBookId = new javax.swing.JLabel();
        lblBorrowedDate = new javax.swing.JLabel();
        lblDueDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBorrowedBooks = new javax.swing.JTable();
        txtMemberId = new javax.swing.JTextField();
        txtBookId = new javax.swing.JTextField();
        txtBorrowedDate = new javax.swing.JTextField();
        txtDueDate = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMembers = new javax.swing.JTable();
        lblBorrowedBooks = new javax.swing.JLabel();
        lblMembers = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();
        txtSearchBooks = new javax.swing.JTextField();
        btnSearchBooks = new javax.swing.JButton();
        txtSearchMembers = new javax.swing.JTextField();
        btnSearchMembers = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        btnBorrow = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Author", "All Copies", "Available Copies"
            }
        ));
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBooks);

        lblMemberId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMemberId.setText("Member ID");

        lblBookId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBookId.setText("Book ID");

        lblBorrowedDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBorrowedDate.setText("Borrowed Date");

        lblDueDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDueDate.setText("Due Date");

        tblBorrowedBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBorrowedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Book ID", "Book Title"
            }
        ));
        jScrollPane2.setViewportView(tblBorrowedBooks);

        txtMemberId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBookId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBorrowedDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDueDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tblMembers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "First Name", "Last Name"
            }
        ));
        tblMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMembersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMembers);

        lblBorrowedBooks.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        lblBorrowedBooks.setText("Borrwed Books");

        lblMembers.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        lblMembers.setText("Members");

        lblBooks.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        lblBooks.setText("Books");

        btnSearchBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchBooks.setText("SEARCH");
        btnSearchBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBooksActionPerformed(evt);
            }
        });

        btnSearchMembers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchMembers.setText("SEARCH");
        btnSearchMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMembersActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("View/Borrow Books");

        btnBorrow.setBackground(new java.awt.Color(102, 255, 51));
        btnBorrow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrow.setText(">>Borrow");
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 51));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblSearch.setText("(search by ID)");

        jLabel1.setText("(search by Title)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeading)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMemberId)
                                    .addComponent(lblDueDate)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBorrowedDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBookId)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBorrowedDate)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMemberId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearchMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(btnSearchMembers))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBorrowedBooks)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMembers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSearch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBooks)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearchBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchBooks)))
                                .addGap(0, 554, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblHeading)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDueDate)
                            .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemberId))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookId))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBorrowedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBorrowedDate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBorrowedBooks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMembers)
                                    .addComponent(lblSearch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchMembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearchMembers))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel)
                        .addComponent(btnBorrow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBooks)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchBooks))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1121, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtBorrowedDate.setText(String.valueOf(java.time.LocalDate.now()));
        txtDueDate.setText(String.valueOf(java.time.LocalDate.now().plusDays(21)));
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from books";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String bookId=rst.getString("bookId");
             String bookTitle=rst.getString("bookTitle");
             String author=rst.getString("author");
             String numberOfCopies=rst.getString("numOfCopies");
             String numberOfAvailableCopies=rst.getString("numOfAvailableCopies");
             
             String tblData[]={bookId,bookTitle,author,numberOfCopies,numberOfAvailableCopies};
                DefaultTableModel tblModel=(DefaultTableModel)tblBooks.getModel();
                tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from members";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String firstName=rst.getString("firstName");
             String lastName=rst.getString("lastName");
             
             String tblData[]={memberId,firstName,lastName};
             DefaultTableModel tblModel=(DefaultTableModel)tblMembers.getModel();
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSearchBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBooksActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel1=(DefaultTableModel)tblBooks.getModel();
        tblModel1.setRowCount(0);
        SearchBook searchBook=new SearchBook();
        searchBook.searchForBook(txtSearchBooks.getText(), tblModel1);
        
    }//GEN-LAST:event_btnSearchBooksActionPerformed

    private void tblMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMembersMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel=(DefaultTableModel)tblMembers.getModel();
        int selectedRowIndex=tblMembers.getSelectedRow();
        txtMemberId.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
        DefaultTableModel tblModel2=(DefaultTableModel)tblBorrowedBooks.getModel();
        tblModel2.setRowCount(0);
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select M.memberId,M.bookId,B.bookTitle from borrowed_books M,books B where M.bookId=B.bookId and M.memberId='"+txtMemberId.getText()+"' and M.isReturned='"+"No"+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String bookId=rst.getString("bookId");
             String bookTitle=rst.getString("bookTitle");
             
             String tblData[]={memberId,bookId,bookTitle};
             DefaultTableModel tblModel1=(DefaultTableModel)tblBorrowedBooks.getModel();
             tblModel1.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_tblMembersMouseClicked

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel=(DefaultTableModel)tblBooks.getModel();
        int selectedRowIndex=tblBooks.getSelectedRow();
        txtBookId.setText(tblModel.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_tblBooksMouseClicked

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        // TODO add your handling code here:
        if(txtBookId.getText().length()==0 || txtMemberId.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please select the Member ID and Book ID", "Error ", JOptionPane.ERROR_MESSAGE);
        }else{
        int count=0;
        
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select count(bookId) as id from borrowed_books where memberId='"+txtMemberId.getText()+"' and isReturned='"+"No"+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             count=rst.getInt("id");
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
        if(count<3){
        
        BorrowBook borrowBook= new BorrowBook();
        borrowBook.memberBorrowBook(txtMemberId.getText(), txtBookId.getText(), txtBorrowedDate.getText(), txtDueDate.getText());
        txtMemberId.setText(null);
        txtBookId.setText(null);
        DefaultTableModel tblModel1=(DefaultTableModel)tblBooks.getModel();
        tblModel1.setRowCount(0);
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from books";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String bookId=rst.getString("bookId");
             String bookTitle=rst.getString("bookTitle");
             String author=rst.getString("author");
             String numberOfCopies=rst.getString("numOfCopies");
             String numberOfAvailableCopies=rst.getString("numOfAvailableCopies");
             
             String tblData[]={bookId,bookTitle,author,numberOfCopies,numberOfAvailableCopies};
                DefaultTableModel tblModel=(DefaultTableModel)tblBooks.getModel();
                tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry One Member can borrow only 3 books at a time", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnSearchMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMembersActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel1=(DefaultTableModel)tblMembers.getModel();
        tblModel1.setRowCount(0);
        SearchMember searchMember=new SearchMember();
        searchMember.searchMemberById1(txtSearchMembers.getText(), tblModel1);
    }//GEN-LAST:event_btnSearchMembersActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BorrowBooks dialog = new BorrowBooks(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearchBooks;
    private javax.swing.JButton btnSearchMembers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblBorrowedBooks;
    private javax.swing.JLabel lblBorrowedDate;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblMembers;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTable tblBorrowedBooks;
    private javax.swing.JTable tblMembers;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtBorrowedDate;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtMemberId;
    private javax.swing.JTextField txtSearchBooks;
    private javax.swing.JTextField txtSearchMembers;
    // End of variables declaration//GEN-END:variables
}
