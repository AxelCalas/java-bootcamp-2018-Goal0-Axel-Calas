package singleton;

public class Program {
    
    public static void main(String[] args) {
	    DbConnection dbConnection = DbConnection.getInstance();        
        dbConnection.Disconnect();
    }
}
