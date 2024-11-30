/*Enter cost of 3 items from the user(using float data type)-apencil,apenandan eraser. You 
have to output the total cost of the items back to the user as their bill.(Add on : You 
can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
import java.util.*;
public class gst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pancil = sc.nextFloat();
        float sum = pen+eraser+pancil;
        System.out.println("total bill amount" + sum);

        //add gst in amount
        float gst =sum+(0.18f * sum);
        System.out.println("include the 18% gst"  + gst);
    }
}