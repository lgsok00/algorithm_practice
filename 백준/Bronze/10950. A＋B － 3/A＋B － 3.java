import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a + b;
        }
        in.close();
        
        for (int sum : arr) {
            System.out.println(sum);
        }
    }
}