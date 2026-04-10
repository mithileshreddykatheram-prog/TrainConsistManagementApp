import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1 (initialization)
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper bogie present? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem is ready for further operations...");
    }
}