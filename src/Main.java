//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        customer client1 = new customer("VG", "BatHouse", "2000-12-10", "12345678900");


        account account1 = new account(client1, "09123");


        account1.deposit(100.0);

        account1.withdraw(50.0);

        account1.displayAccountInformation();




    }


}
