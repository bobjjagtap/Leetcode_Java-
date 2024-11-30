
//     class book{
//         static int count;
//         int price;
//        void book(int price){
//         this.price=price;
//         count++;
//        }
//     }
//     public class practice_opps {
//     public static void main(String[] args) {
//         book b1 = new book();
//         //int bookk=150;
//         b1.book(100);
//         System.out.println(b1.count);
//         book b2 = new book();
//         b2.book(250);
//          //bookk=250;
//          System.out.println(b2.count);

//     }
// } 
////////////////////////////////new///////////////////////////////
// class automobile{
//     private String drive(){
//         return "sdafffaaff";
//     }
// }
// class car extends automobile{
//     protected String drive(){
//         return "jayesada jhayi";
//     }

// }  
// public class electric extends car {
//     //@Override
//     public final String drivej(){
//         return "jayesh jagtap";
//     }
//     public static void main(String[] args) {
//         final car car=new electric();
//         System.out.println(car.drive());
//     }
// }
///////////////////////////////NEW/////////////////////////////
abstract class car{
    static{
        System.out.println("1");
    }

    public car(String name){
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
} 
public class bluecar extends car{
    {
        System.out.println("4");
    }

public bluecar(){
super("blur");
System.out.println("5");
}
public static void main(String[] args) {
    new bluecar();
}
}