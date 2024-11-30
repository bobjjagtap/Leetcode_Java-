public class short_path {
    public static double getShortestpath(String str) {
        int y=0,x=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='n'){
            y++;
            }
            if(str.charAt(i)=='s'){
            y--;
            }
            if(str.charAt(i)=='e'){
            x++;
            }
            if(str.charAt(i)=='w'){
            x--;
            }
            
        }
        return (double)Math.sqrt((x*x)+(y*y));
        
    }
    public static void main(String[] args) {
        String str="WneeNesennn";
        System.out.println(getShortestpath(str));
    }
    
}
