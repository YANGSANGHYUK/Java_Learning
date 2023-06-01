package pt01;

public class FiveTest {
    public static void main(String[] args) {
        Five five = new Five();
        five.setName("Tom");
        five.setBalance(100000);
        System.out.println("이름은 " + five.getName() + " 통장 잔고는 " + five.getBalance() + "입니다.");
    }

}
