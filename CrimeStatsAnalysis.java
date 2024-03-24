import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrimeStatsAnalysis {
    public static void main(String[] args) {
        String inputFilePath = "C:/Users/User/Desktop/File Operations Data Set.csv";
        String outputFilePath = "C:/Users/User/Desktop/output.txt";
        try {
            File inputFile = new File(inputFilePath);
            Scanner scanner = new Scanner(inputFile);
            long totalCrimes = 0;
            // Assuming the first line is the header and skipping it
            if (scanner.hasNextLine()) scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                // Assuming Report_Year_Total is the last column
                int reportYearTotal = Integer.parseInt(values[values.length - 1]);
                totalCrimes += reportYearTotal;
            }
            scanner.close();
            
            // Writing the total to the output file
            FileWriter writer = new FileWriter(outputFilePath);
            writer.write("\nTotal Crimes: " + totalCrimes);
            writer.close();
            
            System.out.println("\nAnalysis completed. Total crimes: " + totalCrimes);
        } catch (IOException e) {
            System.out.println("\nAn error occurred.");
            e.printStackTrace();
        }
    }
}
