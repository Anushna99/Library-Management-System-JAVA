/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;




/**
 *
 * @author DELL
 */
public class Member {
    public String memberId;
    public String memberFirstName;
    public String memberLastName;
    public String memberAddress;
    public String memberDOB;
    public String gender;
    public String tpNumber;
    
    public Member(String memberId,String memberFirstName,String memberLastName,String memberAddress,String memberDOB,String gender,String tpNumber){
        this.memberId=memberId;
        this.memberFirstName=memberFirstName;
        this.memberLastName=memberLastName;
        this.memberAddress=memberAddress;
        this.memberDOB=memberDOB;
        this.gender=gender;
        this.tpNumber=tpNumber;
    }
}
