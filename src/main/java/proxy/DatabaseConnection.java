//REAL OBJECT

package proxy;
public class DatabaseConnection implements Connection {
    
    private String User;
    
    public DatabaseConnection(String User) {
        this.User = User;
    }
    
    @Override
    public void Connect() {
        System.out.println(User + " is connecting to the database...");
        System.out.println("Connected to the database");
    }
    
    @Override
    public void Disconnect() {
       System.out.println(User + " was disconnected from the database");
    }
}

