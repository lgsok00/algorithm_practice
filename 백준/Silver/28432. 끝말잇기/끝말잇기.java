import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    HashSet<String> usedWords = new HashSet<>();

    int n = Integer.parseInt(br.readLine());
    int idx = -1;  // "?" 의 위치

    ArrayList<String> words = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String word = br.readLine();
      if (!"?".equals(word)) {
        usedWords.add(word);
      } else {
        idx = i;
      }
      words.add(word);
    }

    int m = Integer.parseInt(br.readLine());

    for (int i = 0; i < m; i++) {
      String word = br.readLine();
      if (n == 1) {
        bw.write(word + "\n");
        break;
      }
      if (usedWords.contains(word)) {
        continue;
      }
      if (idx == 0) {
        if (words.get(idx + 1).charAt(0) == word.charAt(word.length() - 1)) {
          bw.write(word + "\n");
          break;
        }
      } else if (idx == n - 1) {
        if (words.get(idx - 1).charAt(words.get(idx - 1).length() - 1) == word.charAt(0)) {
          bw.write(word + "\n");
          break;
        }
      } else {
        if (words.get(idx + 1).charAt(0) == word.charAt(word.length() - 1) &&
                words.get(idx - 1).charAt(words.get(idx - 1).length() - 1) == word.charAt(0)) {
          bw.write(word + "\n");
          break;
        }
      }
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
