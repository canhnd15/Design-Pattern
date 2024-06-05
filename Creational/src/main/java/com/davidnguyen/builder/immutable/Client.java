package com.davidnguyen.builder.immutable;

public class Client {
    public static void main(String[] args) {
        House richGuysHouse = new House
                .Builder(2, 1, 4, "made from steel")
                .yard("300 square meters")
                .swimmingPool("40 square meters")
                .garage("50 square meters")
                .build();

        System.out.println(richGuysHouse);
    }
}
