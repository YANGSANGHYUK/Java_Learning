package ex05.ch05;

interface AnimalSound {
    public abstract void sound();

}

class Animal implements AnimalSound {

    @Override
    public void sound() {
        dog();
        cat();
        monkey();
    }

    private void dog() {
        System.out.println("멍멍");
    }

    private void cat() {
        System.out.println("야옹");
    }

    private void monkey() {
        System.out.println("우끼끼");
    }

}

public class InterPt01 {
    public static void main(String[] args) {
        AnimalSound animalSound = new Animal();
        animalSound.sound();

    }

}
