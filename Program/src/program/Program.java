/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import javax.swing.JOptionPane;
/**
 *
 * @author vasilis
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        String input;
        try{
            input = JOptionPane.showInputDialog("Give number a");
            a = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("Give number b");
            b = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("Give number c");
            c = Integer.parseInt(input);
            
            Prod obj = new Prod(a, b, c);
            JOptionPane.showMessageDialog(null,obj.getA()+"*"+obj.getB()+"*"+obj.getC()+"="+obj.mul(),"Results",JOptionPane.PLAIN_MESSAGE);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
