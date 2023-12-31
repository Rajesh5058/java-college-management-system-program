import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String Emailid;
    private String dateofbirth;
    private String Phonenumber;

    public Student(int rollNumber, String name, int age, String Emailid, String dateofbirth, String Phonenumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.Emailid = Emailid;
        this.dateofbirth = dateofbirth;
        this.Phonenumber = Phonenumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailid() {
        return Emailid;
    }

    public String getdateofbirth() {
        return dateofbirth;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }
}

class CollegeManagementSystem {
    private ArrayList<Student> students;

    public CollegeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student List:");
            for (Student student : students) {
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email-id:" + student.getEmailid());
                System.out.println("DateOfBirth:" + student.getdateofbirth());
                System.out.println("PhoneNumber:" + student.getPhonenumber());
                System.out.println("--------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void searchStudent(int rollNumber) {
        boolean found = false;
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email-id:" + student.getEmailid());
                System.out.println("DateofBirth:" + student.getdateofbirth());
                System.out.println("PhoneNumber:" + student.getPhonenumber());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
}

public class CollegeManagementSystemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollegeManagementSystem cms = new CollegeManagementSystem();

        while (true) {
            System.out.println("College Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email-id: ");
                    String Emailid = scanner.nextLine();
                    System.out.print("Enter Date of Birth:");
                    String dateofbirth = scanner.nextLine();
                    System.out.print("Enter Phonenumber: ");
                    String Phonenumber = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    Student student = new Student(rollNumber, name, age, Emailid, dateofbirth, Phonenumber);
                    cms.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    cms.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    int searchRollNumber = scanner.nextInt();
                    cms.searchStudent(searchRollNumber);
                    break;

                case 4:
                    System.out.println("Thank you for using the College Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
