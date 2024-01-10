/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author tarde
 */
public class ClosedJPanel extends JPanel{
    
    private JButton closeButton;
    
            
    public ClosedJPanel(){
        
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.orange);
 
        closeButton = new JButton();
        closeButton.setText("X");
        closeButton.setBackground(Color.red);
        closeButton.setPreferredSize(new Dimension(50, 50));
        
        ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(WIDTH);
        }
    };
        closeButton.addActionListener(al);
        
        this.add(closeButton);
        this.paint(this.getGraphics());
        
    }



    
}
