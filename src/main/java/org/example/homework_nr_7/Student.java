package org.example.homework_nr_7;

public class Student extends Person{
  private String program;
  private Integer year;
  private Double fee;

    public Student(String name, String adress, String program, Integer year, Double fee) {
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + "Program: " + program + ", Year: " + year + ", Fee: " + fee;
    }
}
