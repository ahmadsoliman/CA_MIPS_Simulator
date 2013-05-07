package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class and extends RFormatCommand {
    int sum;
    
    public and(Register d,Register s1,Register s2){
    	sum = ALU.and(s1.getValue(), s2.getValue());
    	d.setValue(sum);
    	
    }
}
