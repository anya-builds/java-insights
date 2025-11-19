package four;

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
            System.out.println(a[6]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("exception");
        }
        System.out.println("final");
    }
}
