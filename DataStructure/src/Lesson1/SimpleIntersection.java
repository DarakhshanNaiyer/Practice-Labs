package Lesson1;

import java.util.ArrayList;

// Quadratic Complexity Algorithm

import java.util.List;

public class SimpleIntersection {
	
	public List<Integer> intersection (int[]a,int[]b){
		
		List<Integer> result = new ArrayList<>(a.length);
		
		for (int x:a) {
			for (int y:b) {
				if(x==y)
					result.add(x);
			}
					}
		return result;
	}
	
	public static void main(String[] args) {
		
		SimpleIntersection simpleintersection= new SimpleIntersection();
		 System.out.println(simpleintersection.intersection(new int [] {4,7,5,2,3}, new int[] {4,2,3,9,1}));

	}

}
