public class leetcode_13 {

    public static int findd(String str) {
       int number=0;
       int prev=0;
       int answer=0;
       for (int i = str.length()-1; i >= 0; i--) {
        if(str.charAt(i)=='I'){
            number=1;
        }else if(str.charAt(i)=='V'){
            number=5;
        }else if(str.charAt(i)=='X'){
            number=10;
        }else if(str.charAt(i)=='L'){
            number=50;
        }else if(str.charAt(i)=='C'){
            number=100;
        }else if(str.charAt(i)=='D'){
            number=500;
        }else if(str.charAt(i)=='M'){
            number=1000;
        }if(number<prev){
            answer-=number;
        }else{
            answer+=number;
        }
        prev=number;
       }
       return answer;
    }
    public static void main(String[] args) {
        String str = "IV";
        System.out.println(findd(str));
    }

}
