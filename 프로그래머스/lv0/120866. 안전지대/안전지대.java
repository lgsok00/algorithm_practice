class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int [][] newBoard = new int [board.length][board[0].length];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    danger(i, j, newBoard);
                }
            }
        }
        answer = countDanger(newBoard);
        
        return answer;
    }
    
    void danger(int i, int j, int[][] newBoard) {
        int overX = newBoard.length;
        int overY = newBoard[0].length;
        
        newBoard[i][j] = 1;
        
        if (i > 0) newBoard[i - 1][j] = 1;
        if (i < overX - 1) newBoard[i + 1][j] = 1;
        if (j < overY - 1) newBoard[i][j + 1] = 1;
        if (j > 0) newBoard[i][j - 1] = 1;
        if (i > 0 && j > 0) newBoard[i - 1][j - 1] = 1;
        if (i < overX - 1 && j > 0) newBoard[i + 1][j - 1] = 1;
        if (i > 0 && j < overY - 1) newBoard[i - 1][j + 1] = 1;
        if (i < overX - 1 && j < overY - 1) newBoard[i + 1][j + 1] = 1;
    }
    
    int countDanger(int[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}