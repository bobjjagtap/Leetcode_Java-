import java.util.*;
public class string1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String firstname = sc.next();
        String lastname = sc.next();
        String fullname = firstname+" "+lastname;
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i));
        }
    }
}
