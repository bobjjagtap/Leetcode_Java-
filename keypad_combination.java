public class keypad_combination {
    public static void combination(String number) {
        String sum="";
        int k=0;
        String dial[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int array[]=new int[number.length()];
        for(int i=0;i<array.length;i++){
        array[i]=number.charAt(i)-'0';
        }
        for(int i=0;i<dial[array[k]].length();i++){   
            for(int j=0;j<dial[array[k+1]].length();j++){ 
             sum+=dial[array[k]].charAt(i);
             sum+=dial[array[k+1]].charAt(j);
            System.out.print(sum+" ");
            sum="";
            }
    }
    }
    public static void main(String[] args) {
        String number ="2";
        combination(number);
    }
}
