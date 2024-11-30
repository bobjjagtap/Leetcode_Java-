public class objectt_opps {
    public static void main(String[] args) {
        vihical v=new car();
        car v1=new car();
        v.movess();
        
        v1.movess();
    }
}
class vihical{
    void movess(){
        System.out.println("adad");
    }
}
class car extends vihical{
    void movess(){
        System.out.println(8);
    }
}