import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.*;

class Account2 {

    private int cn;
    private int pn;
    private double CB = 0;
    private double SB = 0;

    DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
    DecimalFormat df2 = new DecimalFormat("###,##0.00' Dollar'");

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

    void getCurrentBalance() {
        System.out.println("Balance : "+ df2.format(CB)+ "\n");
    }
    
    void getSavingBalance() {
        System.out.println("Balance : "+ df1.format(SB)+ "\n");
    }

    void withdrawCurrentAmt(double amt) {
        if (CB < amt) {
            System.err.println("Insufficient balance");
        } else {
            CB = CB - amt;
            System.out.println("amount withdrawn successfully");
        }
    }
    
    void withdrawSavingAmt(double amt) {
        if (SB < amt) {
            System.err.println("Insufficient balance");
        } else {
            SB = SB - amt;
            System.out.println("amount withdrawn successfully");
        }
    }

    void depositCurrentAmt(double amt) {
        CB = CB + amt;
        System.out.println("amount deposited successfully");
    }
    
    void depositSavingAmt(double amt) {
        SB = SB + amt;
        System.out.println("amount deposited successfully");
    }

}

class OptionMenu extends Account2 {
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
                getSavingAccount();
                break;
            case 2:
                getCurrentAccount();
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

    void getSavingAccount() {
        
        int ch;
        do {
        	System.out.println("\nSaving Account");
            System.out.println("\nSelect Operation");
            System.out.println("1.Balance Enquiry\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
            System.out.print("Choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    getSavingBalance();
                    getAccountType();
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn");
                    double wamt = sc.nextDouble();
                    withdrawSavingAmt(wamt);
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited");
                    double damt = sc.nextDouble();
                    depositSavingAmt(damt);
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

    void getCurrentAccount() {
        
        int ch;
        do {
        	System.out.println("\nCurent Account");
            System.out.println("\nSelect Operation");
            System.out.println("1.Balance Enquiry\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
            System.out.print("Choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    getCurrentBalance();
                    getAccountType();
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn");
                    double wamt = sc.nextDouble();
                    withdrawCurrentAmt(wamt);
                    System.out.println("amount withdrawn successfully");
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited");
                    double damt = sc.nextDouble();
                    depositCurrentAmt(damt);
                    System.out.println("amount deposited successfully");
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

public class ATM2{
    public static void main(String args[]) {
        OptionMenu op = new OptionMenu();
        op.getAccountType();
    }
}