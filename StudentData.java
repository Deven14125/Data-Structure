import java.util.*;

class StudentDetail {
    int Enrollment_no;
    String Name;
    int Semester;
    double Cpi;
}

class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetail[] stu = new StudentDetail[5];

        for (int i = 0; i < 5; i++) {
            stu[i] = new StudentDetail();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter Enrollment No = ");
            stu[i].Enrollment_no = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name = ");
            stu[i].Name = sc.nextLine();
            System.out.print("Enter Semester = ");
            stu[i].Semester = sc.nextInt();
            System.out.print("Enter Cpi = ");
            stu[i].Cpi = sc.nextDouble();
        }

        System.out.println("Student Information ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student Enrollment No = " + stu[i].Enrollment_no);
            System.out.println("Student Name = " + stu[i].Name);
            System.out.println("Student Semester = " + stu[i].Semester);
            System.out.println("Student CPI = " + stu[i].Cpi);
        }

        sc.close();
    }
}