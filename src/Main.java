//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Customer client1 = new Customer("VG", "BatHouse", "2000-12-10", "12345678900");
        Customer client2 = new Customer("VG2", "Arkham City", "2000-10-12", "12345678900");

        Account account1 = new Account(client1, "09123");
        Account account2 = new Account(client2, "029031");

        account1.deposit(500.0);
        account1.transfer(account2,250.0, account1);

        account1.showHistory();

    }


}
