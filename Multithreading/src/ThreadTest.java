
    public class ThreadTest{
        public static void main(String[] args) {
            MyThread t1=new MyThread();
            MyThread t2=new MyThread();
            t1.start();
            //With Same Reference we cannot create multiple Thread so should take multiple reference
            t2.start();
            for(int i=0;i<5;i++){
                System.out.println("Main Thread: "+i);
            }
        }
    }
