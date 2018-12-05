package nthdigitpi.ui;
import java.awt.event.*;
import javax.swing.*;
import nthdigitpi.logic.logic;
import java.math.BigDecimal;

/**
 * This class gives a function to the button labeled "Calculate!." Interacts with
 * the input and output text fields and manipulating with the logic class. 
 * @author vikasshukla
 */
public class CalculateClicker implements ActionListener{
    private JTextField output;    //output text field - displays pi value
    private JTextField input;     //input text field - amount of decimal places desired
    private JButton    calculate; //button to run the logic 
    private logic      logic;     //logic used to manipulate values
    
    public CalculateClicker(JTextField out, JTextField in, JButton calc){
        this.output = out;
        this.input = in;
        this.calculate = calc;
    }
    
    
    // Converts input string to int, runs the logic with integer and makes a Big Decimal value, 
    // and converts back to string to display on the output textfield
    public void actionPerformed(ActionEvent ae){
        this.logic     = new logic();                            //initialzing logic object
        int index      = Integer.parseInt(this.input.getText()); //converting input field to int
        BigDecimal ans = this.logic.findPi(index);               //using logic object to find result, saving as Big Decimal
        this.output.setText(ans.toString());                     //converting Big Decimal to string
        this.input.setText("0");                                 //resets the input textbox to 0, so they can enter another input
                                                                 //makes it look cleaner
    }
}
