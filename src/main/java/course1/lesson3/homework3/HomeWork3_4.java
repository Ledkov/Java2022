package course1.lesson3.homework3;

public class HomeWork3_4 {
    public static void main(String[] args) {
        int[][] arr2D = new int[4][4];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j || i + j == 3) {
                    arr2D[i][j] = 1;
                }
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}

