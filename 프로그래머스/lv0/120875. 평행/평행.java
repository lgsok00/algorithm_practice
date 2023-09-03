class Solution {
    public int solution(int[][] dots) {
        
        double[][] slope = new double[4][4];
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots.length; j++) {
                if (i == j) {
                    continue;
                }
                double y = dots[i][1] - dots[j][1];
                double x = dots[i][0] - dots[j][0];
                slope[i][j] = y / x;
            }
        }
        int answer = 0;
        
        for (int j = 0; j < slope.length; j++) {
            for (int i = 0; i < 4; i++) {
                if (j == i) {
                    continue;
                }
                for (int h = 0; h < 4; h++) {
                    for (int g = 0; g < 4; g++) {
                        if (h == g) {
                            continue;
                        }
                        if (j == h || j == g || i == h || i == g) {
                            continue;
                        }
                        if (slope[j][i] == slope[h][g]) {
                            answer = 1;
                        }
                    }
                }
            }
        }
        return answer;
    }
}