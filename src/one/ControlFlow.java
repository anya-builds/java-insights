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
    }
}
