import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (fiveandzero(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            return new int[] {-1};
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    private boolean fiveandzero(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}