import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        // 배열 오름차순
        Arrays.sort(array);
        // 가장 큰 수 -> max
        max = array[array.length - 1];
        // 각 수의 count를 위한 배열
        int count[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        max = count[0];
        // 가장 큰 count값을 max로 설정
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                // max 값이 바뀔 때 최빈값
                answer = i;
            } else if (max == count[i]) {
                // 최빈값이 여러 개인 경우, -1 return
                answer = -1;
            }
        }
        return answer;
    }
}