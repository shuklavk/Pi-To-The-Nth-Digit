package nthdigitpi.logic;
import java.math.BigDecimal;
import java.util.*;
import java.io.*;
import java.math.RoundingMode;
/**
 * This class creates the logic of the program. It divides 22 by 7 and stores 
 * as a Big Decimal, making it possible to truncate to as many decimal places 
 * as desired.
 * 
 * @author vikasshukla
 */
public class logic {
    private BigDecimal b1 = new BigDecimal(22.0);
    private BigDecimal b2 = new BigDecimal(7.0);
    
    public logic(){
    }
    
    // Takes in the parameter of index, which tells how many decimal places and 
    // returns PI as a Big Decimal value
    public BigDecimal findPi(int index){
         
        // divid function divides b1 by b2 and truncates decimal amount indicated
        // by the index, and the last digit is always rounded down.
        return this.b1.divide(b2, index, RoundingMode.DOWN);
    }
    
    
}
