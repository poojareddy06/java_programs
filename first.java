package oops;

public class first {
    static class animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    static class dog extends animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args) {
        animal myAnimal = new animal();
        dog myDog = new dog();
        myAnimal.sound();
        myDog.sound();
    }
}