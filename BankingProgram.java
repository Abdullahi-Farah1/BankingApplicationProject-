import java.util.Scanner;
public class BankingProgram {
    String account;
    String name;
    String accountType;
    long balance;
    Scanner scanner = new Scanner(System.in);
    public void openAccount() {
        System.out.println("Enter The Account Number:");
        account = scanner.next();
        System.out.println("Enter Account Type: ");
        accountType = scanner.next();
        System.out.println("Enter The Name: ");
        name = scanner.next();
        System.out.println("Enter The Balance: ");

        balance = scanner.nextLong();

    }
    public void displayAccount() {
        System.out.println("Account Number: " + account);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: " + balance);


    }
    public void withdrawal() {
        long atm;
        System.out.println("Enter Withdrawal Amount: ");
        atm = scanner.nextLong();
        if(atm <= balance) {
            balance = balance - atm;
            System.out.println("Balance After Withdrawal: " + balance);
        } else {
            System.out.println("Can't Withdraw Because Balance isn't Sufficient");
        }

    }
    public void deposit() {
        long atm;
        System.out.println("Enter Amount To Be Deposited: ");
        atm = scanner.nextLong();
        balance = atm + balance;


    }
    public boolean findIt(String s) {
        if (account.equals(s)) {
            displayAccount();
            return true;

        } else { return false;

        }

    }

}

