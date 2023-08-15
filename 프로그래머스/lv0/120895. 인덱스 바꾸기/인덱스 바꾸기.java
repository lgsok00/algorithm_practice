class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        // 문자열 my_string -> 문자 배열c로 변환
        char[] c = my_string.toCharArray();
        c[num1] = my_string.charAt(num2);
        c[num2] = my_string.charAt(num1);
        
        // 문자 배열 c -> 문자열 answer로 변환
        String answer = String.valueOf(c);
        return answer;
    }
}