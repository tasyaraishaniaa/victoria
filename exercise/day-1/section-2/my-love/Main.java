public class Main {
    public static void main(String[] args) {
        BankAccount account =  new BankAccount("2150174760");
        account.setAccountHolder("Tasya");
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Current balance: " + account.getBalance());
    }
}
