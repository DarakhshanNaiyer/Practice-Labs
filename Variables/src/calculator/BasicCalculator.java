package calculator;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fNum, sNum;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the first number");
		fNum=sc.nextDouble();
		
        System.out.println("Enter the second number");		
		sNum=sc.nextDouble();
		
		System.out.println(" Available Operator:(+,-,*,/,^,%)");
		System.out.println("Enter your operation");
		
		char Calculation=sc.next().charAt(0);
		
		
		switch(Calculation) {
		
			case'+':
				    System.out.println("Result: " +(fNum+sNum));
				    break;
		
			case'-':
				    System.out.println("Result: " +(fNum-sNum));
				    break;
				
			case'*':
				    System.out.println("Result: " +(fNum*sNum));
				    break;
				
			case'/':
					System.out.println("Result: " +(fNum/sNum));
					break;
					
			case'%':
					System.out.println("Result: " +(fNum%sNum));
					break;
					
			case'^':
					System.out.println("Result: " +Math.pow(fNum,sNum));
					break;
			default:
				System.out.println("You have entered a wrong operator");
		}
		
		
	}

}


