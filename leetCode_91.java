
public class leetCode_91 {
    public static int solveerrr(String s) {
        if (s.charAt(0) == '0')
            return 0;

        int arr[] = new int[s.length()];

        arr[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int current = s.charAt(i) - '0';
            int pervious = s.charAt(i - 1) - '0';
            if (pervious * 10 + current < 27 && pervious != 0) {
                if (i - 2 > -1) {

                    arr[i] += arr[i - 2];
                } else {
                    arr[i] += 1;

                }
            }
            if (current != 0) {

                arr[i] += arr[i - 1];
            }

        }
        return arr[arr.length - 1];
    }

    public static void main(String[] jagtap) {
        String s = "122221";
        System.out.println(solveerrr(s));
    }

}
