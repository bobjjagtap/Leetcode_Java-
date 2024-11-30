public class lowercase {
    public static String lowerp(String str) {
        StringBuilder sb = new StringBuilder("");
        String newstr="";
            newstr=str.toLowerCase();
            Integer count=0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i) == newstr.charAt(i) && str.charAt(i) != ' ' ){
                count++;
                
            }
        }
        sb.append(count);

        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str="I Am Jayesh Jagtap ";
        System.out.println(str);
        System.out.println("this content "+lowerp(str)+" lowercase charecter");
        

    }
}
