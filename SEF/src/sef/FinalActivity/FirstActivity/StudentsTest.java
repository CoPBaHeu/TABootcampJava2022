package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;


public class StudentsTest extends TestCase {

    private Students s1;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        s1 = new Students();
        s1.setSchoolName("HighSchoolName");
    }

    @Override
    public void tearDown() throws Exception {
        s1 = null;
        super.tearDown();
    }

    public void testSetAndGetSchoolName() {
        String newSchool = "NewSchoolName";
        s1.setSchoolName(newSchool);
        assertEquals(newSchool,s1.getSchoolName());
    }

    public void testIntroducing() {
        String newSchool = "NewSchoolName";
        s1.setSchoolName(newSchool);
        String result = "I am study in University " + newSchool;
        assertEquals(result, s1.introducing());
    }
}
