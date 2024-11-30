public class desimal_to_binary_to_decimal {
    public static void converter(int d, int b) {
        int sum = d;

        for (int i = 0; i < d;) {
            sum = d % 2;
            d = d / 2;
            System.out.println(sum);
        }
        for(int i=0;i<d;i++){
        int temp = b%10;  
        double decimal = temp*Math.pow(2, i);  
        b = b/10;  
        }

    }

    public static void main(String[] args) {
        int d = 19;
        int b = 1100;
        System.out.println(1010%10);
        converter(d, b);
    }

}