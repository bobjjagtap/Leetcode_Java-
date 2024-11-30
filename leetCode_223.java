public class leetCode_223 {
    public static void main(String[] args) {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;
        int a=0,b=0,c=0,d=0;
        if(ax1<bx1){
            a=bx1;
        }else{
            a=ax1;
        }
        if(ay1<by1){
            b=by1;
        }else{
            b=ay1;
        }
        if(ax2>bx2){
            c=bx2;
        }else{
            c=ax2;
        }
        if(ay2>by2){
            d=by2;
        }else{
            d=ay2;
        }
        int sum1=Math.abs(ax1);
        int sum2=Math.abs(ay1);
        int sum3=Math.abs(ax2);
        int sum4=Math.abs(ay2);
        int sum5=Math.abs(bx1);
        int sum6=Math.abs(by1);
        int sum7=Math.abs(bx2);
        int sum8=Math.abs(by2);
        int area1=(sum1+sum3)*(sum2+sum4);
        int area2=(sum5+sum7)*(sum6+sum8);
        System.out.println(area1+" "+area2);

        int sum9=Math.abs(a);
        int sum10=Math.abs(b);
        int sum11=Math.abs(c);
        int sum12=Math.abs(d);

        int area3=(sum9+sum11)*(sum10+sum12);
        System.out.println(area3);

        area1+=area2;
        area1-=area3;
        System.out.println(area1);
        
    }
}
