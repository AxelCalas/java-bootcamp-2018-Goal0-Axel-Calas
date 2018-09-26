package builder;

public class OracleConnectionBuilder implements ConnectionBuilder {

	private Connection connection;

	public OracleConnectionBuilder() {
		connection = new Connection();
	}

	@Override
	public void buildUser() {
		connection.SetUser("Javi");
	}

	@Override
	public void buildPassword() {
		connection.SetPassword("9876dcba");
	}

	@Override
	public void buildTypeConnection() {
		connection.SetTypeConnection("Oracle");
	}

	@Override
	public String getConnection() {
		return connection.ToString();
	}

}
