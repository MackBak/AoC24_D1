import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        String csvFile = "src/data/inputdata.csv";
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();
        csvReader reader = new csvReader(csvFile);
        reader.csvParse(leftArray, rightArray);

        // Sorting:
        Collections.sort(leftArray);
        Collections.sort(rightArray);

        // Check size
        System.out.println(leftArray.size()); // 1000
        System.out.println(rightArray.size()); // 1000

        // Calculation
        long sum = calculator.calculateDifference(leftArray, rightArray);
        System.out.println(sum);


    }
}
