package Java_Basics_Revision.Enums;

public enum Enum_With_Methods {
    MONDAY("Monday" , 1),
    TUESDAY ("Tuesday" , 2) ,
    WEDNESDAY ("Wednesday" , 3) ,
    THURSDAY ("Thursday" , 4) ,
    FRIDAY ("Friday" , 5) ,
    SATURDAY ("Saturday" , 6) ,
    SUNDAY ("Sunday" , 7);

    private final String name;
    private final int number;

    Enum_With_Methods(String name, int number) {
        this.name = name ;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWeekEnd(){
        return this == SATURDAY || this == SUNDAY;
    }

    public static void main(String[] args) {

        /*Enum_With_Methods day = Enum_With_Methods.valueOf("MONDAY");
        System.out.println(day);*/

        for (Enum_With_Methods day : Enum_With_Methods.values()){
//            System.out.println(day);
            System.out.println(day.getName() + " is day " + day.getNumber() + " of week");
            System.out.println(day.isWeekEnd());
            System.out.println();
        }
    }
}
