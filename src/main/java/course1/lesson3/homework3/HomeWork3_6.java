package course1.lesson3.homework3;

public class HomeWork3_6 {
    public static void main(String[] args) {
        int[] arr2 = {30, 101, 42, 105, 44, 120, 50, 5};
        int maxValue = arr2[0];
        int minValue = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (maxValue < arr2[i]) {
                maxValue = arr2[i];
            }
            if (minValue > arr2[i]) {
                minValue = arr2[i];
        System.out.println("Наибольшее = " + maxValue);
        System.out.println("Наименьшее = " + minValue);
    }
        }
    }
}





