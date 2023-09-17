package com.hemanth.javastreamapi.functionalinterface;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("input "+integer);
    }

    public static void main(String[] args) {
        ConsumerDemo consumer = new ConsumerDemo();

        consumer.accept(30);
    }
}
