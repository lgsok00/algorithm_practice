class Solution {
    public int[] solution(int n) {
        int[] answer;
        // answer 배열 크기 설정
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }
        
        for (int i = 0; i < answer.length; i++) {
            // 홀수만 저장하기 위해 +1
            answer[i] = (i * 2) + 1;
        }
        return answer;
    }
}