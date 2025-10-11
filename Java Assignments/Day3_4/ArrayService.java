
import java.util.Scanner;

public class ArrayService {

    public static void operationsOnArrayElements(int arr1[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----SELECT A NUMBER FOR OPERATION ON YOUR ARRAY----");
        System.out.println("---------------------------------------------------");
        System.out.println("1. FIND ALL PRIME NUMBERS.");
        System.out.println("2. ADDITION OF COMPOSITE NUMBERS.");
        System.out.println("3. ADDITION OF ODD NUMBERS.");
        System.out.println("4. FACTORIAL OF ALL NUMBERS LESS THAN 7.");
        System.out.println("5. FIND Nth MAXIMUM PRIME NUMBER");
        System.out.println("6. FIND Nth MINIMUM PRIME NUMBER");
        System.out.println("7. EXIT.");
        System.out.println("---------------------------------------------------");
        System.out.println();

        int option = sc.nextInt();
        switch (option) {
            case 1:
                // int arrPrime[] = new int[arr1.length];
                int arrPrime = primeNo(arr1);

                // System.out.println(arrPrime[0] + ", " + arrPrime[arr1.length - 1]);
                System.out.print("Your Prime Numbers are : " + arrPrime);
                // Array1D obj1 = new Array1D();
                // obj1.displayArray(arrPrime);
                break;
        }
    }

    public static int primeNo(int arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 2) {
                count++;
            } else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        break;
                    }

                }
                
                count++;

            }

            if (count > 0) {
                return count;
            }
        }

        return -1;

    }
}
