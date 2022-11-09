import java.util.*;
public class QA_22 {
   
    public static void main(String[] args) {
        
        Integer[] numberArray = new Integer[]{3, 2, 5, 1, 4, 2};
        
        TreeSet<Integer> tSetNumbers = new TreeSet<Integer>( Arrays.asList(numberArray) );
        
        System.out.println("TreeSet contains: " + tSetNumbers);
}
}