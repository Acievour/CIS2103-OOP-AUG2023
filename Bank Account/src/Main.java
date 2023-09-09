
public class Main {
    public static void main(String[] args) {

        Account A1 = new Account();
        A1.setAccount_balance(50000);
        A1.setAccount_number(36);
        A1.setCustomer_name("John Doe");
        A1.setEmail("john_doe@email.com");
        A1.setPhone_number(1234);

        System.out.println(A1.toString());

        A1.deposit(15000);
        System.out.println(A1.toString());

        A1.withdraw(350);
        System.out.println(A1.toString());

        A1.withdraw(6990);
        System.out.println(A1.toString());


    }
}