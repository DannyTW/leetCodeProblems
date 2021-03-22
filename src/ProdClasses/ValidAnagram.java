package ProdClasses;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean compareWords(String s, String t) {
        char[] sCharRay = s.toCharArray();
        char[] tCharRay = t.toCharArray();

        Arrays.sort(sCharRay);
        Arrays.sort(tCharRay);

        return Arrays.equals(sCharRay, tCharRay);
    }
}




/**
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.


 Example 1:
 Input: s = "anagram", t = "nagaram"
 Output: true

 Example 2:
 Input: s = "rat", t = "car"
 Output: false

 Constraints:

 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.

*/