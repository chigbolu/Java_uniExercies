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
public class Wage3 {
        public static void main(String[] args) {
        double wage = 0;
    
    double rate = Double.parseDouble(showInputDialog("Insert the hours rate: "));
    
    int hours = 0;
    do { 
      hours ++;    
      wage = hours * rate ;  
    
    }
    while (hours  < 40);
      
    
        showMessageDialog(null,"Your " + hours + "'s hour wage will be " + wage + "£");
        
    }
}
    
    
    
    
    

