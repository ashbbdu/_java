public class Bank {
    String bankName;
    String accountHolder;
    String accountBalance;
    String address;
    String city;
    String state;

    public Bank(String bankName, String accountHolder, String accountBalance, String address, String city, String state) {
        this.bankName = bankName;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bank person1 = new Bank("SBI" , "Ashish Srivastava" , "1000000000000000" , "Gomti Nagar" , "Lucknow" , "UP");
        System.out.println(person1.toString());

        double age = 10.00;
        System.out.println(String.format("%s hi my age is: %d", "Ashish", age));
    }
}
