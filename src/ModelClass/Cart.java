package ModelClass;


import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int cartId;
    private String user;
    private List<CartItem> items;

    public Cart(int cartId, String user) {
        this.cartId = cartId;
        this.user = user;
        this.items = new ArrayList<>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public int getCartId() {
        return cartId;
    }

    public String getUser() {
        return user;
    }
}