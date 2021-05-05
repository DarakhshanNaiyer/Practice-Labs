package LambdaExpressionAndTopicsLesson13;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // creating script engine
		
		ScriptEngine ee= new ScriptEngineManager().getEngineByName("Nashorn is javascript engine");
		
		try {
			ee.eval(new FileReader ("js/hello.js"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//reading Nashorn file 
	}

}
