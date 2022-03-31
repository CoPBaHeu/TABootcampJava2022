package sef.FinalActivity.FirstActivity;

import java.util.Arrays;

class Employee extends Person {
    protected String JobTitle;
    protected String company;
    protected int salary;

    public Employee() {
    }

    public Employee(String jobTitle, String company, int salary) {
        this.JobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
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
        String result = "I am work as " + JobTitle + " in " + company + "\nAnd my salary is a great secret. It's a joke! It's " + salary;
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

        for (int i = employee.length-1; i >=0; i--) {
            System.out.println("Employee " + (i + 1) + "\nName: " + employee[i].getName() + "\nAge: "
                    + employee[i].getAge() + "\nJobTitle: " + employee[i].getJobTitle() + "\nCompanyName: "
                    + employee[i].getCompany() + "\nSalary: " + employee[i].getSalary() + " \n\n");
        }
    }
}
