package four;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    static void main(String[] args) {
//        int a=10;
//        int result = 10/0;
//        System.out.println("Done");

        try{
            int result=10/0;
        }catch (ArithmeticException e){
            System.out.println("In catch block");
        }
        System.out.println("Done");
        int[] a={1,2,3};
//        System.out.println(a[6]);
        try{
            System.out.println(a[2]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("exception");
        } catch (ArithmeticException e){

        }finally {
            System.out.println("finally");
        }
//        System.out.println("final");
        try {
            FileReader fileReader=new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        }
    }
}
