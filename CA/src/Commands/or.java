package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class or extends RFormatCommand {
    int result;
    
    public or(Register d,Register s1,Register s2){
    	destination=d;
    	source1=s1;
    	source2=s2;
      
    }
    public void execute(){
    	result=ALU.or(source1.getValue(), source2.getValue());
    	destination.setValue(result);
    }
}