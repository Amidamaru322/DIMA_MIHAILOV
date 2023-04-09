package org.example.homework_nr_6;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        if (day >= 1 && day <= 31)
            this.day = day;
        else System.out.println("Invalid day: " + day);
    }
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else System.out.println("Invalid month: " + month);
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year >= 0 && year <=2024)
            this.year = year;
         else System.out.println("Invalid year: " + year);
    }
}
