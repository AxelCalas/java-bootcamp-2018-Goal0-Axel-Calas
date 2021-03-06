package builder;

public class FourthMain {
    public static void main(String[] args) {
    
    ConnectionBuilder connectionBuilder1 = new MySqlConnectionBuilder();
    ConnectionDirector connectionDirector1 = new ConnectionDirector(connectionBuilder1);
    connectionDirector1.constructConnection();
    System.out.println(connectionDirector1.GetConnection());
    
    ConnectionBuilder connectionBuilder2 = new OracleConnectionBuilder();
    ConnectionDirector connectionDirector2 = new ConnectionDirector(connectionBuilder2);
    connectionDirector2.constructConnection();
    System.out.println(connectionDirector2.GetConnection());
    }
}
