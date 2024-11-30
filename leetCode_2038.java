import java.util.HashMap;

public class leetCode_2038 {
    public static boolean winnerOfGame(String colors) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        int count=0;
        for (int i = 0; i < colors.length(); i++) {
            char x=colors.charAt(i);
            count=0;
            while(i<colors.length() && colors.charAt(i)==x){
                count++;
                i++;
            }
            map.put(x,map.get(x)+ Math.max(count-2, 0));
            i--;
        }
        return map.get('A')>map.get('B');

    }
    public static void main(String[] args) {
        String colors="AAABABBA";
        System.out.println(winnerOfGame(colors));
    }
}
