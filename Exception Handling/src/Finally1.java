public class Finally1 {
    public static void main(String[] args) {
        try{
            int res=10/0;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("Arithmatic Exception");
        }finally {
            System.out.println("Code Executed");
        }

    }
}
