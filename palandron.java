 class palandron {
    public boolean findd(int x) {
        if(x<0){
        return false;
        }
        int reverse=0;
        int number=x;
        while(number>0){
        reverse = reverse*10+number%10;
        number  = number / 10 ;
        }
        if(x == reverse){
            return true;

        }
        return false;
        
        
    }
        
    
    public static void main(String[] args) {
        int x=1212;
        palandron ob=new palandron();
        System.out.println(ob.findd(x));
       
    }
    
}
