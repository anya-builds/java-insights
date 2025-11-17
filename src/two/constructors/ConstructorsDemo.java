package two.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car car1=new Car("Toyota","blue",12);
//        car1.speed=100;
//        car1.brand="Toyota";
//        car1.color="Red";
        car1.drive();

        Car car2=new Car("kia","red",122);
//        car2.speed=120;
//        car2.brand="kia";
//        car2.color="White";
        car2.drive();

//        Date date = new Date();
//        date.
        System.out.println(car2.getSpeed());

    }
}
