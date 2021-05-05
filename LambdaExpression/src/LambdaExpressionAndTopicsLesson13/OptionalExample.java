package LambdaExpressionAndTopicsLesson13;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
            String [] str =  new String [10];
            
            str [5] = "JAVA OPTIONAL CLASS EXAMPLE";
            
            Optional <String> checkNull = Optional.ofNullable (str [5]);
            
            checkNull.ifPresent(System.out::println);   // Printing values by Method reference
            
            System.out.println(checkNull.get());    // Printing Values by get method
            
            System.out.println( str[5].toLowerCase());
            
            Optional <String> checkNull1 = Optional.ofNullable (str [4]);
            
         // Practice
            checkNull1.ifPresent(System.out::println);   
            System.out.println(checkNull1.isEmpty());
            System.out.println(checkNull.isEmpty());
	}

}
