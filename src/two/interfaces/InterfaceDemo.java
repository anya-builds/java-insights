package two.interfaces;

public class InterfaceDemo {
   public static void main(String[] args) {
//        ElectricCar e1=new ElectricCar();
//        e1.applyBrakes();
//        e1.turnLeft();

       CarControls myCar = new ElectricCar();
       myCar.turnLeft();

       CarControls myCar2=new SportsCar();
       myCar2.turnLeft();
    }
}
