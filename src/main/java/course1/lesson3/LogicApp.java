package course1.lesson3;

public class LogicApp {

    public static void main(String[] args) {
        int a = 0, b = 2;
        if (isPositive(a) && isPositive(b)) {
            System.out.println("Положительное");
        }
        else if (isZero(a)) {
            System.out.println("Ноль");
        }
        }

        public static boolean isPositive(int val) {
            return val > 0;
        }

        public static boolean isZero(int val) {
            return val == 0;
        }
    }
