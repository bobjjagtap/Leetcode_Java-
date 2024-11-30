import java.util.*;
public class linearsearch{
    public static int jayesh(int q[], int w){
        for(int i =0; i < q.length;i++){
            if(q[i] == w){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n[]={12,34,90,45,56,78};
        int x = sc.nextInt();
        int index = jayesh(n, x);
        if(index == -1){
            System.out.println("number not found");
        }
        else{
            System.out.println("number found at "+ index +" index");
        }
    }
}