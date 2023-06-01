package pt01;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

}
// this()는 반드시 생성자 안에서만 호출이 가능하다.
// this()는 반드시 첫 번째 문장이어야 한다.
// this()는 다른생성자를 호출할 때만 사용하여야 한다.