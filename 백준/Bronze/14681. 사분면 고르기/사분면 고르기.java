import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        
        int n = 0;
        
        if (x > 0) {
            if (y > 0) {
                n = 1;
                System.out.println(n);
            } else {
                n = 4;
                System.out.println(n);
            }
        } else {
            if (y > 0) {
                n = 2;
                System.out.println(n);
            } else {
                n = 3;
                System.out.println(n);
            }
        }
    }
}