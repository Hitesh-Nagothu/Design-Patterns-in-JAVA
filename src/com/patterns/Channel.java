package com.patterns;

import java.util.ArrayList;

public class Channel {

    private ArrayList<Subscriber> subs = new ArrayList<>();

    private String title;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.title=title;
        notifySubscribers();

    }


}
