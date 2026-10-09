public class PrintEvenOdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Index: " + arr[i]);
            } else {
                System.out.println("Odd Index: " + arr[i]);
            }
        }
    }
}