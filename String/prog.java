//Q1. Store 2 string in an array eg. [“Car”, “Truck”,], Write a statement having words Car and Truck.
//Count occurrence of Car and Truck in given paragraph.
public class prog {
    public static void main(String[] args) {
        String[] arr = {"Car", "Truck"};

        String para = "I have 2 Car one is Baleeno Car and other is Farari Car but Truck is used for transportation.";

        // Initialize counters
        int carCount = 0;
        int truckCount = 0;

        String[] words = para.split("\\s+");

        for (String word : words) {
            if (word.equalsIgnoreCase("Car")) {
                carCount++;
            }
             else if (word.equalsIgnoreCase("Truck")) {
                truckCount++;
            }
        }

        System.out.println("Occurrences of Car: " + carCount);
        System.out.println("Occurrences of Truck: " + truckCount);
    }
}


