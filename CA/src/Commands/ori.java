package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class ori extends RFormatCommand {
    int sum;
    
    public ori(Register d,Register s1,int s2){
    	sum = ALU.ori(s1.getValue(), s2);
    	d.setValue(sum);
    	
    }
}