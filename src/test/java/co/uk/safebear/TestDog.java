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

        Charlie.getVacs();
        Georgie.getVacs();
        Rosie.getVacs();
        Pepper.getVacs();
    }

    }

