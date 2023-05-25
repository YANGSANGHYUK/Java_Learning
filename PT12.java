package ex02;

import java.util.Scanner;

public class PT12 {
    public static void main(String[] args) {
        // 1mile = 1.609km
        Scanner sc = new Scanner(System.in);
        System.out.println("마일을 입력하시오");
        int mile = sc.nextInt();
        double km = (mile * 1.609);
        double roundedkm = Math.round(km*100.0) /100.0;
        System.out.println(mile+"마일은 "+roundedkm+"킬로미터입니다.");
        
        sc.close();
    }
    
}
