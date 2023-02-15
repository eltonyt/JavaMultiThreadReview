package p3;

public class FindOddNumber {
    // FIND ODD NUMBERS THAT ARE FROM 0 - 100 THROUGH 2 THREADS
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.setName("Thread 1");
        Thread t2 = new Thread(myRunnable);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myRunnable.getOddNums());
    }
}
