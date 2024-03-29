import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.close();
        
        int sum = 1;
        
        // n이 0이 아닐 때까지 1씩 감소하면서 sum에 반복적으로 곱해준다.
        while(n != 0) {
            sum = sum * n;
            n--;
        }
        
        System.out.println(sum);
    }
}