package com.patterns.observer;

public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        RadioChannel radioChannel = new RadioChannel();
        newsAgency.addObserver(radioChannel);
        newsAgency.addNews("Some emergency news");
    }
}
