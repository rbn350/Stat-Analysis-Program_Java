# Stat-Analysis-Program_Java
Simple Java program designed to read a dataset of statistics from a CSV file, and display calculations to an output text file.

**Program Overview**:

- The CrimeStatsAnalysis program is a simple Java application designed to read a dataset of crime statistics from a CSV file, calculate the total number of reported crimes, and write this total to an output text file. The program assumes that the dataset contains a header row and that the total number of crimes reported in a year is located in the last column of each row.

**Features**:

**_CSV File Reading_**:
- Reads crime statistics from a CSV file.

**_Total Crimes Calculation_**:
- Calculates the total number of crimes reported across all years in the dataset.

**_Output Generation_**:
- Writes the calculated total crimes to an output text file.

**How to Run**:

1. Ensure Java is installed on your computer.
2. Place your crime statistics CSV file on your computer and note its path.
3. Update the inputFilePath variable in the program with the path to your CSV file.
4. Optionally, update the outputFilePath variable in the program to your desired output file location.
5. Compile the Java program using javac CrimeStatsAnalysis.java.
6. Run the compiled program with java CrimeStatsAnalysis.
7. After execution, check the specified output file location for the total crimes result.

**Program Structure**:

**_Variables_**:

- **_'inputFilePath'_**: Path to the input CSV file containing the crime statistics.
- **_'outputFilePath'_**: Path to the output text file where the total crimes figure will be written.

**Main Processing**:

- The program first opens and reads the input CSV file, skipping the header row.
- It then reads each row, extracting the total crimes reported in the last column, and adds this to a cumulative total.
- After processing all rows, it writes the total crimes figure to the specified output text file.

**Error Handling**:

- The program includes basic error handling for I/O operations, reporting any issues encountered during file reading or writing.

**Usage Notes**:

- The program assumes the structure of the CSV file is consistent, with the total number of reported crimes in the last column of each row. If your CSV file has a different structure, you will need to modify the program accordingly.
- The program does not perform complex error checking (e.g., to confirm the validity of data in each row). Ensure that your CSV file is correctly formatted to avoid runtime errors.

**Extending the Program**:

For users interested in further developing this program, consider the following enhancements:

- **Dynamic File Paths**: Modify the program to accept input and output file paths as arguments from the command line, making it more flexible for different datasets.
- **Detailed Analysis**: Extend the functionality to perform more detailed analysis, such as calculating crimes by category, year, or other criteria present in the dataset.
- **Data Validation**: Implement additional error checking and data validation to handle missing values or malformed data entries in the CSV file.

This program serves as a basic template for file reading and writing operations in Java, offering a foundation that can be expanded into more comprehensive data analysis tools.
