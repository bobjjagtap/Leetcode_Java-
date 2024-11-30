public class N_QUEENS {
    public static boolean issafe(char queens[][],int row,int col) {
        for (int i = row-1; i >=0; i--) {
            if(queens[i][col]=='q'){
                return false;
            }
        }
        for (int i = row-1, j=col-1; i>=0 && j>=0 ;i--,j--) {
            if(queens[i][j]=='q'){
                return false;
            }
        }
        for (int i = row-1, j=col+1; i>=0 && j<queens.length ;i--,j++) {
            if(queens[i][j]=='q'){
                return false;
            }
        }
        return true;
    }
    public static void safe(char[][] queens,int row) {
        if(row==queens.length){
            printbord(queens);
            //return;
        }
        for (int i = 0; i < queens.length; i++) {
            if(issafe(queens,row,i)){
            queens[row][i]= 'q';
            safe(queens, row+1);
            queens[row][i]='x';
            }
        }
        return;
    }
    public static void printbord(char queens[][]) {
        System.out.println("-------------chese board----------");
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                System.out.print(queens[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        char queens[][]=new char[4][4];
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < 4; j++) {
                queens[i][j]='x';
              
            }
        }
        safe(queens,0);
    }
}
