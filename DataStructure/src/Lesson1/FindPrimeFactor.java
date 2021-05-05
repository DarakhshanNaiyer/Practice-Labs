package Lesson1;

import java.util.ArrayList;
import java.util.List;

// Exponential Complexity Algorithm

public class FindPrimeFactor {
   
	public List<Long> primefactor(long x){
		
		ArrayList<Long> result = new ArrayList<Long>();
		
		long factor=2;
		while (x>1) {
			if (x%factor==0) { // % Modulus mean we are checking remainders should be =0
				result.add(factor);
				x/=factor;          //  x=x/factor
				
			}else {
				factor +=1;
			}
		}
		 return result;
	}
	
	public static void main(String[] args) {
       
		FindPrimeFactor FPF = new FindPrimeFactor ();
		
		System.out.println(FPF.primefactor(2100078577L));
		System.out.println(FPF.primefactor(2100078578L));
		System.out.println(FPF.primefactor(87L));

	}

}
