class Solution {
    public int solution(String binomial) {
        String[] splitArr = binomial.split(" ");
        int result = 0;
        
        int a = Integer.parseInt(splitArr[0]);
        int b = Integer.parseInt(splitArr[2]);
        
        if (splitArr[1].charAt(0) == '+') {
            result = a + b;
        } else if (splitArr[1].charAt(0) == '-') {
            result = a - b;
        } else {
            result = a * b;
        }
        return result;
    }
}