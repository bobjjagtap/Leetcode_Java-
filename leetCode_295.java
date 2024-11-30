import java.util.ArrayList;

public class leetCode_295 {
    ArrayList<Integer>list=new ArrayList<>();
    public void addNum(int num) {
        int i;
        if(list.size() > 0){
            for (i = 0; (i < list.size()  && list.get(i) < num); i++);
            list.add(i , num);
        }else{
            list.add(num);
        }
    }
    
    public double findMedian() {
        int index = list.size()/2;
        if(list.size() % 2 == 0){
            return (double) (list.get(index) + list.get(index - 1))/2;
        }else{
            return list.get(index);
        }
    }


    public static void main(String[] args) {
        leetCode_295 lc=new leetCode_295();
        lc.addNum(4);
        lc.addNum(2);
        lc.addNum(1);
        lc.addNum(9);
        System.out.println(lc.findMedian());
        lc.addNum(5);
        lc.addNum(7);
        lc.addNum(3);
        System.out.println(lc.findMedian());

    }
}
