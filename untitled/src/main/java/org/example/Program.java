package org.example;

import java.io.File;

public class Program {
    public static void main(String[] args) {

        Order order = new Order();;
        Saver saver = new Saver();
        Loader loader = new Loader();
        loader.inputFromConsole(order);
        saver.saveToJson(order);
//      loader.loadFromJson(new File("Users/aleksej/Desktop/HomeWorkOOP6/untitled/order.json"), order);
        System.out.println(order);
        }
    }
