package two.polymorphism;

public class PolymorphismDemo {
   public static void main(String[] args) {

       Car car1=new Car("toyota",435,5);
       car1.displayInfo();

       Bike bike1=new Bike("yamaha",120,true);
       bike1.displayInfo();

       bike1.start();
       car1.start();

       Vehicle v1=new Vehicle("Vehiclebrand",124);
       v1.start();

       Vehicle v2=new Car("Ford",210,6);
       v2.start();

       bike1.start("Hello");
    }
}
