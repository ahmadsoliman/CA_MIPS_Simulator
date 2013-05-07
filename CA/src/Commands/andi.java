package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class andi extends RFormatCommand {
    int sum;
    
    public andi(Register d,Register s1,int s2){
    	sum = ALU.andi(s1.getValue(), s2);
    	d.setValue(sum);
    	
    }
}