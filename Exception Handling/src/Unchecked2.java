import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter Age:");
            int age= sc.nextInt();
            System.out.println("Age: "+age);
        }catch (InputMismatchException e){
            System.out.println("Please enter Integer only");
        }
    }
}
