//PROXY

package proxy;
import java.util.Scanner;

public class ConnectionProxy implements Connection {
    
    private String User;
    
    Connection realConnection;
    
    public ConnectionProxy()  {
        Scanner User = new Scanner(System.in);
        System.out.print("\nUser: ");
        this.User = User.nextLine();             //The proxy requests that a user be entered.
    }
    
    public void Connect() {
        realConnection = new DatabaseConnection(User);
        realConnection.Connect();
    }
    
    public void Disconnect() {
        realConnection = new DatabaseConnection(User);
        realConnection.Disconnect();
    }
}
