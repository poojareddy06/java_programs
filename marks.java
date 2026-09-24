import java.util.Scanner;
public class marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");

        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("5 star");
        } 
        else if (marks >= 80 && marks < 90) {
            System.out.println("4 star");
        } 
        else if (marks >= 70 && marks < 80) {
            System.out.println("3 star");
        } 
        else if (marks >= 60 && marks < 70) {
            System.out.println("2 star");
        } 
        else if (marks >= 50 && marks < 60) {
            System.out.println("1 star");
        } 
        else if(marks>100){
            System.out.println("Invalid marks");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}