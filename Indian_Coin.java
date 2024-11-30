public class Indian_Coin {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        int rupees=590;
        int i=coins.length-1;
        int counnt=0;
        while(rupees!=0) {
            if(rupees>=coins[i]){
                rupees-=coins[i];
                counnt++;
                System.out.println(coins[i]);
                i++;
            }
            i--;
        }
        System.out.println(counnt);
    }
}
