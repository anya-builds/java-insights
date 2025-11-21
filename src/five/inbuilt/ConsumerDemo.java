package five.inbuilt;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer1=(str)-> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Hello");
        consumer1.accept("Hi");
    }
}
