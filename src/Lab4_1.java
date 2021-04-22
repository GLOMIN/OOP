
// File Name : Lab4_1.java
import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {

        Lab4_1 ob = new Lab4_1();
        ob.inPut();
    }

    public void inPut() {
        Lab4_1 ob = new Lab4_1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Calculate grade.");
        System.out.print("Enter student score : ");
        int score = scan.nextInt();
        ob.calGrade(score);
    }

    public void calGrade(int score) {
        String grade;
        if ((score >= 0) && (score <= 100)) {

            if (score >= 80)
                grade = "A";
            else if (score >= 75)
                grade = "B+";
            else if (score >= 70)
                grade = "B";
            else if (score >= 65)
                grade = "C+";
            else if (score >= 60)
                grade = "C";
            else if (score >= 55)
                grade = "D+";
            else if (score >= 50)
                grade = "D";
            else
                grade = "F";
                
            Lab4_1 ob = new Lab4_1();
            ob.outPut(grade);
        }
    }

    public void outPut(String alphabet) {

        System.out.println("Student gradde is " + alphabet);
        System.out.println("End Program.");
    }
}
