class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] c = Integer.toString(x).toCharArray();
        
        int value = 0;
        for (int i = 0; i < c.length; i++) { 
            value += Character.getNumericValue(c[i]);
        }
        
        if (x % value == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}