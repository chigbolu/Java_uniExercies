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
public class Serie {
    public static void main(String[] args) {
        float sum = 0 ,sumCheck = 0;
        long count=0;
        for (float i=1;  ; i++){
            sum += (1/i);
            count++;
            if (sum != sumCheck) 
                
            sumCheck = sum ; 
 
            else break;
          
  
        }
       showMessageDialog(null,"The value is " + sum + " " + count); 
            //done
            
            
            
        }
    }


