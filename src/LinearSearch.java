import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int[] arr = new int[5];
        System.out.println("Enter 5 elements");
        for (int i = 0; i < 5; i++)
            arr[i]=in.nextInt();
        System.out.println("Enter the searching element");
        int sn=in.nextInt();
        int index =search(arr,sn);
        if(index != -1)
            System.out.println("element found at index "+index);
        else
            System.out.println("element not found");

    }
    static int search(int arr[], int sn){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sn){
                return i;
            }
        }
        return -1;
    }
}
