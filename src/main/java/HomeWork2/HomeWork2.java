package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(witch10and20(14, 8));
        isPositivOrNegative(0);
        System.out.println(isNegative(-1));
        printGeekbrainsNTimes("GeekBrains", 6);
        leapYear(2020);

    }


    public static boolean witch10and20(int x1, int x2) {
        int summ = x1 + x2;
        if (summ < 10 || summ > 20) {
            return false;
        } else {
            return true;
        }
    }

    public static void isPositivOrNegative(int x) {
        if (x < 0) {
            System.out.println(x + " - ќтрицательное число");
        } else {
            System.out.println(x + " - ѕоложительное число");
        }
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printGeekbrainsNTimes(String Geekbrains, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(Geekbrains);
        }
    }

    public static void leapYear(int x) {
        if (x % 4 == 0) {
            System.out.println(x + "год вискосный");
        } else {
            System.out.println(x + "год невискосный");
        }

    }
}

