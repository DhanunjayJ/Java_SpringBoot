import java.util.*;

public class Demo {
    public static void main(String [] args){
        
        List<String> names = Arrays.asList("DJ","Dhanunjay","DJAY");
        
        // List<String> uNames = names.stream()
        //                           .map(name -> name.toUpperCase())
        //                           .toList();
        
        List<String> uNames = names.stream()
                                  .map(String::toUpperCase)
                                  .toList();
        //class it belongs to.. :: method name;
        uNames.forEach(System.out::println);
        //passing a method name inside the method. 
    }
}