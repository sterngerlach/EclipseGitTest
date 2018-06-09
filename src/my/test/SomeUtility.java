
/* SomeUtility.java */

package my.test;

import java.util.List;

public class SomeUtility {
	public static void PrintListElements(List<String> stringList) {
		stringList.stream().forEach(System.out::println);
	}
}
