public class Flow {
    public static void main(String[] args) {
        try{
            System.out.println("Line 1");
            System.out.println(10/0);
            System.out.println("Line 2");
        }catch (ArithmeticException e){
            System.out.println("Arithmatic exception handled");
        }catch (RuntimeException e){
            System.out.printf("Runtime Exception");
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println("Line 3");
    }
}
