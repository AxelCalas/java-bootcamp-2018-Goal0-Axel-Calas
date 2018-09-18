package singleton;

public class DbConnection {
    
    private static DbConnection dbConnection = null;
    
    private DbConnection() {
    
        //Here is where the connection is made
        System.out.println("Successful connection");
    }
    
    public static DbConnection getInstance() {
        
        if(dbConnection == null) {
            dbConnection = new DbConnection();
        }
        
        return dbConnection;
    }
    
    public void Disconnect() {
        
        if(dbConnection != null) {
            dbConnection = null;
            System.out.println("Disconnected from the Database");
        }
        else {
            System.out.println("Upps.. Something went wrong");
        }
    }
}

