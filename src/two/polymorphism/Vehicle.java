package two.polymorphism;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

//    @Override
    public void start(){
        System.out.println("Starting Vehicle...");
    }
    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Brand: "+brand+", Speed: "+speed);
    }
}
