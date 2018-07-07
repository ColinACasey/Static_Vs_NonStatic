/*
 * Testing Static Vs Non-Static
 * Date: 7-6-18
 */

package test;

/**
 * This class will compare the Static and NonStatic class. The time differences is displayed using
 * floating point.
 * @author Colin
 */
public class Compare {
	
	public static void main(String[] Args) {
		Static testCaseStatic = new Static();
		NonStatic testCaseNonStatic = new NonStatic();
		
		System.out.println(String.format("%.0100f",testCaseStatic.run()));
		System.out.println(String.format("%.0100f",testCaseNonStatic.run()));
	}
	
}
