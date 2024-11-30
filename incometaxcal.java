import java.util.*;
public class incometaxcal{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income");
        double income = sc.nextDouble();
        double tax ;
        if(income < 5000){
            tax=income+(income* 0);
        }
        else if(income >= 10000 &&  income < 30000){
            tax=income+(income * 0.20);    
        }
        else{
            tax = income+(income * 0.30);
        }

         System.out.println(tax);
    }
}