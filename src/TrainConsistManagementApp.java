import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies: " + passengerBogies);

        // UC3: Unique Bogie IDs using HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nBogie IDs (duplicates automatically removed):");
        System.out.println(bogieIDs);

        System.out.println("\nSystem is ready for further operations...");
    }
}