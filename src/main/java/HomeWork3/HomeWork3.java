package HomeWork3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {
        array0and1();
        System.out.println(arrayVoid(10, 1));


        int[] e6 = new int[10];
        int max = e6[0];
        int min = e6[0];
        for (int i = 0; i < e6.length; i++) {
            e6[i] = new Random().nextInt(15);
            if (min > e6[i]) {
                min = e6[i];
            }
            if (max < e6[i]) {
                max = e6[i];
            }
        }
        System.out.print("Максимальный элемент: " + max + "  Минимальный элемент: " + min);

    }

    public static void array0and1() {
        int[] e1 = new int[10];
        for (int i = 0; i < e1.length; i++) {
            e1[i] = i % 2;
            if (e1[i] == 0) {
                e1[i] = 1;
            } else {
                e1[i] = 0;
            }


        }

        System.out.println(Arrays.toString(e1));
        int a = 1;
        int[] e2 = new int[100];
        for (int j = 0; j < e2.length; j++) {
            e2[j] = a;
            System.out.print(e2[j] + " ");
            a++;

        }
        System.out.println();

        int[] e3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < e3.length; i++) {
            if (e3[i] < 6) {
                e3[i] = e3[i] * 2;
            }

            System.out.print(e3[i] + " ");

        }
        System.out.println();

        int[][] e4 = new int[6][7];
        e4[0][0] = 1;
        e4[0][5] = 1;
        e4[1][1] = 1;
        e4[1][4] = 1;
        e4[2][2] = 1;
        e4[2][3] = 1;
        e4[3][3] = 1;
        e4[3][2] = 1;
        e4[4][4] = 1;
        e4[4][1] = 1;
        e4[5][5] = 1;
        e4[5][0] = 1;
        for (int i = 0; i < e4.length; i++) {
            for (int j = 0; j < e4.length; j++) {
                System.out.print(e4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayVoid(int len, int initialValue) {
        int[] e5 = new int[len];
        for (int i = initialValue; i < e5.length; i++) {
            e5[i] = initialValue;
            System.out.print(e5[initialValue] + " ");
        }
        return e5;
    }


}
