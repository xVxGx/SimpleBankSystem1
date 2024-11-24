import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String numberaccount;
    private final Customer customer;
    private double balance;
    private final List<Movement> history = new ArrayList<>();

    public Account(Customer customer, String numberaccount) {
        this.customer = customer;
        this.balance = 0.0;
        this.numberaccount = numberaccount;
    }

    public void deposit(double value) {
        if (value > 0 ) {
            balance += value;
            history.add(new Movement(value, "Deposit"));
        }else {
            System.out.println("Invalid value, please enter a positive number.");
        }
    }

    public boolean withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            history.add(new Movement(value, "Withdraw"));
            return true;
        }else {
            System.out.println("Insufficient or invalid balance.");
        }
        return false;
    }

    public String toString() {
        return "balance: R$" + getBalance() + "\n" +
                "customer: " + customer.getName() + " (CPF: " + customer.getCpf() + ")" + "\n" +
                "Born on: " + customer.getBirthDate() + "\n" +
                "Address: " + customer.getAddress() + "\n";
    }

    public void showHistory() {
        System.out.println("History of transactions");
        for (Movement t : history) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean transfer(Account contaDestino, double value, Account contaOrigem) {
        if (value <= 0) {
            System.out.println("Value is invalid for transference");
            return false;
        }

        if (contaOrigem.getBalance() < value) {
            System.out.println("Insufficient balance");
            return false;
        }

        boolean saqueRealizado = contaOrigem.withdraw(value);
        if (saqueRealizado) {
            contaDestino.deposit(value);
            history.add(new Movement(value, "Transfer"));
            System.out.println("Transfer of U$" + value + "successfully completed!!");
            return true;
        }
        return false;
    }
}
