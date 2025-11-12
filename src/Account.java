import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountName = "";
    private double balance = 0;

    public List<Transaction> transactions = new ArrayList<>();

    public Account(String accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void getAccountProfile (){
        System.out.printf("Your account name is %s, your number is %s", this.accountName, this.accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    public String deposit (double amount, String type){
        if(amount <= 0 ){
            System.out.println("You cannot deposit 0 or less than 0");
            return "failed to deposit";
        }

        this.balance += amount;
        LocalDateTime localDateTime =  LocalDateTime.now();
        Transaction transaction = new Transaction(amount, transactions.toArray().length + 1,localDateTime, type);
        transactions.add(transaction);
        return "deposit success";
    }

    public  String withdraw (double amount, String type){
        if(amount <= 0 ){
            System.out.println("You cannot withdraw 0 or less than 0");
            return "withdraw to deposit";
        }

        this.balance -= amount;
        LocalDateTime localDateTime =  LocalDateTime.now();
        Transaction transaction = new Transaction(amount, transactions.toArray().length + 1,localDateTime, type);
        transactions.add(transaction);
        return "";
    }

}
