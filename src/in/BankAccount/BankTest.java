package in.BankAccount;

public class BankTest {
    public static void main(String[] args) {
        Bank hdfc = new Bank("Test Test" ,  0000001 , 100.00D);


        hdfc.deposit(100.00D);
        System.out.println(hdfc.getBalance());

        hdfc.withdraw(120.00);

        System.out.println(hdfc.getBalance());


    }
}
