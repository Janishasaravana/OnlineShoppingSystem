package Main;
import java.util.Scanner;

import LogicClass.CartLogic;
import LogicClass.OrderLogic;
import LogicClass.ProductLogic;
import LogicClass.UserLogic;
import ModelClass.Cart;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        try (Scanner sc = new Scanner(System.in)) {
					UserLogic s = new UserLogic();
					ProductLogic s1 = new ProductLogic();
					OrderLogic s3 = new OrderLogic();
					CartLogic s4 = new CartLogic();

					Cart c = null;

					int number;

					while (true) {

					    
					    System.out.println("1. Register");
					    System.out.println("2. Login");
					    System.out.println("3. Search Product");
					    System.out.println("4. Place Order");
					    System.out.println("5. Exit");

					    System.out.print("Enter choice: ");
					    number = sc.nextInt();
					    sc.nextLine();

					    switch (number) {

					    case 1:

					        System.out.print("Enter name: ");
					        String name = sc.nextLine();

					        System.out.print("Enter mail: ");
					        String mail = sc.nextLine();

					        System.out.print("Enter password: ");
					        String password = sc.nextLine();

					        boolean register = s.register(name, password, mail);

					        if (!register) {
					            System.out.println("Registration failed");
					        }

					        break;

					    case 2:

					        System.out.print("Enter mail: ");
					        String logMail = sc.nextLine();

					        System.out.print("Enter password: ");
					        String logPass = sc.nextLine();

					        boolean login = s.login(logMail, logPass);

					        if (login) {
					            System.out.println("Login successful");
					            c = new Cart(1, logMail);
					        } else {
					            System.out.println("Invalid credentials");
					        }

					        break;

					    case 3:

					        System.out.print("Enter product name to search: ");
					        String productName = sc.nextLine();

					        s1.searchProductByName(productName);

					        break;

					    case 4:

					        if (c == null) {
					            System.out.println("Please login first");
					            break;
					        }

					        long amount = s4.TotalAmo(c);

					        s3.OrderPlace(c, c.getUser(), "PLACED", amount);

					        System.out.println("Order placed successfully!");
                          System.out.println("the total amount is :"+amount);
					        break;

					    case 5:

					        System.out.println("Thank you for shopping.");
					        System.out.println("HAPPY SHOPPING");
					        System.out.println("VISIT AGAIN");
					        System.out.println("THANK YOU!!!!!!!!!!!!!!!!!!!!");
					        System.exit(0);

					    default:

					        System.out.println("Invalid option");

					    }

					}
				}

		    }

		

}
