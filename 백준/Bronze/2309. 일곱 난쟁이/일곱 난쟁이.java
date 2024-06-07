import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
  - 배열에 값을 넣어주고, 두 개의 값을 빼서 100 이 나오는 경우를 구한다.
  - 100 이 나왔으면 두 개의 값을 0 으로 만들고 배열을 sort 한다.
 */
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[9];
    int sum = 0;

    for (int i = 0; i < 9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }

    br.close();

    // 오름차순 정렬
    Arrays.sort(arr);
    // 9명 중 빠질 두 명을 담을 변수
    int a = 0;
    int b = 0;
    // 0 ~ 8
    for (int i = 0; i < arr.length - 1; i++) {
      // 1 ~ 9
      for (int j = i + 1; j < arr.length; j++) {
        if (sum - arr[i] - arr[j] == 100) {
          a = arr[i];
          b = arr[j];
          break;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a || arr[i] == b) {
        continue;
      }
      bw.write(arr[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}
