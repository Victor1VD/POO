/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooo;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario13
 */
public class ejercicio4 {
  public static void main(String[] args) {
       float a,b;
             
       a = Float.parseFloat(JOptionPane.showInputDialog("ingrese el primer numero"));
       b = Float.parseFloat(JOptionPane.showInputDialog("ingrese el sehundo numero"));
       System.out.println(a + b);
     }
}
