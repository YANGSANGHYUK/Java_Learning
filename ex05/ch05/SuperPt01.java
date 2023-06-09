package ex05.ch05;

public class SuperPt01 {
    static void getOld(Animal02 u1) {
        u1.age = u1.age + 1;
        System.out.println(u1.name + "가 나이를 1살 더 먹었습니다.");
        System.out.println(u1.name + "의 나이: " + u1.age);
    }

    public static void main(String[] args) {
        Animal02 d = new Dog("뽀삐", 3);
        Animal02 c = new Cat("치즈", 4);
        Animal02 m = new Monkey("숭이", 7);

        getOld(d);
        getOld(c);
        getOld(m);
    }
}
