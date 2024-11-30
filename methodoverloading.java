//public class methodoverloading{
   // public static void main(String[] args){
  //  }
//}
// class calculater{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a,float b,float c){
//         return a+b+c;
//     }
//     int sum(int a,int b){
//         return a-b;
//     }
// }
public class methodoverloading{
    public static void main(String[] args) {
        calculater cl = new calculater();
        System.out.println(cl.sum(10,10));
        System.out.println(cl.sum((float)10.10,(float)20.55));
        System.out.println(cl.sum (10,20));
    }
}
class calculater{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a-b;
    }
    float sum(float a,float b){
        return a+b;
    }
}