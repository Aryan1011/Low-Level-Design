package lld.designPatterns.observer;

import lld.designPatterns.observer.observable.IphoneObservableImpl;
import lld.designPatterns.observer.observable.StocksObservable;
import lld.designPatterns.observer.observer.EmailAlertObserverImpl;
import lld.designPatterns.observer.observer.MobileAlertObserverImpl;
import lld.designPatterns.observer.observer.NotificationAlertObserver;

public class MainStore {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer = new EmailAlertObserverImpl("abc@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("def@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Aryan",iphoneStocksObservable);

        iphoneStocksObservable.add(observer);
        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(3);

    }
}
