/**
 * Created by RyanHarper on 9/28/17.
 */
public class Accountant extends Employee {

    public Accountant(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Spreadsheets!");
    }
}
