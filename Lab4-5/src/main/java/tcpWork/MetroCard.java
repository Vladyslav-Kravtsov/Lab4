package tcpWork;

import java.io.Serializable;

public class MetroCard implements Serializable {
    private String serNum;
    private User usr;
    private String colledge;
    private double balance;

    public MetroCard(String serNum, User usr, String colledge, double balance) {
        this.serNum = serNum;
        this.usr = usr;
        this.colledge = colledge;
        this.balance = balance;
    }
    public MetroCard(){

    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public User getUsr() {
        return usr;
    }

    public void setUsr(User usr) {
        this.usr = usr;
    }

    public String getColledge() {
        return colledge;
    }

    public void setColledge(String colledge) {
        this.colledge = colledge;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addBalance(double balance){
        this.balance += balance;
    }
    public void removeBalance(double balance){
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "MetroCard{" +
                "serNum='" + serNum + '\'' +
                ", usr=" + usr +
                ", colledge='" + colledge + '\'' +
                ", balance=" + balance +
                '}';
    }
}
