
                                        // Part-A 

// ANSWER 1. --------------------------------------------------------------------

public class PartA {
    public static void main(String[] args) {
        int Total_Combinations = 6 * 6;
        System.out.println("Total Combinations: " + Total_Combinations);

// ANSWER 2. --------------------------------------------------------------------

        int[][] distribution = calculateDistribution();

        // Display the distribution
        System.out.println("Distribution of Die A and Die B combinations:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(distribution[i - 1][j - 1] + "\t");
            }
            System.out.println();
        }
    }

    // Function to calculate the distribution of combinations
    private static int[][] calculateDistribution() {
        int[][] distribution = new int[6][6];

        // Iterate through all possible combinations of Die A and Die B
        for (int dieA = 1; dieA <= 6; dieA++) {
            for (int dieB = 1; dieB <= 6; dieB++) {
                // Calculate the sum of the two dice
                int sum = dieA + dieB;

                // Increment the count in the distribution matrix
                distribution[dieA - 1][dieB - 1]++;
            }
        }

        return distribution;
    }
}
