import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /* task 1 and 2 */
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        double[] arr1 = {1.57, 7.654, 9.986};
        long[] longs = new long[]{2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(longs));
        for (int i = 0; i < arr1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr1[i]);
        }
        System.out.println();


        //task 3
        int[] arr2 = {1, 2, 3};
        double[] arr3 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 4
        int[] inst = new int[]{1, 2, 3};

        for (int i = 0; i < inst.length; i++) {
            if (inst[i] % 2 != 0) {
                inst[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(inst[i]);
        }

    }
}