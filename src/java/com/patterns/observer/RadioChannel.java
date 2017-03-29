package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class RadioChannel implements Observer {

    @Override
    public void update(Observable o, Object arg) {
            System.out.println((String) arg);
    }
}
