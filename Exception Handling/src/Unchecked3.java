public class Unchecked3 {
    public static void main(String[] args) {
        try{
            int arr[]=new int[-5];

        }catch (NegativeArraySizeException e){
            System.out.println("Array size cannot be Negative");
            e.printStackTrace();

        }
    }
}
