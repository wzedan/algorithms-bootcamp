package org.learning.io.strings;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by wz on 4/29/17.
 */
public class StringUtilities {

    public static boolean isUnique(String str) {
        if (str.length() > 256) {
            return false;
        }
        HashSet<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!unique.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0, j = str2.length() - 1; i < str2.length() && j > -1; i++, j--) {
            if (str1.charAt(i) != str2.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static String replaceSpace(String str, int actualLength) {
        char[] characters = new char[str.length()];
        characters = str.toCharArray();
        ArrayList<Integer> positions = new ArrayList<Integer>();

        //mark
        for (int i = 0; i < actualLength; i++) {
            if (str.charAt(i) == ' ') {
                if (positions.isEmpty())
                    positions.add(i);
                else {
                    positions.add(i + 2);
                }
            }
        }

        //sweep and swift the array
        for (int i = 0; i < positions.size(); i++) {
            char[] tmp = Arrays.copyOfRange(characters, positions.get(i) + 1, characters.length - 3);
            characters = Arrays.copyOfRange(characters, 0, positions.get(i) + 3);
            characters[positions.get(i)] = '%';
            characters[positions.get(i) + 1] = '2';
            characters[positions.get(i) + 2] = '0';
            char[] result = new char[tmp.length + characters.length];
            System.arraycopy(characters, 0, result, 0, characters.length);
            System.arraycopy(tmp, 0, result, characters.length, tmp.length);
            characters = Arrays.copyOf(result, result.length);
        }
        return new String(characters);
    }

    public static boolean isOneWayEdited(String str1, String str2) {
        if (null != str1 && str1.equalsIgnoreCase(str2)) {
            return true;
        }

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        int counter = 0;
        for (int i = 0; i < str1Chars.length; i++) {
            int index = Arrays.binarySearch(str2Chars, str1Chars[i]);
            if (index < 0) {
                counter++;
            }
        }

        return !(counter > 1);
    }
}
