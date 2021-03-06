package abstracFactory;

public class OracleConnection implements Connection {
    
    private String userName;
    private String password;
    
    private GetInput getInput = new GetInput();
    
    @Override
    public void EnterUser() {
        System.out.print("\n\nUser: ");
        userName = getInput.get();    
    }
    
    @Override
    public void EnterPassword() {
        System.out.print("Passw: ");
        password = getInput.get();
    }
    
    @Override
    public void ShowState() {
        System.out.println("\n"+ userName + " is connected with Oracle\n");
    }
}
