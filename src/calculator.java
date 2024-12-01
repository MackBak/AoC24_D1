import java.util.ArrayList;

public class calculator {

    public static Long calculateDifference(ArrayList<Integer> leftArray, ArrayList<Integer> rightArray) {

        long sum = 0;
        int iterations = leftArray.size();
        System.out.println("GOing to iterate " + iterations + " amount of times");

        for (int i = 0; i < iterations; i++) {
            int leftNumber = leftArray.get(i);
            int rightNumber = rightArray.get(i);
            int difference = Math.abs(leftNumber - rightNumber);
            sum = sum + difference;
        }
        return sum;
    }

    public static Long similarityScore(long number, ArrayList<Integer> rightArray) {
        int counter = 0;
        for (int value : rightArray) {
            if (value == number) {
                counter++;
            }
        }
        return counter * number;
    }
}
