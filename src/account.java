public class account {
    private String numberaccount;
    private double balance;
    private customer customer;

    public account(customer customer, String numberaccount) {
        this.customer = customer;
        this.balance = 0.0;
        this.numberaccount = numberaccount;
    }

    public void deposit(double value) {
        if (value > 0 ) {
            balance += value;
            System.out.println("Deposit of R$ " + value + " completed successfully!!");
        }else {
            System.out.println("Invalid value, please enter a positive number.");
        }
    }

    public Boolean withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            System.out.println("Withdrawal of R$ " + value + " completed successfully!!");
            return true;
        }else {
            System.out.println("Insufficient or invalid balance.");
            return false;
        }
    }

    public void displayAccountInformation() {
        System.out.println("Account Number: " + numberaccount);
        System.out.println("Customer: " + customer.getName() + " (CPF: " + customer.getCpf() + ")");
        System.out.println("Born on: " + customer.getBirthDate());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Balance: R$" + balance);
    }

    public double getBalance() {
        return balance;
    }
}
