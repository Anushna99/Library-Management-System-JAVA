/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class RecoverPassword {
    public String getPassword(String mailAddress){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select password from system_users where mail_address='"+mailAddress+"'";
            ResultSet rst=st.executeQuery(sql);
            
            String password=null;
            while(rst.next()){
             password=rst.getString("password");
            }
            con.close();
            return password;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
            return "";
        }
    }
    public void sendMail(String mailAddress,String recoveredPassword){
        String userName="ashashipriyajayathunga@gmail.com";
        String password="jzyvbbvvueyquygy";
        
        Properties props=new Properties();
        
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");
        
        Session session=Session.getDefaultInstance(props, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(userName, password);
            }
        });
        
        try{
            MimeMessage message=new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailAddress));
            message.setSubject("Recovered Password From Library Management System");
            message.setText("Your Password has been recovered... Password : "+recoveredPassword);
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Password Recovered Successfully..Please Check your mail inbox", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Password Recovering Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
        }
    }
}
