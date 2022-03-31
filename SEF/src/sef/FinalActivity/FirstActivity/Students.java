package sef.FinalActivity.FirstActivity;

class Students extends Person {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    protected String introducing() {
        return "I am study in University " + schoolName;

    }
}
