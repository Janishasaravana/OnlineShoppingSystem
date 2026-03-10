package LogicClass;

import java.util.ArrayList;
import java.util.List;

import ModelClass.Cart;
import ModelClass.Order;

public class OrderLogic {

    List<Order> orders = new ArrayList<>();

    public void OrderPlace(Cart c,String user,String status,long amount) {

        Order ordering = new Order(
               orders.size()+1,
                c.getItems(),
                user,
                status,
                amount
        );

        orders.add(ordering);

        
    }

}