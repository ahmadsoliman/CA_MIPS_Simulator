package Commands;

import DatapathComponents.ALU;
import DatapathComponents.ControlFile;
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
    	ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("ALUsrc", 0);
		ControlFile.setControl("RegWrite", 1);
		//ControlFile.setControl("ALUop", 1100);
    }
}