package abstracFactory;
import java.util.Scanner;

public class GetInput {
    
    public String get(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
