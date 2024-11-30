public class leetCode_149 {
    public int maxPoints(int points[][]) {

        int res = 2;
        int n = points.length;
        if (n == 1)
            return n;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                int extra = 2;
                for (int k = 0; k < points.length; k++) {
                    if (i == k || j == k)
                        continue;
                    int p1 = points[i][0] * (points[i][1] - points[k][1]);
                    int p2 = points[j][0] * (points[j][1] - points[i][1]);
                    int p3 = points[k][0] * (points[k][1] - points[j][1]);
                    if (p1 + p2 + p3 == 0)
                        extra++;
                }
                res = Math.max(extra, res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        leetCode_149 lc = new leetCode_149();
        int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };
        System.out.println(lc.maxPoints(points));

    }
}
