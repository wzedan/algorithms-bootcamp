package org.learning.io.hackerteam.strings.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by wz on 5/10/17.
 */
public class MakePalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");
        String limits = in.next();

        StringTokenizer stringTokenizer = new StringTokenizer(limits, " ");
        int size = Integer.parseInt(stringTokenizer.nextToken());
        int limit = Integer.parseInt(stringTokenizer.nextToken());

        String number = in.next();

        if (number.length() % 2 > 0) {
            System.out.println("-1");
        }
        String firstHalf = number.substring(0, size / 2);
        String secondHalf = number.substring(size / 2);

        String reverseFirstHalf = new StringBuilder(firstHalf).reverse().toString();

        int measure = 0;
        for (int i = 0; i < size / 2; i++) {
            if (secondHalf.charAt(i) != reverseFirstHalf.charAt(i)) {
                measure++;
            }
        }

        if (measure > limit) {
            System.out.println("-1");
        } else {
            System.out.println(firstHalf + reverseFirstHalf);
        }

    }
}
