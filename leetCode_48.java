public class leetCode_48 {
    public static void findd(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[i].length; j++) {
            int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
            
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length/2; j++) {
                int temp=m[i][j];
                m[i][j]=m[i][m.length-1];
                m[i][m.length-1]=temp;
                
            }
            
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
                
            }
            
        }
        
    }
    public static void main(String[] args) {
        int m[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        findd(m);
    }
    
}
