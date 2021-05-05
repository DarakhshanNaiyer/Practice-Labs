package Demo1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new LinkedList<>();
		names.add("John");
		names.add("Mike");
		names.add("Kell");
		names.add("Cate");
		
		Iterator<String>namesIterator=names.iterator();
		
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}


	}

}
