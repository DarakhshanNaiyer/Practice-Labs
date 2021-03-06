package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
       int d;
       String Name;
       float Price;

   public Product(int d, String name, float price) {
	super();
	this.d = d;
	Name = name;
	Price = price;
}


@Override
    public String toString() {
	return "ProductStreamExample [d=" + d + ", Name=" + Name + ", Price=" + Price + "]";
}
}

public class ProductStreamExample {
	
	public static void main(String[] args) {

		List<Product> productlist = new ArrayList<Product>();
		
		productlist.add (new Product (101, "Ram", 500));
		productlist.add (new Product (101, "Ram", 100));
		productlist.add (new Product (101, "Dev", 50));
		productlist.add (new Product (101, "Ram", 500));

//for loop way
		for (Product product: productlist)
         System.out.println(product);
           
		System.out.println("--------------");
		
//Stream API way	
		Stream<Product> stream = productlist.stream();
		stream.forEach(p -> System.out.println(p));
		
		System.out.println("--------------");

//Name sorted
		List<String> productName = productlist.stream()
		.filter(p ->p.Price<100)
		.map (p->p.Name)
		.collect(Collectors.toList());
		System.out.println(productName);
		
		System.out.println("--------------");

//PriceSorted
		List<Product> FilteredProductList = productlist.stream()
				.filter(p ->p.Price<100)
				.map (p->p)
				.collect(Collectors.toList());
				System.out.println(FilteredProductList);

				System.out.println("--------------");

//Most enhanced way
				productlist.stream().filter((c)->c.Price<500)
				.forEach(d->System.out.println(d.Name));
	}

}
