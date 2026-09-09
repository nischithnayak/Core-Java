package Problem;

public class InterThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Main thread calling wait()...");
        synchronized (t1) {
            t1.wait();
        }
        System.out.println("Main Thread got Notification...");
    }
}
class MyThread extends Thread {
    public void run() {
        synchronized (this) {
            System.out.println("Child thread start calculation");
            try {
                // simulate some work
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Calculating step " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Child thread finished, notifying main thread");
            this.notify();
        }
    }
}
