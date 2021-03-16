package com.patterns;

public class Youtube {

    public static void main(String[] args){
        Channel telusko = new Channel();

        Subscriber s1= new Subscriber("Hitesh");
        Subscriber s2= new Subscriber("Deeraj");
        Subscriber s3= new Subscriber("Sanjay");
        Subscriber s4= new Subscriber("Tripura");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);

        telusko.upload("A day in my life");

    }
}
