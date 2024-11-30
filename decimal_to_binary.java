public class decimal_to_binary{
    public static void decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
        float o=num%2;
        System.out.println(o);
 
        // Number should be positive
        while (num > 0) {
            
            System.out.println(binary[id++]= num % 2);
            System.out.println(num = num / 2);
            System.out.println();
        }
        
        System.out.println(binary+" "+id+" "+num);
 
        // Print Binary
       // printBinary(binary, id);
    }
 
    // Main Driver Code
    public static void main(String[] args)
    {
        // Entered number to be convert into binary
        int num = 45;
 
        // Calling Our Above Function
        decimalToBinary(num);
    }
}
