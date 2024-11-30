public class leetCode_8 {
        public static int myAtoi(String s) {
            double res = 0;
            boolean dig = false;
            boolean pos = false;
            boolean neg = false;
            boolean other = false;
            int n = s.length();
            int i = 0;
            while (i<n && s.charAt(i)==' ')
                i++;
            for (; i<n; i++)
            {
                if (other)
                    break;
    
                char S = s.charAt(i);
                if (S>='0' && S<='9')
                {
                    res = res*10 + (S-'0');
                    dig = true;
                }
                else
                {
                    if (dig)
                        break;
    
                    else if (S=='-' && !neg)
                        neg = true;
    
                    else if (S=='+' && !pos)
                        pos = true;
                    
                    else
                        other = true;
                }
            }
            if (pos && neg)
                return 0;
    
            if (neg)
                res = -res;
    
            if (res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            
            if (res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
    
            return (int)res;
        }


    public static void main(String[] args) {
        String str = "+1";
        System.out.println(myAtoi(str));
        
    }

}
// str=str.trim();
// long finalresult=0;
// int i;
// if(str.charAt(0)>='a' && str.charAt(0)<='z'){
// return 0;
// }
// for (i = 0; i < str.length(); i++) {
// if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
// finalresult=finalresult*10 + str.charAt(i)-'0';

// }

// }
// if(Integer.MAX_VALUE<finalresult ){
// return Integer.MIN_VALUE;
// }
// if(str.charAt(0)=='-'){
// finalresult*=-1;
// }
// //int o=(int)finalresult;
// return (int)finalresult;
