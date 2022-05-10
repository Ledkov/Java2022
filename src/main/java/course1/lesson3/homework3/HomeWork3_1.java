package course1.lesson3.homework3;

public class HomeWork3_1 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
