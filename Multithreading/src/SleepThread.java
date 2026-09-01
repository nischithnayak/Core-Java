class MyThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(2000);
                System.out.println("Sleep for 2 seconds");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        t1.start();
        System.out.println("Main Thread...");
    }

}


