package two.polymorphism;

public class Car extends Vehicle {
   private int doors;

    public Car(String brand, int speed,int doors) {
        super(brand, speed);
        this.doors = doors;
    }
    @Override
    public void start(){
        System.out.println("Starting Car...");
    }
}
