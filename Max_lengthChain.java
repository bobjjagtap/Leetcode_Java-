import java.util.Arrays;
import java.util.Comparator;

public class Max_lengthChain {
    public static void main(String[] args) {
        int chain[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(chain,Comparator.comparingDouble(o->o[1]));

        int max=1;
        int last=chain[0][1];
        for (int i = 1; i < chain.length; i++) {
            while(chain[i][0]>last){
                max++;
                last=chain[i][1];
            }
        }
        System.out.println(max);
    }
}
