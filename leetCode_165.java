public class leetCode_165 {
    public static int check(String version1, String version2) {
        for (int m = 0; m < 4; m++) {
        int sum=0;
        int sum2=0;
        int i=0;
        for (i=0; i < version1.length(); i++) {
            if(version1.charAt(i)=='.'){
                i++;
                break;
            }
            sum*=10;
            sum+=version1.charAt(i)-'0';
        }
        System.out.println("sum is "+sum);
        version1= version1.substring(i, version1.length());
        System.out.println("remaning string 1 is "+version1);
        int j=0;
        for (j=0; j < version2.length(); j++) {
            if(version2.charAt(j)=='.'){
                j++;
                break;
            }
            sum2*=10;
            sum2+=version2.charAt(j)-'0';
        }
        System.out.println("sum2 is "+sum2);
       version2= version2.substring(j, version2.length());
       System.out.println("remaning string 2 is "+version2);
       if(sum<sum2){
            return -1;
        }
        if(sum>sum2){
            System.out.println("dddd");
            return 1;
        }
    }
        return 0;
        
    }

    

    public static void main(String[] args) {
        String version1 = "00001.90.8", version2 = "1.69";
        System.out.println(check(version1, version2));
    }
}
