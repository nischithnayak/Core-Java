public class Test {
    public static void main(String[] args) {
      try{
            int res=10/0;
      }catch (ArithmeticException e){
          System.out.println("Invalid division");
      }
        System.out.println("Program Executed");
    }
}
