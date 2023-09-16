/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AddNewBook;
import Model.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Model.Book;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class BookRegistration extends javax.swing.JDialog {

    /**
     * Creates new form BookRegistration
     */
    private boolean validate[]=new boolean[3];
    public BookRegistration(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtBookId.setEditable(false);
    }
    
     public static boolean areAllTrue(boolean[] array){

    for(boolean b : array) if(!b) return false;
    return true;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBookId = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblBookTitle = new javax.swing.JLabel();
        lblNumOfCopies = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtBookTitle = new javax.swing.JTextField();
        txtBookAuthor = new javax.swing.JTextField();
        txtNumberOfCopies = new javax.swing.JTextField();
        lblHeading = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblValidateBookTitle = new javax.swing.JLabel();
        lblValidateAuthor = new javax.swing.JLabel();
        lblValidateNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblBookId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBookId.setText("Book ID");

        lblAuthor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAuthor.setText("Book Author");

        lblBookTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBookTitle.setText("Book Title");

        lblNumOfCopies.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumOfCopies.setText("Number of copies");

        txtBookId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtBookTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBookTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookTitleKeyReleased(evt);
            }
        });

        txtBookAuthor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBookAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookAuthorKeyReleased(evt);
            }
        });

        txtNumberOfCopies.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumberOfCopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumberOfCopiesKeyReleased(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        lblHeading.setText("Add New Book");

        btnAdd.setBackground(new java.awt.Color(0, 255, 102));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Book");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblValidateBookTitle.setForeground(new java.awt.Color(255, 0, 0));

        lblValidateAuthor.setForeground(new java.awt.Color(255, 0, 0));

        lblValidateNumber.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookId)
                    .addComponent(lblBookTitle)
                    .addComponent(lblNumOfCopies)
                    .addComponent(lblAuthor))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidateAuthor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidateBookTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumberOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidateNumber))
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lblHeading)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeading)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBookId)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(lblBookTitle))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValidateBookTitle)))
                        .addGap(38, 38, 38)
                        .addComponent(lblAuthor))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidateAuthor)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumOfCopies)
                    .addComponent(txtNumberOfCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidateNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addGap(39, 39, 39))
        );

        setSize(new java.awt.Dimension(582, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select max(recId) as id from books";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             txtBookId.setText("B"+String.format("%06d", rst.getInt("id")+1));
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(areAllTrue(validate)){
        Book book=new Book(txtBookId.getText(),txtBookTitle.getText(),txtBookAuthor.getText(),Integer.parseInt(txtNumberOfCopies.getText()));
        AddNewBook addNewBook=new AddNewBook(book);
        addNewBook.AddBookToDB();
        txtBookId.setText(null);
        txtBookTitle.setText(null);
        txtBookAuthor.setText(null);
        txtNumberOfCopies.setText(null);
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select max(recId) as id from books";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             txtBookId.setText("B"+String.format("%06d", rst.getInt("id")+1));
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Fill Correctly..!", "Error: " + "Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtBookTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookTitleKeyReleased
        // TODO add your handling code here:
        if(txtBookTitle.getText().length()==0){
            lblValidateBookTitle.setText("Title cannot be blank");
            validate[0]=false;
        }
        else{
            lblValidateBookTitle.setText("");
            validate[0]=true;
        }
    }//GEN-LAST:event_txtBookTitleKeyReleased

    private void txtBookAuthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookAuthorKeyReleased
        // TODO add your handling code here:
        if(!txtBookAuthor.getText().matches("^[\\p{L} .'-]+$")){
            
            if(txtBookAuthor.getText().length()==0){
                lblValidateAuthor.setText("Name cannot be blank");
            }
            else{
                lblValidateAuthor.setText("Invalid Name");
            }
            validate[1]=false;
        }
        else{
            lblValidateAuthor.setText("");
            validate[1]=true;
        }
    }//GEN-LAST:event_txtBookAuthorKeyReleased

    private void txtNumberOfCopiesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberOfCopiesKeyReleased
        // TODO add your handling code here:
        if(txtNumberOfCopies.getText().length()==0){
            lblValidateNumber.setText("This field cannot be blank");
            validate[2]=false;
        }
        else if((!txtNumberOfCopies.getText().matches("[\\s]*[0-9]*[0-9]+")) || Integer.parseInt(txtNumberOfCopies.getText())==0){
            lblValidateNumber.setText("Invalid number");
            validate[2]=false;
        }
        else{
            lblValidateNumber.setText("");
            validate[2]=true;
        }
    }//GEN-LAST:event_txtNumberOfCopiesKeyReleased

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
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BookRegistration dialog = new BookRegistration(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblBookTitle;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNumOfCopies;
    private javax.swing.JLabel lblValidateAuthor;
    private javax.swing.JLabel lblValidateBookTitle;
    private javax.swing.JLabel lblValidateNumber;
    private javax.swing.JTextField txtBookAuthor;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtNumberOfCopies;
    // End of variables declaration//GEN-END:variables
}
