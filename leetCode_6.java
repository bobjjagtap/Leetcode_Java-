public class leetCode_6 {
    public static String find(String s, int numRows) {
        int section = 2 * (numRows - 1);
        int len = s.length() ;
        StringBuilder buldil = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            while (index < len) {
                buldil.append(s.charAt(index));
                if (i != 0 && i != numRows-1) {
                    int section2 = section - (2 * i);
                    int section3 = section2 + index;
                    if (section3 < len) {
                        buldil.append(s.charAt(section3));
                    }
                }
                index = index + section;
            }

        }
        return buldil.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int number = 3;
        System.out.println(find(str, number));
    }

}
