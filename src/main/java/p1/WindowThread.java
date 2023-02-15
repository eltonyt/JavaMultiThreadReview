package p1;

public class WindowThread extends Thread{
    private static int ticketLeft = 1000;
    public WindowThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (WindowThread.class) {
                if (ticketLeft == 0)
                    break;
                else {
                    String currentThread = getName();
                    if (ticketLeft == 1)
                        System.out.println("Selling last ticket from window: " + currentThread + ". ");
                    else
                        System.out.println("Selling ticket " + ticketLeft  + " from window: " + currentThread + ". ");
                    ticketLeft --;
                }
            }
        }
    }
}
