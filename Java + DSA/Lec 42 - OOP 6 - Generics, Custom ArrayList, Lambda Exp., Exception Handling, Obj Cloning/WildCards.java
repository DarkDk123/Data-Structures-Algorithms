import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        // Runner Template.
    }

    // Normal method : Committed to List of Integer types.
    public static void normalMethod(List<Integer> list) {
        System.out.println("I can accept only \"List of Integers\"!!");
    }

    // Unbounded Wildcard in generic
    // Can take List of Any type!! Good flexibility

    // Here "?" denotes any type.
    public static void Unbounded_WildCard(List<?> list) {
        System.out.println("I can accept any List of Any type.");
    }

    // Upper bounded Wildcard
    // Restrictions for wildcard
    // Type must be subtype of given supertype | or supertype itself.

    // Takes a List of all type that extends Number class.
    public static void upperBound_WildCard(List<? extends Number> list) {
        System.out.println("I can accept any List of Number or any sub type of it.");
    }

    // Lower bounded Wildcard
    // Type must be a super type of given sub-type | or subtype itself

    // Takes List of all super types of Integer type.
    // i.e. Number, Object etc.
    public static void lowerBound_WildCard(List<? super Integer> list) {
        System.out.println("I can accept any List of Integers or any super type of Integer.");
    }
}


