package course1.lesson3.homework3;

public class HomeWork3_3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i] + " ");
        }
    }
}
