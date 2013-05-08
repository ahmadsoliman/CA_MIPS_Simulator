package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class andi extends RFormatCommand {
    int result;
    
    public andi(Register d,Register s1,Register s2){
    	destination=d;
    	source1=s1;
    	source2=s2;
      
    }
    public void execute(){
    	result=ALU.andi(source1.getValue(), source2.getValue());
    	destination.setValue(result);
    }
}