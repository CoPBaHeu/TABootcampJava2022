package sef.FinalActivity.FirstActivity;

public class Person {
    protected String name;
    protected String surname; // field for extra task 4
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new IllegalNameException("Wrong name");
        }
    }

    protected String introducing() {
        return "My name is " + name + " and I am " + age + " years old";
    }

    // setters and getters for extra task 4
    public String getSurName() {
        return surname;
    }

    public void setSurName(String surname) throws IllegalNameException {
        if (surname.matches("[a-zA-Z]+")) {
            this.surname = surname;
        } else {
            throw new IllegalNameException("Wrong surname");
        }
    }
}
