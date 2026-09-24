package abstraction;
abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        animal myDog = new dog();
        myDog.sound();
    }
}
