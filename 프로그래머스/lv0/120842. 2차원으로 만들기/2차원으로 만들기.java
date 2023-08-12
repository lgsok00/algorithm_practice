class Solution {
    public int[][] solution(int[] num_list, int n) {
        // num_list의 값들을 n개씩 나눠 2차원 배열로 만들어 주기 위해
        // 행 -> num_list의 길이에서 n을 나눠준 값
        // 열 -> n
        int[][] answer = new int[num_list.length / n][n];
        // index = num_list 값을 가져올 때 사용
        int index = 0; 
        
        // num_list 값을 2차원 배열 answer에 순서대로 넣어줌
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}