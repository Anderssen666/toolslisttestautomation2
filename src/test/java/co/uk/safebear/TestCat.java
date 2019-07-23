package co.uk.safebear;

import co.uk.safebear.kennels.Cat;
import org.junit.Test;

public class TestCat {
    @Test
    public void testCat() {

    Cat.setCatBreed("Moggy");
    System.out.println(Cat.getCatBreed());
}}
