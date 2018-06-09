
/* HelloWorld.java */

package my.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		List<String> strList = Arrays.asList("C++", "Python", "Java", "CSharp");
		SomeUtility.PrintListElements(strList);
	}
}
