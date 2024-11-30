import java.util.*;
public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(6);
//----------------REVERS ARRAY LIST-----------------
        // for (int i =list.size()-1; i>=0;i--) {
        //     System.out.print(list.get(i)+" ");
            
        // }

//----------------MAXIMUM VALUE IN ARRAY LIST------------
        // int max=Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        //              //OR
        //     max=Math.max(max,list.get(i));
        // }
        // System.out.println(max);
//------------------swap-----------------------
        // int temp=list.get(1);
        // list.set(1,list.get(3));
        // list.set(3,temp);
        // for (int i = 0; i < list.size(); i++) {
            
        // }
        // System.out.print(list);
//------------accending & desending order-------------
        // Collections.sort(list);
        //     System.out.print(list);
        //     System.out.println();
        //     Collections.sort(list,Collections.reverseOrder());
        //     System.out.println(list);
//---------------multidimension array----------------
ArrayList<ArrayList<Integer>> newlist=new ArrayList<>();
ArrayList<Integer> list1=new ArrayList<>();
list1.add(1);
list1.add(2);
newlist.add(list1);
ArrayList<Integer> list2=new ArrayList<>(10);
list2.add(3);
list2.add(4);
newlist.add(list2);
System.out.print(newlist);


    }
}