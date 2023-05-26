package ex03;

import java.util.Scanner;

public class Rock {
    final int Rock = 0;
    final int Scissor = 1;
    final int paper = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 낼지 선택하시오.");
        System.out.println("0.주먹");
        System.out.println("1.가위");
        System.out.println("2.보자기");
        int user = sc.nextInt();
        int computer = (int) (Math.random() * 3);
        if (user == computer) {
            System.out.println("당신과 컴퓨터가 비겼습니다.");
        } else if (user == (computer + 1) % 3) {
            System.out.println("당신의 승리 입니다.");
        } else {
            System.out.println("당신의 패배입니다");
        }
        sc.close();

    }

}
