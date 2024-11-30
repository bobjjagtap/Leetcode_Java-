public class find_no_in_string {
    public static void main(String[] args) {
        int count=0;
        String str="hi my name is jayesh prashant jagtap i am 20 year old i born in maharashtra in 9/12/2002";
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)>=97 && str.charAt(i)<=122) 
        //System.out.println(str.charAt(i));
             count++;         
        }
        System.out.println("the number is in string are = "+count);
        //System.out.println(str.length());
    }  
}
