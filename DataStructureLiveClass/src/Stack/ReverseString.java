package Stack;

import java.util.Stack;

public class ReverseString {
	
	public static String reverse(String input){

		Stack <Character> stack = new Stack <Character>();
		
		String reversed  ="";


		for (int i=0; i<input.length(); i++){

		    stack.push(input.charAt(i));
		}

//		for (char ch: input.toCharArray()){          // any of the for loop can be used 
//		   stack.push(ch);
//
//		}
		
		while (!stack.isEmpty()){

		  reversed=reversed+stack.pop();

		}

		
		return reversed;

		}


	public static void main(String[] args) {
		
		String originalString="abcd";
		String reversedString=reverse(originalString);
		System.out.println("Original String: "+originalString);
		System.out.println("Reversed String: "+reversedString);
		
		if(originalString.equals(reversedString)) {
			System.out.println("Palindrome!!");
		}else {
			System.out.println("It's not Palindrome!!");

		}
	}

}
