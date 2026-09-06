public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Payment p1=new Payment();
        Thread t1=new Thread(p1);
        t1.start();
        System.out.println("Reading more Info... from database");

        t1.join();//This line executed by main thread so main thread will wait for t1
        System.out.println("Notification sent to user");
    }
}
class Payment implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
            System.out.println("Payment is done");
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}