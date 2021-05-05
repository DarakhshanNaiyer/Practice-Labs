package LambdaExpressionAndTopicsLesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {


		public static void main(String[] args) {
			List<Product> productlist= new ArrayList<Product>();
			
			productlist.add(new Product(1, "HP laptop", 25000f)) ;
			productlist.add(new Product(2, "Dell laptop", 26000f));
			productlist.add(new Product(3, "Lenovo laptop", 27000f));
			productlist.add(new Product(4, "Acer laptop", 28000f));
			productlist.add(new Product(5, "Asus laptop", 29000f));
			
			List<Float> productPricelist= productlist.stream().map(x->x.price)
					.collect(Collectors.toList());
			
			System.out.println(productPricelist);
			
	}

}
