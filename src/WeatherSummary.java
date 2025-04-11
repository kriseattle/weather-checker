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

            //Create a firstTemp that is from the temps file
            double firstTemp = scan.nextDouble();

            //Set default values to firstTemp for comparasion
            double minTemp = firstTemp;
            double maxTemp = firstTemp;

            //Ensuring that sumTemp has firstTemp in it
            double sumTemp = firstTemp;

            //Set count to 1 because the first temp has been read
            int count = 1;

            //Use while loop to go through every single value in the temps file
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
      
      //Calculate average and print out along with min and max
      double averageTemp = sumTemp /count;
      System.out.println("Min: " + minTemp);
      System.out.println("Max: " + maxTemp);
      System.out.println("Average: " + averageTemp);
      scan.close();
        
    }
    
}