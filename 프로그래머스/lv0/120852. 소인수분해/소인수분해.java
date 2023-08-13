import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            // 나누어 떨어지면 소인수
            // 몫이 2 이상인 경우도 있기 때문에 안 나눠질 때까지 나눠줌
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            // list 값들을 answer 배열에 넣어줌
            answer[i] = list.get(i);
        }
        return answer;
    }
}