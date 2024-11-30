import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class leetCode_950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> indices = new LinkedList<>();
        for (int i = 0; i < deck.length; i++) {
            indices.add(i);
        }
        int result[] = new int[deck.length];
        for (int card : deck) {
            int index = indices.poll();
            result[index] = card;
            if (!indices.isEmpty()) {
                indices.add(indices.poll());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        leetCode_950 lc = new leetCode_950();
        int deck[] = { 17, 13, 11, 2, 3, 5, 7 };
        int array[] = lc.deckRevealedIncreasing(deck);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}