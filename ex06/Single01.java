package ex06;

class Minion {
    public Minion() {
        System.out.println("미니언이 생성되었습니다");
    }
}

class Baron {
    private static Baron instance = new Baron();

    public static Baron getInstance() {
        return instance;
    }

}

public class Single01 {
    public static void main(String[] args) {

        Minion m1 = new Minion();
        Minion m2 = new Minion();
        Minion m3 = new Minion();

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        Baron b1 = Baron.getInstance();
        Baron b2 = Baron.getInstance();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        if (b1 instanceof Baron) {
            System.out.println("같은 타입 입니다.");

        }

        if (b1 instanceof Object) {
            System.out.println("바론과 오브젝트는 같은 타입입니다.");
        }

    }
}
