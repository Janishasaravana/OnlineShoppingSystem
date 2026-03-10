package ModelClass;

public class CartItem {
	private Product product;
	private int quantity;
	private long totalPrice;
	
	public CartItem(Product product, int quantity, long totalPrice) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
