package p1;

public class TicketSale {
    // PROBLEM 1 - 1000 film tickets sell at 2 windows
    public static void main(String[] args) {
        WindowThread windowThread1 = new WindowThread("Window 1");
        WindowThread windowThread2 = new WindowThread("Window 2");
        windowThread1.start();
        windowThread2.start();
    }
}
