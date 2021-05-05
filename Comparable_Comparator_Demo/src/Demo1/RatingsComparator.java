package Demo1;

import java.util.Comparator;

public class RatingsComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus o1, Bus o2) {
		// TODO Auto-generated method stub
		return 
				
				o1.getRatings().compareTo(o2.getRatings());// Sorting in ascending order
	}

}
