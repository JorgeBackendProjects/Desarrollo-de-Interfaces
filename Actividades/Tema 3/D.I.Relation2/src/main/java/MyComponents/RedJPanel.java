package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class RedJPanel extends JPanel{
    
    private JLabel text;

    public RedJPanel(){
        
        this.setPreferredSize(new Dimension(100, 100));
        this.setBackground(Color.red);
        this.setVisible(true);
        
        text = new JLabel();
        text.setText("This is my panel");
        text.setSize(50, 20);
        text.setVisible(true);
        
        this.add(text);
        this.paint(this.getGraphics());
    }    
    
    public String getText() {
        return text.getText();
    }

    public void setText(String text) {
        this.text.setText(text);
    }
}
