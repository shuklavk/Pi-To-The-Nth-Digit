package nthdigitpi.ui;
import java.awt.*;
import javax.swing.*;
import nthdigitpi.logic.logic;

/**
 * This class sets up the UserInterface of the Program. Uses the flexible GridBagLayout.
 * @author vikasshukla
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    
    // sets up the JFrame with title, dimensions, and components
    @Override 
    public void run(){
        this.frame = new JFrame("Decimals of Pi");                         // Title of window
        this.frame.setPreferredSize(new Dimension (400,200));              // Window size
        
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Pressing the X, closes program
        createComponents(this.frame.getContentPane());                     // Puts in all components of program
        
        this.frame.pack();                                                 //sizes frame so all components fit well
        this.frame.setVisible(true);           
    }
    
    public void createComponents(Container container){
        GridBagLayout layout   = new GridBagLayout();       //Creates the Grid Bag Layout
        GridBagConstraints gbc = new GridBagConstraints();
        container.setLayout(layout);                        //Applies the Grid Bag Layout
        
        JLabel topLeft = new JLabel("How many digits? ");   //Creates the label, asking user digits
        gbc.weightx    = 0.5;
        gbc.fill       = GridBagConstraints.HORIZONTAL;
        gbc.gridx      = 0;
        gbc.gridy      = 0;
        container.add(topLeft, gbc);
        
        JTextField input = new JTextField("0");              //Creates the input field where user enters answer
        gbc.fill         = GridBagConstraints.HORIZONTAL;
        gbc.weightx      = 0.5;
        gbc.gridx        = 1;
        gbc.gridy        = 0;
        gbc.ipadx        = 200;
        container.add(input, gbc);
        
        JLabel botLeft = new JLabel("Pi: ");                 //Creates the label, where user is directed to read answer
        gbc.fill    = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.gridx   = 0;
        gbc.gridy   = 1;
        container.add(botLeft, gbc);
        
        JTextField output = new JTextField("0");             //Creates the output field, where the answer is displayed
        gbc.fill    = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.gridx   = 1;
        gbc.gridy   = 1;
        output.setEnabled(false);                            //Makes sure the user cannot interact with output
        container.add(output,gbc);
        
        gbc.fill      = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx     = 0;
        gbc.gridy     = 2;
        container.add(createPanel(input, output), gbc);      //Creates and adds JPanel to project, in this case just 
                                                             //the calculate button
    }
    
    
    //Function creates a new panel with the "Calculate!" button 
    private JPanel createPanel(JTextField in, JTextField out){
        JPanel panel           = new JPanel(new BorderLayout());           // chose to user BorderLayout      
        JButton calculate      = new JButton ("Calculate!");          
        CalculateClicker click = new CalculateClicker(out, in, calculate);
        calculate.addActionListener(click);                                // Function to call when button is clicked
        panel.add(calculate, BorderLayout.NORTH);                          // Places on the JPanel
        
        return panel;
    }
    
    
}
