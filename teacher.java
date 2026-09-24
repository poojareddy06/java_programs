public class teacher {
    String name;
    int age;
    String patiency;
    public teacher(String n,int a,String p){
        this.name=n;
        this.age=a;
        this.patiency=p;
    }
    void no_of_students(){
        patiency+=7;
        System.out.println(name + " has " + patiency + " students.");
    }
    void teachingskills() {
        patiency += 5;
        System.out.println(name + " has improved teaching skills. Patiency increased to " + patiency);
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Patiency: " + patiency);
    }
    public static void main(String[] args) {
        teacher t1 = new teacher("prajju", 30, "high");
        t1.displayDetails();
        t1.no_of_students();
        t1.teachingskills();
        System.out.println("After activities:");
        t1.displayDetails();
    }
}
