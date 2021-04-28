package com.wordpress.boxofcubes.junitspringbootunittesting;


import com.wordpress.boxofcubes.junitspringbootunittesting.models.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    private Person me;
    private Person anna;
    private Person bob;

    @Before
    public void makePerson(){
        me = new Person("Emily", 26);

        anna = new Person();
        anna.setName("Anna");
        anna.setAge(18);

        bob = new Person("Robert", 0);
        bob.setName("Bob");
        bob.setAge(70);
    }

    @Test
    public void checkNameNotNull(){
        assertNotNull("Name should not be null - Emily", me.getName());
        assertNotNull("Name should not be null - Anna", anna.getName());
        assertNotNull("Name should not be null - Bob", bob.getName());
    }

    @Test
    public void checkAge(){
        assertNotNull("Age should not be null - Emily", me.getAge());
        assertTrue("Age should be greater than 25 - Emily", me.getAge() > 25);
        assertTrue("Age should be less than 27 - Emily", me.getAge() < 27);

        assertNotNull("Age should not be null - Anna", anna.getAge());
        assertTrue("Age should be greater than 17 - Anna", anna.getAge() > 17);
        assertTrue("Age should be less than 19 - Anna", anna.getAge() < 19);

        assertNotNull("Age should not be null - Bob", bob.getAge());
        assertTrue("Age should be greater than 50 - Bob", bob.getAge() > 50);
        assertTrue("Age should be equal to 70 - Bob", bob.getAge() == 70);
    }

    @Test
    public void checkLettersInName(){
        assertTrue("E is in Emily", me.nameContainsLetter('E'));
        assertTrue("m is in Emily", me.nameContainsLetter('m'));
        assertTrue("l is in Emily", me.nameContainsLetter('l'));
        assertFalse("Y is in not in Emily", me.nameContainsLetter('Y'));
        assertFalse("k is in not in Emily", me.nameContainsLetter('k'));
        assertFalse("- is in not in Emily", me.nameContainsLetter('-'));

        assertTrue("A is in Anna", anna.nameContainsLetter('A'));
        assertTrue("n is in Anna", anna.nameContainsLetter('n'));
        assertFalse("[blank] is in not in Anna", anna.nameContainsLetter(' '));
        assertFalse("N is in not in Anna", anna.nameContainsLetter('N'));

        assertTrue("o is in Bob", bob.nameContainsLetter('o'));
        assertFalse("R is in not in Bob", bob.nameContainsLetter('R'));
    }

    @Test
    public void checkAgeInXYears(){
        assertEquals("Age in 4 years will be 30 - Emily", 30, me.ageInXYears(4));
        assertEquals("Age in 10 years will be 36 - Emily", 36, me.ageInXYears(10));
        assertEquals("Age in 50 years will be 76 - Emily", 76, me.ageInXYears(50));
        assertNotEquals("Age in 5 years will not be 30 - Emily", 30, me.ageInXYears(5));
        assertNotEquals("Age in 8 years will not be 15 - Emily", 15, me.ageInXYears(8));
        assertNotEquals("Age in 50 years will not be 40 - Emily", 50, me.ageInXYears(40));

        assertEquals("Age in 4 years will be 22 - Anna", 22, anna.ageInXYears(4));
        assertEquals("Age in 12 years will be 30 - Anna", 30, anna.ageInXYears(12));
        assertTrue("Age in 5 years will be less than 30 - Anna", anna.ageInXYears(5)<30);
        assertTrue("Age in 3 years will be more than 20 - Anna", anna.ageInXYears(3)>20);

        assertEquals("Age in 5 years will be 75 - Bob", 75, bob.ageInXYears(5));
        assertTrue("Age in 29 years will be less than 100 - Bob", bob.ageInXYears(29)<100);
    }
}
