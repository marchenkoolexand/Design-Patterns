package com.patterns.observer;

import java.util.Observable;

public class NewsAgency extends Observable {

    public void addNews(String newItem){
        this.setChanged();
        this.notifyObservers();
    }
}
