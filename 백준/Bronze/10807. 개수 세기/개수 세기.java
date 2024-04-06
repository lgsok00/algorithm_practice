import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int b = in.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if (b == arr[i]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}