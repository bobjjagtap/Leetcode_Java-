public class leetcode_59 {
    public static void spirll(int n) {
        int temp[][] = new int[n][n];
        int startrow = 0;
        int startcolum = 0;
        int endrow = temp[0].length - 1;
        int endcolum = temp.length - 1;
        int sum = 1;
        while (startcolum <= endcolum || startrow <= endrow) {
            for (int i = startrow; i <= endrow; i++) {
                temp[startrow][i] = sum;
                sum++;
            }

            for (int i = startcolum + 1; i <= endcolum; i++) {
                temp[i][endcolum] = sum;

                sum++;
            }

            for (int i = endrow - 1; i >= startrow; i--) {
                if(startcolum==endcolum){
                    break;
                }

                temp[endrow][i] = sum;

                sum++;
            }

            for (int i = endcolum - 1; i >= startcolum + 1; i--) {
                if(startrow==endrow){
                    break;
                }
                temp[i][startcolum] = sum;
                sum++;
            }
            startcolum++;
            startrow++;
            endcolum--;
            endrow--;
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 3;
        spirll(n);
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {

            }
        }
    }
}
