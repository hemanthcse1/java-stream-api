package com.hemanth.javastreamapi.functionalinterface;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if (integer%2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        PredicateDemo predicate = new PredicateDemo();

        // check whether the given number is even or odd
        System.out.println(predicate.test(24));


    }
}
