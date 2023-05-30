package ex04;

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    } // 메서드의 가장 기본형

    void minus() {
        System.out.println("minus 호출됨");
    };

    void multi() {
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }

    // minus
    // multi
    // divide

}

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        Cal01 c2 = new Cal01();
        c1.add();
        c1.divide();
        c1.minus();
        c1.multi(); // "." = 객체 연결 연산자

        c2.add();
        c2.divide();
        c2.minus();
        c2.multi(); // ".
    }

}
