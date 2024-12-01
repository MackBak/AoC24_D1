import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class csvReader {

    private final String fileName;

    public csvReader(String fileName) {
        this.fileName = fileName;
    }

    public void csvParse(ArrayList<Integer> leftArray, ArrayList<Integer> rightArray) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(this.fileName));

        String line;
        int lineNumber = 0;
        while ((line = bufferedReader.readLine()) != null) {
            lineNumber++;
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(",");
            if (parts.length != 2) {
                System.err.println("Issue on line " + lineNumber + ": " + line);
                continue;
            }

            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            leftArray.add(left);
            rightArray.add(right);
        } // end of while loop
        bufferedReader.close();
    } // end of csvParse
} // end of class
