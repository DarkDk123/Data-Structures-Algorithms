public class OverLoading {
    public static void main(String[] args) {
        /*
         * Method OverLoading refers to extending the behaviour
         * of Existing Methods on different no. of Arguments (Polymorphism)
         */
        marriage("Higher", "Too_Much");
        marriage("Excellent", "Good", "Complete");

    }

    // Method One:
    static void marriage(String status, String wealth){
        System.out.println("\n\n* Marriage one most common nowdays.");
        System.out.println("Passed arguments: " + status + " " + wealth + "\n\n");
    
    }

    // OverLoaded Method Two with same name
    static void marriage(String behaviour, String heart, String dedication){
        System.out.println("* Marriage that is Rare but Pure");
        System.out.println("Passed arguments: " + behaviour + " " + heart + " " + dedication);

    }
}
