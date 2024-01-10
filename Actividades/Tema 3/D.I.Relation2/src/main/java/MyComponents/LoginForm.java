/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tarde
 */
public class LoginForm extends JPanel{
    
    private JLabel nameUser, password;
    private JTextField inputNameUser;
    private JPasswordField inputPassword;
    
    public LoginForm(){
        
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.CYAN);
        this.setVisible(true);

        nameUser = new JLabel();
        nameUser.setVisible(true);
        nameUser.setLocation(150, 100);
        nameUser.setPreferredSize(new Dimension(100, 25));
        nameUser.setText("Username: ");

        password = new JLabel();
        password.setVisible(true);
        password.setLocation(150, 200);
        password.setPreferredSize(new Dimension(100, 25));
        password.setText("Password: ");

        inputNameUser = new JTextField();
        inputNameUser.setVisible(true);
        inputNameUser.setLocation(200, 100);
        inputNameUser.setPreferredSize(new Dimension(100, 25));
        inputNameUser.setText("");
        
        inputPassword = new JPasswordField();
        inputPassword.setVisible(true);
        inputPassword.setLocation(200, 200);
        inputPassword.setPreferredSize(new Dimension(100, 25));
        inputPassword.setText("xxxxxxx");
        
        

        this.add(nameUser);
        this.add(inputNameUser);
        this.add(password);
        this.add(inputPassword);
        
        this.paint(this.getGraphics());
    }

    public JLabel getNameUser() {
        return nameUser;
    }

    public void setNameUser(String a) {
        this.nameUser.setText(a);
    }

    public JLabel getPassword() {
        return password;
    }

    public void setPassword(String a) {
        this.password.setText(a);
    }

    public JTextField getInputNameUser() {
        return inputNameUser;
    }

    public void setInputNameUser(String a) {
        this.inputNameUser.setText(a);
    }

    public JPasswordField getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String a) {
        this.inputPassword.setText(a);
    }
    
    
    
}
