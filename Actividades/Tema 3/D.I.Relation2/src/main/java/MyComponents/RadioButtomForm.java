/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author tarde
 */
public class RadioButtomForm extends JPanel{
    
    private JLabel panelLabel;
    private JRadioButton radioButton1, radioButton2;
    private ButtonGroup butonGroup;
    
    public RadioButtomForm(){
        
        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.CYAN);
        this.setVisible(true);
        
        panelLabel = new JLabel();
        panelLabel.setVisible(true);
        panelLabel.setLocation(100, 100);
        panelLabel.setPreferredSize(new Dimension (100, 25));
        panelLabel.setText("ACTIVITY_4");
        
        radioButton1 = new JRadioButton();
        radioButton1.setVisible(true);
        radioButton1.setLocation(100, 75);
        radioButton1.setPreferredSize(new Dimension (100, 25));
        radioButton1.setText("PayPal");
        
        radioButton2 = new JRadioButton();
        radioButton2.setVisible(true);
        radioButton2.setLocation(200, 75);
        radioButton2.setPreferredSize(new Dimension (100, 50));
        radioButton2.setText("Credit Card");
        
        butonGroup = new ButtonGroup();
        butonGroup.add(radioButton1);
        butonGroup.add(radioButton2);
        
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(panelLabel);
        
        this.paint(this.getGraphics());

    }

    public String getRadioButton1() {
        return radioButton1.getText();
    }

    public void setRadioButton1(String rB1) {
        this.radioButton1.setText(rB1);
    }

    public String getRadioButton2() {
        return radioButton2.getText();
    }

    public void setRadioButton2(String rB2) {
        this.radioButton2.setText(rB2);
    }

    public String getPanelLabel() {
        return panelLabel.getText();
    }

    public void setPanelLabel(String txt) {
        this.panelLabel.setText(txt);
    }
}
