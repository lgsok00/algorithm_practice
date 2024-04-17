import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        int r = in.nextInt();
        
        char[] arr = s.toCharArray();
        
        in.close();
        
        for (int i = 0; i < arr.length; i++) {
            if (i == r - 1) {
                System.out.print(arr[i]);
            }
        }
        
    }
}