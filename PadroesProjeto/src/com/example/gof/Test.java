package com.example.gof;

import com.example.gof.facade.Facade;
import com.example.gof.singleton.SingletonEager;
import com.example.gof.singleton.SingletonLazy;
import com.example.gof.singleton.SingletonLazyHolder;
import com.example.gof.strategy.AggressiveBehavior;
import com.example.gof.strategy.Behavior;
import com.example.gof.strategy.DefensiveBehavior;
import com.example.gof.strategy.NormalBehavior;
import com.example.gof.strategy.Robot;

public class Test {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();

        Facade facade = new Facade();
        facade.migrateClient("John Doe", "12345-678");
    }
}
