package ex03;

import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 몇 단을 출력할 것인지 입력하시오.");
        int a = sc.nextInt();

        System.out.println(a + "단");
        for (int i = 1; i <= 9; i++) {
            int result = a * i;
            System.out.println(a + "x" + i + "=" + result);
        }
        sc.close();

    }
}