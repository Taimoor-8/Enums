package Java_Basics_Revision.Enums;

import java.util.Scanner;

enum Day{
    MONDAY , TUESDAY , WEDNESDAY , THURSDAY ,
    FRIDAY , SATURDAY , SUNDAY
}

public class enumBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day");
        String input = sc.nextLine();

        try {
            Day day = Day.valueOf(input.toUpperCase());
            System.out.println("You entered " + day);
        } catch (IllegalArgumentException e) {
            System.out.println("Enter valid input");
        }

//         Enum using Switch statement
        /*Day day = Day.MONDAY;
        switch (day) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
        }*/

    }
}
