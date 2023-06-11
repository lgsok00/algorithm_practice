class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = 2 * a * b;
        if (answer > answer2)
            return answer;
        else
            return answer2;
    }
}