package in.BankAccount;

public class Bank {
    private String accountHolderName;
    private long accountNumber;
    private double balance;


    Bank () {}

    Bank (String accountHolderName , long accountNumber , double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance () {
       return balance;
    }

    public void deposit (double _amount) {
        this.balance = this.balance + _amount;
    }

    public void withdraw (double _amount) {
        if(this.balance >= _amount) {
            this.balance = this.balance - _amount;
            System.out.println(_amount +  " has been debited from your account & remaining balance is " + this.balance);
        } else {
            System.out.println("Insufficient funds !");
        }
    }



}
