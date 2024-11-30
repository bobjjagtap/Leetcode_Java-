import java.util.*;
public class integer
{
    public static void main(String[]args) 
    {
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i<=18)
        {
            System.out.println("you are to young");
        }
        else{
            System.out.println("madrchod");
        }

        
    }
}