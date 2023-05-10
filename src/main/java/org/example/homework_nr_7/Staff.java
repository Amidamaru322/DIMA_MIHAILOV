package org.example.homework_nr_7;

public class Staff extends Person {
    private String school;
    private Double pay;

    public Staff(String name, String adress, String school, Double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString() + "School: " + school + ", Pay: " + pay;
    }
}