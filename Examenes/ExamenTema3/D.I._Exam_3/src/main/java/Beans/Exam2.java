/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author tarde
 */
public class Exam2 extends JPanel{
    
    private JButton xButton, sendButton;
    private JLabel information;
    private JTextField nameInput, userNameInput;
    private JLabel nameLabel, userNameLabel, result;
    private JProgressBar progBar;
    
    /**
     * This constructor initializes a JPanel and all the components 
     * that it will integrate, as well as adding and painting them. 
     * 
     * It also contains the ActionListeners that give functionality 
     * to the buttons.
     */
    public Exam2(){
        
        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(new Color(255,255,153));
        this.setVisible(true);
        
        xButton = new JButton();
        xButton.setText("X");
        xButton.setPreferredSize(new Dimension(70, 25));
        xButton.setLocation(350, 300);
        xButton.setBackground(Color.red);
        xButton.setVisible(true);
        
        sendButton = new JButton();
        sendButton.setText("SEND");
        sendButton.setPreferredSize(new Dimension(120, 25));
        sendButton.setLocation(200,400);
        sendButton.setVisible(true);
        
        information = new JLabel();
        information.setText("<html><body>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras felis ipsum, tempor ut maximus vel, facilisis non est. Mecenas a massa eget tellus eleifend pelentesco. Phasellus eu urna tempor, venenatis erat ut, convallis lacus.</body></html>");
        information.setPreferredSize(new Dimension(250, 250));
        //information.setLocation();
        information.setVisible(true);
        
        nameInput = new JTextField();
        nameInput.setText("");
        nameInput.setPreferredSize(new Dimension(255, 25));
        //nameInput.setLocation();
        nameInput.setVisible(true);
        
        userNameInput = new JTextField();
        userNameInput.setText("");
        userNameInput.setPreferredSize(new Dimension(255, 25));
        //userNameInput.setLocation();
        userNameInput.setVisible(true);
        
        nameLabel = new JLabel();
        nameLabel.setText("Name: ");
        nameLabel.setPreferredSize(new Dimension(255, 25));
        nameLabel.setLocation(300, 100);
        nameLabel.setVisible(true);
        
        userNameLabel = new JLabel();
        userNameLabel.setText("UserName: ");
        userNameLabel.setPreferredSize(new Dimension(255, 25));
        //userNameLabel.setLocation();
        userNameLabel.setVisible(true);
        
        result = new JLabel();
        result.setText("");
        result.setPreferredSize(new Dimension(255, 25));
        //result.setLocation();
        result.setVisible(false);
        
        progBar = new JProgressBar();
        progBar.setPreferredSize(new Dimension(255, 25));
        //progBar.setLocation();
        progBar.setVisible(false);
        
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(WIDTH);
            }
        };
        
        xButton.addActionListener(al);
        
        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!userNameInput.getText().equals("") && !nameInput.getText().equals("")){
                    result.setText("This is a not valid form");
                    result.setVisible(true);
                }else{
                    progBar.setVisible(true);
                    progBar.setValue(0);
                    progBar.setMinimum(0);
                    progBar.setMaximum(100);
                    
                    ActionListener pB = new ActionListener() {
                        
                        int i = 0;
                        
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            i = i+1;
                            progBar.setValue(i);
                            
                            if(i == 100){
                                result.setText("Form sent with values: " + nameInput.getText() + " and " + userNameInput.getText());
                            }
                        }
                    };
                    
                    Timer t = new Timer(100, pB);
                    t.start();
                }
                
            }
        };
        
        sendButton.addActionListener(al2);
        
        this.add(information);
        this.add(xButton);
        this.add(nameLabel);
        this.add(nameInput);
        this.add(userNameLabel);
        this.add(userNameInput);
        this.add(sendButton);
        this.add(progBar);
        this.add(result);
        
        
        this.paint(this.getGraphics());
    }

    public String getNameInput() {
        return nameInput.getText();
    }

    public void setNameInput(String nameInput) {
        this.nameInput.setText(nameInput);
    }

    public String getUserNameInput() {
        return userNameInput.getText();
    }

    public void setUserNameInput(String userNameInput) {
        this.userNameInput.setText(userNameInput);
    }

    public JLabel getResult() {
        return result;
    }

    public void setResultText(String result) {
        this.result.setText(result);
    }

    public void setResultSize(Dimension d) {
        this.result.setPreferredSize(d);
    }
    
    public void setResultFont(Font font) {
        this.result.setFont(font);
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBarValue(int progBar) {
        this.progBar.setValue(progBar);
    }
    
    public void setPanelBackground(Color color){
        this.setBackground(color);
    }

    public String getInformation() {
        return information.getText();
    }

    public void setInformation(String information) {
        this.information.setText(information);
    }

    public String getNameLabel() {
        return nameLabel.getText();
    }

    public void setNameLabel(String nameLabel) {
        this.nameLabel.setText(nameLabel);
    }

    public String getUserNameLabel() {
        return userNameLabel.getText();
    }

    public void setUserNameLabel(String userNameLabel) {
        this.userNameLabel.setText(userNameLabel);
    }

    public JButton getSendButton() {
        return sendButton;
    }

    public void setSendButtonText(String sendButton) {
        this.sendButton.setText(sendButton);
    }
    
    public void setSendButtonSize(Dimension d) {
        this.sendButton.setPreferredSize(d);
    }
    
    
    
}
