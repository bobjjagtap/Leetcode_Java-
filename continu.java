import java.util.*;
public class continu{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("entr the number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i % 3==0){
                continue;//break; just change the statement that's it!
            
            }
            System.out.println(i);
        }
       
    }
}