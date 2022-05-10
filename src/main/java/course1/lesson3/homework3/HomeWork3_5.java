package course1.lesson3.homework3;

import java.util.Arrays;

public class HomeWork3_5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArr(3,3)));
    }
    public static int[] createArr(int len, int initialValue) {
        int[] Arr = new int[len];
        for (int i = 0; i < Arr.length; i++ ) {
            Arr[i] = initialValue;
        }
        return Arr;
    }
}
