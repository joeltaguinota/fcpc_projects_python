/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class JavaApplication1 {


    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Login form");
        JLabel labelUsername = new JLabel("Username: ");
        JLabel labelPassword = new JLabel("Password: ");
        JTextField txtUsername = new JTextField();
        JTextField txtPassword = new JTextField();
        JButton btnLogin = new JButton("Login");
        
        labelUsername.setBounds(80, 50, 150, 35);
        txtUsername.setBounds(150, 50, 200, 35);
        labelPassword.setBounds(80, 100, 150, 35);
        txtPassword.setBounds(150, 100, 200, 35);
        btnLogin.setBounds(200, 150, 100, 35);
        
        btnLogin.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent ae){
                String username = txtUsername.getText();
                String password = txtPassword.getText();
                if(username.equals("Admin") && password.equals("admin123")){
                    JOptionPane.showMessageDialog(null, "Login Successful!","Administrator Login",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Login Failed!","Administrator Login",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });
                
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(txtUsername);
        frame.add(txtPassword);
        frame.add(btnLogin);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
               
    }
    
}
