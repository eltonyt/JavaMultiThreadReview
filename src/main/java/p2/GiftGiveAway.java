package p2;

// P2 - 100 GIFTS - GIVE AWAY TO 2 PEOPLE. TERMINATE WHEN NUMBER OF GIFTS IS LESS THAN 10.
public class GiftGiveAway {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.setName("John Anderson");
        Thread t2 = new Thread(myRunnable);
        t2.setName("Angle Lee");

        t.start();
        t2.start();
    }
}
