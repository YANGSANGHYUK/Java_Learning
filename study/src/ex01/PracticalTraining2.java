package ex01;

public class PracticalTraining2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println(s1 + s2);

        int age = 20;
        System.out.println("내년이면 "+ age + "살");
//--------------------------------문자열----------------------------------------
     double sum = 1.3 + 12; //12.0으로 자동변환
     System.out.println(sum);

     int x = 3;
     double y = (double) x;  //int형 변수 x가 가지고 있는 값을 double로 강제변환
     System.out.println(x+y);
     
     //i = (int) 12.5; : i에는 12만 저장

     int i;
     double f;

     f = 1/5;
     System.out.println(f);  //피연산자가 정수타입이기 때문에 실행결과가 0

     f = (double) 1/5;
     System.out.println(f);  
     //형변환 연산자가 우선순위가 높기에 정수 1이 부동소수점수 1.0으로 변환, 1.0/5 는 피연산자중 하나가 double 형이기에 5도 double 형으로 자동변환 후 계산

     i = (int) 1.7 + (int) 1.8;
     System.out.println(i);
     
    }
    
}
