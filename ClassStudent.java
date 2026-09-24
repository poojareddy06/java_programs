public class ClassStudent {
    String name;
    int age;
    String mood;
    int energy;
    float attendance;
    public ClassStudent(String name, int age, String mood, int energy, float attendance){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.attendance = attendance;
    }
    void sleep(){
        energy += 10;
        mood = "happy";
        System.out.println(name + " is sleeping. Energy increased to " + energy + ". Mood is now " + mood);
    }
    void study(){
        energy -= 5;
        mood = "tired";
        System.out.println(name + " is studying. Energy decreased to " + energy + ". Mood is now " + mood);
    }
    void skipClass(){
        attendance -= 0.1;
        mood = "guilty";
        System.out.println(name + " skipped class. Attendance decreased to " + attendance + ". Mood is now " + mood);
    }
    void takeExam(){
        if(attendance >= 0.75){
            System.out.println(name + " is taking the exam.");
        } else {
            System.out.println(name + " cannot take the exam due to low attendance.");
        }
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mood: " + mood);
        System.out.println("Energy: " + energy);
        System.out.println("Attendance: " + attendance);
    }
    public static void main(String[] args) {
        ClassStudent student= new ClassStudent("POOJA",20,"happy",75,82);
        student.displayDetails();
        student.study();
        student.sleep();
        student.skipClass();
        student.takeExam();
        System.out.println("After activities:");
        student.displayDetails();
    }
}
