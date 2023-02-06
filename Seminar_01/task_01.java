package Seminar_01;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int num = in.nextInt();
        in.close();
        int triang = 0;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            triang += i;
            fact *= i;
        }
        System.out.printf("%d-e треугольное число равно %d\n", num, triang);
    }
}