package pt01;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.print("Zero");
        } else if (number == 1) {
            System.out.print("One");
        } else if (number == 2) {
            System.out.print("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.print("Four");
        } else if (number == 5) {
            System.out.print("Five");
        } else if (number == 6) {
            System.out.print("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        sc.close();
    }

}
