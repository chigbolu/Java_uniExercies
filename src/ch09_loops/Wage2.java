/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch09_loops;

import static javax.swing.JOptionPane.*;


public class Wage2 {
    public static void main(String[] args) {
        double wage = 0;
    
    double rate = Double.parseDouble(showInputDialog("Insert the hours rate: "));
    
    int hours = 0;
    for (int i =0; hours < 40;  i++){
        
       hours ++;
      wage = hours * rate ;  
        
    }
      
    
        showMessageDialog(null,"Your " + hours + "'s hour wage will be " + wage + "£");
        
    }
}
    
    
    
    
    
    
