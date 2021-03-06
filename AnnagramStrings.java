// This program is for checking that 2 strings are Annagram or not
// Input: Two stings
// Output: True/False

import java.util.Arrays;
import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
 String a = sc.next();
 String b = sc.next();
 System.out.println(areAnagram(a,b));
	}
	public static boolean areAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char[] str1_chars = str1.toCharArray();
		Arrays.sort(str1_chars);
		char[] str2_chars = str2.toCharArray();
		Arrays.sort(str2_chars);
		return Arrays.equals(str1_chars,str2_chars);
	}
	

}
