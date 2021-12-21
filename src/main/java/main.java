import java.util.Arrays;
import java.util.Random;

public class main {


    public static void main(String[] args) {

        int[] sequence = new int[] {1, 2, 3, 4, 5, 7, 8, 9 ,10}; // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        int[] sequence2 = new int[] {1, 3, 4, 5, 6};
        int[] sequence3 = new int[] {};
        int[] sequence4 = new int[] {1, 2, 3, 5};

        FindMissedValue(sequence);
        FindMissedValue(sequence2);
        FindMissedValue(sequence3);
        FindMissedValue(sequence4);
    }

    public static void FindMissedValue(int[] sequence) {
        if (sequence.length == 0) {
            System.out.println(1);
        }
        else {
            int lastElement = sequence[sequence.length - 1];
            int sum = Arrays.stream(sequence).sum();
            int expectedSum = lastElement * (lastElement + 1) / 2;
            System.out.println(expectedSum - sum);
        }
    }
}
