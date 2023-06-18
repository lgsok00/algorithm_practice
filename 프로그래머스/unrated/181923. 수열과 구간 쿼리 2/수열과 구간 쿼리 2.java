import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] arr1 = new int[queries.length];
        Arrays.fill(arr1, Integer.MAX_VALUE);
        
        // 쿼리의 길이만큼 반복
        for(int i = 0; i < queries.length; i++) {
            // 각 쿼리의 s <= i <= e의 조건을 for문을 이용해 충족
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                // i > k의 조건
                if( arr[j] > queries[i][2]) {
                    // 가장 작은 arr[i] 조건
                    if(arr1[i] > arr[j]) {
                        arr1[i] = arr[j];
                    } 
                }
            }
            if(arr1[i] == Integer.MAX_VALUE) {
                arr1[i] = -1;
            }              
        }
        return arr1;
    }
}