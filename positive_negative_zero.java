/*Write a program to enter the numbers till the user wants and at the 
end it should display the count of positive, negative and zeros entered.*/
import java.util.*;
public class positive_negative_zero{
    public static void main(String[]args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int number;
        int countPositive = 0, countNegative = 0, countZero = 0;
        char choise;
        do {
            number = sc.nextInt();
            if (number>0) {
                countPositive++;//count the positive number 1+2+3+4....etc
            } else if(number<0) {
                countNegative++; //count the negative number 1+2+3+4....etc           
            }
              else{
                countZero++;//count the zero number 1+2+3+4....etc
              }
              System.out.println("do you want to continue y/n");
              choise =sc.next().charAt(0);

        } while (choise == 'y' || choise == 'Y');
        System.out.println("Positive Number count = "+countPositive);
        System.out.println("Negative Number count = "+countNegative);
        System.out.println("Zero Number count = "+countZero);
    }
}