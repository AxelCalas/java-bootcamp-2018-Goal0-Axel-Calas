package builder;

public class ConnectionDirector {

	private ConnectionBuilder connectionBuilder;

	public ConnectionDirector(ConnectionBuilder connectionBuilder) {
		this.connectionBuilder = connectionBuilder;
	}

	public void constructConnection() {
		connectionBuilder.buildUser();
		connectionBuilder.buildPassword();
		connectionBuilder.buildTypeConnection();
	} 

	public String GetConnection() {
		return connectionBuilder.getConnection();
	}

}