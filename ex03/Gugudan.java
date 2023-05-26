package ex03;

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int b = 1; b <= 9; b++) {
                int result = i * b;
                System.out.println(i + "x" + b + "=" + result);
            }
        }

    }
}
