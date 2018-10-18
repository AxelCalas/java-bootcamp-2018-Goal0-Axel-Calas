package abstracFactory;

public class MySqlFactory implements ConnectionFactory {
    @Override
    public Connection CreateConnection() {
        return new MySqlConnection();
    }
}
