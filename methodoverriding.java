public class methodoverriding{
    public static void main(String[] args) {
        nomo no = new nomo();
        System.out.println(no.sum(10,10));
        System.out.println(no.sum(10,10));
        
    }
}
class calculater{
    int sum(int a,int b){
        return a+b;
    }
}
class nomo extends calculater{
    int sum(int a,int b){
        return a-b;
    }
}