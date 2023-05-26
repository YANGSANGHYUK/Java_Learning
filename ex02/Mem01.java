package ex02;

class Hello {
    static int price = 1000;
    String name = "커피";

    void run(){
        int n = 100;
        System.out.println("달린다" + "\n" + n);
    }
}

public class Mem01 {

    static int price = 10000;

    public static void main(String[] args) {
        Hello c = new Hello();
        c.run();
        System.out.println(Mem01.price);
        System.out.println(Hello.price);
        System.out.println(c.name);
    //  System.out.println(c.n);
        
        
        
    }
}