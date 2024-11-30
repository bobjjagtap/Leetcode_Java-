public class class_object {
    public static void main(String[] args) {
        bank b1 = new bank("jayesh");
        //int tip=9;
       // p1.penn(5,11);
        //System.out.println(p1.all+","+p1.alll);
        //System.out.println(all+","+va);
        //b1.name("jayesh");
        System.out.println(b1.name);
        b1.setpassword("");
        System.out.println(b1.po);
    }
}
class bank{
  // private String password;
    String name;
    String password,po="qweeeee";
     bank(String n){
        name= n; 
    }
     void setpassword(String po){
         po=po;
         //System.out.println(password);
     }
}
