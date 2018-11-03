import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter size array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        for (int i = 0; i< array1.length; i++){
            System.out.println("enter the element " + (i+1) + " : ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("enter size array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        for (int i = 0; i< array2.length; i++){
            System.out.println("enter the element " + (i+1) + " : ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];
        for (int i = 0; i<array1.length;i++){
            array3[i] = array1[i];
        }

        for (int i = array1.length; i<array3.length;i++){
            array3[i] = array2[i-array2.length + 1];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

    }
}
