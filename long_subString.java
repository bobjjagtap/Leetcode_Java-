//Longest Substring Without Repeating Characters
public class long_subString {
    public static int findd(String str) {
        int res = 0;
        boolean[] visited = new boolean[113];
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = i; j <=str.length() - 1; j++) {
                if (visited[str.charAt(j)] == true) {
                    break;
                } 
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;

                }

            }

        }
        return res;

    }

    public static void main(String[] args) {
        String str = " ";
        System.out.println(findd(str));
    }
}