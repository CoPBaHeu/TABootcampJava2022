package sef.FinalActivity.FirstActivity;

import java.util.Arrays;

public class Employee extends Person {
    protected String jobTitle;
    protected String company;
    protected int salary;

    public Employee() {
    }

    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //constructor for extra task 2
    public Employee(String name, String surname, int age, String jobTitle, String company, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    protected String introducing() {
        String result = "I am work as " + jobTitle + " in " + company + "\nAnd my salary is a great secret. It's a joke! It's " + salary;
        return super.introducing() + "\n" + result;
    }

    public void sortFromLargeToLess(Employee[] employee) {
        System.out.println("Order of employee before sorting is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + "\nName: " + employee[i].getName() + "\nAge: "
                    + employee[i].getAge() + "\nJobTitle: " + employee[i].getJobTitle() + "\nCompanyName: "
                    + employee[i].getCompany() + "\nSalary: " + employee[i].getSalary() + "\n\n");
        }

        Arrays.sort(employee, new SalaryComparator());
        System.out.println("\n\nOrder of employee after sorting by employee salary is");

        for (int i = employee.length - 1; i >= 0; i--) {
            System.out.println("Employee " + (i + 1) + "\nName: " + employee[i].getName() + "\nAge: "
                    + employee[i].getAge() + "\nJobTitle: " + employee[i].getJobTitle() + "\nCompanyName: "
                    + employee[i].getCompany() + "\nSalary: " + employee[i].getSalary() + " \n\n");
        }
    }

    // Extra task 4
    public void sortByNames(Employee[] employee) {
        System.out.println("Order of employee before sorting is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + "\nName: " + employee[i].getName() + "\nSurname: "
                    + employee[i].getSurName() + "\nAge: " + employee[i].getAge() + "\nJobTitle: "
                    + employee[i].getJobTitle() + "\nCompanyName: " + employee[i].getCompany() +
                    "\nSalary: " + employee[i].getSalary() + "\n\n");
        }

        Arrays.sort(employee, new NamesComparator());
        System.out.println("\n\nOrder of employee after sorting by employee salary is");

        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + "\nName: " + employee[i].getName() + "\nSurname: "
                    + employee[i].getSurName() + "\nAge: " + employee[i].getAge() + "\nJobTitle: "
                    + employee[i].getJobTitle() + "\nCompanyName: " + employee[i].getCompany() +
                    "\nSalary: " + employee[i].getSalary() + "\n\n");
        }
    }
}
