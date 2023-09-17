package com.hemanth.javastreamapi.lambdafunctions;

import com.hemanth.javastreamapi.functionalinterface.ConsumerDemo;
import com.hemanth.javastreamapi.functionalinterface.PredicateDemo;
import com.hemanth.javastreamapi.functionalinterface.SupplierDemo;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceToLambda {


    public static void main(String[] args) {


        // Consumer Functional Interface

        System.out.println("--------Consumer Functiona interface--------");

        /*@Override
        public void accept(Integer integer) {
            System.out.println("input "+integer);
        }*/

        ConsumerDemo consumer = new ConsumerDemo();
        consumer.accept(20);

        // convert Consumer functional interface to lambda function
        Consumer<Integer> consumerLambda = (integer) -> System.out.println("input " + integer);

        consumerLambda.accept(30);


        // Predicate Functional Interface
        System.out.println("--------Predicate Functional interface-------");

        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(25));

        /*@Override
        public boolean test(Integer integer) {
            if (integer%2 == 0){
                return true;
            }else {
                return false;
            }
        }*/

        // convert predicate functional interface to lambda function

        Predicate<Integer> predicate = integer -> integer%2==0;
        System.out.println(predicate.test(24));



        // Supplier Functional interface
        System.out.println("-----------Supplier Functional interface---------");

        SupplierDemo supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());

        /*@Override
        public String get() {
            return "Returns final value ";
        }*/


        Supplier<String> supplier = () -> "Returns final value or default value";

        System.out.println(supplier.get());




    }
}
