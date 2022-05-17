package course1.lesson3.homework3;

public class HomeWork3_7 {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 7, 4, 4};
        System.out.println(balanceCheck(arr1));
        }
        public static boolean balanceCheck(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
                for (int j = arr.length - 1; j > i; j--) {
                    sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                break;
            }
            else {
                sumRight = 0;
            }
        }
            return sumLeft == sumRight;
        }
}


