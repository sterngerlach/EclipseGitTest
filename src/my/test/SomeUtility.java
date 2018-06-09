
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
	
	public static List<List<Integer>> SplitList(List<Integer> sourceList, int partitionSize) {
		List<List<Integer>> partitionList = new ArrayList<>();
		
		for (int i = 0; i < sourceList.size(); i += partitionSize)
			partitionList.add(sourceList.subList(i,
				i + partitionSize >= sourceList.size() ?
					sourceList.size() : i + partitionSize));
		
		return partitionList;
	}
}
