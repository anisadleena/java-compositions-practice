package org.javaPractice.laptop.components;

import org.javaPractice.laptop.Laptop;

public class Hello {

//    to display output
    public static void main(String[] args) {
        Laptop lappy = new Laptop();

        System.out.println("======= Processor =======");
        System.out.println("brand: " + lappy.getProcessor().getBrand());
        System.out.println("cache memories: " +lappy.getProcessor().getCacheMemory()
        );
        System.out.println("frequency: " +lappy.getProcessor().getFrequency()
        );
        System.out.println("max frequency: " +lappy.getProcessor().getMaxfrequency()
        );
        System.out.println("min frequency: " +lappy.getProcessor().getMinFrequency()
        );
        System.out.println("series: " +lappy.getProcessor().getSeries()
        );
        System.out.println("cores: " +lappy.getProcessor().getCores()
        );
        System.out.println("generation: " +lappy.getProcessor().getGeneration()
        );
        System.out.println("threads: " +lappy.getProcessor().getThreads()
        );
        System.out.println("view all: " +lappy.getProcessor()
        );
    }

}
