package Creational.Singleton.com.example.thread;

import Creational.Singleton.com.example.singleton.Singleton;


public class ThreadBar implements Runnable {

    @Override
    public void run() {

        Singleton singleton = Singleton.getThreadSafeInstance("BAR");

        System.out.println(singleton.value); // to verify and print the value in console
    }

}
