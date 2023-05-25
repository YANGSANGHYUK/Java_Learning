package ex02;

public class PT9 {
    public static void main(String[] args) {
        int x = 0b0001101; // 13
        int y = 0b0001010; // 10
        System.out.print("x&y=" + (x & y) + "    ");
        // AND 연산을 수행하면 해당 비트 위치에서 두 개의 비트가 모두 1일 때만 결과 값의 해당 비트가 1이 되고, 그 외에는 0이 된다.
        System.out.print("x|y=" + (x | y) + "    ");
        // OR 연산을 수행하면 해당 비트 위치에서 하나의 비트라도 1인 경우 결과 값의 해당 비트는 1이 된다.
        System.out.print("x^y=" + (x ^ y) + "     ");
        // XOR 연산은 두 개의 비트가 다를 때 1을 반환하고, 같을 때는 0을 반환
        System.out.println("~x=" + (~x) + "    ");
        // NOT 연산은 각 비트를 반전시킨다.
        System.out.print("x>>1=" + (x >> 1) + "    ");
        //이 연산자는 오른쪽으로 비트를 지정된 수만큼 시프트하며, 왼쪽에는 부호 비트를 유지
        System.out.print("x<<1=" + (x << 1) + "    ");
        //이 연산자는 왼쪽으로 비트를 지정된 수만큼 시프트하며, 오른쪽에는 0을 추가
        System.out.println("x>>>1=" + (x >>> 1) + "   ");
        //이 연산자는 오른쪽으로 비트를 지정된 수만큼 시프트하며,왼쪽 비트가 0으로 채워진다.

    }

}
