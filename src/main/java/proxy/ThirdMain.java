//CLIENT

package proxy;
import java.util.Scanner;

public class ThirdMain {
    
    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc;
        
        Connection proxyConnection = null;
        
        do{                                     //Do-While to stay in the menu. Option 3 to exit.
            opc = Ask();
            
            switch(opc) {
                case 1:
                    System.out.println("\nYou are going to connect to the database..");
                    proxyConnection = new ConnectionProxy();
                    proxyConnection.Connect();
                    break;
                case 2:
                    System.out.println("\nYou are going to disconnect from the database..");
                    proxyConnection = new ConnectionProxy();
                    proxyConnection.Disconnect();
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
    
     public static int Ask() {                  //Method to print the Options Menu
        System.out.print(
        " OPTION MENU\n"
    +   " ------ ----- \n\n"
    +   "1) Connect to database.\n"
    +   "2) Disonnect from the database.\n"
    +   "3) Exit.\n"
    +   "Choose an option: ");
        return Integer.parseInt( S.nextLine() );    
    }
}
