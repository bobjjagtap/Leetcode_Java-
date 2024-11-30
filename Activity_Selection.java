import java.util.ArrayList;

public class Activity_Selection {
    public static void main(String[] args) {
        int Start[]={1,3,0,5,8,9};
        int end[]=  {2,4,6,7,9,9};
        ArrayList<Integer>list=new ArrayList<>();
        int max_section=1;
        int last=end[0];
        list.add(1);
        for (int i = 1; i < end.length; i++) {
            while(Start[i]>last){
                max_section++;
                list.add(i+1);
                last=end[i];
            }
        }
        for (int index = 0; index < list.size(); index++) {
            System.out.print("A"+list.get(index)+" ");
        }
    }
}
