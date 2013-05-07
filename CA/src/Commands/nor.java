package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class nor extends RFormatCommand {
    int sum;
    
    public nor(Register d,Register s1,Register s2){
    	sum = ALU.nor(s1.getValue(), s2.getValue());
    	d.setValue(sum);
    	
    }
}