public class Unchecked {
    public static void main(String[] args) {
        try{
            String name="Nischith";
            System.out.println(name.charAt(15));
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Invalid Index");

        }
    }
}
