/*
 * A Final Fantasy Damage, etc. Calculator. 
 * 
 * 
 * Formulas to work on:
 * 
 * attack damage: ((Unit ATK Squared) / Enemy DEF) * (1d20)/10)
 * magic damage: (Unit MAG squared) / Enemy SPR) * (1d20/10)
 * 
 * Other:
 * Physical attacks are a d20 divided by 2, times weapon power plus half your
 * strength stat+your level x2?
 * ((1d20/2)(weapon power))+(strength stat/2)+(LVx2)
 * 
 * Magic attacks are rolls plus half your magic stat plus 2 times your level
 * 
 * monks unarmed weapon atk = LV * 2.5
 * for the 2nd one, instead of "rolls" might change that to a number for the
 * magic's strength
 * 
 */

package tempconverterapp;
import javax.swing.*;
import learn.*;

/**
 *
 * @author Kyle
 */
public class FFBG {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                learn.FFBG_Calculator.main(new String[0]); //CelciusConverterGUI.java() .FFBG_Calculator(); //createAndShowGUI();
            }
        });
    }
}

