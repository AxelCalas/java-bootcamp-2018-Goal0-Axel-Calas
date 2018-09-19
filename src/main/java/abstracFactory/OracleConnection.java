package abstracFactory;

import java.util.Scanner;

public class OracleConnection implements Connection {
    
    String UserName,Password;
    
    @Override
    public void EnterUser() {
        Scanner User = new Scanner(System.in);
        System.out.print("\n\nUser: ");
        UserName = User.nextLine();    
    }
    
    @Override
    public void EnterPassword() {
        Scanner Passw = new Scanner(System.in);
        System.out.print("Passw: ");
        Password = Passw.nextLine(); 
    }
    
    @Override
    public void ShowState() {
        System.out.println("\n"+ UserName + " is connected with Oracle\n");
    }
}
