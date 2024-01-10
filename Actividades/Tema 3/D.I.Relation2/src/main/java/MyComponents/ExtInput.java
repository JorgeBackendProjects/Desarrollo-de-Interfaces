/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tarde
 */
public class ExtInput extends JPanel {

    private JLabel labelOne, labelTwo;
    private JTextField textFieldOne;
    private JTextArea textAreaOne;
    private boolean isTextArea = false, isEditable = true;

    public ExtInput() {

        this.setPreferredSize(new Dimension(300, 300));
        this.setBackground(Color.CYAN);
        this.setVisible(true);

        labelOne = new JLabel();
        labelOne.setVisible(true);
        labelOne.setLocation(150, 100);
        labelOne.setPreferredSize(new Dimension(100, 25));
        labelOne.setText("LabelOne");

        labelTwo = new JLabel();
        labelTwo.setVisible(false);
        labelTwo.setLocation(150, 300);
        labelTwo.setPreferredSize(new Dimension(100, 25));
        labelTwo.setText("LabelTwo");

        textFieldOne = new JTextField();
        textFieldOne.setVisible(true);
        textFieldOne.setLocation(100, 200);
        textFieldOne.setPreferredSize(new Dimension(100, 25));
        textFieldOne.setText("TextFieldOne");

        textAreaOne = new JTextArea();
        textAreaOne.setVisible(false);
        textAreaOne.setLocation(100, 200);
        textAreaOne.setPreferredSize(new Dimension(200, 100));
        textAreaOne.setText("TextAreaOne");

        this.add(labelOne);
        this.add(labelTwo);
        this.add(textFieldOne);
        this.add(textAreaOne);

        this.paint(this.getGraphics());

    }

    public void viewer() {
        if (isTextArea == true) {
            
            textAreaOne.setVisible(true);
            textFieldOne.setVisible(false);
        
        } else {
            
            textAreaOne.setVisible(false);
            textFieldOne.setVisible(true);
        }
        
        labelTwo.setVisible(false);
    }

    public boolean getIsTextArea() {
        return isTextArea;
    }

    public void setIsTextArea(boolean isTextArea) {
        this.isTextArea = isTextArea;

        if (isEditable == true) {
            
            viewer();
        }
    }

    public boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(boolean isEditable) {
        this.isEditable = isEditable;

        if (isEditable == false) {
            textAreaOne.setVisible(false);
            labelTwo.setVisible(true);
            textFieldOne.setVisible(false);
        }else{
            
           viewer(); 
        }
    }

    public String getLabelTwo() {
        return labelTwo.getText();
    }

    public void setLabelTwo(String txt) {
        labelTwo.setVisible(true);
        this.labelTwo.setText(txt);
    }
}
