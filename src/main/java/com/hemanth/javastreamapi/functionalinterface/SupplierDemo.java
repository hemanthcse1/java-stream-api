package com.hemanth.javastreamapi.functionalinterface;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {


    @Override
    public String get() {
        return "Returns final value ";
    }

    public static void main(String[] args) {

        SupplierDemo supplier = new SupplierDemo();

        System.out.println(supplier.get());
    }
}
