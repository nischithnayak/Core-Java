public class CopyArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]=new int[arr1.length];
        System.out.println("Original Array: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            arr2[i]=arr1[i];
        }
        System.out.println();
        System.out.println("Copied Array: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
