package Tasca2.Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stock;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
        notifyObserver();
    }
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update(stock);
        }
    }
}

