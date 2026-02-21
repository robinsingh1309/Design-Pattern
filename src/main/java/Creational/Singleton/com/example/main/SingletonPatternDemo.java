package Creational.Singleton.com.example.main;

import Creational.Singleton.com.example.singleton.Singleton;
import Creational.Singleton.com.example.thread.ThreadBar;
import Creational.Singleton.com.example.thread.ThreadFoo;


public class SingletonPatternDemo {

    public static void main(String[] args) throws InterruptedException {

        Singleton singleton1 = Singleton.getInstance("ABC");

        Singleton singleton2 = Singleton.getInstance("XYZ");

        // printed HashCode, so as to cross verify that one only instance has been created
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1 == singleton2); // output -> true (i.e, one one instance would be created)

        
        //------------------------------------------------------------------------------------------------------
        // Thread safe Demo
        
        Thread t1 = new Thread(new ThreadFoo());
        
        Thread t2 = new Thread(new ThreadBar());
        
        // If you see same value being printed on console that means singleton is being reused
        t1.start();
        t2.start();
        
    }

}
