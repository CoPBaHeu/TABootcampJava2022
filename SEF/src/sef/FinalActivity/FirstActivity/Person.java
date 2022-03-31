package sef.FinalActivity.FirstActivity;

class Person {
    protected String name;
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

}
