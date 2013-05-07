package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class or extends RFormatCommand {
    int sum;
    
    public or(Register d,Register s1,Register s2){
    	sum = ALU.or(s1.getValue(), s2.getValue());
    	d.setValue(sum);
    	
    }
}