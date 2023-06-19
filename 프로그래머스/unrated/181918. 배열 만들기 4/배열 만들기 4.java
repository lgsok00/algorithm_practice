import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        // ArrayList temp 선언
        ArrayList<Integer> temp = new ArrayList<>();
        
        int i = 0;
        while (i < arr.length){
            // 빈 배열 이라면
            if (temp.size() == 0) {
                temp.add(arr[i]);
                i += 1;
            } else {
                // 마지막 인덱스 선언
                int last = temp.get(temp.size() - 1);
                // temp 에 원소가 있고, 마지막 원소가 arr[i] 보다 작으면
                if (temp.size() != 0 && last < arr[i]) {
                    temp.add(arr[i]);
                    i += 1;
                // temp 에 원소가 있고, 마지막 원소가 arr[i] 보다 크거나 같다면
                } else if (temp.size() != 0 && last >= arr[i]) {
                    // temp 마지막 원소 제거
                    temp.remove(temp.size() - 1);
                }
            }
        }
        // stk 배열 선언
        int[] stk = new int[temp.size()];
        for (int k = 0; k <temp.size(); k++) {
            stk[k] = temp.get(k).intValue();
        }
        return stk;
    }
}