import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        String csvFile = "src/data/inputdata.csv";

        ArrayList<Integer> leftArray = new ArrayList<Integer>();
        ArrayList<Integer> rightArray = new ArrayList<Integer>();

        csvReader reader = new csvReader(csvFile);
        reader.csvParse(leftArray, rightArray);

        System.out.println("######## Left Numbers Array ########\n");
        for (Integer num : leftArray) {
            System.out.print(num + "\n");
        }

    }
}