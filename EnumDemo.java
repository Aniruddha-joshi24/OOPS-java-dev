package week2;

enum Day {

    MONDAY("Start of work week"),
    TUESDAY("Second working day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost Friday"),
    FRIDAY("Last working day"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    // instance variable
    private String description;

    // enum constructor
    Day(String description) {
        this.description = description;
    }

    // getter method
    public String getDescription() {
        return description;
    }
}

public class EnumDemo {

    public static void main(String[] args) {

        // assigning enum value
        Day today = Day.FRIDAY;

        // printing enum constant
        System.out.println("Today is: " + today);

        // printing instance variable using getter
        System.out.println("Description: " + today.getDescription());

        // switch case still works
        switch (today) {

            case MONDAY:
                System.out.println("Start of the week");
                break;

            case FRIDAY:
                System.out.println("Almost weekend!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Midweek");
        }

        // printing all enum values with description
        System.out.println("\nAll Days:");

        for (Day d : Day.values()) {
            System.out.println(d + " - " + d.getDescription());
        }
    }
}