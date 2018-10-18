package abstracFactory;

public class OracleFactory implements ConnectionFactory {
    @Override
    public Connection CreateConnection() {
        return new OracleConnection();
    }
}
