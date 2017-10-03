/**
 * Created by RyanHarper on 9/27/17.
 */
public class Baby extends Person {

    public Baby(String name) {
        super(name); // comes from the constructor of Person, the superclass
    }

    public void cry() {
        System.out.println("Wahhh!");
    }
}
