import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a1 = Integer.parseInt(st.nextToken());
    int a0 = Integer.parseInt(st.nextToken());

    int c = Integer.parseInt(br.readLine());
    int n0 = Integer.parseInt(br.readLine());

    br.close();

    /*
      - f(n) <= c * g(n)
        - f(n) = a1 * n + a0 => O(n)
        - g(n) = n
      - a1 * n0 + a0 <= c * n0
      - a0 <= c * n0 - a1 * n0
      - a0 <= (c - a1) * n0
      - c - a1 >= 0 => 부등호가 바뀌기 때문 => c >= a1
      -----------------------------
      - ex) f(1), a1 = 7, a2 = 7, c = 8, n0 = 1
      - 7 * 1 + 7 <= 8 * 1 => 14 <= 8
     */

    if (a1 * n0 + a0 <= c * n0 && c >= a1) {
      bw.write("1");
    } else {
      bw.write("0");
    }

    bw.flush();
    bw.close();
  }
}
