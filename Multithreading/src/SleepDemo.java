class MyThread6 extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=5;i++ ){
            System.out.println("Thread running: "+i);
            try{
                Thread.sleep(1000);
                System.out.println("Sleep for one Second");
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
public class SleepDemo {
    public static void main(String[] args) {
        MyThread6 t1=new MyThread6();
        t1.start();
        System.out.println("Main Thread");
    }
}
