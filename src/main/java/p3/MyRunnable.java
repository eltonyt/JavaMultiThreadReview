package p3;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable{
    private List<Integer> oddNums = new ArrayList<>();
    private static int counter = 0;
    @Override
    public void run() {
        while (true) {
            if (foundAllOdd())
                break;
        }
    }

    private synchronized boolean foundAllOdd() {
        Thread currentThread = Thread.currentThread();
        String threadName = currentThread.getName();
        if (counter == 100)
            return true;
        else {
            System.out.println("Thread: " + threadName + " handling number: " + counter + "...");
            if (counter % 2 == 1)
                oddNums.add(counter);
            counter ++;
        }
        return false;
    }

    public List<Integer> getOddNums() {
        return oddNums;
    }
}
