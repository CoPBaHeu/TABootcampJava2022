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
    //Testing of methods added in extra task 4
    //so that the % of coverage does not decrease ))))
    public void testSetAndGetSurnameSuccess() {
        String testSurname = "Anderson";
        try {
            p1.setSurName(testSurname);
        } catch (IllegalNameException illegalNameException) {
            System.out.println(illegalNameException.getMessage());
        }
        assertEquals(testSurname, p1.getSurName());
    }

    public void testSetAndGetSurnameFailed() {
        String oldSurname = p1.getSurName();
        String testSurname = "Smith1";
        try {
            p1.setSurName(testSurname);
        } catch (IllegalNameException illegalNameException) {

            assertTrue("No error message", illegalNameException.getMessage().length() > 0);

        }
        assertEquals("Validation does not work",oldSurname, p1.getSurName());
    }
}
