package one;

import com.sun.security.jgss.GSSUtil;

public class ControlFlow {
    public static void main(String[] args) {
        //if-else
        int age =20;
        if (age > 18){
            System.out.println("Welcome to our bank!");
        }else{
            System.out.println("not applicable");
        }

        //if else ladder
        int marks=90;
        if (marks >90){
            System.out.println("Grade A");
        }else if(marks>75){
            System.out.println("Grade B");
        } else if (marks>60) {
            System.out.println("Grade C");
        }else{
            System.out.println("F");
        }

        //switch
//        String day="monday";
        String day = "Saturday";
        switch (day) {
            case "Monday" -> System.out.println("Start of the week");
            case "Friday" -> System.out.println("Last day of the week");
            default -> System.out.println("Enjoy weekend");
        }

        //loops
        //for
        for (int i=0;i< 10;i++){
            System.out.println("Count: " + i);
        }
    }
}
