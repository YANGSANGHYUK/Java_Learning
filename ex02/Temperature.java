package ex02;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("온도 변환을 선택하세요");
        System.out.println("1. 섭씨 온도를 화씨 온도로 변환");
        System.out.println("2. 화씨 온도를 섭씨 온도로 변환");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("섭씨 온도를 입력하세요");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) +32;
            double roundedfahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
            System.out.println("화씨 온도는"+ roundedfahrenheit + "도 입니다.");
        }else if (choice == 2) {
            System.out.print("화씨 온도를 입력하세요");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit-32) *5/9;
            double roundedcelsius = Math.round(celsius * 100.0) / 100.0;
            System.out.println("섭씨 온도는"+ roundedcelsius + "도 입니다.");         
        }else {
            System.out.println("잘못된 선택입니다.");
            
        }
        sc.close();

        // C=5/9(f-32)
    }

}
