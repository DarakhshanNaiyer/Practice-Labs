package InstanceOfoperator;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
	   
		list.add("Java");
		list.add("Programming");
		list.add("Language");
		
		System.out.println(list);
//		 for (ElementClassName Variable : Object){
		for (String str : list) {
			System.out.println("Instance od Operator" +str instanceof String);
			System.out.println( list instanceof ArrayList);
			System.out.println("Daru"  );
			
			}

 
	}

}
