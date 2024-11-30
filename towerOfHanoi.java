public class towerOfHanoi {
    public static void tower(int n,char src,char help,char dest) {
        if(n==1){
            System.out.println(n+" move from "+src+" to "+dest);
            return;
        }
        tower(n-1, src, dest, help);
        System.out.println(n+" move from "+src+" to "+dest);
        tower(n-1, dest, help, src);

    }
    public static void main(String[] args) {
        tower(4, 'a', 'b', 'c');
    }
    
}
