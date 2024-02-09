import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int buddhist = scanner.nextInt();
        int year = buddhist - 543;
        
        System.out.println(year);
    }
}