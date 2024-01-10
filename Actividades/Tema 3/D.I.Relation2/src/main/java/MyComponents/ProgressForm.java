/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

/**
 *
 * @author tarde
 */
public class ProgressForm extends JPanel{
    
    private ClosedJPanel closedPanel;
    private Label_Input labelInput;
    private JButton button;
    private JProgressBar progressBar;
    private JLabel messageResult;
    
    public ProgressForm(){
        
        this.setPreferredSize(new Dimension(650, 500));
        this.setBackground(Color.green);
        this.setVisible(true);
        
        closedPanel = new ClosedJPanel();
        
        labelInput = new Label_Input();
        
        button = new JButton();
        button.setPreferredSize(new Dimension(300, 50));
        button.setText("Send");
        button.setVisible(true);
        
        progressBar = new JProgressBar(); 
        progressBar.setPreferredSize(new Dimension(250, 50));
        progressBar.setValue(0);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setVisible(false);
        
        messageResult = new JLabel();
        messageResult.setPreferredSize(new Dimension(100, 100));
        messageResult.setLocation(250, 100);
        messageResult.setText("Form sended!");
        messageResult.setVisible(false);
        
        this.add(closedPanel);
        this.add(labelInput);
        this.add(button);
        this.add(progressBar);
        this.add(messageResult);
        
        ActionListener clickButton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ActionListener startProgressBar = new ActionListener() {
                    int i = 0;

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        progressBar.setVisible(true);

                        i = i + 1;
                        progressBar.setValue(i);

                        if(progressBar.getValue() == progressBar.getMaximum()){
                           messageResult.setVisible(true);
                        }

                    }
                };
                
                Timer t = new Timer(100, startProgressBar);
                t.start();
            }
        };
        
        button.addActionListener(clickButton);
        
        
        this.paint(this.getGraphics());
    }
    
    
    
   
           
}
