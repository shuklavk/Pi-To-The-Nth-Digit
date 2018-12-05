package nthdigitpi.ui;
import nthdigitpi.logic.*;
import javax.swing.SwingUtilities;
/**
 * Project displays a user interface and asks for number of digits of PI desired, and
 * output the value. Contains a text field for user to type, a display field, and a button
 * labeled "Calculate."
 * @author vikasshukla
 */
public class NthDigitPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new UserInterface());  //Boots the userinterface
    }
    
}
