package builder;

public class MySqlConnectionBuilder implements ConnectionBuilder {

	private Connection connection;

	public MySqlConnectionBuilder() {
		connection = new Connection();
	}

	@Override
	public void buildUser() {
		connection.SetUser("Pepe");
	}

	@Override
	public void buildPassword() {
		connection.SetPassword("1a2b3c4d");
	}

	@Override
	public void buildTypeConnection() {
		connection.SetTypeConnection("MySql");
	}

	@Override
	public String getConnection() {
		return connection.ToString();
	}

}
