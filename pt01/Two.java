package pt01;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산을 입력하세요: ");
        char a = sc.next().charAt(0);
        System.out.println("피연산자 2개를 입력하세요: ");
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == '+') {
            System.out.println(b + c);
        } else if (a == '-') {
            System.out.println(b - c);
        } else if (a == '*') {
            System.out.println(b * c);
        } else if (a == '/') {
            System.out.println(b / c);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        sc.close();
    }

}
