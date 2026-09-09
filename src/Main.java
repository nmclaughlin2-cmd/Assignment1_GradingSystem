import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        int studentScore = scnr.nextInt();


        if (studentScore > 100 || studentScore < 0) {
            System.out.println("Invalid score");
        }
        else if (studentScore >= 90) {
            System.out.println("Grade: A");
        }
        else if (studentScore >= 80) {
            System.out.println("Grade: B");
        }
        else if (studentScore >= 70) {
            System.out.println("Grade: C");
        }
        else if (studentScore >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}
