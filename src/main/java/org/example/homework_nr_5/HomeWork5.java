package org.example.homework_nr_5;
enum Month{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}
enum weekday{
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();

    public boolean isWeekDay() {
        if (this == SUNDAY || this == SATURDAY) return false;
        else return true;
    }
    public boolean isHoliday() {
        return !isWeekDay();
    }
}
public class HomeWork5 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        System.out.println("==========================");


        System.out.println(weekday.MONDAY.isWeekDay());
        System.out.println(weekday.TUESDAY.isWeekDay());
        System.out.println(weekday.WEDNESDAY.isWeekDay());
        System.out.println(weekday.THURSDAY.isWeekDay());
        System.out.println(weekday.FRIDAY.isWeekDay());
        System.out.println(weekday.SATURDAY.isWeekDay());
        System.out.println(weekday.SUNDAY.isWeekDay());


        System.out.println("==========================");

        boolean booleanValue = Boolean.valueOf("true");
        System.out.println(booleanValue);
        byte byteValue = Byte.valueOf("120");
        System.out.println(byteValue);
        short shortvalue = Short.valueOf("32000");
        System.out.println(shortvalue);
        int intValue = Integer.valueOf("147895632");
        System.out.println(intValue);
        long longValue = Long.valueOf("987654321987654321");
        System.out.println(longValue);
        double doubleValue = Double.valueOf("4444.5d");
        System.out.println(doubleValue);
        float floatValue = Float.valueOf("2354.56f");
        System.out.println(floatValue);
    }
}
