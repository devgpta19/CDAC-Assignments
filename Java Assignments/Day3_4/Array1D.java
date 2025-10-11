
import java.util.*;

public class Array1D {

    public static int[] getElements(int n) {

        Scanner sc = new Scanner(System.in);

        //Enter elements from user
        int arr[] = new int[n];
        System.out.println("Enter an Array of Numbers");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " Element of Array : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Get the length of the Array
        System.out.print("Length of the Array : ");
        int n = sc.nextInt();

        int arr1[] = new int[n];

        // Get the Elements from getElements(int) function
        arr1 = Array1D.getElements(n);

        //Display Elements of Array
        displayArray(arr1);

        ArrayService obj = new ArrayService();
        obj.operationsOnArrayElements(arr1);

    }
}
