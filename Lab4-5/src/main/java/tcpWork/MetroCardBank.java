package tcpWork;

import java.util.ArrayList;

public class MetroCardBank {
    private ArrayList<MetroCard> store;

    public MetroCardBank() {
        this.store = new ArrayList<>();
    }

    public ArrayList<MetroCard> getStore() {
        return store;
    }

    public void setStore(ArrayList<MetroCard> store) {
        this.store = store;
    }
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder("List of MetroCards:");
        for (MetroCard c : store) {
            buf.append("\n\n" + c);
        }
        return buf.toString();
    }
    public int findMetroCard(String serNum) {
        int index = 0;
        for (MetroCard card : store) {
            if (card.getSerNum().equals(serNum)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public int numCards() {
        return store.size();
    }
    public void addCard(MetroCard newCard) {
        store.add(newCard);
    }
    public boolean removeCard(String serNum) {
        for (MetroCard card: store) {
            if(card.getSerNum().equals(serNum)){
                return store.remove(card);
            }
        }
        return false;
    }
    public boolean addMoney(String serNum, double money) {
        for (MetroCard card : store) {
            if (card.getSerNum().equals(serNum)) {
                card.addBalance(money);
                return true;
            }
        }
        return false;
    }
    public boolean getMoney(String serNum, double money) {
        for (MetroCard card : store) {
            if (card.getSerNum().equals(serNum)) {
                if (card.getBalance() >= money) {
                    card.removeBalance(money);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
