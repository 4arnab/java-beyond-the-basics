import java.time.LocalDateTime;

// Transaction class
public class Transaction {
    public double amount = 0;
    public int reference;
    public LocalDateTime date;
    public String type;

    public Transaction(double amount, int reference, LocalDateTime date, String type){
        this.amount = amount;
        this.reference = reference;
        this.date = date;
        this.type = type;

    }
}
