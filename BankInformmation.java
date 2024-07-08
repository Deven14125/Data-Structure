import java.util.*;

class BankAccount {
    int Account_Number;
    double Balance;
    String Account_Holder_Name;

    void depositMoney(int Deposit) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Much Money You Want To Deposit = ");
        Deposit = sc.nextInt();
        Balance = Balance + Deposit;
        sc.close();
    }

    void withdrawMoney(int Withdraw) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Much Money You Want To Withdraw = ");
        Withdraw = sc.nextInt();
        Balance = Balance - Withdraw;
        sc.close();
    }

    void checkBalance(int Balance) {
        System.out.print("Balance = " + Balance);
    }
}

public class BankInformmation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] b1 = new BankAccount[2];
        for (int i = 0; i < 2; i++) {
            b1[i] = new BankAccount();
            System.out.println("Enter Detail Of Account " + (i + 1) + " : ");
            System.out.print("Enter Account Number = ");
            b1[i].Account_Number = sc.nextInt();
            System.out.print("Enter How Many Balance In Account = ");
            b1[i].Balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Account Holder Name = ");
            b1[i].Account_Holder_Name = sc.nextLine();
        }
        System.out.println("Details Of Account Holders");
        for (int i = 0; i < 2; i++) {
            System.out.println("Details Of Account " + (i + 1) + " : ");
            System.out.println("Account Number = " + b1[i].Account_Number);
            System.out.println("Balance = " + b1[i].Balance);
            System.out.println("Account Holder Name = " + b1[i].Account_Holder_Name);
        }
        for (int i = 0; i < 2; i++) {
            b1[i].depositMoney(i);
            b1[i].withdrawMoney(i);
            b1[i].checkBalance(i);
        }
        sc.close();
    }
}