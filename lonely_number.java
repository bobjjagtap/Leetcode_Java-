import java.util.ArrayList;

public class lonely_number {

    public static ArrayList findd(ArrayList<Integer>list) {
        ArrayList<Integer>newlist=new ArrayList<>();
         int i=0;
       for (int index = 1; index < list.size()-1; index++) {
        if(list.get(index-1)==list.get(index)+1 || list.get(index-1)==list.get(index)-1){
            
        }
        else if(list.get(index+1)==list.get(index)+1 || list.get(index+1)==list.get(index)-1){ 
                   
        }
        else{
            newlist.add(i,index);
            i++;
        }
        
       }
       return newlist;
    }
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList<>();
    //    list.add(9);
    //    list.add(8);
    //    list.add(4);
       list.add(10);
       list.add(6);
       list.add(5);
       list.add(4);
       list.add(9);
       list.add(12);
       System.out.println(findd(list));
    }
}
   
