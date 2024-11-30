import java.util.HashMap;

public class leetCode_299 {
    public static String getHint(String secret, String guess) {
        StringBuilder first=new StringBuilder(secret);
        StringBuilder second=new StringBuilder(guess);
        HashMap<Character,Integer>map=new HashMap<>();
        int nbulls=0;
        int ncows=0;
        for (int i = secret.length() - 1; i > -1; i--) {
            if(first.charAt(i)==second.charAt(i)){
                first.deleteCharAt(i);
                second.deleteCharAt(i);
                nbulls++;
            }
            else{
                if(!map.containsKey(secret.charAt(i)))
                    map.put(secret.charAt(i),0);
                map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if(map.containsKey(second.charAt(i)) && map.get(second.charAt(i))>0 ){
                ncows++;
                map.put(second.charAt(i), map.get(second.charAt(i))-1);
            }
        }
        return nbulls+"A"+ncows+"B";
    } 
    public static void main(String[] args) {
        System.out.println(getHint("1807","7810"));
    }
}
