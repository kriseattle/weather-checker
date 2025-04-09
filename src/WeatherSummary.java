import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to weather checker!");

        double minTemp = Double.MAX_VALUE;
        double maxTemp = Double.MIN_VALUE;
        double sumTemp = 0.0;
        int count = 0;

        while (scan.hasNextDouble()){
            double temp = scan.nextDouble();
            sumTemp += temp;
            count++;
            
            if (temp < minTemp){
                minTemp = temp; 
            }
            if (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        
        if (count > 0){
            double averageTemp = (sumTemp)/count;
            System.out.println("Min temp: " + minTemp);
            System.out.println("Max temp: " + maxTemp);
            System.out.println("Average temp: " + averageTemp);
        
        }
    }
}

