import java.util.ArrayList;

public class thirumooler_test{
    public static void main(String[] args) {
        String array[]={"jan-1","jan-26","aug-15"};
        ArrayList<ArrayList<String>>list=new ArrayList<ArrayList<String>>();
        ArrayList<String>shorttime=new ArrayList<>();
        ArrayList<String>ans=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                shorttime.add(array[j]);
                list.add(new ArrayList<>(shorttime));
            }
            
            shorttime.clear();
        }
        System.out.println(list);
    }
}