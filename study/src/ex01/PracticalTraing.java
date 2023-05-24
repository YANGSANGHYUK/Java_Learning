package ex01;

public class PracticalTraing {
    public static void main(String[] args) {
        char ch1 = '가';
        char ch2 = '\uac00';
        char ch3 = 'a';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
//-------------------------------------문자형--------------------------------------------------
        int x = 123_456;
        System.out.println(x);

       final double LIGHT_SPEED = 3e5;
       System.out.println(LIGHT_SPEED); 

     //  float temperature = 12.3;  : 12.3은 double형이므로 오류
     float temperature = 12.3f;
     System.out.println(temperature);
//-----------------------------------------------리터럴-----------------------------------------
     boolean flag = true;
     boolean b = 1 < 2;
     System.out.println(flag);
     System.out.println(b);
//--------------------------------------논리형 리터럴--------------------------------------
     int age = 22;
     String name = "Kim";
     System.out.println(age +" "+ name);

     var age2 = 22;
     var name2 = "kim";
     //var 키워드는 변수의 타입을 초기값으로부터 자동적으로 추론할때 사용
     System.out.println(age2 + name2);

     var id = 0; //충분한 정보가 없어 정수형으로 가정
    // var sum; : 변수 sum의 타입을 추측할 정보가 부족하여 오류 발생.
    System.out.println(id);
//----------------------------------------------변수타입 추론 기능------------------------------------
    
    }
    
}
