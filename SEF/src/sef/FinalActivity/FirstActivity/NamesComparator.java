package sef.FinalActivity.FirstActivity;

import java.util.Comparator;
// Comparator for extra task 4
public class NamesComparator implements Comparator {
    public int compare(Object emp1, Object emp2) {

        //parameter are of type Object, so we have to downcast it to Employee objects

        String emp1Name = ((Employee) emp1).getName();
        String emp2Name = ((Employee) emp2).getName();

        if (emp1Name.compareTo(emp2Name) == 0) {
            String emp1SurName = ((Employee) emp1).getSurName();
            String emp2SurName = ((Employee) emp2).getSurName();
            return emp1SurName.compareTo(emp2SurName);
        } else {
            //uses compareTo method of String class to compare names of the employee
            return emp1Name.compareTo(emp2Name);
        }
    }
}
