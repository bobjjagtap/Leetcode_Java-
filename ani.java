import java.util.Stack;

public class ani {
    public static int finddd(String str ) {
    
        Stack<Integer> s=new Stack<>();
        int n=str.length();
        int i=0;
        while(i<n){
        String string=Character.toString(str.charAt(i));
        if(string.equals("+") || string.equals("-") || string.equals("/") || string.equals("*") ){
            int b=s.pop();

            int a=s.pop();
            
            int res=cal(a, b, string.charAt(0));
            s.push(res);
            
        }else{
            s.push(Integer.parseInt(string));
        }
        i++;
    }
    return s.pop();
}

public static int cal(int a,int b,char str){
    if(str=='+'){
        return a+b;
    }else if(str=='-'){
        return a-b;
    }else if(str=='*'){
        return a*b;
    }else{
        return a/b;
    }
}
    public static void main(String[] args) {
        System.out.print(finddd("51*3+"));
    }
}
// int sum=0;
       
//         while(n!=0){
//             sum=sum*10;
//             sum+=n%10;
//             n=n/10;
//         }
//         System.out.println(sum);