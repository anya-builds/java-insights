package two.constructors;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String brand;
    String color;
   int speed;

    public Car(String brand,String color,int speed){
//        System.out.println("Constructor Called");
        this.brand=brand;
        this.color=color;
        this.speed=speed;

    }

    public  void drive(){
        System.out.println(brand + " is driving at "+ speed);
    }
     public int getSpeed(){
        return speed;
     }
     public String getBrand(){
        return brand;
     }
    public void setSpeed(int speed){
        this.speed=speed;
    }
}
