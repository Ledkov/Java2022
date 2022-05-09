package course1.lesson3;

import java.util.Arrays;

public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[2][2] = 100;
        array[4][4] = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(Arrays.toString(array));

        int[][] newArray = new int[5][];

        newArray[0] = new int[]{1, 2, 3};
        newArray[1] = new int[]{1, 2};
        newArray[3] = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }

        int[][] arr24 = {{1, 2},{3, 4}, {5, 6}};
        for (int i = 0; i < arr24.length; i++) {
            System.out.println(Arrays.toString(arr24[i]));
        }
    }
}
