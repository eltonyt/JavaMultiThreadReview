package p4;

public class FightForLuckyMoney {
    public static void main(String[] args) {
        LuckyMoneyRunnable luckyMoneyRunnable = new LuckyMoneyRunnable();
        Thread t1 = new Thread(luckyMoneyRunnable);
        t1.setName("Person 1");
        Thread t2 = new Thread(luckyMoneyRunnable);
        t1.setName("Person 2");
        Thread t3 = new Thread(luckyMoneyRunnable);
        t1.setName("Person 3");
        Thread t4 = new Thread(luckyMoneyRunnable);
        t1.setName("Person 4");
        Thread t5 = new Thread(luckyMoneyRunnable);
        t1.setName("Person 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
