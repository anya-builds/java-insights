package five.inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static Function<Integer,Integer> addFunction = (a) -> a+3;
    public static Function<Integer,Integer> substractFunction = (a) -> a - 7;


    public static void main(String[] args){
        System.out.println(addFunction.apply(10));
        System.out.println(substractFunction.apply(10));

    }
}
