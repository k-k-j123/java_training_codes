import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class Account {

    private int cn;
    private int pn;
    private double balance = 0;

    void setCustomerNumber(int cn) {
        this.cn = cn;
    }

    void setPinNumber(int pn) {
        this.pn = pn;
    }

    int getCustomerNumber() {
        return cn;
    }

    int getPinNumber() {
        return pn;
    }

    double getBalance() {
        return balance;
    }

    void withdrawAmt(double amt) {
        if (balance < amt) {
            System.err.println("Insufficient balance");
        } else {
            balance = balance - amt;
        }
    }

    void depositAmt(double amt) {
        balance = balance + amt;
    }

}

class Option extends Account {
    Scanner sc = new Scanner(System.in);

    HashMap<Integer, Integer> data = new HashMap<>();

    void getLogin() {

        data.put(11111, 111);
        data.put(11112, 112);
        data.put(11113, 113);
        data.put(11114, 114);
        data.put(11115, 111);

        do {
            try {
                System.out.println("\nWelcome to the ATM");

                System.out.print("Enter Customer number : ");
                setCustomerNumber(sc.nextInt());

                System.out.print("Enter Pin number : ");
                setPinNumber(sc.nextInt());

                int c = getCustomerNumber();
                int p = getPinNumber();

                if (data.containsKey(c) && data.get(c) == p) {
                    System.out.print("Login successfull\n");
                    getAccountType();
                } else {
                    System.err.println("Login unsuccessfull");
                    System.out.println("Check your id and password");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid Input");
                System.out.println("Please enter a only numbers");
                sc.next();
                getLogin();
            }
        } while (true);

    }

    void getAccountType() {

        System.out.println("\nSelect Account type");
        System.out.println("1.Savings Account\n2.Current Account\n3.Exit");
        System.out.print("Choice:");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
            	System.out.println("\nSaving Account");
                getOperationMenu();
                break;
            case 2:
            	System.out.println("\nCurrent Account");
                getOperationMenu();
                break;
            case 3:
                System.out.println("\nThankyou for VISITING");
                System.out.println("Please visit AGAIN");
                break;
            default:
                System.err.println("\nInvlaid Choice");
                System.out.println("Please enter a valid choice");
                getAccountType();
                break;
        }
    }

    void getOperationMenu() {
        
        int ch;
        do {
            System.out.println("\nSelect Operation");
            System.out.println("1.Balance Enquiry\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
            System.out.print("Choice:");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Balance: " + getBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn");
                    double wamt = sc.nextDouble();
                    withdrawAmt(wamt);
                    getBalance();
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited");
                    double damt = sc.nextDouble();
                    depositAmt(damt);
                    getBalance();
                    break;
                case 4:
                    System.out.println("\nThankyou for VISITING");
                    System.out.println("Please visit AGAIN");
                    break;
                default:
                    System.err.println("\nInvlaid Choice");
                    System.out.println("Please enter a valid choice");
                    break;
            }
        } while (ch!=4);

    }
}

public class ATM {
    public static void main(String args[]) {
        Option op = new Option();
        op.getLogin();
    }
}