public class mearg_divid_counquer {
    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }

    }

    public static void findd(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (ei + si) / 2;
        findd(array, si, mid);
        findd(array, mid + 1, ei);
        mearge(array, mid, si, ei);
    }

    public static void mearge(int array[], int mid, int si, int ei) {
        int temp[] = new int[ei - si + 1];
        // System.out.println(ei-si+1);
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                // System.out.println("temp first is"+temp[k]);
                i++;
            } else {
                temp[k] = array[j];
                // System.out.println(temp[k]);
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= ei) {
            temp[k++] = array[j++];
        }
        for (int k2 = 0, l = si; k2 < temp.length; k2++, l++) {
            array[l] = temp[k2];

        }
    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 2, 5, 1, 4 };
        findd(array, 0, array.length - 1);
        print(array);
    }

}
