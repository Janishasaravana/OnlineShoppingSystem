package ModelClass;
import java.util.List;

public class Order {
	
private int orderId;
private String user;
private List<CartItem> items;
private long amount;

private String status;

public Order(int orderId,List<CartItem>items ,String user, String status,long amount) {
	super();
	this.orderId = orderId;
	this.user = user;
	
	this.status = status;
	this.amount=amount;
	this.items=items;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public List<CartItem> getItems() {
    return items;
}
public void setItems(List<CartItem> items) {
    this.items = items;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}


}
