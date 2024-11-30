public class superr {
    public static void main(String[] args) {
        horce hc = new horce();
    }
    
}
class animal{
    animal(){
        System.out.println("animal class constructer called");
    }
}
class horce extends animal{
    
    horce(){
        super();
        System.out.println("hors class constracter called");
    }
}
