import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("How Many Students To Enter: ");
        int numStudent = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numStudent];

        for (int i = 0; i < numStudent; i++) {
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student " + (i + 1) + " Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, grade);
        }
        BubbleSort(students);

        System.out.println("\nSorted Students (Ascending by Grade): ");
        for (Student student : students) {
            System.out.println(student);
        }
        sc.close();
    }
    public static void BubbleSort(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].grade > students[j + 1].grade) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}