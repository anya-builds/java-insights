package five.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        // Streams --> Assembly line / pipeline
        List<String> items= Arrays.asList("Apple","Banana","cherry");
        for(String fruit:items){
            System.out.println(fruit);
        }
    }
}
