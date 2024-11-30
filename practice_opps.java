
    class book{
        static int count;
        int price;
       void book(int price){
        this.price=price;
        count++;
       }
    }
    public class practice_opps {
    public static void main(String[] args) {
        book b1 = new book();
        //int bookk=150;
        b1.book(100);
        System.out.println(b1.count);
        book b2 = new book();
        b2.book(250);
         //bookk=250;
         System.out.println(b2.count);
         
    }
}   

