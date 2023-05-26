package ex03;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int odd = sc.nextInt();
        if (odd % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다.");
        }
        sc.close();
    }

}
