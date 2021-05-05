package Lesson3;

import java.util.Scanner;

public class Hash_Tables {
	

	public static void main(String[] args) {
		
		Map<String, Integer> map = new Map<>();
		
		map.add("I", 1);
		map.add("Am", 2);
		map.add("the", 4);
		map.add("Darakhshan", 5);
		map.add("Naiyer", 6);
		map.add("b", 10);
		map.add("c", 20);
		map.add("d", 30);
		map.add("e", 40);
		map.add("f", 50);
		map.add("g", 60);
		map.add("h", 70);
		map.add("j", 80);
		
		Scanner sc = new Scanner (System.in);
//		
//		System.out.println(map.size());
//		
//		System.out.println("Enter the key whose value you want to delete:");
//		
//		map.remove(sc.nextLine());
//		
//		System.out.println(map.size());
		
//		System.out.println(map.size());
//		
//		System.out.println(map.remove("Darakhshan"));
//		
//		System.out.println(map.remove("Am"));
//		
//		System.out.println(map.size());
//		
//		System.out.println(map.isEmpty()); 

        System.out.println(map.size());
		
		System.out.println("Enter the key you want to add:");
		String A= sc.nextLine();
		System.out.println("Enter the value of the key:");
		int B = sc.nextInt();

		map.add(A,B);
		
		System.out.println("Total Elements:"+map.size());
		
	}

}
