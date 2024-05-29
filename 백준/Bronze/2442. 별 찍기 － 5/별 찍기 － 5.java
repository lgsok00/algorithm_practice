import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    in.close();

    for (int i = 1; i <= n; i++) {
      // 공백 찍기
      for (int j = i; j < n; j++) {
        System.out.print(" ");
      }

      // 별 찍기
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}