package builder;

public class Connection {
    
    private String user;
    private String password;
    private String typeConnection;
    
    public void SetUser(String user){
        this.user = user;
    }
    
    public void SetPassword(String password){
        this.password = password;
    }
    
    public void SetTypeConnection(String typeConnection){
        this.typeConnection = typeConnection;
    }
    
    public String ToString() {
		return "Connection Type " + typeConnection + ", User: " + user + ", Passw:" + password;
	}
}
