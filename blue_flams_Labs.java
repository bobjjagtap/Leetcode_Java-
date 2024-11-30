public class blue_flams_Labs {
    public static String findd(String str) {
        String list = "AbcdEfghIjklmnOpqrstUvwxyz";
        String finlll = "";
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                n = (str.charAt(i) - 'a') - 0;
                for (int j = 0; j < 1; j++) {
                    if(n==25){
                        finlll += list.charAt(0);
                    }else{
                    finlll += list.charAt(n+1);
                    }
                }
            } else {
                finlll += str.charAt(i);
            }
        }
        return finlll;
    }

    public static void main(String[] args) {
        String str = "zjhdkgcjwv.,6794/jwjkfh";
        System.out.println(findd(str));
    }
}
