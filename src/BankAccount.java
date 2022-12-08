public class BankAccount {
    private String name ;
    private String cardName ;
    private String  balance ;

    public BankAccount(String name, String cardName, String balance) {
        this.name = name;
        this.cardName = cardName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", cardName='" + cardName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
