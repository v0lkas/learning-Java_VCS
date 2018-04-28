package vcs.lesson_06;

public class Car {
    // fields
    private String color;
    private String make;
    private int year;
    private int honkTimes;

    // constructor #1
    public Car() {
        year = 2000;
    }

    // constructor #2
    public Car(int year) {
        this.year = year;
    }

    // constructor #3
    public Car(int year, String color, String make) {
        this.year = year;
        this.color = color;
        this.make = make;
    }

    public void honk() {
        System.out.println("HONK!");
        honkTimes++;
    }

    public String getColor() {
        return this.color;
    }

    public String setColor(String color) {
        return this.color = color;
    }
}
