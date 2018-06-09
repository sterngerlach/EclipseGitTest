
/* HelloWorld.java */

package my.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

public class HelloWorld {
	
	private JFrame mMainFrame;
	
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		List<String> strList = Arrays.asList("C++", "Python", "Java", "CSharp");
		SomeUtility.PrintListElements(strList);
		
		HelloWorld helloWorldApp = new HelloWorld();
	}
	
	public HelloWorld() {
		this.mMainFrame = new JFrame("EclipseGitTest");
		this.mMainFrame.setSize(640, 480);
		this.mMainFrame.setLocationRelativeTo(null);
		this.mMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mMainFrame.setVisible(true);
	}
}
