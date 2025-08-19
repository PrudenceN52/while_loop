/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while_loop;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class While_loop {

    public static void main(String[] args) {
        //prgram count changed by user during runtime
       int count = 0;
       int counter = 1;
       while( count ==0){ // begin loop
           JOptionPane.showMessageDialog(null, "Loop number:" + counter);
           counter++;
           
           //local integer variable
           int choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to continue? \n 1=No, 0=Yes"));//prompt user
           
           
           
           switch(choice){
               case 0:
                   break;
               case 1:
                   JOptionPane.showMessageDialog(null, "User terminated the program");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Wrong input");
                   count=choice;
           }//end of switch
           
       }//end of while loop
    }//end of main
}
// end of class
//added github