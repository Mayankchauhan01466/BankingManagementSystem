package Banking_Management_System;

public class Transaction {

    private int transactionId;
    private long account_number;
    private String full_name;
    private String type;
    private double amount;

    public Transaction(int transactionId, long account_number, String full_name, String type, double amount) {
        this.transactionId = transactionId;
        this.account_number = account_number;
        this.full_name = full_name;
        this.type = type;
        this.amount = amount;
    }
}


