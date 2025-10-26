import java.util.*;

class Bank {
    long[] acc;

    public Bank(long[] balance) {
        acc = new long[balance.length];
        for (int i = 0; i < balance.length; i++) {
            acc[i] = balance[i];
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > acc.length || account2 > acc.length || acc[account1 - 1] < money)
            return false;
        acc[account1 - 1] -= money;
        acc[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account > acc.length)
            return false;
        acc[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account > acc.length || acc[account - 1] < money)
            return false;
        acc[account - 1] -= money;
        return true;
    }

    public void printBalances() {
        System.out.println("Current account balances:");
        for (int i = 0; i < acc.length; i++) {
            System.out.println("Account " + (i + 1) + ": " + acc[i]);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        long[] balances = new long[n];

        System.out.println("Enter initial balances:");
        for (int i = 0; i < n; i++) {
            System.out.print("Account " + (i + 1) + ": ");
            balances[i] = sc.nextLong();
        }

        Bank bank = new Bank(balances);

        while (true) {
            System.out.println("\nChoose operation: 1.Transfer 2.Deposit 3.Withdraw 4.Show Balances 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("From account: ");
                    int from = sc.nextInt();
                    System.out.print("To account: ");
                    int to = sc.nextInt();
                    System.out.print("Amount: ");
                    long amt = sc.nextLong();
                    System.out.println(bank.transfer(from, to, amt) ? "Transfer successful" : "Transfer failed");
                    break;
                case 2:
                    System.out.print("Account: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Amount: ");
                    long depAmt = sc.nextLong();
                    System.out.println(bank.deposit(depAcc, depAmt) ? "Deposit successful" : "Deposit failed");
                    break;
                case 3:
                    System.out.print("Account: ");
                    int withAcc = sc.nextInt();
                    System.out.print("Amount: ");
                    long withAmt = sc.nextLong();
                    System.out.println(bank.withdraw(withAcc, withAmt) ? "Withdrawal successful" : "Withdrawal failed");
                    break;
                case 4:
                    bank.printBalances();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
