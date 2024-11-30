public class roman_to_integer {

    public static void findd(String str) {
        char sum;
        int summ=0;
        char I = 'I';
        char V = 'V';
        char X = 'X';
        char L = 'L';
        char C = 'C';
        char D = 'D';
        char M = 'M';

        for (int i = 0; i < str.length(); i++) {
            sum = str.charAt(i);
            if(I==sum){
                summ+=1;    
            }
            if(V==sum){
                summ+=5;    
            }
            if(X==sum){
                summ+=10;    
            }
            if(L==sum){
                summ+=50;    
            }
            if(C==sum){
                summ+=100;    
            }
            if(D==sum){
                summ+=500;    
            }
            if(M==sum){
                summ+=1000;    
            }
            
        }
        System.out.println(summ);
        

    }

    public static void main(String[] args) {
        String str = "IV";
        findd(str);
    }

}
