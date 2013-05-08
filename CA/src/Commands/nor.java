package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class nor extends RFormatCommand {
    int result;
    
    public nor(Register d,Register s1,Register s2){
    	destination=d;
    	source1=s1;
    	source2=s2;
      
    }
    public void execute(){
    	result=ALU.nor(source1.getValue(), source2.getValue());
    	destination.setValue(result);
    }
}