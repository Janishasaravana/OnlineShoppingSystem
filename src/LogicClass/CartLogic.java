package LogicClass;

import ModelClass.Cart;
import ModelClass.CartItem;
import ModelClass.Product;

public class CartLogic {
	public void addToCart(Cart c, Product product, int quantity) {

	    long totalPrice = product.getPrice() * quantity;

	    CartItem item = new CartItem(product, quantity, totalPrice);

	    c.getItems().add(item);

	    System.out.println("Product added to cart");
	}
	 public long TotalAmo(Cart c) {

	        long amount = 0;

	        for (CartItem item : c.getItems()) {
	            amount =amount+ item.getTotalPrice();
	        }

	        return amount;
	    }
	}
 