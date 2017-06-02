package org.learning.bigo;

import org.junit.Test;
import org.springframework.util.StopWatch;

/**
 * Created by wz on 4/23/17.
 */
public class FibTrialsTest {


    @Test
    public void allFibWithoutMemo() throws Exception {
        StopWatch stopWatch = new StopWatch();
        FibTrials fibTrials = new FibTrials();

        stopWatch.start("5");
        fibTrials.allFibWithoutMemo(5);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 5, stopWatch.getTotalTimeMillis()));


        stopWatch.start("20");
        fibTrials.allFibWithoutMemo(20);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 20, stopWatch.getTotalTimeMillis()));

        stopWatch.start("50");
        fibTrials.allFibWithoutMemo(50);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 50, stopWatch.getTotalTimeMillis()));

        stopWatch.start("75");
        fibTrials.allFibWithoutMemo(75);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 75, stopWatch.getTotalTimeMillis()));
    }

    @Test
    public void allFibWithMem() throws Exception {
        StopWatch stopWatch = new StopWatch();
        FibTrials fibTrials = new FibTrials();

        stopWatch.start("5");
        fibTrials.allFibWithMem(5);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 5, stopWatch.getTotalTimeMillis()));


        stopWatch.start("20");
        fibTrials.allFibWithMem(20);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 20, stopWatch.getTotalTimeMillis()));

        stopWatch.start("50");
        fibTrials.allFibWithMem(50);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 50, stopWatch.getTotalTimeMillis()));

        stopWatch.start("75");
        fibTrials.allFibWithMem(75);
        stopWatch.stop();
        System.out.println(String.format("Job [%d] - Time [%d]", 75, stopWatch.getTotalTimeMillis()));
    }

}