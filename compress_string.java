public class compress_string {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i <str.length(); i++) {
            Integer counter = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i + 1)){
                counter++;
                i++;
            }
            sb.append(str.charAt(i));
            if(counter>1){
                sb.append(counter);

            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "abceddDdfgdh";
        System.out.println(compress(str));
    }

}
// StringBuilder sb = new StringBuilder("");
//         Integer count;
//         for(int i=0;i<str.length();i++){
//              count=1;
//             while(str.charAt(i) == str.charAt(i+1) && i<str.length()-1){
//                 i++;
//                 count++;
//             }
//             sb.append(str.charAt(i));
//             if(count>1){
//               sb.append(count);
//             }

            
//         }
//         return sb.toString();
//     }
