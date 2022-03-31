package sef.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;
    int w = 80;
    float h = 1.6f;
    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
        person.setWeight(w);
        person.setHeight(h);
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        int newWeight = 90;
        person.setWeight(newWeight);
        assertEquals(newWeight,person.getWeight());
        System.out.println("Weight is: " + person.getWeight());
    }

    public void testSetAndGetHeight() {
        float newHeight = 1.9f;
        person.setHeight(newHeight);
        assertEquals(newHeight,person.getHeight());
        System.out.println("Height is: " + person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testCalculatingBMI(){
            float result = (w/(h*h));
        assertEquals(String.valueOf(result), person.calculatingBMI());
        System.out.println("Weight: " + w + "\nHeight: " + h + "\nBMI: " + person.calculatingBMI());
    }

}
