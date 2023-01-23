import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number of customers do you want to input? ");
        int n = scanner.nextInt();
        BankingProgram bankAccount[] = new BankingProgram[n];
        for(int i = 0; i < bankAccount.length; i++) {
           bankAccount[i] = new BankingProgram();
           bankAccount[i].openAccount();
        }
        int count;
        do {
            System.out.println(" ----------- \n Banking System Application ");
            System.out.println("\"1. Display all account details \\n 2. Search by Account number\\n 3. Deposit the amount \\n 4. Withdraw the amount \\n 5.Exit \" ");
            System.out.println("Enter Your Choice: ");
            count = scanner.nextInt();
            switch (count) {
                case 1:
                    for (int i = 0; i < bankAccount.length; i++) {
                        bankAccount[i].displayAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter The Account NUmber To Search: ");
                    String s = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < bankAccount.length;i++) {
                        found = bankAccount[i].findIt(s);
                        if(found) {
                            break;
                        }
                    }if (!found) {
                    System.out.println("Search failed! Account does not exist!!");
                }
                case 3:
                    System.out.println("Enter The Account Number: ");
                    s = scanner.next();
                    found = false;
                    for (int i = 0; i < bankAccount.length; i++) {
                        found = bankAccount[i].findIt(s);
                        if (found) {
                            bankAccount[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account does not exist!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    s = scanner.next();
                    found = false;
                    for (int i = 0; i < bankAccount.length; i++) {
                        found = bankAccount[i].findIt(s);
                        if (found) {
                            bankAccount[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for your time..");
                    break;

            }
        } while (count !=5);


    }
}