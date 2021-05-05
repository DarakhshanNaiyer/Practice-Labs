package Lesson2;

import java.util.Optional;

class StackArray<Character> {

	public void push(char c) {
		
	}

	public Optional<java.lang.Character> pop() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}

public class StringReverse {
	
	public String reverse(String str) {
		
		StringBuilder result= new StringBuilder ();
		
		StackArray<Character> stack= new StackArray<>(capacity:100);
		
		for (char c: str.toCharArray())
			stack.push(c);
		
		Optional <Character> optChar = stack.pop();
		
		while(optChar.isPresent()) {
			result.append(optChar.get());
			optChar=stack.pop();
		}
		
		return result.toString();
		
	}

	public static void main(String[] args) {

            System.out.println(new StringReverse().reverse("This is reversed"));
	}

}
