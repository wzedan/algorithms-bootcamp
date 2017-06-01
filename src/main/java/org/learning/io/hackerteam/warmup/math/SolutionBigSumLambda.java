package org.learning.io.hackerteam.warmup.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.LongStream;

/**
 * Created by wz on 5/9/17.
 */
public class SolutionBigSumLambda {

    public static final void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");
        int size;
        size = in.nextInt();

        String numbersStr = in.next();
        StringTokenizer stringTokenizer = new StringTokenizer(numbersStr, " ");
        long[] numbers = new long[size];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            numbers[i++] = Long.parseLong(stringTokenizer.nextToken());
        }
        System.out.println(LongStream.of(numbers).sum());

    }
}
