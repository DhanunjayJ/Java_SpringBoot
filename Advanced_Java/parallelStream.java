import java.util.*;

public class Demo {
    public static void main(String [] args){
        
        int size = 1000;
        
        List<Integer> nums = new ArrayList<>(size);
        
        Random ran = new Random();
        
        for(int i=1;i<=size;i++)
        nums.add(ran.nextInt(100));
        
        // int sum1 = nums.stream()
        //               .map(i -> i*2)
        //               .reduce(0,(c,e) -> c+e);
        
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i -> {
                            try{Thread.sleep(1); }catch (Exception e){}
                            return i*2;})
                        .mapToInt(i->i)
                        .sum();
                        
        long endSeq = System.currentTimeMillis();
        
        long startPara = System.currentTimeMillis();    
        int sum3 = nums.parallelStream()
                        .map(i -> {
                            try{Thread.sleep(1); }catch (Exception e){}
                            return i*2;})
                        .mapToInt(i->i)
                        .sum();
        long endPara = System.currentTimeMillis(); 
        
        
        // System.out.println(sum1);
        System.out.println(endSeq-startSeq);
        System.out.println(endPara-startPara);
    }
}