//PROXY

package proxy;
import java.util.Scanner;

public class ConnectionProxy implements Connection {
    
    private String user;
    private Connection realConnection;
    
    public ConnectionProxy()  {
        Scanner User = new Scanner(System.in);
        System.out.print("\nUser: ");
        this.user = User.nextLine();             //The proxy requests that a user be entered.
    }
    
    public void Connect() {
        realConnection = new DatabaseConnection(user);
        realConnection.Connect();
    }
    
    public void Disconnect() {
        realConnection = new DatabaseConnection(user);
        realConnection.Disconnect();
    }
}
