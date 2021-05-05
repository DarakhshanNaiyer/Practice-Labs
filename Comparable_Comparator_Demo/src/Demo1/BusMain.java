package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bus b1= new Bus(1000, "Tele traverls", 50d, 4.8d);
     Bus b2= new Bus(1200, "360 travles", 1200.50d,3.8d);
     Bus b3= new Bus(1100, "Ttec Travles", 1750.50d, 4.9d);
     Bus b4= new Bus(1010, "HCL Travles", 1250.50d, 2.9d);
     Bus b5= new Bus(1001, "Wipro Travles", 1750.50d, 2.3d);
     Bus b6= new Bus(1900, "Wells Travles", 1750.50d, 4.9d);
     
     List<Bus>buslist= new ArrayList<>();
     buslist.add(b1);
     buslist.add(b2);
     buslist.add(b3);
     buslist.add(b4);
     buslist.add(b5);
     buslist.add(b6);
     
     Collections.sort(buslist);
     System.out.println("Printing all buses");
     
     for (int i=0; i<buslist.size(); i++) {
    	 System.out.println(buslist.get(i));
     }
     System.out.println();
     System.out.println();
     
     Collections.sort(buslist, new FareComparator());
     
     System.out.println("Printing all buses sorted base on Fares");
     for (int i=0; i<buslist.size(); i++) {
    	 System.out.println(buslist.get(i));
	}
     System.out.println();
     System.out.println();
     
     Collections.sort(buslist, new RatingsComparator());
     for (int i=0; i<buslist.size(); i++) {
    	 System.out.println(buslist.get(i));
}
     System.out.println();
     System.out.println();
	
	
	System.out.println("Printing Buses using ForEach Loop");
	for (Bus b:buslist) {
		System.out.println(b);
		
	}
}
}