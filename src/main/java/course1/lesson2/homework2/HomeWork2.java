package course1.lesson2.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        printWordTimes("дождь",5);
        isPositiveOrNegative(3);
        System.out.println(leapYear(2000));
    }

    public static boolean within10and20(int x1, int x2) {
return  x1 + x2 >= 10 && x1 + x2 <= 20;
        }

        public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
        }

        public static boolean isNegative(int x) {
        return x < 0;
        }

        public static void printWordTimes(String word, int times) {
        for (int x = 0; x < times; x++) {
            System.out.println(word);
        }
        }

        public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 > 0 || year % 400 == 0;
        }
    }

