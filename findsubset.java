public class findsubset {
    public static void findd(String str,String ans,int i) {
        if(i==str.length()){
            if(str.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }
        findd(str,ans+str.charAt(i),i+1);
        findd(str,ans,i+1);
        
    }

    public static void main(String[] args) {
        String str="abc";
        String s=str.substring(0, 1)+str.substring(1+1);
        System.out.println(s);
        findd(str," ",0);
    }
}
