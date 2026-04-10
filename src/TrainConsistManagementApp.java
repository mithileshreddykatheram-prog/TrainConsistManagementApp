import java.util.*;

public class TrainConsistManagementApp {

    // Bogie class (Custom Object)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC7: Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> Capacity: " + b.capacity);
        }

        // Sorting using Comparator (Lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> Capacity: " + b.capacity);
        }

        System.out.println("\nSystem is ready for further operations...");
    }
}