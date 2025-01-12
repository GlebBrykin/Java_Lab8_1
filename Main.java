public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        System.out.printf("%s is weekend? %b\n", DayOfWeek.MONDAY.name(), DayOfWeek.MONDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.TUESDAY.name(), DayOfWeek.TUESDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.WEDNESDAY.name(), DayOfWeek.WEDNESDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.THURSDAY.name(), DayOfWeek.THURSDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.FRIDAY.name(), DayOfWeek.FRIDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.SATURDAY.name(), DayOfWeek.SATURDAY.isWeekend());
        System.out.printf("%s is weekend? %b\n", DayOfWeek.SUNDAY.name(), DayOfWeek.SUNDAY.isWeekend());

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        for(UserRole role : UserRole.values())
            System.out.printf("%s is authorized? %b\n", role.name(), role.isAuthorized());
    }
}