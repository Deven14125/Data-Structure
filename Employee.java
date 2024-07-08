import java.util.*;

class EmployeeDetail {
    int Employee_id;
    String Name;
    String Designation;
    double Salary;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id = ");
        Employee_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name = ");
        Name = sc.nextLine();
        System.out.print("Enter Employee Designation = ");
        Designation = sc.nextLine();
        System.out.print("Enter Employee Salary = ");
        Salary = sc.nextDouble();
        sc.close();
    }

    void printData() {
        System.out.println("Employee Detais");
        System.out.println("Employee Id = " + Employee_id);
        System.out.println("Employee Name = " + Name);
        System.out.println("Employee Designation = " + Designation);
        System.out.println("Employee Salary = " + Salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeDetail e1 = new EmployeeDetail();

        e1.getData();

        e1.printData();

        sc.close();
    }
}

// import java.util.*;
// class BankAccount{
// int accountno;
// String username;
// String email;
// String accounttype;
// double accountbalance;
//
// void getAccountDetails(){
// Scanner sc = new Scanner(System.in);
// accountno= sc.nextInt();
// sc.nextLine();
// username=sc.nextLine();
// email=sc.nextLine();
// accounttype=sc.nextLine();
// accountbalance=sc.nextDouble();
//
// }
//
// void displayAccountDetails(){
// System.out.println("Account no ="+accountno);
// System.out.println("User name ="+username);
// System.out.println("Email ="+email);
// System.out.println("Account type ="+accounttype);
// System.out.println("Account balance ="+accountbalance);
//
// }
// }
//
// public class lab5_4 {
//
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// BankAccount b1 = new BankAccount();
// b1.getAccountDetails();
// b1.displayAccountDetails();
//
// }
// }
//
//