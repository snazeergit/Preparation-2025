package com.nt.strings;

/*
 * Find out if the given string is rotation of another String
 * s1="ABCD"
 * s2="CDAB"
 * s1 is rotated 2 positions to the right gives you s2
 * so s2 is rotation of s1
 */
public class StringRotation {
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		boolean isRotated = findRotationString(s1, s2);
		if (isRotated)
			System.out.println(s2 + " is roation of " + s1);
		else
			System.out.println(s2 + " is NOT a roation of " + s1);

	}

	private static boolean findRotationString(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s1.concat(s1);
		return s1.contains(s2);
	}
}
