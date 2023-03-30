public class NestedSwitch {
    public static void main(String[] args) {
        int outerOption = 1;
        int innerOption = 2;

        // Much Cleaner and shorter Format.
        String result = switch (outerOption) {
            case 1 -> switch (innerOption) {
                case 1 -> "Inner option 1";
                case 2 -> "Inner option 2";
                default -> "Invalid inner option";
            };
            case 2 -> "Outer option 2";
            default -> "Invalid outer option";
        };

        System.out.println(result);

    }
}
