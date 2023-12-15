// Used to create related constants in a safe manner.
public class Enum {
    public static void main(String[] args) {
        enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        // Each constant in Enum type, is a object of that enum type.
        for( Day day: Day.values()) {
            System.out.println(day);
        }
    }
}


