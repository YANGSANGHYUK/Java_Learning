package ex02;

import java.util.Scanner;

public class PT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요.");
        System.out.print("x:");

        int x = sc.nextInt();
        System.out.print("y:");
        int y = sc.nextInt();
        
        int high = Math.max(x, y);
        int low = Math.min(x, y);
        double average = (x+y)/2;


        System.out.println("두 수의 합: " + (x+y));
        System.out.println("두 수의 차: "+ (x-y));
        System.out.println("두 수의 곱: "+(x*y));
        System.out.println("두 수의 평균: "+ average);
        System.out.println("큰 수: "+ high);
        System.out.println("작은 수: "+low);

        sc.close();

    }
}
