package ModelClass;


public class Users {
    private String name;
    private String password;
    private String mail;
    private int userId;
	public Users(String name, String password, String mail,int userId) {
		super();
		this.name = name;
		this.password = password;
		this.mail = mail;
		this.userId=userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
