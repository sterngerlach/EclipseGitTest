
/* SomeUtility.java */

package my.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SomeUtility {
    public static void PrintListElements(List<String> stringList) {
        stringList.stream().forEach(System.out::println);
    }
    
    public static void PrintIntegers(List<Integer> intList) {
        System.out.println(
            intList
                .stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ")));
    }
    
    public static void fizzbuzz(int n) {
        if (n % 3 == 0) { System.out.println("ffffffiiiiizzzzzzz"); }
        else if(n % 5 == 0) { System.out.println("bbbbbbuuuuuuzzzzzz"); }
        else { System.out.println(n);}
    }
    
    /*
    public static List<List<Integer>> SplitList(List<Integer> sourceList, int partitionSize) {
        List<List<Integer>> partitionList = new ArrayList<>();
        
        for (int i = 0; i < sourceList.size(); i += partitionSize)
            partitionList.add(sourceList.subList(i,
                i + partitionSize >= sourceList.size() ?
                    sourceList.size() : i + partitionSize));
        
        return partitionList;
    }*/
    
    public static void someMethod()
    {
        System.out.println("The quick brown fox jumps over the lazy dog.");
    }
    
    public static void someMethod2()
    {
        System.out.println("Lorem ipsum");
    }
}
