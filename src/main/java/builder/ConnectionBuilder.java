package builder;

public interface ConnectionBuilder {
	
	public void buildUser();

	public void buildPassword();

	public void buildTypeConnection();

	public String getConnection();
}
