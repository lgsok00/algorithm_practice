class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]+");
        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("[0-9]+")) {
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}