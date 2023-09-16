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
public class User {
    public String userName;
    public String password;
    public String userType;
    public String mailAddress;
    public static boolean isAdmin;
    
    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public User(String userName,String password,String userType,String mailAddress){
        this.userName=userName;
        this.password=password;
        this.userType=userType;
        this.mailAddress=mailAddress;
    }
}
