package LambdaExpressionAndTopicsLesson13;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<String> gamesList = new ArrayList<String>();
		
		gamesList.add("Football");
		gamesList.add("Basketball");
		gamesList.add("Vallyball");
		gamesList.add("ThrowBall");
		
		System.out.println("-------Iterating by passing Lambda Expression");
		
		gamesList.forEach(games -> System.out.println(games));


	}

}
