public class practice3_recursion {
    public static int findd(String str) {
        if(str.length()==0){
            
            return 0;
        }
        return findd(str.substring(1)) + 1;

        
    }
    public static void main(String[] args) {
        String str="jayesh jagtap";
        System.out.println(findd(str));
    }
    
}
