
/**
 * FindMaxWealth: A LeetCode Question for Finding the Max Wealth
 * of Richest Person.
 */
public class FindMaxWealth {
    public static void main(String[] args) {
        
        // Main Functioning.`
        int[][] persons = {
                { 1, 2, 3, 14 },
                { 5, 6, 7, 18 },
                { 9, 10, 11, 12}, 
        };

        // Calling Method that Returns the Max Wealth.
        int max = maxWealth(persons);
        System.out.println("* The Maximum Wealth of Richest Person is: " + max);

    }

    /**
     * @param persons :It's an 2D Array of Integers such that:
     *                {
     *                {1, 2, 3},
     *                {2, 4, 1},
     *                {0, 5, 0}
     *                } Where Each subarray denotes a single person, it's number
     *                denotes balances in distinct accounts.
     * 
     * @return Returns "int": The Total wealth of the Richest Person.
     */
    static int maxWealth(int[][] persons) {
        // Initializing Maximum Wealth to keep track of Max Wealth.
        int MaximumWealth = 0;
        for (int[] person : persons) {
            // Each person denoting an int Array in persons i.e. an 2D Array.
            int currentNetWealth = 0; // NetWealth of Individual Persons.
            for (int account : person) {
                currentNetWealth += account;
            }
            // If Current person has wealth greater than the maxWealth then MaxWealth=CurrentWealth.
            if (MaximumWealth < currentNetWealth) MaximumWealth = currentNetWealth;
        }
        return MaximumWealth;
    }
}