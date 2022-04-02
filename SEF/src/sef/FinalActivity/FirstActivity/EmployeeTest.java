package sef.FinalActivity.FirstActivity;

import junit.framework.TestCase;


public class EmployeeTest extends TestCase {

    private Employee e1, e2, e3, e4;
    private String name, job, com;
    private int age, sal;
    Employee[] emp;


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
        Employee[] arr = new Employee[]{e1, e2, e3, e4};
        for (int i = 0; i < arr.length; i++) {
            emp[i].name = arr[i].getName();
            emp[i].age = arr[i].getAge();
            emp[i].jobTitle = arr[i].getJobTitle();
            emp[i].company = arr[i].getCompany();
            emp[i].salary = arr[i].getSalary();
        }
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
        String result = "My name is " + name + " and I am " + age + " years old" + "\nI am work as "
                + job + " in " + com + "\nAnd my salary is a great secret. It's a joke! It's " + sal;
        assertEquals(result, testEmp.introducing());
    }

    // testing extra task 4
    public void testSortByNames() {
        e1 = new Employee("Isabella", "Valois", 45, "Emperor", "Roman Empire", 2000);
        e2 = new Employee("Carlos", "Liechtenstein", 20, "Emperor", "Roman Empire", 1000);
        e3 = new Employee("Carlos", "Habsburg", 15, "Princess", "Burgundian kingdom", 500);
        e4 = new Employee("Isabella", "Habsburg", 30, "King", "French kingdom", 1500);
        Employee[] arr = new Employee[]{e1, e2, e3, e4};
        for (int i = 0; i < arr.length; i++) {
            emp[i].name = arr[i].getName();
            emp[i].surname = arr[i].getSurName();
            emp[i].age = arr[i].getAge();
            emp[i].jobTitle = arr[i].getJobTitle();
            emp[i].company = arr[i].getCompany();
            emp[i].salary = arr[i].getSalary();
        }
        new Employee().sortByNames(emp);
    }
}