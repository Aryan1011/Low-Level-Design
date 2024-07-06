package lld.designPatterns.observer.observer;

import lld.designPatterns.observer.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String email;
    StocksObservable observable;
    public EmailAlertObserverImpl(String email, StocksObservable observable){
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(email,"message sent on email");
    }

    private void sendEmail(String email, String message) {
        System.out.println("email sent to "+ email);
    }
}
