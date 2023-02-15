package p2;

public class MyRunnable implements Runnable{

    private static int giftNumber = 100;
    @Override
    public void run() {
        while (true) {
            if (giveAwayGift())
                break;
        }
    }

    private synchronized boolean giveAwayGift() {
        if (giftNumber < 10)
            return true;
        else {
            Thread currentThread = Thread.currentThread();
            try {
                currentThread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String currentPersonName = currentThread.getName();
            System.out.println(currentPersonName + " receiving #" + giftNumber + " gift.");
            giftNumber --;
        }
        return false;
    }
}
