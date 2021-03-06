package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAPIEX1 {

	public static void main(String[] args) {
//
//		int [] arr = new int [] {1, 2,3,4,5};
//		
//		for (int i :arr )
//			System.out.println(i);

		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		stream1.forEach(a -> System.out.println(a));
		
		System.out.println("------------------");
		
		//Another Way of doing the same
		
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5});
		stream2.forEach(a -> System.out.println(a));
		
//		concept for list
		
		System.out.println("----------------");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Stream<Integer> stream3 = list.stream();
		stream3.forEach(b -> System.out.println(b));
		
		System.out.println("----------------");

//      Another Use case of random and limited numbers
		
		Stream<Integer> randomNumbers= Stream.generate(()-> (new Random()).nextInt(100));
		randomNumbers.limit(5).forEach(c -> System.out.println(c));

		
	}

}
