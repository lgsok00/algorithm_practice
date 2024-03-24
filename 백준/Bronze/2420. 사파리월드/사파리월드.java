import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        long m = in.nextLong();
        
        in.close();
        
        System.out.println(Math.abs(n - m));
        
    }
}