import java.util.*;

public class leetCode_204 {
    public static int countPrimes(int n) {
        int count = 0;
        if(n<2){
            return 0;
        }
        boolean primes[] = new boolean[n];
        Arrays.fill(primes,true);
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i)
                        primes[j] = false;
                    
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 49;
        System.out.println(countPrimes(n));
    }
}
// int count=1;
// if(2>=n){
// return 0;
// }
// for (int i = 3; i < n; i++) {
// count+=countt(i,count);
// //System.out.println(count);
// }
// return count;
// }
// public static int countt(int i,int count){
// for (int j = 2; j < i; j++){
// if (i % j == 0){
// return 0;
// }
// }
// return 1;