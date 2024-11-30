import java.util.Scanner;

public class remove_duplicatechar_recursion {
    public static void removeDuplicate(String str,int indx,StringBuilder newstr,boolean array[]) {
        if(str.length()==indx){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(indx);
        if(array[currentchar-'a']==true){
            removeDuplicate(str, indx+1, newstr, array);
        }       
        else{
            array[currentchar-'a']=true;
            removeDuplicate(str, indx+1, newstr.append(currentchar), array);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str="jayeshjagtap";
        System.out.println('a'-'j');
        //boolean array[]=new boolean[26];
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
    
}
