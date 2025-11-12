import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("hello form bank application");

        Account account = new Account("ahmed abdifatah", "633140321");

        account.deposit(125, "Cash");
        account.withdraw(25, "Cash");

        account.deposit(100, "Dollar");
        account.deposit(20, "Dollar");

        for(Transaction transaction : account.transactions){
            System.out.printf("Reference id:%s  Amount:%s   Date:%s Type:  $%s    your balance is:     %s\n", transaction.reference, transaction.amount, transaction.date, transaction.type, account.getBalance());
        }

        System.out.println(account.getBalance());
    }
}
