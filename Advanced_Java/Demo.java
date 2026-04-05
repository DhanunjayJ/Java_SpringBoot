import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Demo {
    public static void main (String args[]){

        List<Integer> nums = Arrays.asList(1,2,34,5,5,6,6);

        Stream <Integer> sortedValues = nums.stream(). filter(n -> n%2==0).sorted();

        sortedValues.forEach( n -> System.out.println(n));
        
    }
}