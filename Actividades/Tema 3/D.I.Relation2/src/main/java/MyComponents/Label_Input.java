/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tarde
 */
public class Label_Input extends JPanel{
    
    private JTextField panelTextField;
    private JLabel panelLabel;
    
    public Label_Input(){
        
        this.setPreferredSize(new Dimension(300, 150));
        this.setBackground(Color.CYAN);
        this.setVisible(true);
        
        panelTextField = new JTextField();
        panelTextField.setVisible(true);
        panelTextField.setLocation(200, 75);
        panelTextField.setPreferredSize(new Dimension (100, 50));
        panelTextField.setText("TEXTFIELD");
        
        panelLabel = new JLabel();
        panelLabel.setVisible(true);
        panelLabel.setLocation(100, 75);
        panelLabel.setPreferredSize(new Dimension (100, 50));
        panelLabel.setText("LABEL");
        
        this.add(panelTextField);
        this.add(panelLabel);
        this.paint(this.getGraphics());

    }

    public String getPanelTextField() {
        return panelTextField.getText();
    }

    public void setPanelTextField(String txt) {
        this.panelTextField.setText(txt);
    }

    public String getPanelLabel() {
        return panelLabel.getText();
    }

    public void setPanelLabel(String txt) {
        this.panelLabel.setText(txt);
    }
    
    
}
