package Tasca2.Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String stock;

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void setStock(String stock) {
        this.stock = stock;
        notifyObserver();
    }
    @Override
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update(stock);
        }
    }
}

