/**
 * Created by RyanHarper on 9/25/17.
 */
public class Student {
    private String name;
    private String cohort;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String cohort) { // constructor overloading. the name is same, parameters are different
        this.name = name;
        this.cohort = cohort;
    }

    public boolean isEnrolled() {
        return cohort != null;
    }

    public String getCohort() {
        return cohort;
    }
}
