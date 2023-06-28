class Solution {
    public int[] solution(String myString) {
        String[] splitarr = myString.split("x", myString.length());
        int[] answer = new int[splitarr.length];
        
        for (int i = 0; i < splitarr.length; i++){
            answer[i] = splitarr[i].length();
        }
        return answer;
    }
}