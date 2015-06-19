/**
 * 
 */
package com.git;

/**
 * @author 282026 Determine the last position of a substring inside a string
 *         with the help of strOrig.lastIndexOf(Stringname) method.
 */
public class SearchlastString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index "
					+ lastIndex);
		}

	}

}
