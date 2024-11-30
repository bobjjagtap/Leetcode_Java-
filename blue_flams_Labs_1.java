public class blue_flams_Labs_1 {
    public static int area(int length, int breath) {
        int sum = length * breath;

        int n = 0;
        if (length < breath) {
            n = breath - length;
        } else {
            n = length - breath;
        }

        int n1 = n * n;

        double m = (double) sum / n1;

        if (m % 2 == 0) {
            return (int) m;
        } else {
            return (int) sum;
        }
    }

    public static void main(String[] args) {
        int length = 15;
        int breath = 10;
        System.out.println(area(length, breath));
    }
}
