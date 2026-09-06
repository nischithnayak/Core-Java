public class JoinExample2 {
    public static void main(String[] args) throws InterruptedException{
        DownloadFile d1=new DownloadFile();
        d1.start();
        Thread.sleep(2000);

        d1.join();
        System.out.println("Open file");

    }
}
class DownloadFile extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Downloading file ....");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

}