package LogicClass;

import java.util.ArrayList;
import java.util.List;

import ModelClass.Users;

public class UserLogic {

	 List<Users> newUsers = new ArrayList<>();
	 int nextId = 1;
	
	public boolean register(String name,String password,String mail) {
	if ( name.isEmpty() 
   || password.isEmpty() ||
    mail.isEmpty()) {
    return false;
    }
	
    for(Users user:newUsers) {
    	if(user.getMail().equals(mail)) {
    		return false;
    	}
    }

    int userId = nextId++;
    
    Users newUser = new Users(name, password, mail,userId);
    newUsers.add(newUser);
   
    System.out.println("successful registration");
    return true;
}
	public boolean login(String mail, String password) {

        for (Users user : newUsers) {
            if( (user.getMail().equals(mail)) && (user.getPassword().equals(password)) ){
                return true;
            }
        }

        return false; 
	
	}	
		
	}

