import java.util.*;
public class calculator{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextInt();
        double number2 = sc.nextInt();
        char name = sc.next().charAt(0);
        double sum;
        switch(name){
            case '=': sum=number1*number2;
                    System.out.println("multiplication = "+sum);        
                    
            case '+': sum=number1+number2;
                    System.out.println("addition = "+sum);        
                    
            case '-': sum=number1-number2;
                    System.out.println("suntraction = "+sum);        
                    
            case '%': sum=number1/number2;
                    System.out.println("division = "+sum);        
                            
        }
    }
}