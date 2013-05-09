package Commands;

import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class slr extends RFormatCommand {
    
    public slr(Register d,Register s1,int s){
    	destination=d;
    	source1=s1;
    	shamt=s;
      
    }
    public void execute(){
    	int result;
    	int val1;
    	val1=source1.getValue();
    	result= val1 >> shamt;   	
    	destination.setValue(result);
    	ControlFile.setControl("MemWrite", 1);
    }
}