package calculator;

import java.util.Scanner;

public class BasicCalculatorMe {
	
public static void main (String args[]) {
    double Fnumber, Snumber;
      Scanner sc = new Scanner(System.in);
    
		// TODO Auto-generated constructor stub
	   System.out.println("Enter the first number");
	    Fnumber=sc.nextDouble();
	
	   System.out.println("Enter the second number");
	    Snumber=sc.nextDouble();
	
	   System.out.println("+,-,/,*,^,%");
	
  char Calculator= sc.next().charAt(0);
		  
		  switch (Calculator) {
		  
		  case'+':
			  System.out.println("Result:" +(Fnumber+Snumber));
			  break;
		  case'-':
			  System.out.println("Result:" +(Fnumber-Snumber));
			  break;
		  case'/':
			  System.out.println("Result:" +(Fnumber/Snumber));
			  break;
		  case'^':
			  System.out.println("Result:" +Math.pow(Fnumber,Snumber));
			  break;
		  case'*':
			  System.out.println("Result:" +(Fnumber*Snumber));
			  break;
		 case'%':
			  System.out.println("Result:" +(Fnumber%Snumber));
			  break;
			  
		 default:
		 System.out.println("You entered a wrong operator");
			  
			  
		  }
    }
}


    