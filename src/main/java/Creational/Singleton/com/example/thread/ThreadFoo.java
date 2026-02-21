package Creational.Singleton.com.example.thread;

import Creational.Singleton.com.example.singleton.Singleton;


public class ThreadFoo implements Runnable {

    @Override
    public void run() {

        Singleton singleton = Singleton.getThreadSafeInstance("FOO");

        System.out.println(singleton.value); // to verify and print the value in console
    }

}
