/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class RegisterMember {
    Member member;
    public RegisterMember(Member member){
        this.member=member;
    }
    public void addMemberToDB(){
        try{
            Connection con=DB.createConnection();
            String sql="insert into members(memberId,firstName,lastName,address,DOB,gender,tpNumber) values('"+member.memberId+"','"+member.memberFirstName+"','"+member.memberLastName+"','"+member.memberAddress+"','"+member.memberDOB+"','"+member.gender+"','"+member.tpNumber+"')";
            
            PreparedStatement statement=con.prepareStatement(sql);
            int i=statement.executeUpdate();
            if(i==1){
                JOptionPane.showMessageDialog(null, "Member Registered Successfully", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Member Registration Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    
}
