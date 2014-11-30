/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch09_loops;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author ec4086e
 */
public class Wage4 {
     public static void main(String[] args) {
        double wage = 0;
        int i = 0;
    
    double rate = Double.parseDouble(showInputDialog("Insert the hours rate: "));
    int hours = Integer.parseInt(showInputDialog("Insert the hours of work"));
    
    do { 
      
      i ++;
      wage = i * rate ; 
      
     // showMessageDialog(null,"Your " + i + "'s hour wage will be " + wage + "£");
    
    }
    while (i  < hours);
    showMessageDialog(null,"Your " + i + "'s hour wage will be " + wage + "£");
      
    
        
        
    }
}
    

