package five.inbuilt;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {
   public static void main(String[] args) {
        //::
        List<String> names= Arrays.asList("Alice","Charlie","Bob");
       for (int i = 0; i < names.size(); i++) {
           System.out.println(names.get(i));
       }

       for(String name:names)
           System.out.println(name);
    }
}
