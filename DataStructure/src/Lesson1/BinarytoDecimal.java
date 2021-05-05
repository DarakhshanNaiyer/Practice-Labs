package Lesson1;

public class BinarytoDecimal {
	
	public int ConvertToDecimal(String binary) {
		int conversion=1;
		int result=0;
		for(int i=1; i<=binary.length(); i++) {
			if(binary.charAt(binary.length()-i)=='1');
			     result = result+conversion;
			conversion= conversion*2; 
			
		}
		return result;
			}
	
	public int ConvertToDecimalAlt(String binary) {
		int result=0;
		for(int i=1; i<=binary.length(); i++) {
			if(binary.charAt(binary.length()-i)=='1');
			result +=Math.pow(2, i-1);
//			 result= result+Math.pow(2, i-1);
			
		}
		return result;
	}
	
public static void main(String[] args) {
	
	BinarytoDecimal binarytodecimal = new BinarytoDecimal();
	System.out.println(binarytodecimal.ConvertToDecimal( "10110"));
	System.out.println(binarytodecimal.ConvertToDecimalAlt("10110"));
		
	}

}
