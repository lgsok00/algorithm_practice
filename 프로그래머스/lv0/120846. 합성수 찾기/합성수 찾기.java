class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            // count => 약수의 개수
            int count = 0;
            for (int j = 1; j <= n; j++) {
                // 나누어 떨어지면 -> 약수
                // count + 1
                count += (i % j == 0) ? 1 : 0;
            }
            // count 가 3 이상 => 합성수
            // answer + 1
            answer += (count >= 3) ? 1 : 0;
        }
        return answer;
    }
}