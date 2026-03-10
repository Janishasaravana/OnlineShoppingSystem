package LogicClass;

import java.util.ArrayList;
import java.util.List;

import ModelClass.Product;

public class ProductLogic {
	
		List<Product> products = new ArrayList<>();
		
 public ProductLogic(){		
		        products.add(new Product(1, "Laptop", 50000, 10, "Gaming Laptop"));
		        products.add(new Product(2, "Phone", 20000, 5, "Android Phone"));
		        products.add(new Product(3, "Bag", 2000, 8, "Travel Bag"));
		        products.add(new Product(4, "Mobile phones",40000,4,"vivo"));
		        products.add(new Product(5, "Laptop", 65000, 17, "Dell Laptop"));
		        products.add(new Product(6, "Phone", 25000, 57, "Samsung Phone"));
		        products.add(new Product(7, "Bag", 2000, 19, "School Bag"));
		        products.add(new Product(8, "Mobile phones",42000,9,"Realme"));
}
		 public void searchProductByName(String name) {
	     boolean find = false;
	  

	    for (Product newProduct : products) {

	        if (newProduct .getProName().toLowerCase().contains(name.toLowerCase())) {

	            System.out.println("ID: " + newProduct .getId());
	            System.out.println("Name: " + newProduct .getProName());
	            System.out.println("Price: " + newProduct .getPrice());
	            System.out.println("Stock: " + newProduct .getStock());
	            System.out.println("Description: " + newProduct .getDescription());
	            System.out.println("                                 ");

	            find = true;
	        }
	    }

	    if (!find) {
	        System.out.println("Product not found");
	    }
	}
}
