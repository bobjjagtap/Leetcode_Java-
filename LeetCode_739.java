import java.util.*;
public class LeetCode_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indxStack = new Stack<>();
        int size = temperatures.length;
        int[] answer = new int[size];
        for (int indx = 0; indx < size; indx++) {
            int currTemp = temperatures[indx];
            while (!indxStack.isEmpty() && temperatures[indxStack.peek()] < currTemp) {
                answer[indxStack.peek()] = indx - indxStack.peek();
                System.out.print(indxStack.pop());
            }
            indxStack.push(indx);
        }
        return answer;
    }    public static void main(String[] args) {
        LeetCode_739 lc=new LeetCode_739();
        int[] temperatures={73,74,75,71,69,72,76,73};
        int[] arr=lc.dailyTemperatures(temperatures);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
