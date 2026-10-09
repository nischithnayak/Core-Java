import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter value: ");
        int number=sc.nextInt();
        int index=-1;
        for(int i=0;i< arr.length;i++){
            if(number==arr[i]){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("Number found at Index: "+index);
        }else{
            System.out.println("Number not Found ");
        }
    }
}
