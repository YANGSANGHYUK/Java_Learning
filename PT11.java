package ex02;

import java.util.Scanner;

public class PT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("오렌지의 개수를 입력하시오: ");
        int orange = sc.nextInt();
        System.out.println(orange/10+"박스가 필요하고 "+orange%10+"개가 남습니다.");

    sc.close();    
    }
    
    
}
