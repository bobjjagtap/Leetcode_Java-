import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

public class interphase {
    public static void main(String[] args) {
        queen q=new queen();
        q.move();
    }
    
}
interface classplayear{
    void move();

}
class rook implements classplayear{
    void move(){
    System.out.println("up,down,left,right");
    }
}
class queen implements classplayear{
    void move(){
    System.out.println("up,down,left,right,digonal");
    }
}

