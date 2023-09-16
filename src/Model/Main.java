/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.LoginWindow;
import View.MainWindow;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String args[])
    {
        LoginWindow login_window=new LoginWindow();
        login_window.setVisible(true);
        login_window.getRootPane().setDefaultButton(login_window.getButton());
        
        /*MainWindow mainWindow=new MainWindow();
        mainWindow.setVisible(true);*/
    }
}
