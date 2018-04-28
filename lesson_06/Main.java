package vcs.lesson_06;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        // car1.honk();

        Car car2 = new Car(1998);





        Car car3 = new Car(1998, "Black", "Chrysler");
        car3.honk();

        String color = car3.getColor();
        System.out.println(color);

        car3.setColor("Red");
        color = car3.getColor();
        System.out.println(color);
    }
}
