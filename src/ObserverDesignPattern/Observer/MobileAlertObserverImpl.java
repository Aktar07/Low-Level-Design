package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

import java.util.ArrayList;
import java.util.List;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsg(userName,"product is in stock hurry up");
    }

    private void sendMsg(String emailId, String msg){
        System.out.println("msg sent to:"+ userName);
        // send actual email to the end user
    }
}
