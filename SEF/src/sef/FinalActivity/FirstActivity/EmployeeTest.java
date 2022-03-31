package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    private Employee e1, e2, e3, e4;
    private String name, job, com;
    private int age, sal;
    Employee emp[];


    public void setUp() throws Exception {
        super.setUp();
        e1 = new Employee("Manager", "TestCompany", 20000);
        e1.setName("Carlos");
        e1.setAge(35);
        e2 = new Employee("Head of Department", "AnotherCompany", 50000);
        e2.setName("Philipp");
        e2.setAge(41);
        e3 = new Employee("Secretary", "TestCompany", 14500);
        e3.setName("Isabella");
        e3.setAge(23);
        e4 = new Employee("Courier", "TestCompany", 10000);
        e4.setName("Moris");
        e4.setAge(50);


        emp = new Employee[4];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
        }
        emp[0].name = e1.getName();
        emp[0].age = e1.getAge();
        emp[0].JobTitle = e1.getJobTitle();
        emp[0].company = e1.getCompany();
        emp[0].salary = e1.getSalary();

        emp[1].name = e2.getName();
        emp[1].age = e2.getAge();
        emp[1].JobTitle = e2.getJobTitle();
        emp[1].company = e2.getCompany();
        emp[1].salary = e2.getSalary();

        emp[2].name = e3.getName();
        emp[2].age = e3.getAge();
        emp[2].JobTitle = e3.getJobTitle();
        emp[2].company = e3.getCompany();
        emp[2].salary = e3.getSalary();

        emp[3].name = e4.getName();
        emp[3].age = e4.getAge();
        emp[3].JobTitle = e4.getJobTitle();
        emp[3].company = e4.getCompany();
        emp[3].salary = e4.getSalary();
    }


    public void tearDown() throws Exception {
        e1 = null;
        e2 = null;
        e3 = null;
        e4 = null;
        emp = null;
        super.tearDown();
    }

    public void testSortFromLargeToLess() {
        new Employee().sortFromLargeToLess(emp);
    }
    public void testIntroducing() throws IllegalNameException {
        job = "Nobody";
        com = "Nowhere";
        sal = 500;
        age = 60;
        name = "Peter";
        Employee testEmp = new Employee();
        testEmp.setAge(age);
        testEmp.setName(name);
        testEmp.setSalary(sal);
        testEmp.setCompany(com);
        testEmp.setJobTitle(job);
        String result  = "My name is " + name + " and I am " + age + " years old" + "\nI am work as "
                + job + " in " + com + "\nAnd my salary is a great secret. It's a joke! It's " + sal;
        assertEquals(result, testEmp.introducing());
    }
}