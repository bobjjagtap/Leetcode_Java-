import java.util.*;

public class staircase {
    public static int solvee(int n) {
        int cout=0,h=0;
while(0<n){
    cout++;
    if(n>=cout || n==0){
        h=cout;
    }else{
        break;
    }
    n=n-cout;
    
}
        return h;
    }
    public static void main(String[] args) {
        int n=21;
        String words[]={"ab","ab","ab"};
        System.out.println(solvee(n));
    }
}
