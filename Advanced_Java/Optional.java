import java.util.*;

public class Demo {
    public static void main(String [] args){
        List<String> names = Arrays.asList("DJ","Dhanunjay","DJAY","DJAI");
        
        Optional<String> name = names.stream()
                                     .filter(str -> str.contains("D"))
                                     .findFirst();
        
        System.out.println(name.orElse("Not Found"));
    }
}

// or you can use this.

import java.util.*;

public class Demo {
    public static void main(String [] args){
        List<String> names = Arrays.asList("DJ","Dhanunjay","DJAY","DJAI");
        
        String name = names.stream()
                                .filter(str -> str.contains("D"))
                                .findFirst()
                                .orElse("Not Found");
        
        System.out.println(name);
    }
}