/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyComponents;

/**
 *
 * @author tarde
 */
public class Main {
 
    public static void main(String[]args){
        ExtInput ex = new ExtInput();
        
        
        System.out.println(ex.getIsEditable());
        
        ex.setIsEditable(false);
        
        System.out.println(ex.getIsEditable());
        
    }
}
