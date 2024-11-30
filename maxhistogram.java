
import java.util.*;

public class maxhistogram {
    public static int chack(int[] histogram) {
        int maxarea = Integer.MIN_VALUE;

        int right_min[] = new int[histogram.length];

        int left_min[] = new int[histogram.length];
        Stack<Integer> s = new Stack<>();
        // right min find index
        for (int i = histogram.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && histogram[s.peek()] >= histogram[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right_min[i] = histogram.length;
            } else {
                right_min[i] = s.peek();
            }
            s.push(i);
        }
        // left min find index
        s = new Stack<>();
        for (int i = 0; i < histogram.length; i++) {
            while (!s.isEmpty() && histogram[s.peek()] >= histogram[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left_min[i] = -1;
            } else {
                left_min[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < histogram.length; i++) {
            int hight = histogram[i];
            int width = right_min[i] - left_min[i] - 1;
            int current = hight * width;
            maxarea = Math.max(maxarea, current);
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int histogram[] = { 2,1,5,6,2,3};
        System.out.println(chack(histogram));
    }
}
