import java.util.*;
public class buysell{
    /*public static void sellbuy(int array[],int buy,int sell) {
        for(int i=0;i<array.length;i++){
            if(buy==array[i]){


            }
        }
        
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[]={7, 1, 5, 3, 6, 4};
        System.out.println("enter the stock buying price");
        int buy=sc.nextInt();
        System.out.println("enter the selling price");
        int sell=sc.nextInt();
        double profit=0;
        for(int i=0;i<array.length;i++){
            if(buy==array[i]){
                for(int j=array[i];j<array.length;j++){
                    if(sell==array[j]){
                        profit=sell-buy;

                        if(profit<0){
                            System.out.println("profit will be in negetiv so i can define you proft price");
                            
                        }
                        else{
                            System.out.println(profit);
                        }
                    
                    }
                                                    
                }
            }
            
        }
    }
}