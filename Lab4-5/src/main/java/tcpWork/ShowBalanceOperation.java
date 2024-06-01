package tcpWork;

public class ShowBalanceOperation extends CardOperation {
    private String cardSerialNumber;

    public ShowBalanceOperation(String cardSerialNumber) {
        this.cardSerialNumber = cardSerialNumber;
    }
    private double balance;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardSerialNumber() {
        return cardSerialNumber;
    }

    public void setCardSerialNumber(String cardSerialNumber) {
        this.cardSerialNumber = cardSerialNumber;
    }

}

