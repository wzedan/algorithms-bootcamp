package org.learning.bigo;

/**
 * Created by wz on 4/23/17.
 *
 * @Reference Cracking the code interview - chapter VI - Big O
 */
public class FibTrials {
    public void allFibWithoutMemo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fib(n));
        }
    }

    /*
    * With recursion and with two branches of code , we are reaching O(2^n) which is terrible even for small inputs
    * (< 50)
    * */
    private long fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }


    public void allFibWithMem(int n) {
        long[] memo = new long[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(fib(n, memo));
        }
    }

    /*
    * Memorization saves a lot of time as array access saves a lot of iterations which results in O(n) complexity
    * */
    private long fib(int n, long[] memo) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0) return memo[n];

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
