package org.example.homework_nr_5;
enum Month{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}
enum weekday{
    Monday(true, false),
    Tuesday(true, false),
    Wednesday(true, false),
    Thursday(true, false),
    Friday(true, false),
    Saturday(false, true),
    Sunday(false, true);
    boolean isWeekday;
    boolean isHoliday;

    weekday(boolean isWeekday, boolean isHoliday) {
        this.isWeekday = isWeekday;
        this.isHoliday = isHoliday;

    }
    public boolean isWeekday() {
        return isWeekday;
    }
    public boolean isHoliday() {
        return isHoliday;
    }
}
public class HomeWork5 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        System.out.println("==========================");


        System.out.println(weekday.Monday.isWeekday());
        System.out.println(weekday.Tuesday.isWeekday());
        System.out.println(weekday.Wednesday.isWeekday());
        System.out.println(weekday.Thursday.isWeekday());
        System.out.println(weekday.Friday.isWeekday());
        System.out.println(weekday.Saturday.isWeekday());
        System.out.println(weekday.Sunday.isWeekday());


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
