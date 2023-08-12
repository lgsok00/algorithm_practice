class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        // index = numbers 값을 가져올 때 사용
        int index = 0;
        
        // k 번째로 공을 던지는 사람을 구하기 위한 반복문
        // 오른쪽으로 한 명을 건너뛰기 위해 index 값에 2씩 더해줌
        for (int i = 1; i < k; i++) {
            index += 2;
        }
        
        // index 값이 배열의 길이 보다 커질 수 있기 때문에 나눠줌 
        index %= numbers.length;
        answer = numbers[index];
        return answer;
    }
}