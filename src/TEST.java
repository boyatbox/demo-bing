package cits_custom_method;

import com.cognizant.cognizantits.datalib.testdata.view.TestDataView;
import com.cognizant.cognizantits.engine.commands.General;
import com.cognizant.cognizantits.engine.constants.ObjectProperty;
import com.cognizant.cognizantits.engine.constants.SystemDefaults;
import com.cognizant.cognizantits.engine.core.CommandControl;
import com.cognizant.cognizantits.engine.execution.exception.UnCaughtException;
import com.cognizant.cognizantits.engine.support.Status;
import com.cognizant.cognizantits.engine.support.methodInf.InputType;
import com.cognizant.cognizantits.engine.support.methodInf.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TEST  extends General{

	 public TEST(CommandControl cc) {
	        super(cc);
	    }
	
	 	@Action(desc = "Description of the method", input = InputType.NO)
	    public void fn_CustomMethod() {
	        //To Do. Put your code here
	 		System.out.println("test method");
	 		Report.updateTestLog(Action, "test method", Status.PASS);
	    }
}
