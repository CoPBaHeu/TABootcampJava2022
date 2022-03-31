package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person p1;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        p1 = new Person();
        p1.setAge(18);
        p1.setName("Carlos");
    }

    @Override
    public void tearDown() throws Exception {
        p1 = null;
        super.tearDown();
    }

    public void testSetAndGetAge() {
        int newAge = 25;
        p1.setAge(newAge);
        assertEquals(newAge, p1.getAge());
    }

    public void testSetAndGetNameSuccess() {
        String testName = "Tom";
        try {
            p1.setName(testName);
        } catch (IllegalNameException illegalNameException) {
            System.out.println(illegalNameException.getMessage());
        }
        assertEquals(testName, p1.getName());
    }

    public void testSetAndGetNameFailed() {
        String oldName = p1.getName();
        String testName = "Tom1";
        try {
            p1.setName(testName);
        } catch (IllegalNameException illegalNameException) {

            assertTrue("No error message", illegalNameException.getMessage().length() > 0);

        }
        assertEquals("Validation does not work",oldName, p1.getName());
    }

    /*public void testSetAndGetName() {
        try {
            p1.setName("Tom");
        } catch (IllegalNameException illegalNameException) {
            System.out.println(illegalNameException.getMessage());
        }
        assertEquals("Tom", p1.getName());

        try {
            p1.setName("Tom1");
        } catch (IllegalNameException illegalNameException) {
            System.out.println(illegalNameException.getMessage());
        }
        assertEquals("Tom", p1.getName());
    }*/

    public void testIntroducing() {
        int newAge = 30;
        String newName = "Jack";
        try {
            p1.setName(newName);
        } catch (IllegalNameException illegalNameException) {
            illegalNameException.getMessage();
        }
        p1.setAge(newAge);
        String result = "My name is " + newName + " and I am " + newAge + " years old";
        assertEquals("Introducing message is incorrect",result, p1.introducing());
    }
}
