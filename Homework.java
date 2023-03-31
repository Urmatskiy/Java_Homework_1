import java.util.Arrays;

import javax.security.auth.login.CredentialException;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println();
        System.out.println(isLeapYear(1900));

        System.out.println(Arrays.toString(createArray(4, 17)));

        int[] firstArray = new int[] { 1, 0, 0, 1, 0 };
        System.out.println(Arrays.toString(changeByteArray(firstArray)));

        int[] secondArray = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(changeArray(secondArray)));

        int[][] array = new int[5][5];
        int[][] newArray = createDiagonal(array);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isSumBetween10And20(int a, int b) {
        return (a + b <= 20 && a + b >= 10);
    }

    private static boolean isPositive(int x) {
        return (x > 0);
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        ;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    private static int[] createArray(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }

    private static int[] changeByteArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        return arr;
    }

    private static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    private static int[][] createDiagonal(int[][] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (i == start && j == end) {
                    arr[i][j] = 1;
                    start = start + 1;
                    end = end - 1;
                }
            }
        }
        return arr;
    }
}