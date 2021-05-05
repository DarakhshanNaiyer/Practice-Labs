package Demo1;

import java.util.Comparator;

public class FareComparator implements Comparator <Bus>{

	@Override
	public int compare (Bus o1, Bus o2) {
		// TODO Auto-generated method stub
		return 
				o2.getFare().compareTo(o1.getFare());// Sorting in descending order
	}

}
