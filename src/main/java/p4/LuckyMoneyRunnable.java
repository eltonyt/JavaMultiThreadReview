package p4;

import java.util.Random;

public class LuckyMoneyRunnable implements Runnable{
    int count = 0;
    int total = 100;
    private static Random randomNum = new Random();
    @Override
    public void run() {
        synchronized (LuckyMoneyRunnable.class) {
            Thread t = Thread.currentThread();
            String pName = t.getName();
            if (count == 3)
                System.out.println(pName + " failed to get any luck money");
            else {
                int moneyReceived = randomNum.nextInt((int) total);
                if (count == 2)
                    moneyReceived = total;
                System.out.println(pName + " grabbed $" + moneyReceived + ".");
                total -= moneyReceived;
                count ++;
            }
        }
    }
}
