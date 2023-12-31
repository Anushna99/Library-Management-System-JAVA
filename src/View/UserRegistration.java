/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AddUser;
import Model.DB;
import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserRegistration extends javax.swing.JDialog {

    /**
     * Creates new form UserRegistration
     */
    private boolean validate[]=new boolean[4];
    public UserRegistration(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblUserType = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        btnSignup = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pwdPassword = new javax.swing.JPasswordField();
        pwdConfirmPassword = new javax.swing.JPasswordField();
        lblValidateUsername = new javax.swing.JLabel();
        lblValidatePassword = new javax.swing.JLabel();
        lblValidateConfirmPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblValidateEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setText("Password");

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");

        lblUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUserType.setText("User Type");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        cmbUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Admin" }));

        btnSignup.setBackground(new java.awt.Color(102, 255, 51));
        btnSignup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
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

        pwdPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwdPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdPasswordKeyReleased(evt);
            }
        });

        pwdConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pwdConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdConfirmPasswordKeyReleased(evt);
            }
        });

        lblValidateUsername.setForeground(new java.awt.Color(255, 0, 0));

        lblValidatePassword.setForeground(new java.awt.Color(255, 0, 0));

        lblValidateConfirmPassword.setForeground(new java.awt.Color(255, 0, 0));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email Address");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblValidateEmail.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add New User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserType)
                            .addComponent(lblConfirmPassword)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdPassword)
                                    .addComponent(pwdConfirmPassword)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValidatePassword)
                                    .addComponent(lblValidateUsername)
                                    .addComponent(lblValidateConfirmPassword)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValidateEmail))))
                    .addComponent(jLabel1))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignup)
                .addGap(20, 20, 20)
                .addComponent(btnCancel)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidateUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidatePassword))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(pwdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidateConfirmPassword))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserType)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidateEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(588, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static boolean areAllTrue(boolean[] array){

    for(boolean b : array) if(!b) return false;
    return true;
}
    
    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        if(areAllTrue(validate)){
        User user=new User(txtUsername.getText(),String.valueOf(pwdPassword.getPassword()), String.valueOf(cmbUserType.getSelectedItem()),txtEmail.getText());
        AddUser addUser=new AddUser(user);
        addUser.addUserToDB();
        txtUsername.setText(null);
        pwdPassword.setText(null);
        pwdConfirmPassword.setText(null);
        cmbUserType.setSelectedIndex(0);
        txtEmail.setText(null);
        }
        else{
        
        JOptionPane.showMessageDialog(null, "Please Fill Correctly..!", "Error: " + "Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        int count=0;
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select count(*) as ct from system_users where user_name='"+txtUsername.getText()+"'";
            ResultSet rst=st.executeQuery(sql);
            while(rst.next()){
             
             count=rst.getInt("ct");
             
            }
            
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
        if(txtUsername.getText().length()<5){
            lblValidateUsername.setText("Must have 5 or more characters");
            validate[0]=false;
        }
        else if(txtUsername.getText().matches("[0-9]+")){
            lblValidateUsername.setText("Invalid username");
            validate[0]=false;
        }
        else if(count==1){
            lblValidateUsername.setText("Sorry this username is not available");
            validate[0]=false;
        }
        else{
            lblValidateUsername.setText("");
            validate[0]=true;
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void pwdPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdPasswordKeyReleased
        // TODO add your handling code here:
        
        if(pwdConfirmPassword.getPassword().length>0 && !String.valueOf(pwdPassword.getPassword()).equals(String.valueOf(pwdConfirmPassword.getPassword()))){
            lblValidateConfirmPassword.setText("Confirmed password doen not match");
            validate[2]=false;
        }
        if(pwdPassword.getPassword().length<=6){
            lblValidatePassword.setText("Should contain more than 6 characters");
            validate[1]=false;
        }
        else{
            lblValidatePassword.setText("");
            validate[1]=true;
        }
    }//GEN-LAST:event_pwdPasswordKeyReleased

    private void pwdConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmPasswordKeyReleased
        // TODO add your handling code here:
        if(!String.valueOf(pwdPassword.getPassword()).equals(String.valueOf(pwdConfirmPassword.getPassword()))){
            lblValidateConfirmPassword.setText("Confirmed Password does not match");
            validate[2]=false;
        }
        else{
            lblValidateConfirmPassword.setText("");
            validate[2]=true;
        }
    }//GEN-LAST:event_pwdConfirmPasswordKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if(txtEmail.getText().length()==0){
            lblValidateEmail.setText("Please type your Email address");
            validate[3]=false;
        }
        else if(!txtEmail.getText().matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")){
            lblValidateEmail.setText("Invalid address");
            validate[3]=false;
        }
        else{
            lblValidateEmail.setText("");
            validate[3]=true;
        }
    }//GEN-LAST:event_txtEmailKeyReleased

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserRegistration dialog = new UserRegistration(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblValidateConfirmPassword;
    private javax.swing.JLabel lblValidateEmail;
    private javax.swing.JLabel lblValidatePassword;
    private javax.swing.JLabel lblValidateUsername;
    private javax.swing.JPasswordField pwdConfirmPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
