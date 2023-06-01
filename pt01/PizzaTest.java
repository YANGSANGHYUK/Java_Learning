package pt01;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println("(" + pizza.type + ", " + pizza.size + ")");

        Pizza pizza2 = new Pizza(24, "포테이토");

        System.out.println("(" + pizza2.type + ", " + pizza2.size + ")");
    }

}
