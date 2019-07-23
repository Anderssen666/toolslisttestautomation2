package co.uk.safebear;

import co.uk.safebear.kennels.Dog;
import org.junit.Test;

public class TestDog {

    @Test
    public void testDog() {

        Dog Charlie = new Dog();
        Dog Georgie = new Dog();
        Dog Rosie = new Dog();
        Dog Pepper = new Dog();

        Charlie.setName("Charlie");
       Georgie.setName("Georgie");
       Rosie.setName("Rosie");
       Pepper.setName("Pepper");


        Charlie.setAge(5);
        Georgie.setAge(8);
        Rosie.setAge(10);
        Pepper.setAge(2);

        Charlie.setBreed("Bulldog");
        Georgie.setBreed("Poodle");
        Rosie.setBreed("Pug");
        Pepper.setBreed("Beagle");

        Charlie.updateVacs(true);
        Georgie.updateVacs(true);
        Rosie.updateVacs(false);
        Pepper.updateVacs(true);

        System.out.println("Charlie is vaccinated: " + Charlie.getVacs());
        System.out.println("Georgie is vaccinated: " + Georgie.getVacs());
        System.out.println("Rosie is vaccinated: " + Rosie.getVacs());
        System.out.println("Pepper is vaccinated: " + Pepper.getVacs());

        System.out.println ("Charlie is a " + Charlie.getBreed());

        Charlie.bark();

    }



    }

