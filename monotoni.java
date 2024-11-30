import java.util.ArrayList;
public class monotoni {
     public static boolean findd(ArrayList<Integer>list) {
        if(list.get(0)<list.get(list.size()-1)){
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)<=list.get(i+1)){
            }
            else{
                return false;
            }       
        }
    }else{
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)>=list.get(i+1)){
            }
            else{
                return false;
            }       
        }
    }
    return true;
    }
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList<>();
    //    list.add(9);
    //    list.add(8);
    //    list.add(4);
       list.add(3);
       list.add(3);
       list.add(3);
       list.add(3);
       System.out.println(findd(list));
    }
}
