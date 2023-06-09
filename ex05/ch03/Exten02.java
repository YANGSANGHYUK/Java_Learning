package ex05.ch03;

class 동물 {
    String print() {
        return "";
    }
}

class 사자 extends 동물 {
    String name = "사자";
}

class 호랑이 extends 동물 {
}

public class Exten02 {
    public static void main(String[] args) {
        동물 d1 = new 동물();
    }

}
