import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        
        if (a.length() >= b.length()) {
            System.out.print("go");
        } else {
            System.out.print("no");
        }
    }
}