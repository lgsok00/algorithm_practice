import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
         Arrays.sort(array);
        
        int answer = array[0]; // 초기값을 배열의 첫 번째 요소로 설정
        
        for (int num : array) {
            if (Math.abs(num - n) < Math.abs(answer - n)) {
                answer = num;
            }
        }
        
        return answer;
    }
}