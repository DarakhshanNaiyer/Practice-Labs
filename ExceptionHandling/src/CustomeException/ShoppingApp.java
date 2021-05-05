package CustomeException;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping Shop = new Shopping ();
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Balance");
		
		int balance= sc.nextInt();// store input in balance variable
		
		System.out.println("Enter Product Cost");
		
		int cost = sc.nextInt();//store input in balance variable
		
		int UpdatedBalance = Shop.buyProduct(balance,cost);
		
		System.out.println("Updated balance after shopping"+ "\n"+UpdatedBalance);
		
		}

}
