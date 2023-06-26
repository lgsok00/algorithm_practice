import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] intervals1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] +1);
        int[] intervals2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] +1);
        
        int[] answer = new int[intervals1.length + intervals2.length];
        
        System.arraycopy(intervals1, 0, answer, 0, intervals1.length);
        System.arraycopy(intervals2, 0, answer, intervals1.length, intervals2.length);
        
        return answer;
    }
}