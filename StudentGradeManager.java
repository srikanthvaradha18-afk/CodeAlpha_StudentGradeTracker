import java.util.ArrayList;
import java.util.Scanner;
class Student {
    String name;
    double grade;
    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}
public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(name, grade));
        }
        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;
        String topStudent = students.get(0).name;
        String lowStudent = students.get(0).name;
        for (Student s : students) {
            total += s.grade;
            if (s.grade > highest) {
                highest = s.grade;
                topStudent = s.name;
            }
            if (s.grade < lowest) {
                lowest = s.grade;
                lowStudent = s.name;
            }
        }
        double average = total / students.size();
        System.out.println("\n================================");
        System.out.println("      STUDENT SUMMARY REPORT");
        System.out.println("================================");
        System.out.printf("%-15s %-10s%n", "Name", "Grade");
        System.out.println("------------------------------");
        for (Student s : students) {
            System.out.printf("%-15s %-10.2f%n", s.name, s.grade);
        }
        System.out.println("------------------------------");
        System.out.printf("Average Score : %.2f%n", average);
        System.out.printf("Highest Score : %.2f (%s)%n", highest, topStudent);
        System.out.printf("Lowest Score  : %.2f (%s)%n", lowest, lowStudent);
        sc.close();
    }
}