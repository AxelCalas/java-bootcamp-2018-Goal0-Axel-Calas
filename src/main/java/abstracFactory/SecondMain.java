package abstracFactory;

import java.util.Scanner;

public class SecondMain {
    
    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;
        
        do{
            opc = Ask();
            
            switch(opc) {
                case 1:
                    TypeConnection(new MySqlFactory());
                    break;
                case 2:
                    TypeConnection(new OracleFactory());
                    break;
                case 3:
                    System.out.println("\n--------Goodbye--------");
                    break;
                default:
                    System.out.println("ERROR -- An invalid option has been chosen");
                    break;
            }
            
            System.out.println("\n\n");
            
        } while(opc!=3);
    }
    
    public static void TypeConnection(ConnectionFactory factory) {
        Connection connection = factory.CreateConnection();
        connection.EnterUser();
        connection.EnterPassword();
        connection.ShowState();
    }
    
    
    public static int Ask() {
        System.out.print(
        " OPTION MENU\n"
    +   " ------ ----- \n\n"
    +   "1) Create an MySql connection.\n"
    +   "2) Create an Oracle connection.\n"
    +   "3) Exit.\n"
    +   "Choose an option: ");
        return Integer.parseInt( S.nextLine() );
    }
}
