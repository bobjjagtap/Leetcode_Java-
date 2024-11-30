public class leetCode_79 {
    static boolean visited[][]; 
    public static boolean solve(char[][] board,String word) {
        int m=board.length,n=board[0].length;
        visited=new boolean[m][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0) && backtrackk(i,j,0,board,word)) return true;
            }
        }
        return false;
    }
    public static boolean backtrackk(int i,int j,int index,char[][] board,String word){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(index)||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        boolean found=backtrackk(i+1, j, index+1, board, word)||backtrackk(i-1, j, index+1, board, word)||backtrackk(i, j+1, index+1, board, word)||backtrackk(i, j-1, index+1, board, word);
        visited[i][j]=false;
        return found;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        System.out.print(solve(board,word));
    }
}
