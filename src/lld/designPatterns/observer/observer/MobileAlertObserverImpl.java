package lld.designPatterns.observer.observer;

import lld.designPatterns.observer.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable stocksObservable;
    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable){
        this.userName = userName;
        this.stocksObservable=stocksObservable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(userName,"Product is available");
    }

    private void sendMessageOnMobile(String userName, String productIsAvailable) {
        System.out.println("message sent to + "+ userName);
    }
}
