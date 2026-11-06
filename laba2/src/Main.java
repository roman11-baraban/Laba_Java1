import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Выберите задание: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.print("Введите размер массива: ");
                int n = scanner.nextInt();

                while (n <= 0) {
                    System.out.print("Введите размер массива > 0: ");
                    n = scanner.nextInt();
                }

                int[] nums = new int[n];
                System.out.println("Заполните элементы массива: ");

                for (int i = 0; i < nums.length; i++) {
                    //nums[i] = scanner.nextInt();
                    nums[i] = random.nextInt(-10, 10);
                    System.out.println(nums[i]);
                }

                int sum1 = 0;

                for (int i = 0; i < nums.length; i++) {
                    sum1 += nums[i];
                }
                System.out.println("Сумма всех элементов массива: " + sum1);
                break;

            case 2:
                System.out.print("Введите размер матрицы: ");
                int m = scanner.nextInt();

                while (m <= 0) {
                    System.out.print("Введите размер матрицы > 0: ");
                    m = scanner.nextInt();
                }

                int[][] arr2 = new int[m][m];
                System.out.println("Заполните элементы матрицы: ");

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        arr2[i][j] = scanner.nextInt();
                    }
                }

                int secDiag = 0;

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        if (i + j == m - 1)
                            secDiag += arr2[i][j];
                    }
                }

                System.out.println("Сумма элементов побочной диагонали: " + secDiag);
                break;
        }
    }
}