package lld.designPatterns.observer.observable;

import lld.designPatterns.observer.observer.NotificationAlertObserver;

public interface StocksObservable {
    // for all the stocks
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
