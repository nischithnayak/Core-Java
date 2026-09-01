public class YieldExample {
    public static void main(String[] args) {
        MyThread5 t1=new MyThread5();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
    }
}
class MyThread5 extends Thread{
    @Override
    public void run(){
        Thread.yield();//Child Thread
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
