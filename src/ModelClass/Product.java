package ModelClass;

public class Product {
   private int id;
   private String proName;
   private int price;
   private int stock;
   private String description;
   
public Product(int id, String proName, int price,int stock, String description) {
	super();
	this.id = id;
	 this.proName = proName;
	this.price = price;
	this.stock = stock;
	this.description = description;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	
	
	
	
	
	
	
}
