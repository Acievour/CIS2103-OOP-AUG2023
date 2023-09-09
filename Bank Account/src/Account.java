public class Account {
    private int account_number;
    private float account_balance;
    private String customer_name;
    private String email;
    private int phone_number;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(float account_balance) {
        this.account_balance = account_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }


    public void deposit(int cash){

            this.account_balance = this.account_balance + cash;

    }

    public void withdraw(int cash) {
        if (this.account_balance - cash > 0) {
            this.account_balance = this.account_balance - cash;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_number=" + account_number +
                ", account_balance=" + account_balance +
                ", customer_name='" + customer_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
